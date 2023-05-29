package Animais;

public class Gato extends Animal {
    static int numeroDeGatos;
  
   
    public Gato(String nome, String cor, double altura, double peso, String estado) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estado = estado;

        numeroDeGatos ++;
    }
    @Override
    public String toString() {
        return "gato [nome=" + nome + "]";
    }
    
    
}


    
