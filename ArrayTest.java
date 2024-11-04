import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args)  {
	 Integer [] a = new Integer[] {9,7, 11, 8, 1};
	 int temp;
	 
	 System.out.println("Before swapping:");
	 System.out.println(Arrays.deepToString(a));
	 
	 //swapping value in 4th and 5th position
	 temp = a[3];
	 a[3] = a[4];
	 a[4] = temp;
	 
	 System.out.println("Aftaer swapping:");
	 System.out.println(Arrays.deepToString(a));
	 
	 }
	 
}