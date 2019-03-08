package thisIsJavaHead4_5;



class Rock{
	static int count = 0;
	String messegeOnRock;
	Rock(int i,String b){
		this(i);
		messegeOnRock = b;
		System.out.println("WOW, this rock has a messege: " + messegeOnRock );
	}
	
	Rock(int i){
		count++;
		System.out.println("Rock is stronger than "+count+" rocks" );
	}
}

public class InitializationAndCompletion {
	static int N = 10;

	
	public static void main(String[] args) {
		
		for(int i = 0;i<N;i++)
			new Rock(i);
		new Rock(Rock.count, "Hello hello, i can brake u to the dust");
	
	
	
	
	}

}
