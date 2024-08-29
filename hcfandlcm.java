import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int num1,num2,hcf=0,lcm=0;
		Scanner sc=new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1<0 || num2<0){
		    System.out.println("input should be positive");
		}
		else{  
		for(int i=1;i<num2;i++){
		    if(num1%i==0 && num2%i==0){
		         hcf=i;
		    }
		     lcm=(num1*num2)/hcf;
		}
		System.out.println("lcm="+lcm);
		System.out.println("hcf="+hcf);
		}
		
	}
}
