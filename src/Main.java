public class Main {

	/*
	 * Implementation of a binary search
	 * 
	 * Complexity:
	 * Time: O(logN) -> binary logarithm
	 * Space: O(1)
	 */
	
	public static void main(String[] args) 
	{
		int[] array = {1,2,3,4,5,6};
		int result = BinarySearch(2, array);
		
		if(result != -1) {
			System.out.println("The element was found in the position " + result);
		}else 
		{
			System.out.println("Element couldn't be find in the array!");
		}
	}
	
	public static int BinarySearch(int valueSearched, int[] arraySearched) 
	{
		int leftPointer = 0;
		int rightPointer = arraySearched.length - 1;
		int middlePointer;
		int middleValue;
		
		while(leftPointer <= rightPointer) 
		{
			middlePointer = (leftPointer + rightPointer) / 2;
			middleValue = arraySearched[middlePointer];
			if(middleValue == valueSearched) 
			{
				return middlePointer;
			}else 
			{
				if(valueSearched < middleValue) 
				{
					rightPointer = middlePointer - 1;
				}else 
				{
					leftPointer = middlePointer + 1;
				}
			}
		} 
		
		return -1;
	}

}
