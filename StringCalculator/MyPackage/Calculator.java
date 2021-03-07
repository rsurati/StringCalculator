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
		int count=0;
		char del;
		String delimiter="";
		char[] ch = new char[numbers.length()]; 
		
 
		del= numbers.charAt(3);
	
		for (int i = 3; i < numbers.length(); i++) { 
			
			System.out.println(numbers.charAt(i));
			if(numbers.charAt(i)==']') {
				break;
			}
			count++;
			
        } 
			//System.out.println("Count is:"+count);
			//System.out.println("Numbers length is:"+numbers.length());
			
			
		if(numbers.isEmpty()) {
			return 9;
		}
		else {
				
				delimiter = Character.toString(numbers.charAt(3));
				numbers = numbers.substring(count+5);
				//System.out.println(numbers.toString());
				
				
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
