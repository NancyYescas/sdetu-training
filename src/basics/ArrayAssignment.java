package basics;

public class ArrayAssignment {

	public static void main(String[] args) {
		// Write 3 functions that take an array as a parameter and return the minimum,
		//average, and maximum values of that array
		
		int[] array = {1, 2, 3, 4, 10};
		
		int min = getMin(array);
	    System.out.println("MIN:" +min);
		
		int max = getMax(array);
		System.out.println("MAX:" +max);
		
		double avg = getAvg(array);
		System.out.println("AVG:" +avg);

	}
	
	public static int getMin(int[] inputArray) {
		int minValue = inputArray[0]; 
		
	    for (int i=1; i<inputArray.length; i++){ 
	      if (inputArray[i] < minValue){ 
	        minValue = inputArray[i];
	      }
	     }
	    return minValue;
     }
	
	public static int getMax(int[] inputArray) {
		int maxValue = inputArray[0]; 
		
	    for (int i=1; i<inputArray.length; i++){ 
	      if (inputArray[i] > maxValue){ 
	        maxValue = inputArray[i];
	      }
	     }
	    return maxValue;
     }

	public static double getAvg(int[] inputArray) {
		int sumValues = 0;
		double avgValues=0;
		
	    for (int i=0; i< inputArray.length; i++){ 
	      sumValues=sumValues+inputArray[i];
	      }
	    avgValues= sumValues/inputArray.length;
	    return avgValues;
     }

}

