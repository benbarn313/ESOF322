package strategy;

/**
 *
 * @author Alex Ekstrom and Ben Barnett
 */

public class TableStore implements Strategy
{
    
    //storage array
    String[][] table = new String[20][2];
    int i = 0;
    
    //store the elements of the bikes sequentially in an array
    
    @Override
    public void storeData(Bike b)
    {
        table[i][0] = b.getSerialNumber();
        table[i][1] = b.getColor();
        i++;
        System.out.println("Stored bike " + b.getSerialNumber() + " in spot " 
                + (i + 1) + " of the array with the Table Store method");
    }
}
