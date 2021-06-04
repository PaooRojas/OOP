package com.ucreativa;

import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.BitacuraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Familiar mama = new Familiar("Yorleny", "1234", 46, false,"mama");
        Familiar hermana = new Familiar("Johanna", "4567", 25, false, "hermana");
        Amigo vecino = new Amigo("Anthony", "8901", 24, false, "vecino", "Tony");

        List<Persona> familia = new ArrayList<>();
        familia.add(mama);
        familia.add(hermana);
        familia.add(vecino);

        List<BitacuraVacunas> bitacora = new ArrayList<>();
        bitacora.add(new BitacuraVacunas(mama, "ninguno", "Pfzier", 1,new Date()));
        bitacora.add(new BitacuraVacunas(hermana, "ninguno", "Johnson", 2, new Date()));
        bitacora.add(new BitacuraVacunas(vecino, "ninguno", "Pfzier", 1, new Date()));


    }
}


