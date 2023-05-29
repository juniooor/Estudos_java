package Animais;

public class Passaro extends Animal{
    static int numeroDePassaros;
   

    public Passaro(String nome, String cor, double altura, double peso, String estado) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estado = estado;
    
        numeroDePassaros ++
    }
    
    
}
