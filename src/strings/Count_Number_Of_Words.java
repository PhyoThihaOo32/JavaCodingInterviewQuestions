package strings;

public class Count_Number_Of_Words {
	
	public static void main(String[] args) {
		
		String str = "Hello World Hello World";
		int count=1;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
				
				count++;
			}
			
		}
		
		System.out.println("World count: "+ count);
	}

}
