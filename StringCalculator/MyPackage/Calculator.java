package MyPackage;

import java.util.ArrayList;

public class Calculator {

	
//	Delimiters can be of
//	any length with the following format: “//[delimiter]\n” for example: “//[***]\n1***2***3” should return 6

	
public int Add(String numbers) {
		
		
		String negative="";
		String arr[];
		int sum=0 ;
		int count=0;
		char del;
		String delimiter="";
		char[] ch = new char[numbers.length()]; 
	
 
		del= numbers.charAt(3);
	
		for (int i = 3; i < numbers.length(); i++) { 
			
			System.out.println(numbers.charAt(i));
			if(numbers.charAt(i)==']'&&numbers.charAt(i+1)!='[') {
				break;
			}
			count++;
			
        } 
			//System.out.println("Count is:"+count);
			//System.out.println("Numbers length is:"+numbers.length());
			
			
		if(numbers.isEmpty()) {
			return 0;
		}
		else {
				
				delimiter = Character.toString(numbers.charAt(3));
				numbers = numbers.substring(count+5);
				System.out.println(numbers.toString());
				
				
				for(int i=0;i<numbers.length();i++) {
					
					if(numbers.charAt(i)!=del)
					{
						char temp = numbers.charAt(i);
						sum+=Integer.parseInt(Character.toString(temp));
					}
				}
			
			}		
		return sum;
			
		
	}
}
