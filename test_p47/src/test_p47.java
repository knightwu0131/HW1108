public class test_p47
{
	public static void main(String[] args)
	{
		Car17 car1;
		car1 = new Car17();
		
		car1.show();
		
		int number = 1234;
		double gasoline = 20.5;
		String str = "1號車";
		
		car1.setCar17(number,gasoline);
		car1.setName(str);
		
		car1.show();
		
		
	}
}

class Car17
{
	private int num;
	private double gas;
	private String name;
	
	public Car17()
	{
		num = 0;
		gas = 0.0;
		name = "沒有名稱";
		System.out.println("生產了車子");
	}
	
	public void setCar17(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);;
	}
	public void setName(String nm)
	{
		name = nm;
		System.out.println("將車名設為"+name);
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("車名是"+name);
	}
}