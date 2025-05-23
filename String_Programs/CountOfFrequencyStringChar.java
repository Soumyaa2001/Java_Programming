import java.util.Scanner;
class CountOfFrequencyStringChar {

	public static void countOfStringChar(String str)
	{	
		str = str.toLowerCase();
		for (int i=0; i<str.length() ;i++ ) 
		{
			int count =1;
			char ch = str.charAt(i);
			for (int j=i+1;j<str.length() ;j++ ) 
			{
				if(ch==str.charAt(j))
				count++;		
			}	
			System.out.println(str.charAt(i) + " Frequency is : " + count);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String  : ");
		String a=sc.nextLine();
		countOfStringChar(a);
	}
}

    //wap to find the frequency of character in string
    // public static void frequencyOfCharacter(String s){
    //     char[] ch=new char[26];
    //      int i=0;
    //     for (char c = 'a';c<='z';c++, i++) {
    //         ch[i]=c;           
    //     }
    //     int[] freq=new int[26]; 
    //     for(int j=0;j<s.length();j++){
	//		   if(s.charAt(j)!= ' ')
	//			{
    //         int index=s.charAt(j)-'a';
    //         freq[index]++;
    //			}
    //     }   
    //     System.out.println(Arrays.toString(ch));
    //     System.out.println(Arrays.toString(freq));

    //     for(int j=0;j<freq.length;j++){
    //         if(freq[j]>0){
    //             System.out.println(ch[j]+"--->"+freq[j]);
    //         }
    //     }
    // }
    



