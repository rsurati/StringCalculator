package MyPackage;

public class Calculator {

	
//Assuming Numbers are separated by comma(,) and New Line (\n)
//Also combining for “//[delimiter]\n[numbers…]”
//Handling Negative numbers also
//For numbers greater than 1000 should be ignored

	
public int Add(String numbers) {
		
		
		String negative="";
		String arr[];
		int sum=0 ;
		if(numbers.isEmpty()) {
			return 0;
		}
		else {
			
			String delimiter = ",";
			if(numbers.matches("//(.*)\n(.*)"))
			{
				delimiter = Character.toString(numbers.charAt(2));
				numbers = numbers.substring(4);
			}
			
			arr = numbers.split(delimiter + "|\n");
			
			for(String i : arr) {
				
				if(Integer.parseInt(i) < 0){
	        		if(negative.equals(""))
	        			negative = i;
	        		else
	        			negative += ("," + i);
	        	}
				if(Integer.parseInt(i) < 1000) {
					sum+= Integer.parseInt(i);
				}
			}
			
			if(!negative.equals("")){
				throw new IllegalArgumentException("Negatives not allowed: " + negative);
			}
			
			
		}		
		return sum;
			
		
	}
}
