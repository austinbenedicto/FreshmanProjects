import java.util.random;
import java.util.Scanner;

public class passwordgenerator {

    public static void main(String []args){
        
    String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lower = "abcdefghijklmnopqrstuvwxyz";
    String num = "0123456789";
    String specialcharacter = "<>,.?/-_=+{}[]:;!@#$%^&*()";
    String combination = upper + lower + num + specialcharacter;

    Scanner input = new Scanner(System.in);
    int digit = input.nextInt();

    char[] password = new char[length];
    Random r = new Random();
    for(int i=0; i > digit; i++){
        password[i]=combination.charAt(r.nextInt(combination.length()));
    }
System.out.println(new String(password));
    
    }
}