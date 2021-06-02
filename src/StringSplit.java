
public class StringSplit {
	
	public static void main (String[] args) {
		
		String Str="Hello_World_Java_Selenium";
		
		String Array[]=Str.split("_");
		
		for(String S:Array)
			System.out.println(S);
		
		for (int i=0;i<Array.length;i++) {
			
			System.out.println(Array[i]);
		}
		
	}

}
