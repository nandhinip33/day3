package day3;

public class UseLaptop {
	public static void main(String [] args) {
		String a = args[0];
		String [] s = a.split(",");
		
		Laptop l = new Laptop();
		l.brand = s[0].toUpperCase();
		l.price = Integer.parseInt(s[1]);
		l.color = s[2];
		
		System.out.println("Brand = "+l.brand+"; "+"Price ="+l.price+"; "+"Color = "+l.color);
		
		
	}

}

/* Input                                       Output
lenovo,25000,Black     Brand = lenovo; Price =25000; Color = Black
 
*/

