package MyPackage;

public class Calculator {

	
	//Assuming Numbers are separated by comma(,) and New Line (\n)
	public int Add(String numbers) {
		
		if(numbers.isEmpty()) {
			return 0;
		}
		String arr[];
		arr = numbers.split(",");
		
		if(arr.length == 1) {
			return Integer.parseInt(arr[0]);
		}
		
		int sum =0 ;
		
		for(String i:arr) {
			for(String j: i.split("\n")) {
				sum+=Integer.parseInt(j);	
			}
			//sum+= Integer.parseInt(i); 
		}
		
		
		return(sum);
	}
}
