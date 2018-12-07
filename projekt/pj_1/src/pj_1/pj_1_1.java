package pj_1;

	import java.util.Scanner;
	
		public class pj_1_1 {
			public static void main(String[] args) {
				System.out.println(" Input Number : ");
				
				Scanner scanner = new Scanner ( System.in);
					int inputnum = scanner.nextInt();
					
					for(int i = 1 ; i < 10; i++) {
						System.out.printlf("%d * %d = %d\n", inputnum , i , (inputnum * i));
						}


						scanner.close();

			}
	
	

	}
		
					