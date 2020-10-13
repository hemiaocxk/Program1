package cpu;

public class CPU {
	private int speed;
	  String brand;	 
	  public int getspeed(){
		  if(speed>0){
			  speed=speed;
			}else{
				System.out.println("Error");
			}
		return speed;
		
	}
	  public String getbrand(){
		return brand;
		 
	  }
	 public void setspeed(int speed){
		this.speed=speed;
		
	}
	 public void setbrand(String brand){
		 this.brand=brand;
	 }

}
