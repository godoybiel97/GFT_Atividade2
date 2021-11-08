package gft_exercicio2;

public class VideoGame extends Produto {
    private String marca;
    private String modelo;
    private boolean isUsado;


public VideoGame (String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
    super (nome, preco, qtd);
    this.nome = nome;
    this.marca = marca;
    this.modelo = modelo;
}   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isIsUsado() {
        return isUsado;
    }

    public void setIsUsado(boolean isUsado) {
        this.isUsado = isUsado;
    }
    
    public double calculaImposto() {
        double I = 0;
        if (isUsado == true) {
            I = preco * 0.25;
            System.out.println("O imposto do PS4 Slim usado é R$ " + I);
        }
        else {
            I = preco * 0.45;
            System.out.println("O imposto do PS4 Slim é RS " + I + "\n");
        }
        return I;
    }

}
