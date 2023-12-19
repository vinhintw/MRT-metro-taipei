package Model;

import java.util.Scanner;

public class InputReader {
    public static String[] readInput(){
        Scanner sc = new Scanner(System.in);     
        System.out.println("enter start location: ");
        String start = sc.nextLine();
        System.out.println("enter end location: ");
        String end = sc.nextLine();
        sc.close();
        return new String[]{start, end};
    }
}
