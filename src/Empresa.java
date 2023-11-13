import java.util.ArrayList;
import java.util.List;

public class Empresa {
    public static List<Empresa> empresas = new ArrayList<Empresa>();
    private List<Cliente> funcionarios= new ArrayList<Cliente>();
    private String nome;
    private String cnpj;
    private String endereco;
    public Empresa(String nome, String cnpj, String endereco){
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.empresas.add(this);
    }
    public String getNome(){
        return this.nome;
    }
    public String getCnpj(){
        return this.cnpj;
    }
    public String getEndereco(){
        return this.endereco;
    }

    public void addFuncionario(Cliente funcionario){
        this.funcionarios.add(funcionario);
    }
    public List<Cliente> getFuncionarios(){
        return this.funcionarios;
    }
}
