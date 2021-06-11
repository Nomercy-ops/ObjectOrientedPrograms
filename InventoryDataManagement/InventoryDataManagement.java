/**
 * 
 * @author Rikesh Chhetri
 * @version 1.0
 * @Created_on: 10.06.21
 * 
 *  purpose:  is to read the value of inventory items from json file and calculate the price.
 */

package com.bridgelabz.oop.InventoryDataManagement;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class InventoryDataManagement {

    // getting the path source of a json file
    public static void main(String[] args) {

        try {
            System.out.println("Reading JSON from a file");
            System.out.println("----------------------------");
            
            // path for the json file
            String pathName = "D:\\Inventorys.json";
            
             //convert the json object back to json string using mapper to calculate total price of inventory items..
            ObjectMapper mapper = new ObjectMapper();
            InventoryFactory factory = mapper.readValue(new File(pathName), InventoryFactory.class);

            System.out.print(" The Total Price of  " + factory.getRice().get(0).getName());
            System.out.print(" for " + factory.getRice().get(0).getWeight() + "Kg ");
            System.out.println(" is : " + factory.getRice().get(0).getWeight() * factory.getRice().get(0).getPricePerKg());
            System.out.print(" The Total Price of  " + factory.getPulses().get(0).getName());
            System.out.print(" for " + factory.getPulses().get(0).getWeight() + "Kg ");
            System.out.println(" is : " + factory.getPulses().get(0).getWeight() * factory.getPulses().get(0).getPricePerKg());
            System.out.print(" The Total Price of  " + factory.getWheats().get(0).getName());
            System.out.print(" for " + factory.getWheats().get(0).getWeight() + "Kg ");
            System.out.println(" is : " + factory.getWheats().get(0).getWeight() * factory.getWheats().get(0).getPricePerKg());

        } catch (IOException e) {
        } // end of  catch block
    }
}
