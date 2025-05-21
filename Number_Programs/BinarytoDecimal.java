// binary  to decimal  convertion

import java.util.Scanner;
public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String b = scanner.next();
        int sum = 0;
        String rev="";
        for(int i =0; i<= b.length()-1;  i ++)
        {
            rev=b.charAt(i)+rev;
        }
        
        for(int j =0;j<rev.length();j++)
            {
              sum = sum +Integer.parseInt(String.valueOf(rev.charAt(j))) * (int)Math.pow(2,j);         
            }
       System.out.println("Decimal Number is : " + sum );
    }
}
