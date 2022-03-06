import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
        System.out.println("Enter Number: ");
        int num=Integer.parseInt(br.readLine());
        int fact = 1;
        for(int i=1; i<=num; i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of the Given Number is :" +fact);
	}

}