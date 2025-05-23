import java.util.Scanner;

class StringReverse {

	public static String rev1(String str) //using back itaration on string
	{
		String temp="";
		for (int i=str.length()-1;i>=0;i--)
		{
			temp= temp+str.charAt(i);		
		}
		return temp;
	}
	public static String rev2(String str)  // using 2 pointer approach altering start and end
	{
		int start = 0;
		int end = str.length()-1;
		char []c=str.toCharArray();
		while(start<end)
		{
			char temp = c[start];
			c[start]= c[end];
			c[end]=temp;
			start++;
			end--;
		}
		return new String(c);
	}
	public static String rev3(String str)   //using buffer reader inbuilt methods
	{
		StringBuffer sb = new StringBuffer(str);
		return sb.reverse().toString();
	}

	public static String rev4(String str)  //using buffer and back iteration over the string
	{
		StringBuffer sb = new StringBuffer("");
		for (int i=str.length()-1;i>=0;i--)
		{
			sb.append(str.charAt(i));		
		}
		return sb.toString();
	}

	public static String rev5(String str)  // using 2 pointer approach altering start and end by xor operation
	{
		int start = 0;
		int end = str.length()-1;
		char []c=str.toCharArray();
		while(start<end)
		{
			c[start]= (char)(c[start]^c[end]);
			c[end]=(char)(c[start]^c[end]);
			c[start]= (char)(c[start]^c[end]);
			start++;
			end--;
		}
		return new String(c);
	}
	public static String rev6(String str)  // using 2 pointer approach altering start and end by plus operation
	{
		int start = 0;
		int end = str.length()-1;
		char []c=str.toCharArray();
		while(start<end)
		{
			int temp = (int)c[start] + (int)c[end];
			c[start]=(char)( temp-(int)c[start]);
			c[end]=(char)( temp-(int)c[end]);
			start++;
			end--;
		}
		return new String(c);
	}

	public static String rev7(String str)  // using 2 pointer approach altering start and end by multiplication operation
	{
		int start = 0;
		int end = str.length()-1;
		char []c=str.toCharArray();
		while(start<end)
		{
			int temp = (int)c[start] * (int)c[end];
			c[start]=(char)( temp/(int)c[start]);
			c[end]=(char)( temp/(int)c[end]);
			start++;
			end--;
		}
		return new String(c);
	}


	public static String rev8(String str)  	
	{
		int start = 0;
		int end = str.length()-1;
		char []c=str.toCharArray();
		while(start<end)                         //  a = a + b - (b = a);
		{
			c[start]=(char)((int)c[start] + (int)c[end] -(int)(c[end] = c[start])) ;
			start++;
			end--;
		}
		return new String(c);
	}

		public static String rev9(String str)  	
	{
		int start = 0;
		int end = str.length()-1;
		char []c=str.toCharArray();
		while(start<end)                     //a = b - a + (b = a);
		{
			c[start]=(char)((int)c[end] - (int)c[start] +(int)(c[end] = c[start])) ;
			start++;
			end--;
		}
		return new String(c);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String  : ");
		String a=sc.nextLine();
		System.out.println("reverse is :" +rev1(a));
		System.out.println("reverse is :" +rev2(a));
		System.out.println("reverse is :" +rev3(a));
		System.out.println("reverse is :" +rev4(a));
		System.out.println("reverse is :" +rev5(a));
		System.out.println("reverse is :" +rev6(a));
		System.out.println("reverse is :" +rev7(a));
		System.out.println("reverse is :" +rev8(a));
		System.out.println("reverse is :" +rev9(a));
	}
}