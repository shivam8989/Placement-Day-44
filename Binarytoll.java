import java.util.*;
public class Binarytoll {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number");
        int n = sc.nextInt();
        String s = Integer.toBinaryString(n);

        for(int i = 0; i<s.length(); i++){

            System.out.print(s.charAt(i)+"-> ");
        }
        System.out.println("null");


    }
}
