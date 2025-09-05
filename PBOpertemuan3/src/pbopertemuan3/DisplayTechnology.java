/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuan3;

/**
 *
 * @author LEGION
 */
abstract class DisplayTechnology {
    protected String displayType;
    protected int resolution;
    
    public DisplayTechnology(String displayType, int resolution) {
        this.displayType = displayType;
        this.resolution = resolution;
    }
    
    public abstract void showDisplayInfo();
}