/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbopertemuan3;

/**
 *
 * @author LEGION
 */
abstract class HuaweiDevice extends Tablet {
    protected String processor;
    
    public HuaweiDevice(String model, double screenSize, String processor) {
        super(model, screenSize);
        this.processor = processor;
    }
    
    public abstract void enableHarmonyOSFeature();
}