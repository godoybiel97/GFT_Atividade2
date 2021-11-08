package gft_exercicio2;
import java.util.ArrayList;
import java.util.List;

public class GFT_Exercicio2 {

    public static void main(String[] args) {
        Livro L1 = new Livro ("Harry Potter", 40, 50, "J. K. Rowling", "Fantasia", 300);
        Livro L2 = new Livro ("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "Fantasia", 500);
        Livro L3 = new Livro ("POO Java", 20, 50, "GFT", "Educativo", 500);
        
        VideoGame ps4 = new VideoGame ("PS4", 1800, 100, "Sony", "Slim", false);
        VideoGame ps4Usado = new VideoGame ("PS4", 1000, 7, "Sony", "Slim", true);
        VideoGame xbox = new VideoGame ("XBOX", 1500, 500, "Microsoft", "One", false);
        
        List<Livro> livros = new ArrayList<>();
        livros.add(L1);
        livros.add(L2);
        livros.add(L3);
        
        List<VideoGame> games = new ArrayList<>();
        games.add(ps4);
        games.add(ps4Usado);
        games.add(xbox);
        
        Loja americanas = new Loja ("Americanas", "12345678", livros, games);
        L2.calculaImposto();
        L3.calculaImposto();
        
        ps4Usado.calculaImposto();
        ps4.calculaImposto();
        
        americanas.listalivros();
        americanas.listaVideoGame();
        americanas.calculaPatrimonio();
        
        
    }
    
}
