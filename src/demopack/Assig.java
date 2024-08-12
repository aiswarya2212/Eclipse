package demopack;

import java.util.Scanner;

public class Assig {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int a = sc.nextInt();
int  t=1;
/*int a =5*/
for(int i=1;i<=a;i++)
{
	t*=i;
}
System.out.println("factorial of "+a+ " is "+t);
	}

}
