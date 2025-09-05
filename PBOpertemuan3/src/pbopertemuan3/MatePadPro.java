/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuan3;

/**
 *
 * @author LEGION
 */
public class MatePadPro extends HuaweiDevice implements Connectivity, Multimedia, Productivity {
    private int batteryCapacity;
    private boolean pencilConnected;
    
    public MatePadPro(String processor, int batteryCapacity) {
        super("Huawei MatePad Pro 13.2", 13.2, processor);
        this.batteryCapacity = batteryCapacity;
        this.pencilConnected = true;
    }

    @Override
    public void displaySpecs() {
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Processor: " + processor);
        System.out.println("Battery Capacity: " + batteryCapacity + "mAh");
        System.out.println("M-Pencil Connected: " + (pencilConnected ? "Yes" : "No"));
    }
    
    @Override
    public void enableHarmonyOSFeature() {
        System.out.println("HarmonyOS features activated on " + model);
    }
    
    // Interface Connectivity
    @Override
    public void connectWifi(String networkName) {
        System.out.println(model + " connected to WiFi: " + networkName);
    }
    
    @Override
    public void connectBluetooth(String deviceName) {
        System.out.println(model + " connected to Bluetooth device: " + deviceName);
    }
    
    // Interface Multimedia
    @Override
    public void playVideo(String videoTitle) {
        System.out.println("Playing video: " + videoTitle + " on " + model);
    }
    
    @Override
    public void playAudio(String audioTitle) {
        System.out.println("Playing audio: " + audioTitle + " on " + model);
    }
    
    // Interface Productivity
    @Override
    public void openApp(String appName) {
        System.out.println("Opening " + appName + " on " + model);
    }
    
    @Override
    public void multitask() {
        System.out.println("Multitasking with multiple windows on " + model);
    }
    
    // Overload method - connectBluetooth dengan parameter berbeda
    public void connectBluetooth(String deviceName, int batteryLevel) {
        System.out.println(model + " connected to " + deviceName + " (Battery: " + batteryLevel + "%)");
    }
}