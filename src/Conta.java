public class Conta extends Produto {
    private Banco banco;
    private String numero = String.valueOf((int) Math.floor(Math.random() * 1000));
    private Double saldo;
    private String tipo;
    private static final String CODIGOFIXO = "CONTA";
    private static final String DESCRICAOFIXA = "Conta bancária";

    public Conta(String tipo, Banco banco, Cliente cliente){
        super(DESCRICAOFIXA, CODIGOFIXO, cliente);
        this.tipo = tipo;
        this.banco = banco;
        this.saldo = 0.0;
    }

    public Banco getBanco(){
        return this.banco;
    }

    public String getNumero(){
        return this.numero;
    }

    public String getTipo(){
        return this.tipo;
    }

    public Double getSaldo(){
        return this.saldo;
    }

    public void depositar(Double valor){
        this.saldo += valor;
    }

    public void sacar(Double valor){
        this.saldo -= valor;
    }


    public void transferir(Conta conta, Double valor){
        this.sacar(valor);
        conta.depositar(valor);
    }
}
