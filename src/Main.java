import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selected = "";
        while (!selected.equals("0")) {
            System.out.println("Bem vindo ao sistema bancario ");
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Criar banco");
            System.out.println("2 - Criar agencia");
            System.out.println("3 - Criar cliente");
            System.out.println("4 - Criar cartão");
            System.out.println("5 - Criar cheque especial");
            System.out.println("6 - Criar conta");
            System.out.println("7 - TESTE");
            System.out.println("0 - Sair");
            selected = scanner.nextLine();
            switch (selected) {
                case "1": {
                    System.out.println("Digite o nome do banco: ");
                    String nome = scanner.nextLine();
                    Banco banco = new Banco(nome);
                    System.out.println("\n Banco criado com sucesso! \n ");
                    break;
                }
                case "2": {
                    if (Banco.bancos.isEmpty()) {
                        System.out.println("\n ERRO: Não existem bancos cadastrados! \n");
                        break;
                    }
                    System.out.println("Selecione um banco: ");
                    for (int i = 0; i < Banco.bancos.size(); i++) {
                        System.out.println(i + 1 + " - " + Banco.bancos.get(i).getNome());
                    }
                        selected = scanner.nextLine();
                        Banco banco = Banco.bancos.get(Integer.parseInt(selected) - 1);
                        System.out.println("Insira o número da agencia: ");
                        String numero = scanner.nextLine();
                        banco.criarAgencia(numero);
                        System.out.println("\n Agencia criada com sucesso! \n ");
                        break;
                }
                case "3":{
                    System.out.println("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o cpf do cliente: ");
                    String cpf = scanner.nextLine();
                    Cliente cliente = new Cliente(nome, cpf);
                    System.out.println("\n Cliente criado com sucesso! \n ");
                    break;
                }
                case "4", "5", "6":{
                    System.out.println("\n Ainda não implementado \n");
                    break;
                }
                case "0":{
                    System.out.println("\n ENCERRADO \n");
                    break;
                }
                default:{
                    System.out.println("\n Opção inválida! \n");
                    break;
                }
            }
        }


        for (Banco banco : Banco.bancos) {
            System.out.println(banco.getNome());
        }
        System.out.println(Banco.bancos.get(0).getAgencias().get(0).getNumero());


        /*Agencia agencia1 = new Agencia("0001");
        Conta conta1 = new Conta( "123456", agencia1, "corrente");
        Cartao cartao1 = new Cartao(5000);
        ChequeEspecial chequeEspecial1 = new ChequeEspecial(1000,12.3);
        banco1.addAgencia(agencia1);
        banco1.addProduto(conta1);
        banco1.addProduto(cartao1);
        banco1.addProduto(chequeEspecial1);

        Cliente cliente1 = new Cliente("Joazinho", "123.456.789-00");
        cliente1.addProduto(conta1);
        cliente1.addProduto(cartao1);
        cliente1.addProduto(chequeEspecial1);

        System.out.println("Nome do banco: " + banco1.getNome());
        System.out.println("Lista de agências do banco: ");
        for (Agencia agencia : banco1.getAgencias()) {
            System.out.println(agencia.getNumero());
        }
        System.out.println("Lista de produtos do banco: ");
        for (Produto produto : banco1.getProdutos()) {
            System.out.println(produto.getCodigo() + " - " + produto.getDescricao());
        }
        System.out.println("");
        System.out.println("Nome do cliente: " + cliente1.getNome());
        System.out.println("CPF do cliente: " + cliente1.getCpf());
        System.out.println("Número da agência: " + agencia1.getNumero());
        System.out.println("");
        System.out.println("Informações da conta:");
        System.out.println("Número da conta: " + conta1.getNumero());
        System.out.println("Agência da conta: " + conta1.getAgencia().getNumero());
        System.out.println("Saldo da conta: " + conta1.getSaldo());
        System.out.println("Tipo da conta: " + conta1.getTipo());
        conta1.depositar(1000.0);
        System.out.println("----Depósito de 1000.0 realizado----");
        System.out.println("Novo saldo após depósito: " + conta1.getSaldo());
        conta1.sacar(500.0);
        System.out.println("----Saque de 500.0 realizado----");
        System.out.println("Novo saldo após saque: " + conta1.getSaldo());
        System.out.println("");
        System.out.println("Informações do cartão:");
        System.out.println("Número do cartão: " + cartao1.getNumero());
        System.out.println("Limite do cartão: " + cartao1.getLimite());
        System.out.println("Possui função crédito: " + cartao1.getCredito());
        System.out.println("Possui função débito: " + cartao1.getDebito());
        cartao1.gerarFatura();
        System.out.println("----Fatura gerada----");
        System.out.println("Fatura do cartão: " + cartao1.getFatura());
        cartao1.pagarFatura();
        System.out.println("----Fatura paga----");
        System.out.println("Fatura do cartão após pagamento: " + cartao1.getFatura());
        System.out.println("");
        System.out.println("Informações do cheque especial:");
        System.out.println("Limite do cheque especial: " + chequeEspecial1.getLimite());
        System.out.println("Taxa de juros do cheque especial: " + chequeEspecial1.getTaxaDeJuros());
        System.out.println("----Cheque especial utilizado----");
        chequeEspecial1.useChequeEspecial(500.0);
        System.out.println("Novo limite do cheque especial: " + chequeEspecial1.getLimite());
        chequeEspecial1.pagarChequeEspecial(500.0);
        System.out.println("----Cheque especial pago----");
        System.out.println("Novo limite do cheque especial: " + chequeEspecial1.getLimite());

*/
    }
}