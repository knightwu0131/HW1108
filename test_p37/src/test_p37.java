import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p37 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請輸入英文字母");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
      String str =br.readLine();
      String stru =str.toUpperCase();
      String strl =str.toLowerCase();
      System.out.println("轉換成大寫的是"+stru);
      System.out.println("轉換成小寫的是"+strl);
	}

}
