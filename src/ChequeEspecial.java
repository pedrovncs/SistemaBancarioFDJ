public class ChequeEspecial extends Produto {
    private double limite;
    private double taxaDeJuros;
    private static final String codigoFixo = "CHEQUEESPECIAL";
    private static final String descricaoFixa = "Cheque Especial";

    public ChequeEspecial(double limite, double taxaDeJuros) {
        super(descricaoFixa, codigoFixo);
        this.limite = limite;
        this.taxaDeJuros = taxaDeJuros;
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
