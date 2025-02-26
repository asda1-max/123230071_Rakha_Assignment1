/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas071;

/**
 *
 * @author A Z E R O T H
 */
// Main Class
public class tugas071 {
    public static void main(String[] args) {
        NvidiaGPU nvidia = new NvidiaGPU("RTX 4090", 24, 2500,70);
        AMDGPU amd = new AMDGPU("RX 7900 XTX", 24, 2300,65);
        IntelGPU intel = new IntelGPU("Intel Arc A770", 16, 2100,60);

        System.out.println("\n=== NVIDIA GPU ===");
        nvidia.boostClock();
        nvidia.monitorTemperature();
        nvidia.vramAmount();
        nvidia.overclock(250);
        nvidia.dlssVersion(3);

        System.out.println("\n=== AMD GPU ===");
        amd.boostClock();
        amd.monitorTemperature();
        amd.vramAmount();
        amd.overclock(200);
        amd.fsrVersion(3);

        System.out.println("\n=== Intel GPU ===");
        intel.boostClock();
        intel.monitorTemperature();
        intel.vramAmount();
        intel.xessVersion(2);
    }
}
