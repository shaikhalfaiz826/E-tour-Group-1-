

package pack1;

public class Demo8
{
	static void perform(Electronic_Appliance ref)
	{
		ref.on();
		ref.off();
		
		if(ref instanceof Washing_Machine)
		{
			Washing_Machine ob=(Washing_Machine)ref;
			ob.fillWater();
		}
	}
	public static void main(String[] args)
	{
		perform(new Tv());
		perform(new Washing_Machine());
	}

}
