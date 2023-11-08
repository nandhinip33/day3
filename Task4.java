package day3;

public class Task4 {
	public static void main (String [] args) {
		
		String a = args[0];
		String [] b = a.split(","); 
		
		String name = b[0].concat("Venkat");
		int age = Integer.parseInt(b[1])+2;
		
		System.out.println(name+" "+age);
	}

}

/* Input            Output
Sahana,23           SahanaVenkat 25

*/
