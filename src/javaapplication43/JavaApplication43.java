package javaapplication43;

import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication43 {

    public static void main(String[] args) {
        System.out.print("enter the text: ");
        Scanner cti = new Scanner(System.in);
        String a = cti.nextLine();
        String[] b = a.split(" ");
        for (int i = 0; i < b.length; i++) {
            String result = new StringBuilder(b[i]).delete(0, 1).append(b[i].substring(0, 1)).toString();
            System.out.print(result + "ay"+ " ");
        }

    }

}
