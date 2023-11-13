import java.util.Scanner;
public class MenuAcoes {
    Scanner scanner = new Scanner(System.in);
    public void executar(String selected){
        while(!selected.equals("0")){
            System.out.println(("MENU DE AÇÕES"));
            if(Cliente.clientes.isEmpty()){
                System.out.println("\n ERRO: Não há clientes cadastrados \n");
                break;
            }
            System.out.println("Selecione o cliente: ");
            for(int i = 0; i < Cliente.clientes.size(); i++){
                System.out.println(i + 1 + " - " + Cliente.clientes.get(i).getNome());
            }
            System.out.println("0 - Voltar");
            selected = scanner.nextLine();
            if(selected.equals("0")){
                System.out.println("-> Retorno a tela anterior");
                break;
            }
            Cliente cliente = Cliente.clientes.get(Integer.parseInt(selected) - 1);
            if (cliente.getProdutos().isEmpty()){
                System.out.println("\n ERRO: Não há produtos cadastrados \n");
                break;
            }
            System.out.println("Selecione o produto: ");
            for(int i = 0; i < cliente.getProdutos().size(); i++){
                System.out.println(i + 1 + " - " + cliente.getProdutos().get(i).getCodigo() + " - " + cliente.getProdutos().get(i).getDescricao());
            }
            System.out.println("0 - Voltar");
            selected = scanner.nextLine();
            if(selected.equals("0")){
                System.out.println("-> Retorno a tela anterior");
                break;
            }
            Produto produto = cliente.getProdutos().get(Integer.parseInt(selected) - 1);
            System.out.println("Selecione a ação: ");
            if (produto instanceof Conta){
                Conta conta = (Conta) produto;
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Transferir");
                System.out.println("0 - Voltar");
                selected = scanner.nextLine();
                switch (selected){
                    case "1":
                        System.out.println("Digite o valor a ser depositado: ");
                        selected = scanner.nextLine();
                        conta.depositar(Double.parseDouble(selected));
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    case "2":
                        System.out.println("Digite o valor a ser sacado: ");
                        selected = scanner.nextLine();
                        conta.sacar(Double.parseDouble(selected));
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    case "3":
                        if (Conta.contas.isEmpty()){
                            System.out.println("\n ERRO: Não há contas cadastradas \n");
                            break;
                        }
                        System.out.println("Selecione a conta de envio: ");
                        for (int i = 0; i < Conta.contas.size(); i++){
                            System.out.println(i + 1 + " - " + Conta.contas.get(i).getNumero() + " - " + Conta.contas.get(i).getDescricao());
                        }
                        System.out.println("0 - Voltar");
                        selected = scanner.nextLine();
                        if(selected.equals("0")){
                            System.out.println("-> Retorno a tela anterior");
                            break;
                        }
                        Conta contaDestino = Conta.contas.get(Integer.parseInt(selected) - 1);
                        System.out.println("Digite o valor a ser transferido: ");
                        selected = scanner.nextLine();
                        conta.transferir(contaDestino, Double.parseDouble(selected));
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    case "0":
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    default:
                        System.out.println("\n Opção inválida \n");
                        break;
                }
            }
            else if ( produto instanceof Cartao ){
                System.out.println("1 - Habilitar / débito");
                System.out.println("2 - Habilitar / crédito");
                System.out.println("3 - Alterar limite");
                System.out.println("4 - Gerar fatura");
                System.out.println("5 - Pagar fatura");
                System.out.println("0 - Voltar");
                selected = scanner.nextLine();
                Cartao cartao = (Cartao) produto;
                switch (selected){
                    case "1":
                        cartao.setDebito();
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    case "2":
                        cartao.setCredito();
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    case "3":
                        System.out.println("Digite o novo limite: ");
                        selected = scanner.nextLine();
                        cartao.setLimite(Double.parseDouble(selected));
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    case "4":
                        cartao.gerarFatura();
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    case "5":
                        cartao.pagarFatura();
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    case "0":
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    default:
                        System.out.println("\n Opção inválida \n");
                        break;
                }

            }
            else if (produto instanceof ChequeEspecial){
ChequeEspecial chequeEspecial = (ChequeEspecial) produto;
                System.out.println("1 - Alterar limite");
                System.out.println("2 - Alterar taxa de juros");
                System.out.println("3 - Usar cheque especial");
                System.out.println("4 - Pagar cheque especial");
                System.out.println("0 - Voltar");
                selected = scanner.nextLine();
                switch (selected){
                    case "1":
                        System.out.println("Digite o novo limite: ");
                        selected = scanner.nextLine();
                        chequeEspecial.setLimite(Double.parseDouble(selected));
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    case "2":
                        System.out.println("Digite a nova taxa de juros: ");
                        selected = scanner.nextLine();
                        chequeEspecial.setTaxaDeJuros(Double.parseDouble(selected));
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    case "3":
                        System.out.println("Digite o valor a ser usado: ");
                        selected = scanner.nextLine();
                        chequeEspecial.useChequeEspecial(Double.parseDouble(selected));
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    case "4":
                        System.out.println("Digite o valor a ser pago: ");
                        selected = scanner.nextLine();
                        chequeEspecial.pagarChequeEspecial(Double.parseDouble(selected));
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    case "0":
                        System.out.println("-> Retorno a tela anterior");
                        break;
                    default:
                        System.out.println("\n Opção inválida \n");
                        break;
                }

            }
        }
    }
}
