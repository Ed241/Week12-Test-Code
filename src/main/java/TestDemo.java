import java.util.Random;

import com.google.common.annotations.VisibleForTesting;

public class TestDemo {
	
	
	public int addPositive(int a, int b) {
		if(a > 0 && b > 0) {
			return a+b;
		}else {
			throw new IllegalArgumentException("Both Parameters must be positve!");
		}
	}
	
	@VisibleForTesting 
	int randomNumberSquared() {
		int randomInt = getRandomInt();
		int squaredRandom = randomInt * randomInt;
		return squaredRandom;
	}
	
	@VisibleForTesting
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) +1;
	}

}
