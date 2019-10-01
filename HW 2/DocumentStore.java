package strategy;

/**
 *
 * @author Alex Ekstrom and Ben Barnett
 */

public class DocumentStore implements Strategy{
    
 
 //storage array
 Bike[] data = new Bike[20];
 int i = 0;
 
 //store bikes sequntially in an array
 @Override
 public void storeData(Bike b)
 {
     System.out.println("Stored bike " + b.getSerialNumber() + " in spot " + i + " of the array with the Document Store method");
     data[i] = b;
 }
 
}

