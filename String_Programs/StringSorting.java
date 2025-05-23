
import java.util.Scanner;
import java.util.Arrays;
class StringSorting {

	public static String array(String str)
	{
	    char[] c=str.toCharArray();
        for(int i=0;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]>c[j]){
                    char temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        return new String(c);
	}

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String s=sc.nextLine();
		System.out.println(array(s));
	}
}