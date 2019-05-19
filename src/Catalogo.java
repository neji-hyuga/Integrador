import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Catalogo {
    private Map<String, Livro> estoque;
    private Livro livroNovo;


    public void cadastrarLivro (Livro livro){
        System.out.println("digite o isbn do livro: ");
        Scanner tecladoCadastro = new Scanner(System.in);
        String isbnDigitado = tecladoCadastro.next();
        livroNovo = new Livro(isbnDigitado);
        System.out.println("digite o código: ");
        String codigoDigitado = tecladoCadastro.next();
        livroNovo.setCodigo(codigoDigitado);
        System.out.println("digite o título do livro: ");
        String tituloDigitado = tecladoCadastro.next();
        livroNovo.setTitulo(tituloDigitado);
        System.out.println("digite o nome do autor do livro: ");
        String autorDigitado = tecladoCadastro.next();
        livroNovo.setAutor(autorDigitado);
        System.out.println("digite o ano de lançamento do livro: ");
        int anoDigitado = tecladoCadastro.nextInt();
        livroNovo.setAnoLancamento(anoDigitado);
        System.out.println("digite a quantidade de livros adicionadas ao estoque");
        int estoqueDigitado = tecladoCadastro.nextInt();
        livroNovo.setQtdEstoque(estoqueDigitado);
        System.out.println("digite o preço unitário do livro: ");
        float precoDigitado = tecladoCadastro.nextFloat();
        livroNovo.setPreco(precoDigitado);
        estoque.put(livroNovo.getIsbn(), livroNovo);
        System.out.println("livro cadastrado com sucesso");
        System.out.println("deseja ver o estoque atualizado? [S/N]");
        Scanner teclado = new Scanner(System.in);
        String opcao;
        opcao = teclado.next();

        if (opcao != "S"){ //aqui eu tentei com ==, mas ele tava fzndo a outra opção
            listarEstoque();
        }else{
            System.exit(0);
        }
    }

    public void listarEstoque(){
        for(String chave : estoque.keySet()) {
            System.out.println(estoque.get(chave).toString());
        }
    }

    public Livro consultarLivro (String isbn){

        Livro livro = estoque.get(isbn);
        if (livro == null){
            System.out.println("livro inexistente");
        } else{
            System.out.println("*************************");
            System.out.println(livro);
            System.out.println("*************************");
        } return livro;

    }

    public void efetuarVenda(String isbn) {
        try {
            Livro livro = estoque.get(isbn);
            if (livro.getQtdEstoque() < 0) {
                System.out.println("livro sem estoque");
            } else {
                livro.setQtdEstoque(livro.getQtdEstoque() - 1);
                System.out.println("vendido: " + livro.getTitulo() + "\nestoque atual: " + livro.getQtdEstoque());
            }
        }catch (NullPointerException e){
            System.out.println("livro não encontrado");
        }
    }

    public Catalogo() {
        estoque = new HashMap<>();
        Livro livro1 = new Livro("153209");
        livro1.setCodigo("34617");
        livro1.setTitulo("Guiness Book");
        livro1.setAutor("Robert Morales");
        livro1.setAnoLancamento(2019);
        livro1.setQtdEstoque(10);
        livro1.setPreco(170.0f);
        estoque.put(livro1.getIsbn(), livro1);

        Livro livro2 = new Livro("159989");
        livro2.setCodigo("879844");
        livro2.setTitulo("Atlas Moderno");
        livro2.setAutor("Banjamin Stuffs");
        livro2.setAnoLancamento(2018);
        livro2.setQtdEstoque(5);
        livro2.setPreco(100.0f);
        estoque.put(livro2.getIsbn(), livro2);
    }

    public Map<String, Livro> getEstoque() {
        return estoque;
    }

    public void setEstoque(Map<String, Livro> estoque) {
        this.estoque = estoque;
    }

    public Livro getLivroNovo() {
        return livroNovo;
    }

    public void setLivroNovo(Livro livroNovo) {
        this.livroNovo = livroNovo;
    }
}
