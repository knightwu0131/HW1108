
public class test_p24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1=new Car();
		car1.show();
		car1.setCar(1234,20.5);
		 car1.show();
		System.out.println("�u���ܨ���");
		car1.setCar(2345);
		car1.show();
		System.out.println("�u���ܨT�o�q");
		car1.setCar(30.5);
		car1.show();
	}

}
class Car
{
private	int num;
private	double gas; 
   public void setCar(int n) {
	num=n;
   System.out.println("�N�����]��"+num);
}
   public void setCar(double g) {
	gas=g;
System.out.println("�N�T�o�]��"+gas);
}

   public void setCar(int n, double g) {
		num=n;
		gas=g;
	System.out.println("�N�����]��"+num+"�N�T�o�]��"+gas);
	}
	void show() {
		System.out.println("�����O"+this.num);
	    System.out.println("�T�o�q�O"+this.gas);

	}

}