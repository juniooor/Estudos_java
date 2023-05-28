package Animais;

public class Cachorro{
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;
    public String estado;

    public void latir(){
        System.out.println("AU AU AU!");
    }

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){
        switch(acao){
            case "carinho": this.estado = "feliz"; break;
            case "reclamar": this.estado = "triste"; break;
            case "dormir": this.estado = "bravo"; break;
            default: this.estado = "neutro"; break;
        }
        return estado;
    }
}

