public class Conta extends Produto {
    private Agencia agencia;
    private String numero;
    private Double saldo;
    private String tipo;
    private static final String codigoFixo = "CONTA";
    private static final String descricaoFixa = "Conta bancária";

    public Conta(String numero, Agencia agencia, String tipo){
        super(descricaoFixa, codigoFixo);
        this.numero = numero;
        this.tipo = tipo;
        this.agencia = agencia;
        this.saldo = 0.0;
    }

    public String getNumero(){
        return this.numero;
    }

    public String getTipo(){
        return this.tipo;
    }

    public Agencia getAgencia(){
        return this.agencia;
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
