
import java.util.*;

public class App {

    static int menu() {
        Scanner leia = new Scanner(System.in);

        System.out.println("=== Árvore Binária de Busca ===");
        System.out.println("1. Inserir elemento");
        System.out.println("2. Remover elemento");
        System.out.println("3. Buscar elemento");
        System.out.println("4. Exibir árvore");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        return leia.nextInt();
    }

    public static void cadastrarDadosAlunos() {
        Scanner leia = new Scanner(System.in);
       AVLTree<Aluno> arvore = new AVLTree<>();
        int opcao = 0;

        do {
            System.out.println("----------------------------------");
            opcao = menu();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a matricula a ser inserida: ");
                    int matriculaInserir = leia.nextInt();
                    leia.nextLine();

                    System.out.print("Digite o nome a ser inserido: ");
                    String nomeInserir = leia.nextLine();

                    Aluno aluno = new Aluno(nomeInserir, matriculaInserir);
                    arvore.add(aluno);
                    System.out.println("Aluno inserido com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite a matricula do aluno a ser removido: ");
                    int matriculaRemover = leia.nextInt();
                    Aluno alunoRemover = new Aluno("", matriculaRemover);
                    arvore.remove(alunoRemover);
                    System.out.println("Aluno removido com sucesso!");
                    break;

                case 3:
                    System.out.print("Digite matricula a ser buscada: ");
                    int matriculaBuscar = leia.nextInt();
                    leia.nextLine();

                    Aluno alunoBusca = new Aluno("", matriculaBuscar);
                    Aluno alunoEncontrado = arvore.buscar(alunoBusca);

                    if (alunoEncontrado != null) {
                        System.out.println("Aluno encontrado: " + alunoEncontrado);
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;

                case 4:
                    System.out.println("Exibindo a árvore em pré-ordem:");
                    arvore.preOrder();
                    System.out.println("Exibindo a árvore em ordem:");
                    arvore.inOrder();
                    System.out.println("Exibindo a árvore em pós-ordem:");
                    arvore.postOrder();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }

    public static void cadastrarDadosInteiros() {
        Scanner leia = new Scanner(System.in);
        AVLTree<Integer> arvore = new AVLTree<>();
        int opcao = 0;

        do {
            System.out.println("----------------------------------");
            opcao = menu();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o elemento a ser inserido: ");
                    Integer elementoInserir = leia.nextInt();
                    arvore.add(elementoInserir);
                    System.out.println("Elemento inserido com sucesso!");
                    break;

                case 2:
                    System.out.println("Remoção não será testada nesta etapa.");
                    break;

                case 3:
                    System.out.print("Digite o elemento a ser buscado: ");
                    Integer elementoBuscar = leia.nextInt();

                    if (arvore.buscar(elementoBuscar) != null) {
                        System.out.println("Elemento encontrado!");
                    } else {
                        System.out.println("Elemento não encontrado!");
                    }
                    break;

                case 4:
                    System.out.println("Exibindo a árvore em pré-ordem:");
                    arvore.preOrder();
                    System.out.println("Exibindo a árvore em ordem:");
                    arvore.inOrder();
                    System.out.println("Exibindo a árvore em pós-ordem:");
                    arvore.postOrder();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    public static void main(String[] args) throws Exception {
        cadastrarDadosInteiros();
    }
}
