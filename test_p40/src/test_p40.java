import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p40 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�п�J�r��C");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
      String str1 =br.readLine();
      System.out.println("�п�J�n�s������r�C");
      
      String str2 =br.readLine();
      StringBuffer sb =new StringBuffer(str1);
      sb.append(str2);
    
    	  System.out.println("�b�u"+str1+"�v����s�W�u"+str2+"�v�N�|�ܦ��u"+sb+"�v");
}
}