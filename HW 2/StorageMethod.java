/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author alexekstrom
 */
public class StorageMethod
{
   private Strategy strategy; 

   public StorageMethod(Strategy strategy) {
        this.strategy = strategy;
   }
   


public void executeStrategy(Bike b) {
        strategy.storeData(b);
    }    
}
