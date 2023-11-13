import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selected = "";
        while (!selected.equals("0")) {
            System.out.println("Bem vindo ao sistema bancario ");
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Menu Criar");
            System.out.println("2 - Menu Consultar");
            System.out.println("3 - Menu Remover");
            System.out.println("4 - Menu Ações");
            System.out.println("5 - Criar Exemplo");
            System.out.println("0 - Sair");
            selected = scanner.nextLine();
            switch (selected) {
                case "1":
                    MenuCriar menuCriar = new MenuCriar();
                    menuCriar.executar(selected);
                    break;
                case "2":
                    MenuConsultar menuConsultar = new MenuConsultar();
                    menuConsultar.executar(selected);
                    break;
                case "3":
                    MenuRemover menuRemover = new MenuRemover();
                    menuRemover.executar(selected);
                    break;
                case "4":
                    MenuAcoes menuAcoes = new MenuAcoes();
                    menuAcoes.executar(selected);
                    break;
                case "5": {
                    Exemplo exemplo = new Exemplo();
                    exemplo.executar();
                    break;
                }
                case "0":
                    System.out.println("\n ENCERRADO \n");
                    break;
                default:
                    System.out.println("\n Opção inválida \n");
                    break;

            }
        }
    }
}