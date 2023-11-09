import java.util.Scanner;

public class MenuRemover extends TerminalOption {
    Scanner scanner = new Scanner(System.in);

    public void executar(String selected) {
        Integer index;
        while (!selected.equals("0")) {
            System.out.println("MENU REMOVER");
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Remover Banco");
            System.out.println("2 - Remover Agencia");
            System.out.println("3 - Remover Cliente");
            System.out.println("4 - Remover Produto");
            System.out.println("0 - Voltar");
            selected = scanner.nextLine();
            switch (selected){
                case "1":{
                    System.out.println("Qual banco deseja remover: ");
                    for (int i = 0; i < Banco.bancos.size(); i++){
                        System.out.println( i + 1 + " - " + Banco.bancos.get(i).getNome());
                    }
                    System.out.println("0 - Voltar");
                    selected = scanner.nextLine();
                    if (selected.equals("0")){
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    }
                    index = Integer.parseInt(selected) - 1;
                    Banco.bancos.remove(index);
                    System.out.println( Banco.bancos.get(index).getNome() + " removido com sucesso");
                    break;
                }
                case "2":{
                    System.out.println("A qual banco a agencia pertence:  ");{
                        for (int i = 0; i < Banco.bancos.size(); i++){
                            System.out.println( i + 1 + " - " + Banco.bancos.get(i).getNome());
                        }
                        System.out.println("0 - Voltar");
                        selected = scanner.nextLine();
                        if (selected.equals("0")){
                            System.out.println("-> Retorno a tela anterior");
                            break;
                        }
                        index = Integer.parseInt(selected) - 1;
                        Banco banco = Banco.bancos.get(index);
                        if (banco.getAgencias().isEmpty()){
                            System.out.println("Não há agencias cadastradas neste banco.");
                            break;
                        }
                        System.out.println("Qual agencia deseja remover: ");
                        for (int i = 0; i < banco.getAgencias().size(); i++){
                            System.out.println( i + 1 + " - " + banco.getAgencias().get(i).getNumero());
                        }
                        selected = scanner.nextLine();
                        index = Integer.parseInt(selected) - 1;
                        banco.removerAgencia(banco.getAgencias().get(index));
                        System.out.println("Agencia: " + banco.getAgencias().get(index).getNumero() + "removida com sucesso");
                        break;
                    }
                }
                case "3":{
                    if (Cliente.clientes.isEmpty()){
                        System.out.println("Não há clientes cadastrados.");
                        break;
                    }
                    System.out.println("Qual cliente deseja remover: ");
                    for (int i = 0; i < Cliente.clientes.size(); i++){
                        System.out.println( i + 1 + " - " + Cliente.clientes.get(i).getNome());
                    }
                    System.out.println("0 - Voltar");
                    selected = scanner.nextLine();
                    if (selected.equals("0")){
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    }
                    index = Integer.parseInt(selected) - 1;
                    Cliente.clientes.remove(index);
                    System.out.println( Cliente.clientes.get(index).getNome() + " removido com sucesso");
                    break;
                }
                case "4":{
                    System.out.println("De qual cliente deseja remover o produto: ");
                    for (int i = 0; i < Cliente.clientes.size(); i++){
                        System.out.println( i + 1 + " - " + Cliente.clientes.get(i).getNome());
                    }
                    System.out.println("0 - Voltar");
                    selected = scanner.nextLine();
                    if (selected.equals("0")){
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    }
                    index = Integer.parseInt(selected) - 1;
                    Cliente cliente = Cliente.clientes.get(index);
                    if (cliente.getProdutos().isEmpty()){
                        System.out.println("Não há produtos cadastrados para este cliente.");
                        break;
                    }
                    System.out.println("Qual produto deseja remover: ");
                    for (int i = 0; i < cliente.getProdutos().size(); i++){
                        System.out.println( i + 1 + " - " + cliente.getProdutos().get(i).getCodigo() +
                                cliente.getProdutos().get(i).getDescricao() +
                                " - " + cliente.getProdutos().get(i).getBanco().getNome());
                    }
                    selected = scanner.nextLine();
                    index = Integer.parseInt(selected) - 1;
                    cliente.getProdutos().remove(index);
                    System.out.println("Produto: " + cliente.getProdutos().get(index).getCodigo() + "removido com sucesso");
                    break;
                }
                default:{
                    System.out.println("Opção inválida");
                    break;
                }

            }

        }
    }
}

