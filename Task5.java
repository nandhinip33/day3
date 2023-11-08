package day3;

public class Task5 {
	public static void main(String []  args) {
		
		String a = args[0];
		String[] s = a.split(",");
		
		String s1 = s[0].concat("Sakthi");
		int age = Integer.parseInt(s[1])-3;
		float per = Float.parseFloat(s[2])+1;
		boolean t = Boolean.parseBoolean(s[3]);
		
		System.out.println("Name = "+s1+"; "+"Age = " +age+"; "+"Percentage = "+per+"; "+"ismale = "+t);
		
	}

}

/* Input                    Output
Siva,28,80.5,true           Name = SivaSakthi; Age = 25; Percentage = 81.5; ismale = true


*/
