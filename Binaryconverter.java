import java.util.Scanner;

public class Binaryconverter{

  public static void main(String []args){
          
      System.out.println("Give me the binary number");  
      // binary number
      Scanner b = new Scanner(System.in);  
      String bi = b.nextLine();
    
      // convert to decimal
      int decimal = Integer.parseInt(bi, 2);
      System.out.println(decimal + " in decimal.");

      int hit = Integer.parseInt(bi,2);
      String octal = Integer.toOctalString(hit);
      System.out.println(octal + " in octal.");

      int num = Integer.parseInt(bi,2);
      String hexa = Integer.toHexString(num);
      System.out.println(hexa + " in hexadecimal.");

  }  
  
}