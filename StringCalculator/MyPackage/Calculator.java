package MyPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; 

public class Calculator {

	
// Allow multiple delimiters like this: “//[delim1][delim2]\n” for example “//[*][%]\n1*2%3” should return 6.
	
public int Add(String numbers) {
		
		
		String negative="";
		String arr[];
		int sum=0 ;
		int count=0;
		char del;
		String delimiter="";
		char[] ch = new char[numbers.length()]; 
		
		ArrayList<String> del_list = new ArrayList<String>();
 
		del= numbers.charAt(3);
	
		for (int i = 3; i < numbers.length(); i++) { 
			
			
			if(numbers.charAt(i-1)=='[' && numbers.charAt(i+1)==']') {
				
				del_list.add(Character.toString(numbers.charAt(i)));
			
			}
			
			
        } 
			
			//System.out.println("Count is:"+count);
			//System.out.println("Numbers length is:"+numbers.length());
		
		
		 List<String> newList = del_list.stream().distinct().collect(Collectors.toList()); 
		 
		 	//System.out.println(newList.toString());
		 
			
		if(numbers.isEmpty()) {
			return 0;
		}
		else {
				
				//System.out.println(numbers.toString());
				//System.out.println(numbers.length());
				numbers = numbers.substring(3+(3*newList.size()));
				//System.out.println(numbers.toString());
				//System.out.println(numbers.length());
				
				
				for(int i=0;i<numbers.length();i++)
				{
					
					char temp = numbers.charAt(i);
					
						if(newList.contains(Character.toString(temp)))
							{	
							
								sum+=0;
					
							}
						else {
	
							sum+=Integer.parseInt(Character.toString(temp));
							
						}
				}
				return sum;
				
			}		
			
			
		
	}
}
