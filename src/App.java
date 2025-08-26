import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        /*Scanner scanner = new Scanner(System.in);
        String stuff = scanner.nextLine();
        System.out.println(stuff); */
        
        int x;//decleration
        x = 5;//initialization
        char c = 'C';
        double numbers = 19.5;
        // camel casing
        final int CONNY = 5;

        //comparisons
        boolean boo = false;
        System.out.println(!boo != false);

        //conditional
        if(!boo) System.out.println("boo passed");

        //short circuit
        int divisor = 0;
        if(divisor !=0 && 5/divisor>1) System.out.println("omg");

        System.out.println(x);
        System.out.println("Hello, Owen Croniser");

        //scanner.close();
        } 
    }
}
