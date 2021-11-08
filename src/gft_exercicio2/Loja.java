package gft_exercicio2;
import java.util.List;

public class Loja {
    private String nome;
    private String CNPJ;
    private List <Livro> livros;
    private List <VideoGame> videoGames;
    
    public Loja (String nome, String CNPJ, List <Livro> livro, List <VideoGame> videoGames) {
        this.CNPJ = CNPJ;
        this.nome = nome;
        this.livros = livro;
        this.videoGames = videoGames;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
public void listalivros () {
    System.out.println("--------------------------------------------------------");
    if (livros != null) {
        System.out.println("A loja Americanas possui esses livros para venda: \n");
        for (int i = 0; i < livros.size(); i++) {
            System.out.println("Título: " + livros.get(i).getNome() + ", preço: " + livros.get(i).getPreco() + ", quantidade: " + livros.get(i).getQtd() + " em estoque.");
        }
        System.out.println("----------------------------------------------------");
    }
}
public void listaVideoGame() {
    if (videoGames != null) {
        System.out.println("A loja Americanas possui esses video games para venda: \n");
        for (int i = 0; i < videoGames.size(); i++) {
            System.out.println("Video game: " + videoGames.get(i).getModelo() + ", preço: " + videoGames.get(i).getPreco() + ", quantidade: " + videoGames.get(i).getQtd() + " em estoque.");           
        }
    }
        else {
                System.out.println("A loja não tem video games no seu estoque.");
                }
        System.out.println("----------------------------------------------------");    
} 
public double calculaPatrimonio () {
    double r = 0.00;
    for (Livro index: livros) {
        r = r + (index.getPreco()*index.getQtd());
    }
    for (VideoGame index: videoGames) {
        r = r + (index.getPreco()*index.getQtd());
    }
    System.out.println("O patrimônio da loja " + nome + " é de " + r);
    return r;
}
}
