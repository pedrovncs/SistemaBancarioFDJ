public abstract class Produto {
    protected final String descricao;
    protected final String codigo;

    public Produto( String descricao, String codigo){
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

}
