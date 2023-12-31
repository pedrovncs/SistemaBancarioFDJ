import java.sql.SQLOutput;
import java.util.Scanner;

public class MenuCriar extends TerminalOption {
    Scanner scanner = new Scanner(System.in);

    public void executar(String selected) {
        while (!selected.equals("0")) {
            System.out.println("MENU CRIAR");
            System.out.println("O que você deseja criar?");
            System.out.println("1 - Banco");
            System.out.println("2 - Agência");
            System.out.println("3 - Cliente");
            System.out.println("4 - Conta");
            System.out.println("5 - Cartão");
            System.out.println("6 - Cheque especial");
            System.out.println("7 - Empresa");
            System.out.println("0 - Voltar");
            selected = scanner.nextLine();
            switch (selected) {
                case "1": {
                    System.out.println(("Digite o nome do banco: "));
                    String nome = scanner.nextLine();
                    Banco banco = new Banco(nome);
                    System.out.println("\n Banco criado com sucesso! \n");
                    break;
                }
                case "2": {
                    if (Banco.bancos.isEmpty()) {
                        System.out.println("\n Não há bancos cadastrados \n");
                        break;
                    }
                    System.out.println("Selecione o banco: ");
                    for (int i = 0; i < Banco.bancos.size(); i++) {
                        System.out.println(i + 1 + " - " + Banco.bancos.get(i).getNome());
                    }
                    System.out.println("0 - Voltar");
                    selected = scanner.nextLine();
                    if (selected.equals("0")) {
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    }
                    Banco banco = Banco.bancos.get(Integer.parseInt(selected) - 1);
                    System.out.println("Digite o número da agência: ");
                    String numero = scanner.nextLine();
                    banco.criarAgencia(numero);
                    System.out.println("\n Agência criada com sucesso! \n");
                    break;
                }
                case "3": {
                    System.out.println("Digite o nome do cliente");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o cpf do cliente");
                    String cpf = scanner.nextLine();
                    Cliente cliente = new Cliente(nome, cpf);
                    System.out.println("O cliente é funcionário de alguma empresa? (s/n)");
                    String resposta = scanner.nextLine();
                    if (resposta.equals("s")) {
                        if (Empresa.empresas.isEmpty()) {
                            System.out.println("\n Não há empresas cadastradas \n");
                            break;
                        }
                        System.out.println("Selecione a empresa: ");
                        for (int i = 0; i < Empresa.empresas.size(); i++) {
                            System.out.println(i + 1 + " - " + Empresa.empresas.get(i).getNome());
                        }
                        System.out.println("0 - Voltar");
                        selected = scanner.nextLine();
                        if (selected.equals("0")) {
                            System.out.println("-> Retorno a tela anterior");
                            break;
                        }
                        Empresa empresa = Empresa.empresas.get(Integer.parseInt(selected) - 1);
                        cliente.setEmpresa(empresa);
                        empresa.addFuncionario(cliente);
                    }
                    System.out.println("\n Cliente criado com sucesso! \n");
                    break;
                }
                case "4": {
                    if (Cliente.clientes.isEmpty()) {
                        System.out.println("\n Não há clientes cadastrados \n");
                        break;
                    }
                    System.out.println("Selecione o cliente: ");
                    for (int i = 0; i < Cliente.clientes.size(); i++) {
                        System.out.println(i + 1 + " - " + Cliente.clientes.get(i).getNome());
                    }
                    System.out.println("0 - Voltar");
                    selected = scanner.nextLine();
                    if (selected.equals("0")) {
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    }
                    Cliente cliente = Cliente.clientes.get(Integer.parseInt(selected) - 1);

                    if (Banco.bancos.isEmpty()) {
                        System.out.println("\n Não há bancos cadastrados \n");
                        break;
                    }
                    System.out.println("Selecione o banco: ");
                    for (int i = 0; i < Banco.bancos.size(); i++) {
                        System.out.println(i + 1 + " - " + Banco.bancos.get(i).getNome());
                    }
                    System.out.println("0 - Voltar");
                    selected = scanner.nextLine();
                    if (selected.equals("0")) {
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    }
                    Banco banco = Banco.bancos.get(Integer.parseInt(selected) - 1);
                    System.out.println("Escolha o tipo da conta: ");
                    System.out.println("1 - Conta corrente");
                    System.out.println("2 - Conta poupança");
                    System.out.println("3 - Conta salário");
                    String tipoConta = scanner.nextLine();
                    switch (tipoConta){
                        case "1":
                            tipoConta = "corrente";
                            break;
                        case "2":
                            tipoConta = "poupança";
                            break;
                        case "3":
                            tipoConta = "salário";
                            break;
                        default:
                            System.out.println("\n Opção inválida \n");
                            break;
                    }

                    cliente.abrirConta(tipoConta, banco);
                    System.out.println("Conta " + tipoConta +  "\n criada com sucesso! \n");
                    break;
                }
                case "5": {
                    if (Cliente.clientes.isEmpty()) {
                        System.out.println("\n Não há clientes cadastrados \n");
                        break;
                    }
                    System.out.println("Selecione o cliente: ");
                    for (int i = 0; i < Cliente.clientes.size(); i++) {
                        System.out.println(i + 1 + " - " + Cliente.clientes.get(i).getNome());
                    }
                    System.out.println("0 - Voltar");
                    selected = scanner.nextLine();
                    if (selected.equals("0")) {
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    }
                    Cliente cliente = Cliente.clientes.get(Integer.parseInt(selected) - 1);

                    if (Banco.bancos.isEmpty()) {
                        System.out.println("\n Não há bancos cadastrados \n");
                        break;
                    }
                    System.out.println("Selecione o banco: ");
                    for (int i = 0; i < Banco.bancos.size(); i++) {
                        System.out.println(i + 1 + " - " + Banco.bancos.get(i).getNome());
                    }
                    System.out.println("0 - Voltar");
                    selected = scanner.nextLine();
                    if (selected.equals("0")) {
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    }
                    Banco banco = Banco.bancos.get(Integer.parseInt(selected) - 1);
                    cliente.pedirCartao(banco);
                    System.out.println("\n Cartão criado com sucesso! \n");
                    break;
                }
                case "6": {
                    if (Cliente.clientes.isEmpty()) {
                        System.out.println("\n Não há clientes cadastrados \n");
                        break;
                    }
                    System.out.println("Selecione o cliente: ");
                    for (int i = 0; i < Cliente.clientes.size(); i++) {
                        System.out.println(i + 1 + " - " + Cliente.clientes.get(i).getNome());
                    }
                    System.out.println("0 - Voltar");
                    selected = scanner.nextLine();
                    if (selected.equals("0")) {
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    }
                    Cliente cliente = Cliente.clientes.get(Integer.parseInt(selected) - 1);

                    if (Banco.bancos.isEmpty()) {
                        System.out.println("\n Não há bancos cadastrados \n");
                        break;
                    }
                    System.out.println("Selecione o banco: ");
                    for (int i = 0; i < Banco.bancos.size(); i++) {
                        System.out.println(i + 1 + " - " + Banco.bancos.get(i).getNome());
                    }
                    System.out.println("0 - Voltar");
                    selected = scanner.nextLine();
                    if (selected.equals("0")) {
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    }
                    Banco banco = Banco.bancos.get(Integer.parseInt(selected) - 1);
                    System.out.println("Digite o limite do cheque especial: ");
                    double limiteChequeEspecial = Double.parseDouble(scanner.nextLine());
                    System.out.println("Digite a taxa de juros do cheque especial: ");
                    double taxaDeJuros = Double.parseDouble(scanner.nextLine());
                    cliente.pedirChequeEspecial(limiteChequeEspecial, taxaDeJuros, banco);
                    System.out.println("\n Cheque especial criado com sucesso! \n");
                    break;
                }
                case "7": {
                    System.out.println("Digite o nome da empresa: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o cnpj da empresa: ");
                    String cnpj = scanner.nextLine();
                    System.out.println("Digite o endereço da empresa: ");
                    String endereco = scanner.nextLine();
                    Empresa empresa = new Empresa(nome,cnpj,endereco);
                    System.out.println("\n Empresa criada com sucesso! \n");
                    break;
                }
                case "0":
                    System.out.println("\n -> Retorno a tela anterior \n");
                    break;
                default:
                    System.out.println("\n Opção inválida \n");
                    break;
            }
        }
    }
}
