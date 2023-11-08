package day3;

public class Task6 {
	public static void main(String[] args) {
		
		String a = args[0];
		String b = args[1];
		
		String [] s = a.split(",");
		String [] s1 = b.split(",");
		
		//int a1 = Integer.parseInt(s[1]);
		//boolean b1 = Boolean.parseBoolean(s[2]);
		//float f = Float.parseFloat(s[3]);
	
			
		System.out.println("Name:"+s[0]+"; "+"Age:"+s[1]+"; "+"isgirl:"+s[2]+"; "+"Weight:"+s[3]+"; "+"Name:"+s1[0]+"; "+"Age:"+s1[1]+"; "+"isgirl:"+s1[2]+"; "+"Weight:"+s1[3]);
	}

}

/* Input                                       Output
Nandhini,23,true,55.5 Ramesh,20,false,62.5     Name:Nandhini; Age:23; isgirl:true; Weight:55.5; Name:Ramesh; Age:20; isgirl:false; Weight:62.5


*/

