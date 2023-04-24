package codeup;

import java.util.ArrayList;
import java.util.Scanner;

public class Codeup1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = 1;
        while (n != 0){
            n = sc.nextInt();
            list.add(n);
        }
        for(int i = 0; i < list.size()-1; i++){
            System.out.println(list.get(i));
        }
    }
}
