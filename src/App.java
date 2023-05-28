import Animais.Cachorro;

public class App {
    public static void main(String[] args) {
        Cachorro cachorro1;
        cachorro1 = new Cachorro();

        cachorro1.nome = "Cacau";
        cachorro1.cor = "Marron";
        cachorro1.altura = 40;
        cachorro1.peso = 25.3;
        cachorro1.tamanhoDoRabo = 30;

        cachorro1.latir();
        System.out.println(cachorro1.pegar()); 
        System.out.println(cachorro1.interagir("carinho"));
        System.out.println(cachorro1.interagir("dormir"));
        System.out.println(cachorro1.interagir("reclamar"));
        System.out.println(cachorro1.interagir(""));
    }   

}

