package pc;

import harddisk.HardDisk;
import cpu.CPU;

public class PC {
	CPU cpu;
	HardDisk hd;
	
	public void setCPU(CPU c){
		this.cpu=c;
	}
	public void setHardDisk(HardDisk h){
		this.hd=h;
	}
	public void show(){
		System.out.println("CPU的速度："+cpu.getspeed());
		System.out.println("CPU的品牌："+cpu.getbrand());
		System.out.println("硬盘的容量："+hd.getamount());
	    System.out.println("硬盘的颜色："+hd.getcolor());
	}

}
