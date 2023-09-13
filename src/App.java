import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tb = new Scanner(System.in);
        System.out.println("Skriv en text: ");

        String text = tb.nextLine();

        System.out.println("Längden på texten är: " + text.length());

       
    }
}
