package org.example;

import java.util.Scanner;

//TIP To Run code, press or
// click the icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = new int[11];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 1; i < 10; i++){
            arr[i+1] = arr[i-1] + arr[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}