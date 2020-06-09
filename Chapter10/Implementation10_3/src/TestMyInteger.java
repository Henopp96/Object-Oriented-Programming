
public class TestMyInteger {
public static void main(String [] args) {
	MyInteger i1 = new MyInteger(20);
	System.out.println(i1.isEven());
	System.out.println(i1.isOdd());
	System.out.println(i1.isPrime());
	System.out.println(i1.parseInt("915"));
	char[] num = { '1' , '2' , '9' };
	System.out.println(i1.parseInt(num));
}
}
