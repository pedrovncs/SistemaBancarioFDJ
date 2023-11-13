import java.util.Scanner;

public class MenuConsultar extends TerminalOption {
    Scanner scanner = new Scanner(System.in);

    public void executar(String selected) {
        while (!selected.equals("0")) {
            System.out.println("MENU CONSULTAR");
            System.out.println("O que você deseja consultar?");
            System.out.println("1 - Banco");
            System.out.println("2 - Cliente");
            System.out.println("3 - Empresa");
            System.out.println("0 - Voltar");
            selected = scanner.nextLine();
            switch (selected) {
                case "1": {
                    System.out.println("Selecione o banco: ");
                    if (Banco.bancos.isEmpty()) {
                        System.out.println("\n ERRO: Não há bancos cadastrados \n");
                        break;
                    }
                    for (int i = 0; i < Banco.bancos.size(); i++) {
                        System.out.println(i + 1 + " - " + Banco.bancos.get(i).getNome());
                    }
                    System.out.println("0 - Voltar");
                    selected = scanner.nextLine();
                    if (selected.equals("0")) {
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    }
                    Banco banco = Banco.bancos.get(Integer.parseInt(selected) - 1);
                    System.out.println("Nome: " + banco.getNome());
                    System.out.println("Agencias: ");
                    for (int i = 0; i < banco.getAgencias().size(); i++) {
                        System.out.println(" - " + banco.getAgencias().get(i).getNumero());
                    }
                    System.out.println("Produtos: ");
                    for (int i = 0; i < banco.getProdutos().size(); i++) {
                        System.out.println(" - " + banco.getProdutos().get(i).getCodigo() + " - " + banco.getProdutos().get(i).getDescricao());
                    }
                    if (!banco.getProdutos().isEmpty()) {
                        System.out.println("00 - Mais informações.");
                    }
                    System.out.println("0 - Voltar");
                    selected = scanner.nextLine();
                    if (selected.equals("0")) {
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    }
                    if (selected.equals("00")) {
                        System.out.println("Selecione o produto: ");
                        for (int i = 0; i < banco.getProdutos().size(); i++) {
                            System.out.println(i + 1 + " - " + banco.getProdutos().get(i).getCodigo() + " - " + banco.getProdutos().get(i).getDescricao());
                        }
                        System.out.println("0 - Voltar");
                        selected = scanner.nextLine();
                        if (selected.equals("0")) {
                            System.out.println("-> Retorno a tela anterior");
                            break;
                        }
                        Produto produto = banco.getProdutos().get(Integer.parseInt(selected) - 1);
                        if (produto instanceof Conta) {
                            Conta conta = (Conta) produto;
                            System.out.println("Número: " + conta.getNumero());
                            System.out.println("Tipo: " + conta.getTipo());
                            System.out.println("Saldo: " + conta.getSaldo());
                            System.out.println("Cliente: " + conta.getCliente().getNome());
                        }
                        if (produto instanceof Cartao) {
                            Cartao cartao = (Cartao) produto;
                            System.out.println("Número: " + cartao.getNumero());
                            System.out.println("Função Débito: " + cartao.getDebito());
                            System.out.println("Função Crédito: " + cartao.getCredito());
                            System.out.println("Limite: " + cartao.getLimite());
                            System.out.println("Cliente: " + cartao.getCliente().getNome());
                        }
                        if (produto instanceof ChequeEspecial) {
                            ChequeEspecial chequeEspecial = (ChequeEspecial) produto;
                            System.out.println("Limite: " + chequeEspecial.getLimite());
                            System.out.println("Taxa de Juros: " + chequeEspecial.getTaxaDeJuros());
                            System.out.println("Cliente: " + chequeEspecial.getCliente().getNome());
                        }
                    }
                    break;
                }
                case "2": {
                    System.out.println("Selecione o cliente: ");
                    if (Cliente.clientes.isEmpty()) {
                        System.out.println("\n ERRO: Não há clientes cadastrados \n");
                        break;
                    }
                    for (int i = 0; i < Cliente.clientes.size(); i++) {
                        System.out.println(i + 1 + " - " + Cliente.clientes.get(i).getNome());
                    }
                    System.out.println("0 - Voltar");
                    selected = scanner.nextLine();
                    if (selected.equals("0")) {
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    }
                    Cliente cliente = Cliente.clientes.get(Integer.parseInt(selected) - 1);
                    System.out.println("Nome: " + cliente.getNome());
                    System.out.println("CPF: " + cliente.getCpf());
                    System.out.println("Produtos: ");
                    for (int i = 0; i < cliente.getProdutos().size(); i++) {
                        System.out.println(" - " + cliente.getProdutos().get(i).getCodigo() +
                                " - " + cliente.getProdutos().get(i).getDescricao());
                    }
                    if (!cliente.getProdutos().isEmpty()) {
                        System.out.println("00 - Mais informações.");
                    }
                    System.out.println("0 - Voltar");
                    selected = scanner.nextLine();
                    if (selected.equals("0")) {
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    }
                    if (selected.equals("00")) {
                        System.out.println("Selecione o produto: ");
                        for (int i = 0; i < cliente.getProdutos().size(); i++) {
                            System.out.println(i + 1 + " - " + cliente.getProdutos().get(i).getCodigo() +
                                    " - " + cliente.getProdutos().get(i).getDescricao());
                        }
                        System.out.println("0 - Voltar");
                        selected = scanner.nextLine();
                        if (selected.equals("0")) {
                            System.out.println("-> Retorno a tela anterior");
                            break;
                        }
                        Produto produto = cliente.getProdutos().get(Integer.parseInt(selected) - 1);
                        if (produto instanceof Conta) {
                            Conta conta = (Conta) produto;
                            System.out.println("Número: " + conta.getNumero());
                            System.out.println("Tipo: " + conta.getTipo());
                            System.out.println("Saldo: " + conta.getSaldo());
                            System.out.println("Banco: " + conta.getBanco().getNome());
                        }
                        if (produto instanceof Cartao) {
                            Cartao cartao = (Cartao) produto;
                            System.out.println("Número: " + cartao.getNumero());
                            System.out.println("Função Débito: " + cartao.getDebito());
                            System.out.println("Função Crédito: " + cartao.getCredito());
                            System.out.println("Limite: " + cartao.getLimite());
                            System.out.println("Banco: " + cartao.getBanco().getNome());
                        }
                        if (produto instanceof ChequeEspecial) {
                            ChequeEspecial chequeEspecial = (ChequeEspecial) produto;
                            System.out.println("Limite: " + chequeEspecial.getLimite());
                            System.out.println("Taxa de Juros: " + chequeEspecial.getTaxaDeJuros());
                            System.out.println("Banco: " + chequeEspecial.getBanco().getNome());
                        }
                    }
                    break;
                }
                case "3": {
                    if (Empresa.empresas.isEmpty()) {
                        System.out.println("\n ERRO: Não há empresas cadastradas \n");
                        break;
                    }
                    System.out.println("Selecione a empresa: ");
                    for (int i = 0; i < Empresa.empresas.size(); i++) {
                        System.out.println(i + 1 + " - " + Empresa.empresas.get(i).getNome());
                    }
                    System.out.println("0 - Voltar");
                    selected = scanner.nextLine();
                    if (selected.equals("0")) {
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    }
                    Empresa empresa = Empresa.empresas.get(Integer.parseInt(selected) - 1);
                    System.out.println("Nome: " + empresa.getNome());
                    System.out.println("CNPJ: " + empresa.getCnpj());
                    System.out.println("Funcionarios: ");
                    if (empresa.getFuncionarios().isEmpty()) {
                        System.out.println(" - Não há funcionários cadastrados");
                        break;
                    } else {
                        for (int i = 0; i < empresa.getFuncionarios().size(); i++) {
                            System.out.println(" - " + empresa.getFuncionarios().get(i).getNome());
                        }
                    }
                }
                case "0": {
                    System.out.println("-> Retorno a tela anterior");
                    break;
                }
                default: {
                    System.out.println("-> Opção inválida");
                    break;
                }
            }
        }
    }
}
