import java.util.Scanner;
public class project63 {

	private int n1,n2,d1,d2, top,bottom, total =0;
	
	
	public void add()
	{
		top = (n1*d2)+(n2*d1);
		bottom = d1*d2;
		zerotest(bottom);
		
	}
	public void subtract()
	{
		top = (n1*d2)-(n2*d1);
		bottom = d1*d2;
		zerotest(bottom);
		
	}
	public void multiple()
	{
		top = n1*n2;
		bottom = d1*d2;
		zerotest(bottom);
		
	}
	public void division()
	{
		top = n1*d2;
		bottom = d1*n2;
		zerotest(bottom);
		
	}
	// don't know how to use this 
	public void tester(int a, int b)
	{
		if ((a/b)%2 ==0)
			total = a/b;
	}
	public void zerotest(int a)
	{
		if(a ==0)
			System.out.println("can't divided by zero");
			System.exit(1);
		
	}
	public String toString() { return top + "/" + bottom ;}
	 public static void main(String args[])
	 { String op; int num1, num2, den1,den2 = 0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the Opraction( +, -, /,*)::" );
		 op = sc.next();
		 System.out.println("numerator 1::" );
		 num1 = sc.nextInt();
		 System.out.println("denominator 1::" );
		 den1 = sc.nextInt();
		 System.out.println(num1 + "/" + den1 +" "+ op + " ?/? = ?/?" );
		 System.out.println("numerator 2::" );
		 num2 = sc.nextInt();
		 System.out.println("denominator 2::" );
		 den2 = sc.nextInt();
		 System.out.print(num2 + "/" + den2);
		 
		 project63 test = new project63();
		 if (op == "+")
			 test.add();
		 else if (op =="-")
			 test.subtract();
		 else if (op=="/")
			 test.division();
		 else
		 {
			 test.multiple();
		 }
	 } // end of main 
	 
}// end of project class
