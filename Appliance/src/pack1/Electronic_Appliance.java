
//define a class Demo1
//	define "perform()" method in such a way that it can accept any specific appliance and invoke "on" ,"off" and also "fillwater()" whenever "Washing_Machine" is passed to "perform()" method.

package pack1;

public class Electronic_Appliance
{
	void on()
	{
	}
	void off()
	{
	}
}
class Tv extends Electronic_Appliance
{
	void on()
	{
		System.out.println("Tv on");
	}
	void off()
	{
		System.out.println("Tv off");
	}
}
class Washing_Machine extends Electronic_Appliance
{
	void on()
	{
		System.out.println("Washing_Machine on");
	}
	void off()
	{
		System.out.println("Washing_Machine off");
	}
	void fillWater()
	{
		System.out.println("fill required amount of water");
	}
}

