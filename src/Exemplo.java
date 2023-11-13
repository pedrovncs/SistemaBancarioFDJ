public class Exemplo {
    public void executar() {

        /*Crie 5 clientes de forma que alguns deles só tenham um serviço (ex.:
        conta), outros tenham dois (ex.: conta e cheque especial) e outros
        tenham todos os produtos
        Divida esses clientes entre 3 diferentes bancos e 2 diferentes
        empresas*/

        Banco banco1 = new Banco("Banco A");
        Banco banco2 = new Banco("Banco B");
        Banco banco3 = new Banco("Banco C");

        Empresa empresa1 = new Empresa("Empresa X", "CNPJ1", "Endereco1");
        Empresa empresa2 = new Empresa("Empresa Y", "CNPJ2", "Endereco2");

        Cliente cliente1 = new Cliente("Cliente 1", "CPF1");
        cliente1.abrirConta("Conta Padrão", banco1);
        cliente1.pedirCartao(banco1);
        cliente1.pedirChequeEspecial(1000.0, 0.1, banco1);
        cliente1.setEmpresa(empresa1);
        empresa1.addFuncionario(cliente1);

        Cliente cliente2 = new Cliente("Cliente 2", "CPF2");
        cliente2.abrirConta("Conta Padrão", banco2);
        cliente2.setEmpresa(empresa1);
        empresa1.addFuncionario(cliente2);

        Cliente cliente3 = new Cliente("Cliente 3", "CPF3");
        cliente3.pedirCartao(banco3);
        cliente3.setEmpresa(empresa2);
        empresa2.addFuncionario(cliente3);

        Cliente cliente4 = new Cliente("Cliente 4", "CPF4");
        cliente4.pedirChequeEspecial(1000.0, 0.1, banco1);
        cliente4.setEmpresa(empresa2);
        empresa2.addFuncionario(cliente4);

        Cliente cliente5 = new Cliente("Cliente 5", "CPF5");
        cliente5.abrirConta("Conta Padrão", banco2);
        cliente5.pedirCartao(banco2);
        cliente5.setEmpresa(empresa1);
        empresa1.addFuncionario(cliente5);

        exibirInfo(cliente1, cliente2, cliente3, cliente4, cliente5);
    }

    private static void exibirInfo(Cliente... clientes) {
        System.out.println("\n EXEMPLO \n");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Empresa: " + (cliente.getEmpresa() != null ? cliente.getEmpresa().getNome() : "N/A"));
            System.out.println("Produtos:");
            for (Produto produto : cliente.getProdutos()) {
                System.out.println("- " + produto.getDescricao() + " (" + produto.getCodigo() + ")");
                System.out.println("  Banco: " + produto.getBanco().getNome());
            }
            System.out.println("------------------------");
        }
        System.out.println("\n FIM DO EXEMPLO \n");

    }
}
