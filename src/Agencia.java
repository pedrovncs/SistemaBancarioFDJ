public class Agencia {
    private String numero;
    private Banco banco;

    public Agencia(Banco banco, String numero){
        this.numero = numero;
        this.banco = banco;
    }

    public String getNumero(){
        return this.numero;
    }

    public Banco getBanco(){
        return this.banco;
    }
}
