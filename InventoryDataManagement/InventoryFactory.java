package com.bridgelabz.oop.InventoryDataManagement;

import java.util.List;

/**
 *  model file for inventory data management
 *
 */

public class InventoryFactory {

    private List<Rice> Rice;
    private List<Wheats> Wheats;
    private List<Pulses> Pulses;

    public List<Rice> getRice() {
        return Rice;
    }

    public void setRice(List<Rice> rice) {
        Rice = rice;
    }

    public List<Wheats> getWheats() {
        return Wheats;
    }

    public void setWheats(List<Wheats> wheats) {
        Wheats = wheats;
    }

    public List<Pulses> getPulses() {
        return Pulses;
    }

    public void setPulses(List<Pulses> pulses) {
        Pulses = pulses;
    }


}