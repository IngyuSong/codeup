package codeup;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (sum < num){
            sum += ++i;
        }
        System.out.println(i);
    }
}
