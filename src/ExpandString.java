import java.util.Scanner;

public class ExpandString {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(Character.isAlphabetic(str.charAt(i))){
                System.out.print(str.charAt(i));
            }
            else{
                int x=Character.getNumericValue(str.charAt(i));
                for(int j=1;j<x;j++){
                    System.out.print(str.charAt(i-1));
                }
            }
        }
    }
}
