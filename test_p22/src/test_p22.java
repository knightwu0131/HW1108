
public class test_p22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1=new Car();
		 int number=1234;
		 double gasoline=20.5;
		 car1.setNumGas(number, gasoline);
		 
		 car1.show();
		System.out.println("���w�����T���T�o�q(-10.0)�ݬ�");
		
		car1.setNumGas(1234,-10.0);
		car1.show();
	}

}
class Car
{
private	int num;
private	double gas; 
	void setNumGas(int n, double g) {
		if(g>0 &&g<100) {
		num=n;
		gas=g;
	System.out.println("�N�����]��"+num+"�N�T�o�]��"+gas);
		}
		else {
			System.out.println(g+"���O���T���T�o�q");
			System.out.println("�L�k���ܨT�o�q");
		}
	}
	void show() {
		System.out.println("�����O"+this.num);
	    System.out.println("�T�o�q�O"+this.gas);

	}

}