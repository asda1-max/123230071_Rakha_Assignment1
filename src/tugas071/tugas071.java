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
        NvidiaGPU rtx4090 = new NvidiaGPU("RTX 4090", 24, 2500,70);
        AmdGPU rx7900xtx = new AmdGPU("RX 7900 XTX", 24, 2300,65);
        IntelGPU arcA770 = new IntelGPU("Intel Arc A770", 16, 2100,60);

        System.out.println("\n<=== NVIDIA GPU ===>");
        rtx4090.boostClock();
        rtx4090.monitorTemperature();
        rtx4090.vramAmount();
        rtx4090.overclock(250);
        rtx4090.dlssVersion(3);

        System.out.println("\n<=== AMD GPU ===>");
        rx7900xtx.boostClock();
        rx7900xtx.monitorTemperature();
        rx7900xtx.vramAmount();
        rx7900xtx.overclock(200);
        rx7900xtx.fsrVersion(3);

        System.out.println("\n<=== Intel GPU ===>");
        arcA770.boostClock();
        arcA770.monitorTemperature();
        arcA770.vramAmount();
        arcA770.xessVersion(2);
    }
}
