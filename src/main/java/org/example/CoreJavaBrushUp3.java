package org.example;

public class CoreJavaBrushUp3 {
    public static void main(String[] arg) {

        // String s = "Selenium test Academy";
        String s1 = "Selenium test Academy";

        String s2 = new String("Welcome") ;
        String s3 = new String("Welcome") ;

        //Cara untuk memotong String dan menjadikan Array
        String s = "Selenium test Academy";
        String [] spliterString =   s.split(" ");
        System.out.println(spliterString[0]);
        System.out.println(spliterString[1]);

        // Bisa juga menggunakan ini jika pakai perulangan
        // ini jika ingin membaca dari belakang ke depan urutannya atau reverse
        for (int i = s.length()-1; i >=0; i--)
        {
            System.out.println(s.charAt(i));
        }

    }
}
