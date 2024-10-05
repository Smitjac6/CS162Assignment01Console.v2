import java.util.Scanner;

public class IOconsole {
    public static void main (String []args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your Favorite drink?");
        String drink = scanner.nextLine(); 
        
        System.out.println("You like " + drink);

        if (args.length > 0) {
            
            System.out.println("You like " + args[0]);
        }
        
        }
}

