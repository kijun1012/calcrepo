package simpleCalculator;

public class Calculator {
	private int result = 1;

	public void add(int x, int y) {
		result = x + y;
	}

	public void sub(int x, int y) {
		result = x - y;
	}

	public void multi(int x, int y) {
		result = x * y;
	}

	public void exp(int x, int y){
		for(int i=0;i<y;i++)
			result = result * x;
	}
	public int getResult() {
		return result;
	}
}
