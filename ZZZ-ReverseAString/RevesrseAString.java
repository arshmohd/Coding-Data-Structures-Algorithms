package ReverseAString;

import java.util.Scanner;

class ReverseAString {
    public static String solve(String A) {
        String[] str = A.split("\\s");
        String p="";
        // It ends on 1 because For last Space is not required
        for(int i=str.length-1;i>=1;i--)
        {
            p+=str[i];
            p+=" ";
        }
        p+=str[0];// first item is just added on last
        return p.trim().replaceAll(" +", " ");
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String S=sc.nextLine();
            String output=solve(S);
            System.out.println(output);
        }
}