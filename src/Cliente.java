import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private List<Produto> produtos;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.produtos = new ArrayList<Produto>();
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public List<Produto> getProdutos(){
        return this.produtos;
    }
    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }
}
