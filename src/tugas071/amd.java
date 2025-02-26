/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas071;

/**
 *
 * @author A Z E R O T H
 */
    class AMDGPU extends GPU implements Overclockable, FSR {
    AMDGPU(String name, int vram, double clockSpeed, int temperature) {
        super(name, vram, clockSpeed, temperature);
    }

    @Override
    void boostClock() {
        System.out.println(name + " boosts clock speed to " + (clockSpeed + 150) + " MHz.");
    }

    @Override
    void monitorTemperature() {
        System.out.println(name + " temperature is stable at " + temperature + " Celcius");
    }
    
    @Override
    void vramAmount() {
        System.out.println(name + " VRAM amount = " + vram);
    }
    
    @Override
    public void overclock(double increment) {
        clockSpeed += increment;
        System.out.println(name + " is overclocked to " + clockSpeed + " MHz.");
    }
    
    @Override
    public void fsrVersion(int version) {
        System.out.println( name + " FSR Version is " + version);
    }
}
