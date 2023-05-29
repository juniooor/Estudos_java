package Animais;

public class Cachorro extends Animal{
    private int tamanhoDoRabo;
    static int numeroDeCachorros;

    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estado) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estado = estado;

        numeroDeCachorros ++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

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

