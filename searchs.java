package samis;
import java.util.Scanner;
public class searchs {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	       
	        System.out.println("Enter number of element  ");
	        int len = scanner.nextInt();
	        int[]array= new int[len];
	        System.out.println("Enter a element ");
	        for(int i=0; i<len;i++) {
	        	int j =i+1;
	        	int element = scanner.nextInt();
	        	array[i]=element;
	        }
	        System.out.println("Enter a number to search for: ");
	        int searchNumber = scanner.nextInt();
	        int count = 0;
	        for (int number : array) {
	            if (number == searchNumber) {
	                count++;
	            }
	        }       
	        if (count > 0) {
	            System.out.println("The number " + searchNumber + " is present in the array and appears " + count + " times.");
	        } else {
	            System.out.println("The number " + searchNumber + " is not present in the array.");
	        }
	        scanner.close();
	    }
	
}



