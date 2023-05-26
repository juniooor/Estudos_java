import java.text.NumberFormat.Style;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Junior";
        System.out.println(nome.toUpperCase());
        String outronome = "JUnior";
        System.out.println(nome.equalsIgnoreCase(outronome));

        LocalDate today = LocalDate.now();
        Locale country = new Locale("pt", "BR");
        String diaDaSemana = today.getDayOfWeek().getDisplayName(TextStyle.FULL, country);
        System.out.println(diaDaSemana);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() <12 ){
            saudacao = "Bom dia! ";
        } 
        else if (agora.getHour() >=12 && agora.getHour() <18 ){
            saudacao = "Boa tarde! ";
        }
        else if (agora.getHour() >=18 && agora.getHour() <24 ){
            saudacao = "Boa noite! ";
        }
        else {
            saudacao = "olá";
        }

        System.out.printf("Olá %s. , HOje é %s. , %s %n", nome,diaDaSemana, saudacao.toUpperCase());
    }   
}
