import java.util.*;

public class App {

    static int menu(){
        Scanner leia = new Scanner(System.in);
        
        System.out.println("=== Cadastro de Alunos - Árvore Binária de Busca ===");
        System.out.println("1. Inserir aluno");
        System.out.println("2. Remover aluno");
        System.out.println("3. Buscar aluno");
        System.out.println("4. Exibir alunos");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        return leia.nextInt();
    }
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        BinarySearchTree<Aluno> arvore = new BinarySearchTree <>(); // Instanciar a arvore
        int opcao=0;
        do {
            System.out.println("----------------------------------");
            opcao = menu();
            switch (opcao) {  
                case 1:
                    System.out.print("Digite a matricula a ser inserida: ");                    
                    int matriculaInserir = leia.nextInt();
                    leia.nextLine();

                    System.out.print("Digite o nome a ser inserido:");
                    String nomeInserir = leia.nextLine();

                    Aluno aluno = new Aluno(nomeInserir, matriculaInserir);
                    arvore.add(aluno);
                   
                    System.out.println("Aluno inserido com sucesso!");

                break;

                 case 2:
                    System.out.print("Digite a matricula do aluno a ser removido: ");
                    int matriculaRemover = leia.nextInt();
                    Aluno alunoRemover = new Aluno( "", matriculaRemover);
                    arvore.remove(alunoRemover); // remover elemento da árvore
                    System.out.println("aluno removido com sucesso");
                    break;



                case 3:
                    System.out.print("Digite matricula a ser buscada: ");
                    int matriculaBuscar = leia.nextInt();
                    leia.nextLine();

                    Aluno alunoBusca = new Aluno("",matriculaBuscar);
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

                default:
                     System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }
}

