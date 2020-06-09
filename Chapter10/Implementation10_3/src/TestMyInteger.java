
public class TestMyInteger {
public static void main(String [] args) {
	MyInteger i1 = new MyInteger(20);
	MyInteger i2 = new MyInteger(15);
	System.out.println("Testing isEven: " + i1.isEven());
	System.out.println("Testing isOdd: " + i1.isOdd());
	System.out.println("Testing isPrime: " + i1.isPrime());
	System.out.println(i1.parseInt("915"));
	char[] num = { '1' , '2' , '9' };
	System.out.println(i1.parseInt(num));
	System.out.println("Testing equals(int): " + i1.equals(19));
	System.out.println("Testing equals(int): " + i1.equals(20));
	System.out.println("Testing isOdd(MyInteger): " + MyInteger.isOdd(34));
	System.out.println("Testing isEven(MyInteger): " + MyInteger.isEven(34));
	System.out.println("Testing isPrime(MyInteger): " + MyInteger.isPrime(31));
	System.out.println("Testing getValue: " + i1.getValue());
	System.out.println("Testing equals(MyInteger): " + i1.equals(i2));
}
}
