package MyPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; 

public class Calculator {

	
//Here we can also handle multiple delimiters with length longer than one char
// Sample Input : "//[***][%%][&&]\n1***2%%3&&4"
	
public int Add(String numbers) {
		
		
		String negative="";
		String arr[];
		int sum=0 ;
		int count;
		char del;
		String delimiter="";
		char[] ch = new char[numbers.length()]; 
		int del_sum=0;
		
		ArrayList<String> del_list = new ArrayList<String>();
		ArrayList<Integer> count_list = new ArrayList<Integer>();
 
		del= numbers.charAt(3);
	
		for (int i = 3; i < numbers.length(); i++) { 
				
			if(numbers.charAt(i-1)=='[')
			{
				count=1;
				int j =i;
				while(j>0) {
					
					if(numbers.charAt(j+1)!=']') {
						
						count++;
					}
					else {
						break;
					}
					
					j++;
				}
					del_list.add(Character.toString(numbers.charAt(j)));
					count_list.add(count);
					i= j+2;
				
			}
			
			
        } 
			
//			System.out.println("Count List is :"+count_list.toString());
//			System.out.println("Delimeter List is:"+del_list.toString());
			
			for(int i = 0; i < count_list.size(); i++)
			{  del_sum += count_list.get(i);
			}
		
			System.out.println("Sum of Count list is: "+del_sum);
		
		 List<String> newList = del_list.stream().distinct().collect(Collectors.toList()); 
		 
		 	System.out.println(newList.toString());
		 
			
		if(numbers.isEmpty()) {
			return 0;
		}
		else {
				
				//System.out.println(numbers.toString());
				//System.out.println(numbers.length());
				numbers = numbers.substring(3+(2*count_list.size())+del_sum);
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
