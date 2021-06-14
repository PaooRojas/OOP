package com.ucreativa;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.repositories.Repository;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Repository repo = new FileRepository();

        while (true) {
            String nombre, cedula, edad, riesgo, isAmigo, relacion, facebook, parentesco, marca, sintomas, dosis, print;
            Persona persona;
            System.out.println("Nombre");
            nombre = in.nextLine();
            System.out.println("Cedula");
            cedula = in.nextLine();
            System.out.println("Edad");
            edad = in.nextLine();
            System.out.println("Riesgo(S/N):");
            riesgo = in.nextLine();
            System.out.println("Amigo(A)/ Familiar (F):");
            isAmigo = in.nextLine();
            if (isAmigo.equals("A")) {
                System.out.println("Relacion");
                relacion = in.nextLine();
                System.out.println("Facebook");
                facebook = in.nextLine();
                persona = new Amigo(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), relacion, facebook);
            } else {
                System.out.println("Parentesco");
                parentesco = in.nextLine();
                persona = new Familiar(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), parentesco);
            }
            System.out.println("Vacuna -- Marca:");
            marca = in.nextLine();
            System.out.println("Vacuna -- Sintomas:");
            sintomas = in.nextLine();
            System.out.println("Vacuna -- Dosis:");
            dosis = in.nextLine();

            repo.save(persona, sintomas, marca, Integer.parseInt(dosis), new Date());

            System.out.println("¿Quiere imprimir lista? (S)");
            print = in.nextLine();
            if (print.equals("S")) {
                for (String item : repo.get()) {
                    System.out.println(item);
                }
            }
        }
    }

}
