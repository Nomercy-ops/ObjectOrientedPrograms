
package com.bridgelabz.oop.InventoryManagementProgram;

/**
 *
 *  This is the model file for the inventory
 */
public class InventoryModel {
    
    private String name;
    private int weight;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
