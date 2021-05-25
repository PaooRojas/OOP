package com.ucreativa;

import com.ucreativa.familia.Paola;
import com.ucreativa.familia.Yorleny;

public class Main {

    public static void main(String[] args) {

        Paola yo = new Paola();

        Yorleny mama = new Yorleny("Hola");

        mama.setAge();

        int age = mama.getAge();
        System.out.println("My age is" + age);
        System.out.println("Amo" + mama.getHobby());


        System.out.println("Chao" + age);
    }
}



