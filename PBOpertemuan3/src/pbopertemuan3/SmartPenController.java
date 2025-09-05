/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuan3;

/**
 *
 * @author LEGION
 */
public class SmartPenController {
    public void connectPen() {
        System.out.println("M-Pencil connected with default settings");
    }
    
    public void connectPen(String penModel) {
        System.out.println(penModel + " connected to MatePad Pro");
    }
    
    public void connectPen(String penModel, int pressureSensitivity) {
        System.out.println(penModel + " connected with " + pressureSensitivity + " levels of pressure sensitivity");
    }
}