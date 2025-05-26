import java.util.Scanner;
class PhraseLargestPalindrom {

	public static void wordCount(String str)
	{	
	    char[] c = str.toCharArray();
	    int start = 0;
	    boolean word = false;

	    for (int i = 0; i <= c.length; i++) {
	        if (i == c.length || c[i] == ' ') 
	        {
	            if (word)
	             {  
	                palindrom(new String(c, start, i - start));
	                word = false;
	            }
	        } 
	        else 
	        {
	            if (!word) 
	            {  
	                start = i;
	                word = true;
	            }
	        }
	    }
	}

	public static void palindrom(String str)
	{
		String temp="";
		for (int i=str.length()-1;i>=0;i--)
		{
			temp=temp+str.charAt(i);
				
		}
		 if(str.equalsIgnoreCase(temp))   
		 	int count=charCount(str);
		 String largestPalindrom = "";
		 int max = -500;
		 if(count>max)
		{
			largestPalindrom= str;
			max=count;
		}
		System.out.println(largestPalindrom);
	}

	public static int charCount(String str)
	{
	int count=0;
	for (int i=0;i<str.length();i++)
	{
		if (str.charAt(i) !=' ')
			count++;
	}
	 return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String  : ");
		String a=sc.nextLine();
		wordCount(a);
	}
}