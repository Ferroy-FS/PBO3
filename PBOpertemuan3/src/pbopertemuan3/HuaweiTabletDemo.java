/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuan3;

/**
 *
 * @author LEGION
 */
public class HuaweiTabletDemo {

    public static void main(String[] args) {
        System.out.println("=== DEMO HUAWEI MATEPAD PRO 13.2 ===");
        MatePadPro myTablet = new MatePadPro("Kirin 9000s", 10000);
        myTablet.powerOn();
        myTablet.displaySpecs();
        System.out.println("");
        
        System.out.println("=== Interface ===");
        myTablet.enableHarmonyOSFeature();
        myTablet.connectWifi("Home-Network");
        myTablet.connectBluetooth("Huawei FreeBuds");
        myTablet.connectBluetooth("Huawei Mouse", 85);
        myTablet.playVideo("4K Demo Video");
        myTablet.playAudio("My Favorite Song");
        myTablet.openApp("WPS Office");
        myTablet.multitask();
        System.out.println("");
        
        System.out.println("=== Abstract ===");
        OLEDDisplay display = new OLEDDisplay(2880, 97.5);
        display.showDisplayInfo();
        display.showDisplayInfo(true); 
        System.out.println("");
        
        System.out.println("=== Override ===");
        SpecialEditionMatePad specialTablet = new SpecialEditionMatePad("Kirin 9000s", 10000, "Artist Edition");
        specialTablet.displaySpecs(); 
        specialTablet.enableHarmonyOSFeature(); 
        System.out.println("");
        
        System.out.println("=== Overloading ===");
        SmartPenController penController = new SmartPenController();
        penController.connectPen();
        penController.connectPen("M-Pencil 2");
        penController.connectPen("M-Pencil 3", 4096);
    }
}