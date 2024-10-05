import java.util.Scanner;

public class IOconsole {
    public static void main (String []args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your Favorite drink?");
        String drink = scanner.nextLine(); 
        

        if (args.length > 0) {

            int times = Integer.parseInt(args[0]);

            for (int j =  0; j < times ;j++ ){

            System.out.println("You like " + drink);
            }
        }
        
        }
}


