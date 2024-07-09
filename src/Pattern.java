import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the command :");
        String cmd =sc.nextLine();
        char[] chars = cmd.toCharArray();
        int len = chars.length;
        for(int i=0;i<len;i++) {
            for(int j=0;j<len;j++) {
                if(j==i||j==len-1-i)
                    System.out.print(chars[j]);
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }

    }

}

