import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.println("Uppgift A");
        System.out.print("Skriv en text: ");

        String text = tb.nextLine();

        System.out.println('"'+text+'"');
        System.out.println("Längden på texten är: " + text.length());

        System.out.println("Uppgift B");
        System.out.println("Tecknet a ligger på plats: "+text.indexOf("a")+" i texten");
        
        System.out.println("Uppgift C");
        System.out.print("Skriv en siffra där texten börjar: ");
        int start = tb.nextInt();
        System.out.print("Skriv en siffra där texten slutar: ");
        int slut = tb.nextInt();

        String del_sträng = text.substring(start, slut);

        System.out.println(del_sträng);

        System.out.println("Uppgift D");

        System.out.println("Din text innehåller Hej: " + text.contains("Hej"));
       
    }
}
