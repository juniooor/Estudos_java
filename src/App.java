import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("INFORME O SEU NOME");
        String nome1 = sc.nextLine();

        System.out.println("INFORME SEU PRIMEIRO NOME");
        String nome2=sc.nextLine();
        System.out.println("Informe a sua Idade: ");
        int idade = sc.nextInt();
        System.out.println("Informe seu salario: ");
        double salario = sc.nextDouble();
        System.out.println("Informe a taxa: ");
        float taxa = sc.nextFloat();
        System.out.println("Informe o seu sexo:");
        char sexo = sc.next().charAt(0);

        sc.close();

    }   
}
