public class Cartao extends Produto{
    private double limite;
    private static final String numero = (int) Math.floor(Math.random() * 100000) + "";
    private boolean debito;
    private boolean credito;
    private double fatura;
    private static final String codigoFixo = "CARTAO";
    private static final String descricaoFixa = "Cartão de crédito e/ou débito";

    public Cartao(double limite){
        super(descricaoFixa, codigoFixo);
        this.limite = limite;
        this.credito = false;
        this.debito = true;
    }

    public String getNumero(){
        return this.numero;
    }

    public double getLimite(){
        return this.limite;
    }

    public boolean getDebito(){
        return this.debito;
    }

    public boolean getCredito(){
        return this.credito;
    }

    public double getFatura(){
        return this.fatura;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public void setDebito(){
        this.debito = !debito;
    }

    public void setCredito(){
        this.credito = !credito;
    }

    public void gerarFatura(){
        this.fatura = Math.random() * this.limite;
    }

    public void pagarFatura(){
        this.fatura = 0.0;
    }


}
