package org.example;

import java.util.Scanner;

//TIP To Run code, press or
// click the icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = n; i > 0; i--) {
            if (n - i != 0){
                for(int k = 0; k < n - i; k++){
                    System.out.print(" ");
                }
            }
            for (int j = i; j > 0; j--) {

                System.out.print("");
                if(j == i){
                    System.out.print(" "+j);
                }else if(j == n){
                    System.out.print(j);
                }else if(j == 1){
                    System.out.println(" "+j);
                }else{
                    System.out.print(" "+j);
                }
            }
        }
    }
}