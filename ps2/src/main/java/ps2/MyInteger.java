package ps2;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}
	
	public int setiValue(int iValue) {
		return this.iValue = iValue;
		
	}
	public boolean isEven() {
		return (iValue % 2 == 0 ? true : false);
	}

	public boolean isOdd() {
		return !isEven();
	}
	
	public boolean isPrime() {
		int f = 0;
		for (f = 2; f <= iValue / 2; f++) {
			if (iValue % f != 0) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isEven(int iValue) {
		MyInteger myInt = new MyInteger(iValue);
		return myInt.isEven();
	}
	
	public static boolean isOdd(int val) {
		return !isEven(val);
	}
	
	
	public static boolean isPrime(int val) {
		int f = 0;
		for (f = 2; f <= val / 2; f++) {
			if (val % f != 0) {
				return true;
			}
		}
		return false;
		}
	
	public static boolean isEven(MyInteger myInt) {
		return myInt.isEven();
	}
	
	public static boolean isOdd(MyInteger myInt) {
		return myInt.isOdd();
	}
	
	public static boolean isPrime(MyInteger myInt) {
		return myInt.isPrime();
	}

	public boolean equals(int iValue) {
		if (this.iValue == iValue)
			return true;
		else
			return false;
	}
	
	public boolean equals(MyInteger myInt) {
		return equals(myInt.getiValue());
	}

}
