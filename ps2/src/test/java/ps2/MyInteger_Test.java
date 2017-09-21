package ps2;

public class MyInteger_Test {
	
	public static void main(String[] args) {
		MyInteger x = new MyInteger(47);
		System.out.println("x is even? " + x.isEven());
		System.out.println("x is odd? " + x.isOdd());
		System.out.println("x is prime? " + x.isPrime());
		System.out.println("17 is prime? " + MyInteger.isPrime(17));
		
		MyInteger y = new MyInteger(8);
		System.out.println("y is odd? " + y.isOdd());
		System.out.println("55 is odd? " + MyInteger.isOdd(55));
		System.out.println("x is equal to y? " + x.equals(y));
		System.out.println("x is equal to 47? " + x.equals(47));
	}
}
	