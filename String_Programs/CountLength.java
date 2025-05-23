import java.util.Scanner;
import java.util.Arrays;
class CountLength
{
	// public static int length1(String a)
	// { 
	// 	int i =0;
	// 	int count=0;
	// 	String res ="";
	// 	do{ 
	// 		char ch = a.charAt(i);
	// 		if(ch != '\0')
	// 		{
	// 			count++;
	// 			i++;
	// 			ch='\0';
	// 			res=res+ch;
	// 		}
	// 	}while(a != "\0");
	// 	return count;
	// }
	public static int length2(String a) {
    int count = 0;
    for (char ch : a.toCharArray()) {
        count++;
    }
    return count;
	}

	public static int length3(String a) {
    int count = 0;
    try {
        while (true) 
        {
            char ch = a.charAt(count); 
            count++;
        }
    } 
    catch (StringIndexOutOfBoundsException e) {
        return count; 
    }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String  : ");
		String a=sc.nextLine();
		//System.out.println("length is :" +length1(a));
		System.out.println("length is :" +length2(a));
		System.out.println("length is :" +length3(a));
	}
}