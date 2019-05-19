import java.util.Scanner;

public class TesteLivraria {
    public static void main(String[] args) {

        Catalogo catalogo1 = new Catalogo();
        Livro livro = new Livro("0");

        Scanner teclado1 = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0){
            System.out.println("##########################");
            System.out.println("Digite a opção desejada:");
            System.out.println("1- consultar estoque");
            System.out.println("2- cadastrar livro");
            System.out.println("3- consultar livro");
            System.out.println("4- efetuar venda");
            System.out.println("0- sair");
            System.out.println("##########################");

            opcao = teclado1.nextInt();

            switch (opcao){
                case 1 :
                    catalogo1.listarEstoque();
                    break;
                case 2 :
                    catalogo1.cadastrarLivro(livro);
                    break;
                case 3 :
                    System.out.println("digite o IBSN do livro");
                    String isbnConsulta = teclado1.next();
                    catalogo1.consultarLivro(isbnConsulta);
                    break;
                case 4 :
                    System.out.println("digite o IBSN do livro");
                    String isbnVenda = teclado1.next();
                    catalogo1.efetuarVenda(isbnVenda);
                    break;
                case 5 :
                    System.out.println("até logo...");
                    System.exit(0);
            }



        }












    }

}
