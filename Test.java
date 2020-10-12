package test;

import pc.PC;
import harddisk.HardDisk;
import cpu.CPU;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cpu=new CPU();
		HardDisk disk=new HardDisk();
		cpu.setspeed(2200);
		cpu.setbrand("ÁúÌÚ");
		disk.setamount(200);
		disk.setcolor("ºÚÉ«");
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();

	}

}
