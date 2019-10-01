/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Alex Ekstrom and Ben Barnett
 */
public class Node 
{
    Bike b;
    Node left;
    Node right;
 
    Node(Bike b) 
    {
        this.b = b;
        right = null;
        left = null;
    }
    //sets right node
    public void setR(Node r)
    {
        right = r;
    }
    //sets left node
    public void setL(Node l)
    {
        left = l;
    }
    //return right node
    public Node getR()
    {
        return right;
    }
    //return left node
    public Node getL()
    {
        return left;
    }
    public Bike getBike()
    {
        return b;
    }
}

