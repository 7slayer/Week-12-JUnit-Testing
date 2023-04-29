import java.util.Random;

public class TestDemo {
	
	public int addPositive(int a, int b) {
		if(a > 0 && b > 0) {
			return a + b;
		} else {
			throw new IllegalArgumentException("Both parameters must be posative!");
		}
	}
	
	
	public int randomNumberSquared() {
		int a = getRandomInt();
		return a * a;
	}


	int getRandomInt() {
		// TODO Auto-generated method stub
		Random random = new Random();
		return random.nextInt();
	}
}
