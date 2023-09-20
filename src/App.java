import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
         //* Uppgift A*/
        System.out.print("Skriv en text: ");

        String text = tb.nextLine();

        System.out.println('"'+text+'"');
        System.out.println("Längden på texten är: " + text.length());
        
         //* Uppgift B*/
        System.out.println("Tecknet a ligger på plats: "+text.indexOf("a")+" i texten");
        
         //* Uppgift C*/
        System.out.print("Skriv en siffra där texten ska delas: ");
        int start = tb.nextInt();
        System.out.print("Skriv en till siffra där texten ska delas: ");
        int slut = tb.nextInt();

        String del_sträng = text.substring(start, slut);

        System.out.println(del_sträng);
       
        //* Uppgift D*/
        System.out.println("Din text innehåller Hej: " + text.contains("Hej"));
        
        //* Uppgift E*/

        tb.nextLine();
        System.out.println("Välj en del av din text som ska bytas ut: ");
        String byta = tb.nextLine();

        System.out.println("Skriv vad delen ska bytas ut till: ");
        String byta2 = tb.nextLine();

        System.out.println(text.replace(byta, byta2));


        

    }
}
