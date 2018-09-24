class Classroom {

	public static void main(String[] args) {

		// référence Dave
		Wilder dave = new Wilder("Dave", true);	

		//utilisation getter 
		System.out.println(dave.whoAmI());

		// référence Robert 
		Wilder robert = new Wilder("Robert", false);

		//getter
		System.out.println(robert.whoAmI());
		
	}
}
