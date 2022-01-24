public class Egg {
	
	public Egg() {
		number = 5;
	}

	public static void main(String[] args) {
		Egg egg = new Egg();
		System.out.println(egg.number);
	}

	private int number = 3;
	{System.out.println(number);}
	
	{ number = 4; }
	{System.out.println(number);}
}