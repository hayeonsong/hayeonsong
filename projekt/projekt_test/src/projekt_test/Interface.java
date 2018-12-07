package projekt_test;

public class Interface implements interfaceA, interfaceB {

		 public Interface () {
			 System.out.println("--Interface structor--");
		}
		 
	@Override
		public void funA () {
			System.out.println( "--funA()--");
		
	}

	@Override
		public void funB () { 
			System.out.println( "--funB()--");
		
	}
}
