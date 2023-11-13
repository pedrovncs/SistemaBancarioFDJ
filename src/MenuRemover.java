import java.util.Scanner;
import java.util.List;

public class MenuRemover extends TerminalOption {
    Scanner scanner = new Scanner(System.in);

    public void executar(String selected) {
        while (!selected.equals("0")) {
            System.out.println("MENU REMOVER");
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Remover Banco");
            System.out.println("2 - Remover Agencia");
            System.out.println("3 - Remover Cliente");
            System.out.println("4 - Remover Produto");
            System.out.println("0 - Voltar");
            selected = scanner.nextLine();

            switch (selected) {
                case "1":
                    removerBanco();
                    break;
                case "2":
                    removerAgencia();
                    break;
                case "3":
                    removerCliente();
                    break;
                case "4":
                    removerProduto();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    private void removerBanco() {
        if (Banco.bancos.isEmpty()) {
            System.out.println("Erro: Não há bancos cadastrados. Nenhum banco removido.");
            return;
        }

        System.out.println("Qual banco deseja remover: ");
        listarElementos(Banco.bancos);

        Banco bancoSelecionado = obterObjeto(Banco.bancos);
        if (bancoSelecionado != null) {
            Banco.bancos.remove(bancoSelecionado);
            System.out.println("Banco removido com sucesso");
        } else {
            System.out.println("Erro: Banco não encontrado. Nenhum banco removido.");
        }
    }

    private void removerAgencia() {
        if (Banco.bancos.isEmpty()) {
            System.out.println("Erro: Não há bancos cadastrados. Nenhuma agência removida.");
            return;
        }

        System.out.println("A qual banco a agência pertence: ");
        listarElementos(Banco.bancos);

        Banco bancoSelecionado = obterObjeto(Banco.bancos);
        if (bancoSelecionado != null) {
            if (bancoSelecionado.getAgencias().isEmpty()) {
                System.out.println("Erro: Não há agências cadastradas neste banco. Nenhuma agência removida.");
                return;
            }

            System.out.println("Qual agência deseja remover: ");
            listarElementos(bancoSelecionado.getAgencias());

            Agencia agenciaSelecionada = obterObjeto(bancoSelecionado.getAgencias());
            if (agenciaSelecionada != null) {
                bancoSelecionado.removerAgencia(agenciaSelecionada);
                System.out.println("Agência removida com sucesso");
            } else {
                System.out.println("Erro: Agência não encontrada. Nenhuma agência removida.");
            }
        } else {
            System.out.println("Erro: Banco não encontrado. Nenhuma agência removida.");
        }
    }

    private void removerCliente() {
        if (Cliente.clientes.isEmpty()) {
            System.out.println("Erro: Não há clientes cadastrados. Nenhum cliente removido.");
            return;
        }

        System.out.println("Qual cliente deseja remover: ");
        listarElementos(Cliente.clientes);

        Cliente clienteSelecionado = obterObjeto(Cliente.clientes);
        if (clienteSelecionado != null) {
            Cliente.clientes.remove(clienteSelecionado);
            System.out.println("Cliente removido com sucesso");
        } else {
            System.out.println("Erro: Cliente não encontrado. Nenhum cliente removido.");
        }
    }

    private void removerProduto() {
        if (Cliente.clientes.isEmpty()) {
            System.out.println("Erro: Não há clientes cadastrados. Nenhum produto removido.");
            return;
        }

        System.out.println("De qual cliente deseja remover o produto: ");
        listarElementos(Cliente.clientes);

        Cliente clienteSelecionado = obterObjeto(Cliente.clientes);
        if (clienteSelecionado != null) {
            List<Produto> produtosCliente = clienteSelecionado.getProdutos();

            if (produtosCliente.isEmpty()) {
                System.out.println("Erro: Não há produtos cadastrados para este cliente. Nenhum produto removido.");
                return;
            }

            System.out.println("Qual produto deseja remover: ");
            listarElementos(produtosCliente);

            Produto produtoSelecionado = obterObjeto(produtosCliente);
            if (produtoSelecionado != null) {
                produtosCliente.remove(produtoSelecionado);
                System.out.println("Produto removido com sucesso");
            } else {
                System.out.println("Erro: Produto não encontrado. Nenhum produto removido.");
            }
        } else {
            System.out.println("Erro: Cliente não encontrado. Nenhum produto removido.");
        }
    }

    private <T> T obterObjeto(List<T> elementos) {
        int index = obterIndice();
        if (index >= 0 && index < elementos.size()) {
            return elementos.get(index);
        }
        return null;
    }

    private void listarElementos(List<?> elementos) {
        for (int i = 0; i < elementos.size(); i++) {
            System.out.println(i + 1 + " - " + elementos.get(i).toString());
        }
        System.out.println("0 - Voltar");
    }

    private int obterIndice() {
        String selected = scanner.nextLine();
        if (selected.equals("0")) {
            System.out.println("-> Retorno a tela anterior");
            return -1;
        }
        return Integer.parseInt(selected) - 1;
    }
}
