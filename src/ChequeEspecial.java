public class ChequeEspecial extends Produto {
    private double limite;
    private double taxaDeJuros;
    private Banco banco;
    private static final String CODIGOFIXO = "CHEQUEESPECIAL";
    private static final String DESCRICAOFIXA = "Cheque Especial";

    public ChequeEspecial(double limite, double taxaDeJuros, Banco banco, Cliente cliente) {
        super(DESCRICAOFIXA, CODIGOFIXO,cliente);
        this.banco = banco;
        this.limite = limite;
        this.taxaDeJuros = taxaDeJuros;
    }

    public Banco getBanco() {
        return this.banco;
    }
    public double getLimite() {
        return this.limite;
    }

    public double getTaxaDeJuros() {
        return this.taxaDeJuros;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void useChequeEspecial(double valor) {
        this.limite -= valor;
    }

    public void pagarChequeEspecial(double  valor) {
        this.limite = this.limite + valor;
    }
}
