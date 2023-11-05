import java.util.List;
import java.util.ArrayList;

public class Banco {
    private String nome;
    private List<Agencia> agencias;
    private List<Produto> produtos;

    public Banco(String nome){
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();
        this.produtos = new ArrayList<Produto>();
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

    public void addAgencia(Agencia agencia){
        this.agencias.add(agencia);
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }
}
