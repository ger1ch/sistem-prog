class ExcTest {
	static void genExcepriom() {
		int nums[] = new int[4];
		System.out.println("До исключительной ситуации");
		nums[8] = 10;
		System.out.println("Строка после исключительной ситуации внутри блока try");
	}
}
class Pr003 {
	public static void main(String args[]) {
		int nums[] = new int[4];
	        int number[] = {4,8, 16, 32, 64, 128};
		int denom[] = {2, 0, 4, 4, 0, 8};
		for(int i = 0; i<number.length; i++) {
			try {
				//System.out.println("До исключительной ситуации");
				//nums[8] = 10;
				//System.out.println("Строка после исключительной ситуации внутри блока try");
				System.out.println(number[i] + "/" + denom[i] + " равно " + number[i]/denom[i]);
				//ExcTest.genException();
			}
			catch(ArrayIndexOutOfBoundsException exc) {
				System.out.println("Исключительная ситуация: выход за границы массива");
			}

			catch(ArithmeticException exc2) {
				System.out.println("Исключительная ситуация: неверная арифмитическая ситуация");
			}
			System.out.println("После оператора catch");
		}
	}
}
