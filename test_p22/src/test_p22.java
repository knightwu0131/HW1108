
public class test_p22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1;
		car1=new Car();
		 int number=1234;
		 double gasoline=20.5;
		 car1.setNumGas(number, gasoline);
		 
		 car1.show();
		System.out.println("指定不正確的汽油量(-10.0)看看");
		
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
	System.out.println("將車號設為"+num+"將汽油設為"+gas);
		}
		else {
			System.out.println(g+"不是正確的汽油量");
			System.out.println("無法更變汽油量");
		}
	}
	void show() {
		System.out.println("車號是"+this.num);
	    System.out.println("汽油量是"+this.gas);

	}

}