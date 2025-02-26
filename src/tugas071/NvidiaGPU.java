/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas071;

/**
 *
 * @author A Z E R O T H
 */
public class NvidiaGPU extends GPU implements Overclockable, DLSS {
    NvidiaGPU(String name, int vram, double clockSpeed, int temperature) {
        super(name, vram, clockSpeed, temperature);
    }

    @Override
    void boostClock() {
        System.out.println(name + " boosts clock speed to " + (clockSpeed + 200) + " MHz.");
    }

    @Override
    void monitorTemperature() {
        System.out.println(name + " temperature is stable at " + temperature + " Celcius");
    }

    
    @Override
    public void overclock(double increment) {
        clockSpeed += increment;
        System.out.println(name + " is overclocked to " + clockSpeed + " MHz.");
    }
    
    @Override
    public void dlssVersion(int version) {
        System.out.println(name + " DLSS Version is " + version);
    }
    
     @Override
    void vramAmount() {
        System.out.println(name + " VRAM amount = " + vram);
    }
}