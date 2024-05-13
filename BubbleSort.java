package samis;
public class BubbleSort {
public static void bubbleSort(char[] arr) {
    int n = arr.length;
    char temp;
 for ( int i =1;i< n;i++){
        for( int j =0;j< n-1;j++){
            if (arr[j]>arr[j+1]){
                 temp = arr[j];
                arr[j] =arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    
}
}
