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
        System.out.println("Skriv in ett tecken: ");
        String tecken = tb.nextLine();
        System.out.println("Tecknet"+tecken+ "ligger på plats: "+text.indexOf(tecken)+" i texten");
        
         //* Uppgift C*/
        System.out.print("Skriv en siffra där texten ska delas: ");
        int start = tb.nextInt();
        System.out.print("Skriv en till siffra där texten ska delas: ");
        int slut = tb.nextInt();

        String del_sträng = text.substring(start, slut);

        System.out.println(del_sträng);
       
        //* Uppgift D*/
        System.out.println("Skriv ett ord: ");
        String ord = tb.nextLine();
        System.out.println("Din text har ordet "+ord+":" + text.contains(ord));
        
        //* Uppgift E*/

        tb.nextLine();
        System.out.println("Välj en del av din text som ska bytas ut: ");
        String byta = tb.nextLine();

        System.out.println("Skriv vad delen ska bytas ut till: ");
        String byta2 = tb.nextLine();

        System.out.println(text.replace(byta, byta2));


        

    }
}
