package strategy;

/**
 *
 * @author Alex Ekstrom and Ben Barnett
 * 
 * This class is our "object" class and we are focusing on our client entering
 * information about multiple bikes which will then be stored in a place
 * of their choosing
 */
public class Bike {  
    
// Creating a bike class that will be testing our store options in the program
    
    public Bike(String color, String serialNumber) 
    {
        this.color = color;
        this.serialNumber = serialNumber;
    }
    
// Implementing the bike into the strategy
    
    String color;
    String serialNumber;
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getSerialNumber() {
        return serialNumber;
    }
    
    public void setserialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    

// Getting and setting elements of the bike that we will store in program
}
