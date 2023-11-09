public class Cartao extends Produto{
    private double limite = Math.random() * 10000;
    private final String numero = String.valueOf((int) Math.floor(Math.random() * 100000));
    private boolean debito;
    private boolean credito;
    private double fatura;
    private Banco banco;
    private static final String codigoFixo = "CARTAO";
    private static final String descricaoFixa = "Cartão de crédito e/ou débito";

    public Cartao(Banco banco, Cliente cliente){
        super(descricaoFixa, codigoFixo, cliente);
        this.banco = banco;
        this.cliente = cliente;
        this.credito = false;
        this.debito = true;
    }

    public String getNumero(){
        return this.numero;
    }

    public double getLimite(){
        return this.limite;
    }

    public String getDebito(){
        if (this.debito){
            return "Habilitado";
        }
        return "Desabilitado";

    }

    public String getCredito(){
        if (this.credito){
            return "Habilitado";
        }
        return "Desabilitado";
    }

    public Banco getBanco(){
        return this.banco;
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
