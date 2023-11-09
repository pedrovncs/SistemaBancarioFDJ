import java.util.List;
import java.util.ArrayList;

public class Banco {
    private String nome;
    public static List<Banco> bancos = new ArrayList<Banco>();
    private List<Agencia> agencias;
    private List<Produto> produtos;

    public Banco(String nome){
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();
        this.produtos = new ArrayList<Produto>();
        bancos.add(this);
    }

    public String getNome(){
        return this.nome;
    }

    public List<Agencia> getAgencias(){
        return this.agencias;
    }

    public List<Produto> getProdutos(){
        return this.produtos;
    }

    public void criarAgencia(String numero){
        Agencia agencia = new Agencia(this, numero);
        this.agencias.add(agencia);
    }

    public void removerAgencia(Agencia agencia){
        this.agencias.remove(agencia);
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }
}
