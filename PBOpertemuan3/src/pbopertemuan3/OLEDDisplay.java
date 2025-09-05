/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuan3;

/**
 *
 * @author LEGION
 */
public class OLEDDisplay extends DisplayTechnology {
    private double colorGamut;
    
    public OLEDDisplay(int resolution, double colorGamut) {
        super("OLED", resolution);
        this.colorGamut = colorGamut;
    }
    
    @Override
    public void showDisplayInfo() {
        System.out.println("Display Type: " + displayType);
        System.out.println("Resolution: " + resolution + "p");
        System.out.println("Color Gamut: " + colorGamut + "% DCI-P3");
    }
    
    public void showDisplayInfo(boolean hdrEnabled) {
        showDisplayInfo();
        System.out.println("HDR: " + (hdrEnabled ? "Enabled" : "Disabled"));
    }
}