public class Livro {
    private String codigo;
    private String titulo;
    private String autor;
    private int anoLancamento;
    private String isbn;
    private int qtdEstoque;
    private float preco;

    @Override
    public String toString() {
        return "Código: " + codigo + '\n' +
                "Título: " + titulo + '\n' +
                "Autor: " + autor + '\n' +
                "Ano: " + anoLancamento + '\n' +
                "ISBN: " + isbn + '\n' +
                "Quantidade de Estoque: " + qtdEstoque + '\n' +
                "Preço: R$" + preco + "\n                        ";
    }

    public Livro(String isbn) {
       this.isbn = isbn;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
