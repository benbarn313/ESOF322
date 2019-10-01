package strategy;
import java.util.Scanner;

/**
 *
 * @author Alex Ekstrom and Ben Barnett
 * This is our driver class to execute the program
 */

public abstract class Client {
    
    public static void main(String[] args) {
        
        Scanner stdin = new Scanner(System.in);
        char answer;
        StorageMethod sm = new StorageMethod(new TableStore());
        int q = 0;
        
        while(q == 0)
        {
        // Will be creating a switch statement
        System.out.println("Welcome client, this program will allow you to "
                + "choose where you would like your data stored at. It will"
                + " give you 3 choices to choose from.");
        System.out.println("-----------------------");
        System.out.println("A. Store using a table.");
        System.out.println("B. Store using a document.");
        System.out.println("C. Store using nodes.");
        System.out.println("D. Exit program");
        System.out.println("Please enter either A, B, or C");
        
        answer = stdin.nextLine().charAt(0);
        
        // Using a switch statement to allow our client to easily choose where 
        // They want their information stored at
        
        switch(answer){
            case 'a':
            case 'A': 
                sm = new StorageMethod(new TableStore());
        
                break;
                
            case 'b':
            case 'B': 
                sm = new StorageMethod(new DocumentStore());

                break;
                
            case 'c':
            case 'C': 
                sm = new StorageMethod(new NodeStore());
   
                break;
                
            case 'd':
            case 'D':
                return;
                          
            default: System.out.println("The letter you entered was not one "
                    + "of the options. Please try again.");
        }
        
        System.out.println("Now you will create a bike.");
        System.out.println("Enter bike color:");
        String color = stdin.nextLine();
        System.out.println("Enter bike serial num (0-999):");
        String serialNumber = stdin.nextLine();
        Bike b = new Bike(color,serialNumber);
        
        sm.executeStrategy(b);
        }
    }
}
