package day3;

public class Task3 {
	public static void main (String[] args) {
		
		
		String a = args[0];
		String u = a.toUpperCase();
		
		int a1 = Integer.parseInt(args[1]);
		int n = a1+2;
		
		float a2 = Float.parseFloat(args[2]);
		float n1 = a2 + 3.0f;
		
		String a3 = args[3];
		
		
		
		System.out.println("NAME = " +u+"; "+"AGE = "+n+"; "+"Percentage = "+n1+"%; "+"DEGREE = "+a3+"(maths)");

}

}

/* Input                    Output
Neha 28 95.2 B.SC            NAME = NEHA; AGE = 30; Percentage = 98.2%; DEGREE = B.SC(maths)

*/
