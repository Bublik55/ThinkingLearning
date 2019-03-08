package thisIsJavaHead4_5;

import java.util.Random;

public class ControlStructures {

	static void BreakAndContinue() {
		for (int i = 0; i < 50; i++) {
			if (i == 44)
				break;
			if (i % 5 == 0) {
				System.out.println(i);
				continue;
			}
		}
	}

	static void switchCase() {
		Random rand = new Random(69);
		for(int i = 0; i <100;i++) {
			int c = rand.nextInt(26)+'a';
			System.out.print((char)c+","+c+": ");
			switch(c) {
			case'a':
			case'e':
			case'i':
			case'o':
			case'u': System.out.println("Гласная");
			break;
			case'y':
			case'w': System.out.println("Yсловно гласная");
			break;
			default: System.out.println("Согласная");
			
			}
		}
	}
	
	static void forEach() {

		int N = 10;
		Random rand = new Random(50);
		float f[] = new float[N];
		for (int i = 0; i < N; i++)
			f[i] = rand.nextFloat();

		for (float x : f)// foreach
			System.out.println(x);

		for (char c : "My woonder pike is under light strike".toCharArray())
			System.out.print(c + " ");
	}

	public static void main(String[] args) {
		forEach();
		BreakAndContinue();
		switchCase();
		
	}

}
