//henry wang
//10//10/19
//period 4
//code that prints the hourglass text art shape thing

public class Hourglass {
	
	public static void String(String TopBottom) {
		
		System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
		
	}
	
		public static void main(String[] args) {
			
			String TopBottom = "|\"\"\"\"\"\"\"\"\"\"|";
			
				String(TopBottom);
			
			for(int line = 1; line <=4; line++) {
				
				for(int space = 0; space < line; space++) {
					System.out.print(" ");
				}
				
				System.out.print("\\");
				
				for(int colon = 1; colon <= (-2 * line + 10); colon++) {
					System.out.print(":");
				}
				
				System.out.println("/");
			}
			
		System.out.println("     ||");
		
		for(int line2 = 4; line2 >=1; line2--) {
			
			for(int space2 = 0; space2 < line2; space2++) {
				System.out.print(" ");
			}
			
			System.out.print("/");
			
			for(int colon2 = 10; colon2 >= ( 2 * line2 + 1); colon2--) {
				System.out.print(":");
			}
			
			System.out.println("\\");
		}
		
		String(TopBottom);

}
}
