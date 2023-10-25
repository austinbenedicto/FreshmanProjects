import java.util.Scanner;

public class decimalConverter{

    public static void main(String[] args) {

        System.out.println("What is your octal number");
    
        // decimal number 
        Scanner o = new Scanner(System.in);  
        int oc = o.nextInt();
        
        // convert octal to binary
        String binary = Integer.toBinaryString(oc);
        System.out.println(binary + " in binary.");

        // convert octal to decimal
        Int decimal = Integer.parseInt(oc,8);
        System.out.println(decimal + " in octal.");

        // convert octal to hexa
        String hexa = Integer.toHexString(oc);
        System.out.println(hexa + " in hexadecimal.");
    }
}