
public class fractiontester {
	
	 public static void main(String args[])
	 {
		 Fraction, f1,f2,f3,f4,f5,f6,f7,f8; 
		 
		 f1 = new Fraction();
		 f2 = new Fraction(2,3);
		 f3 = new Fraction(3,4);
		 f4 = new Fraction(4,3);
		 System.out.println(f2.getNum());
		 System.out.println(f3.getDenom());
		 
		 f5 = f1.add(f2);
		 f6 = f2.subtract(f3);
		 f7 =f3.mulitply(f4);
		 f8 = f4.divide(f1);
		 System.out.println(f5);
		 System.out.println(f6);
		 System.out.println(f7);
		 System.out.println(f8);
	 }

}