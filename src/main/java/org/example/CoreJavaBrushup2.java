package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {
    public static void main(String[] arg) {

        // Sekarang bagaimana caranya print array dengan perkalian di kali 2
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 20, 120};

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                System.out.println(arr2[i]);
                // jika pakai break maka akan langsung berhenti jika ketemu
               //  break;
                // Jika pakai else maka jika di atas tidak ketemu, akan di lanjut code di bawah
                // sampai arr2[i] habis
            } else {
                System.out.println(arr2[i] + " ini bukan perkalian 2");
            }

        }
        ArrayList<String> a = new ArrayList<>();
        a.add("Oke");
        a.add("sipp");
        a.add("joss");
        a.add("aman");
        System.out.println(a.get(1));
        for (int i = 0 ; i<a.size(); i++)
        {
            System.out.println(a.get(i));
        }
        System.out.println("****Batas****");
        for (String val : a)
        {
            System.out.println(val);
        }
        // ini untuk melihat ada tidaknya element yang muncul atau isiannya, hasilnya nanti true atau false
        System.out.println(a.contains("joss"));
        //cara mengkonvert array to arraylist
        String[] name = {"NAAN","EKO","TARJO"};
        List<String> nameArrayList = Arrays.asList (name);
        nameArrayList.contains("Tarjo");
    }
}
