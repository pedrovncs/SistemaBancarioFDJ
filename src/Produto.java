public abstract class Produto {
    protected Cliente cliente;
    protected final String descricao;
    protected final String codigo;

    public Produto( String descricao, String codigo, Cliente cliente){
        this.descricao = descricao;
        this.codigo = codigo;
    }
    public abstract Banco getBanco();

    public Cliente getCliente() {
        return cliente;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

}
