import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BR_MultiTable {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter Number: ");
        int num=Integer.parseInt(br.readLine());
 
        System.out.println("MULTIPLICATION TABLE");
 
 
            for(int j=1; j<=10; j++)
            {
                System.out.println(num+ "*" +j+ "="  +num*j );
            }
	}

}