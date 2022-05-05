
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {9, 1, 8, 4, 3, 5, 6, 7, 3, 5, 1, 0};
		
		int index = linearSearch(array, 5);
		
		if(index != -1) {
			System.out.println("Element found at index: " + index);
			
		}
		else {
			System.out.println("Element not found");
		}

	}
	
	private static int linearSearch(int[]array, int value) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				return i;
			}
		}
		return -1;
	}

}
