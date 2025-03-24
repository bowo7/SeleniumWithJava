package org.example;

public class CoreJavaBrushUp1 {
    public static void main(String[] arg){

        int myNum = 5;
        String website = "Rahul website";
        char letter = 'r';
        double dec = 5.50;
        boolean myCard = true;

        System.out.println(myNum);
        System.out.println(website);
        // Array simplenya 'arr' adalah array yang bernama arr dan 'new' adalah penampungnya atau indexing mulai dari index 0
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        //sama saja, hanya saja ini versi simplenya, tergantung penggunaanya nanti
        int[] arr2 = {1,2,4,5,6};

        //For Loop
//        //Cara bacanya , i sama dengan 0, jika i lebih kecil dari panjang variable arr, maka +1
        for(int i = 0; i< arr.length; i++ )
        {
            System.out.println(arr[i]);

        }
        String[] name = {"bowo","devan","nadhif"};
        for (int i = 0 ; i < name.length ; i++)
        {
            System.out.println(name[i]);
        }
        for (String s : name)
        {
            System.out.println(s);
        }

    }
}
