/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbopertemuan3;

/**
 *
 * @author LEGION
 */
abstract class Tablet {
    protected String model;
    protected double screenSize;
    
    public Tablet(String model, double screenSize) {
        this.model = model;
        this.screenSize = screenSize;
    }
    
    public abstract void displaySpecs();
    
    public void powerOn() {
        System.out.println(model + " is Activated");
    }
}