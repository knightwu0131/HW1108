public class test_p51
{
	public static void main(String[] args)
	{
		Car18[] car1;
		car1 = new Car18[3];
		
		for(int i=0;i<car1.length;i++)
		{
			car1[i] = new Car18();
		}
		
		car1[0].setCar18(1234,20.5);
		car1[1].setCar18(2345,30.5);
		car1[2].setCar18(3456,40.5);
		
		for(int i=0;i<car1.length;i++)
		{
			car1[i].show();
		}
	}
}

class Car18
{
    int num;
	double gas;
	
	public Car18()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCar18(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);;
	}
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}