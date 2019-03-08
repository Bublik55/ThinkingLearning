package thisIsJavaHead4_5;


import java.util.Random;

public class foreach {

	public static void main(String[] args) {
		int N = 10;
		Random rand = new Random(50);
		float f[] = new float[N];
		for (int i =0; i<N; i++)
			f[i] =	rand.nextFloat();
		for(float x : f)
			System.out.println(x);
		
		for(char c:"My woonder pike is under light strike".toCharArray())
			System.out.print(c+" ");
		
	}

}
