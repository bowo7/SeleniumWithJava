package org.example;

import java.security.PublicKey;

public class MethodDemo1 {

    public static void min (String[] arg) {

        MethodDemo1 d = new MethodDemo1();
        String name = d.getData ();
        System.out.println(name);
        MethodDemo2 d2 = new MethodDemo2();
        d2.getUserData();

    }

    public String getData()
    {
        System.out.println("OKE BISA");
        return "siplah";
    }

}
