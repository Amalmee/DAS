import java.util.Arrays;

public class BubbleSort {
    public void swap(int []a,int i, int j)  {
	
	 int temp;
	 temp = a[i];
	 a[i] = a[j];
	 a[j] = temp;	 
	 }
	 
	public void bubbleSort(int[]a) {
	 
	 int num = a.length;
	 for(int i=0; i<num; i++)  {
	    for (int j=0; j<num -i-1; j++) {
	        if (a[j]> a[j+1]) {
			    swap(a,j,j+1);
		    }
	    }
	}
}

    public static void main(String[]args) {
	    int[] numbers={8,3,1,4,5,11,7,2,17,13};
		
		System.out.println("Befor sort the array:");
		printArray(numbers);
		
		BubbleSort sorter= new BubbleSort();
		sorter.bubbleSort(numbers);
		
		System.out.println("After sort the array:");
		printArray(numbers);
		}
		
	public static void printArray(int[]a) {
	    for(int n:a){
		    System.out.print(n+"");
		}
		System.out.println();
	}
}