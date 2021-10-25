package org.vashonsd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("Give me a word");
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);
    System.out.println("yo word backwards is: " + sb.reverse(). toString());

    }
}
