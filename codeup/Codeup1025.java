package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] array = br.readLine().split("");
        String zero = "";
        int n = array.length;
        while (n --> 0){
            zero += '0';
        }
        for(int i=0; i<array.length; i++){
            zero = zero.substring(0, zero.length()-1);
            System.out.println("[" + (array[i] + zero)  +  "]");
        }
    }
}
