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
		System.out.println("CPU���ٶȣ�"+cpu.getspeed());
		System.out.println("CPU��Ʒ�ƣ�"+cpu.getbrand());
		System.out.println("Ӳ�̵�������"+hd.getamount());
	    System.out.println("Ӳ�̵���ɫ��"+hd.getcolor());
	}

}
