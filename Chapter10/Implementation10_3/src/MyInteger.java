
public class MyInteger {
	

		int value = 1;
		
		MyInteger(int num){
			value = num;
		}	
		int getValue() {
			return value;
		}
		boolean isEven() {
			if (value % 2 == 0){
			return true;	
			}
			return false;
		}
		boolean isOdd() {
			if (value % 2 == 1) {
				return true;
			}
			return false;
		}
		boolean isPrime() {
			return isPrime(value);
		}
		static boolean isEven(int num) {
			if (num % 2 == 0){
				return true;	
				}
				return false;
		}
		static boolean isOdd(int num) {
			if (num % 2 == 1){
				return true;	
				}
				return false;
		}
		static boolean isPrime(int num) {
			if (num == 1 || num == 2) {
				return true;
			}
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}
		static boolean isEven(MyInteger num) {
			return isEven(num);
		}
		static boolean isOdd(MyInteger num) {
			return isOdd(num);
		}
		static boolean isPrime(MyInteger num) {
			return isPrime(num);
		}
		boolean equals(int num){
			if (num == value) {
				return true;
			}
			return false;
		}
		boolean equals(MyInteger num) {
			return getValue() == num.getValue();
		}
		int parseInt(char[] num) {
			int convert = 0;
			for (int i = 0; i < num.length; i++) {
				convert = convert * 10 + (num[i] - '0');
			}
			return convert; 
		}
		int parseInt(String num) {
			int convert = 0;
			for (int i = 0; i < num.length(); i++) {
				convert = convert * 10 + (num.charAt(i) - '0');
			}
			return convert; 
		}
	}
	