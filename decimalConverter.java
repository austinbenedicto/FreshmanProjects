import java.util.Scanner;

public class decimalConverter{

    public static void main(String[] args) {

        System.out.println("What is your decimal number");
    
        // decimal number 
        Scanner d = new Scanner(System.in);  
        int de = d.nextInt();
        
        // convert decimal to binary
        String binary = Integer.toBinaryString(de);
        System.out.println(binary + " in binary.");

        // convert decimal to octal
        String octal = Integer.toOctalString(de);
        System.out.println(octal + " in octal.");

        // convert decimal to hexa
        String hexa = Integer.toHexString(de);
        System.out.println(hexa + " in hexadecimal.");
    }
}