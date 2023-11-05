public abstract class Produto {
    private final String descricao;
    private final String codigo;

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
