import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] ch = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            ch[i] = input.charAt(i);
        }

        Arrays.sort(ch);
//        for(char i:ch){
//            System.out.println(i);
//        }
        int lastNum = (int) ch[0];
        int buffer = 0;

//        System.out.println("(int)ch[0] = " + (int)ch[0]);
//        System.out.println("lastNum = " + lastNum);
//        System.out.println("\n");

        for (int i = 0; i <= ch.length; i++) {
//            System.out.println("i = " + i);
//            System.out.println("lastNum = " + lastNum);
            if(i == ch.length) {
//                System.out.println("char frequency: " + buffer);
                System.out.printf("%c: %d\n", (char)ch[i-1], buffer);
                break;
            }
            if ((int)ch[i] == lastNum) {
                buffer++;
            } else {
//                System.out.println("char frequency: " + buffer);
                System.out.printf("%c: %d\n", (char)ch[i-1], buffer);
                buffer = 1;
            }
            lastNum = (int)ch[i];
//            System.out.println();
        }


//        System.out.println(buffer);

        int uniqueChCount = buffer;
        int[][] result = new int[uniqueChCount][2];

        lastNum = 0;

    }
}