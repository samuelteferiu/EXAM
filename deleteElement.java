package samis;

public class deleteElement {
	public static int[] DeleteElement(int[] arr,int index) {
		  if (index < 0 || index >= arr.length) {
	            System.out.println("Invalid index.");
	            return arr;
	        }
	        int[] narr= new int[arr.length - 1];
	        for (int i = 0, j = 0; i < arr.length; i++) {
	            if (i != index) {
	                narr[j++] = arr[i];
	            }
	        }

	        return narr;
	    }

	public static void main(String[] args) {
		int[] array= {3, 7, 1, 9, 4};
		int del=2;
		array= DeleteElement(array,del);
		
	}

}
