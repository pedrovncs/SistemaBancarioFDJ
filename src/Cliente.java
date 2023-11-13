import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private Empresa empresa;
    public static List<Cliente> clientes = new ArrayList<Cliente>();
    private List<Produto> produtos;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.produtos = new ArrayList<Produto>();
        clientes.add(this);
    }
    public void abrirConta(String tipo, Banco banco ){
        Conta conta = new Conta(tipo, banco, this);
        this.addProduto(conta);
        banco.addProduto(conta);
    }
    public void pedirCartao(Banco banco ){
        Cartao cartao = new Cartao(banco, this);
        this.addProduto(cartao);
        banco.addProduto(cartao);
    }
    public void pedirChequeEspecial(double limite, double taxaDeJuros, Banco banco){
        ChequeEspecial chequeEspecial = new ChequeEspecial(limite, taxaDeJuros, banco, this);
        this.addProduto(chequeEspecial);
        banco.addProduto(chequeEspecial);
    }
    public void setEmpresa(Empresa empresa){
        this.empresa = empresa;
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

    public Empresa getEmpresa() {
        return this.empresa;
    }
}
