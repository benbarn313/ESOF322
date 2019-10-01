package strategy;

/**
 *
 * @author Alex Ekstrom and Ben Barnett
 */

public class NodeStore implements Strategy
{
    //make a root node with a median serial number
    Bike basic = new Bike("red", "500");
    Node root = new Node(basic);
    Node current = root;
    
    int j = 0;
    @Override
    public void storeData(Bike b)
    {
        Node n = new Node(b);
        
        while(j == 0)
        {
            // if the node in question is less than the current, look at the left node
            if(Integer.parseInt(current.getBike().getSerialNumber()) > Integer.parseInt(n.getBike().getSerialNumber()))
                    {
                        //if the left exists, go to it and rexamine there
                        if(current.getL() != null)
                        {
                            current = current.getL();
                        }
                        //if it doesnt exist, put the node in question there
                        else
                        {
                            System.out.println("Stored bike " + b.getSerialNumber() + " in the tree with the Node Store method");
                            current.setL(n);
                            //end while loop
                            j = 1;
                        }
                            
                    }
            //if the right exists, go to it and rexamine there
            else if(current.getR() != null)
            {
                current = current.getR();
            }
            //if it doesnt exist, put the node in question there
            else 
            {
                System.out.println("Stored bike " + b.getSerialNumber() + " in the tree with the Node Store method");
                current.setR(n);
                //end while loop
                j = 1;
            }
                
        }
    }	
}

