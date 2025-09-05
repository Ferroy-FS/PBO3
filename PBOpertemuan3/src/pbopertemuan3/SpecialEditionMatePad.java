/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuan3;

/**
 *
 * @author LEGION
 */
public class SpecialEditionMatePad extends MatePadPro {
    private String editionName;
    
    public SpecialEditionMatePad(String processor, int batteryCapacity, String editionName) {
        super(processor, batteryCapacity);
        this.editionName = editionName;
    }
    
    @Override
    public void displaySpecs() {
        super.displaySpecs();
        System.out.println("Special Edition: " + editionName);
    }
    
    @Override
    public void enableHarmonyOSFeature() {
        System.out.println("Special HarmonyOS features activated for " + editionName + " edition");
    }
}