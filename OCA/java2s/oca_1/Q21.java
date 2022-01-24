package java2s.oca_1;

class Base {
	String var = "Main";

	void printVar() {
		System.out.println(var);
	}
}

class Derived extends Base {
	String var = "AAA";

	void printVar() {
		System.out.println(var);
	}
}

class Question_21 {
	public static void main(String[] args) {
		Base base = new Base();
		Derived derived = new Derived();

		System.out.println(base.var);
		System.out.println(derived.var);
		base.printVar();
		derived.printVar();
	}
}