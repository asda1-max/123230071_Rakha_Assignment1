/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas071;

/**
 *
 * @author A Z E R O T H
 */
abstract class GPU {
    protected String name;
    protected int vram; // dalam GB
    protected double clockSpeed; // dalam MHz
    protected int temperature;

    GPU(String name, int vram, double clockSpeed, int temperature) {
        this.name = name;
        this.vram = vram;
        this.clockSpeed = clockSpeed;
        this.temperature = temperature;
    }

    abstract void boostClock();
    abstract void monitorTemperature();
    abstract void vramAmount();
}


