import Animais.Cachorro;

public class App {
    public static void main(String[] args) {
        Cachorro cachorro1;
        cachorro1 = new Cachorro("cacau", "marron", 50, 25.5, 30, "carinho");

        System.out.println(cachorro1.getNome());
        System.out.println(cachorro1.getCor());
        System.out.println(cachorro1.getPeso());
        cachorro1.latir();
        System.out.println(cachorro1.pegar()); 
        System.out.println(cachorro1.interagir("carinho"));
        System.out.println(cachorro1.interagir("dormir"));
        System.out.println(cachorro1.interagir("reclamar"));
        System.out.println(cachorro1.interagir(""));
    }   

}

