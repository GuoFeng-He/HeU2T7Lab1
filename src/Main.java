import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str1 = scan.nextLine();
        System.out.println("Enter another word: ");
        String str2 = scan.nextLine();
        int str1Len = str1.length();
        int str2Len = str2.length();

        if (str1Len == str2Len){
            System.out.println("Your words have equal length");
        }
        else if (str1Len > str2Len){
            System.out.println("Your first word is longer");
        }
        else{
            System.out.println("Your second word is longer");
        }

        // split first word
        if (str1Len % 2 == 0) {
            String split1 = str1.substring(0, (str1Len / 2) + 1);
            String split2 = str1.substring(str1Len / 2);
        }
        else {
            String split1 = str1.substring(0, (str1Len / 2));
            String split2 = str1.substring(str1Len / 2);
        }
        // split second word



    }
}