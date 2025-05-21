// decimal to binary convertion

import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int d = scanner.nextInt();

        // String b = Integer.toBinaryString(d);   INBULT METHOD

        String res = "";
        while(d>0)
        {
            int last = d%2;
            res = last + res;
            d=d/2;
        }
        System.out.println("Binary Number is : " +res);
    }
}
