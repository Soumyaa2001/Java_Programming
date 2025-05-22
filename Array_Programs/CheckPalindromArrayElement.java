import java.util.Scanner;
import java.util.Arrays;
class CheckPalindromArrayElement{

	public static int [] palindromArrayElement(int [] a)
	{
		int count = 0;
		for(int i=0; i<a.length;i++)
		{
			if(palindrom(a[i]))
				count++;
		}
		int[] b = new int[count];
        int bi = 0;
        for (int j = 0; j < a.length; j++) {
            if (palindrom(a[j])) 
            	b[bi++] = a[j];
        }

        return b;
	}
		public static boolean palindrom(int n) 
		{
		int rev = 0	;
		int n1 = n;
		while (n!=0)
		{
			rev = (rev*10)+ n%10;
			n=n/10;			 			
		}
		if (rev== n1)
			return true;
		else
			return false;
		}

		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array  : ");
		int size = sc.nextInt();
		int[] a = new int[size];
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();	
		}
		System.out.println(Arrays.toString(palindromArrayElement(a)));	
}
}