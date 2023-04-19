package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] array = s.split("\\.");
        System.out.println(array[0]);
        System.out.println(array[1]);
    }
}
