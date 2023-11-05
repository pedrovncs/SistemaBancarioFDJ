public class Main {
    public static void main(String[] args) {
        Banco banco1 = new Banco("Banco do Brasil");
        Agencia agencia1 = new Agencia("0001");
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


    }
}