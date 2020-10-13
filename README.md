# Program1
Program项目仓库

#阅读程序

## 一、实验目的
1、使用JAVA创建不同的类，理解类的属性及构造方法
2、学会使用访问权限的几种类型，体验不同修饰符的用法
## 二、实验过程
1、在不同的包里创建PC，CPU，HardDisk和Test四个类，其中Test是主类，具体要求如下：
-CPU类中必须设置一个int型的成员变量speed，有一个void类型的setspeed(int speed)方法将参数speed辅助给Speed,并使用getspeed()返回speed的值
-HardDisk类中必须有一个int型的成员变量amount，有一个void类型的setamount(int amount)方法将参数amount辅助给Amount,并使用getamount()返回amount的值
-PC类中要求实例化CPU类中的cpu和HardDisk类中的hd,并使用setCPU（CPU c）将参数c的值赋值给cpu，使用setHardDisk（HardDisk h）将参数h的值赋值给hd,使用show（）方法显示cpu的速度和硬盘的容量
-Test类作为主类，需要在main方法中创建一个CPU对象cpu,将自己的speed设置为2200，创建一个HardDisk对象disk,将自己的amount设置为200，创建一个PC对象pc,对象pc需成功调用setCPU(CPU c)方法，调用时实参是cpu,调用setHardDisk(HardDisk h)方法，调用时实参是disk,并且调用show()方法
2、完成附加要求：
-多把个类放置在不同的包中
-类中定义不少于两个构造方法，每个类定义不少于两个属性，且类的属性应多样化并体验各种修饰符的用法
-定义的方法中应该有符合常理的逻辑判断
## 三、核心代码
1. 方法一
             public void setCPU(CPU c){
		this.cpu=c;
	    }

2.方法二
                                                   public void setHardDisk(HardDisk h){
		                                         this.hd=h;
	                                         }

3.方法三
                                                  public void show(){
		                                      System.out.println("CPU的速度："+cpu.getspeed());
		                                      System.out.println("CPU的品牌："+cpu.getbrand());
		                                      System.out.println("硬盘的容量："+hd.getamount());
	                                              System.out.println("硬盘的颜色："+hd.getcolor());
	                                        }
	
4.方法四
                                                 public int getspeed(){
		                                         if(speed>0){
			                                   speed=speed;
			                                   }else{
			                          	System.out.println("Error");
			                            }
		                                            return speed;
		
	                                                 }

## 四、实验结果
运行结果无异常，运行结果如下图

  
