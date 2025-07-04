import java.util.*;

class MoveZerosToEnd {
    public static void main(String[] args) {
       	Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array  : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();	
		}

        int x = 0; 

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                a[x] = 1;
                x++;
            }
        }

        while (x < a.length) {
            a[x] = 0;
            x++;
        }

        System.out.println("Array: " + Arrays.toString(a));
    }
}
