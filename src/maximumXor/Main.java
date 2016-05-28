package maximumXor;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//declaring arraylist for the inputs
    	ArrayList<BigInteger> arrayList=new ArrayList<BigInteger>();
    	
    	Scanner scanner = new Scanner(System.in);
    	//total number of inputs
    	int numbers=scanner.nextInt();
    	//take the inputs
    	if(numbers>=1 && numbers<=100000){
	    	for(int i=1;i<=numbers;i++){
			 BigInteger bigInteger=scanner.nextBigInteger();
			 arrayList.add(bigInteger);
	    	}
			 int size=arrayList.size();	
			 System.out.println(maxSubarrayXOR(arrayList,size));
    	}	 

	}
public static BigInteger maxSubarrayXOR(ArrayList<BigInteger> arr, int n){
	    
		//Initialize the result
		BigInteger ans = BigInteger.ZERO;     

	    //starting points of subarrays
	    for (int i=0; i<n; i++){
	    	
	    	// to store xor of current subarray
	        BigInteger curr_xor = BigInteger.ZERO; 
	        // ending points of subarrays starting with i
	        for (int j=i; j<n; j++){
	            curr_xor = curr_xor.xor(arr.get(j));
	            ans = ans.max(curr_xor);   
	        }
	    }
	    return ans;
	}

}
//9056e6a1-6bbd-4ae3-bb09-3df941e4d7d2