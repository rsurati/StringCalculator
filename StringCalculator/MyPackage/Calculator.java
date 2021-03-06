package MyPackage;

public class Calculator {

	//Assuming At max 2 numbers are given separated by comma(,)
	public int Add(String numbers) {
		
		if(numbers.isEmpty()) {
			return 0;
		}
		String arr[];
		arr = numbers.split(",");
		
		if(arr.length == 1) {
			return Integer.parseInt(arr[0]);
		}
		
		
		return(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
	}
}
