package org.vashonsd;
import java.util.Scanner;

public class Conversions {
    public static void cToF () {
        Scanner scan = new Scanner(System.in);
        double tempC = scan.nextDouble();
        double tempF = tempC * 9/5 + 32;
        System.out.println(tempF);
    }
    public static void fToC () {
        Scanner scan = new Scanner(System.in);
        double tempF = scan.nextDouble();
        double tempC = (tempF - 32) * 5/9;
        System.out.println(tempC);
    }
    public static void length() {
        Scanner scan = new Scanner(System.in);
        double lenIn = scan.nextDouble();
        double lenCm = lenIn * 2.54;
        System.out.println(lenCm);
    }

}
