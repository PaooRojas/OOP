package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.BitacuraVacunas;
import com.ucreativa.vacunacion.entities.Persona;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InMemoryRepository implements Repository {

    private final List<BitacuraVacunas> db;

    public InMemoryRepository() {
        this.db = new ArrayList<>();
    }

    public void save(Persona persona, String sintomas, String marca, int dosis, Date fecha) {
        this.db.add(new BitacuraVacunas(persona, sintomas, marca, dosis, fecha));
    }

    public List<String> get() {
        List<String> lines = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        for (BitacuraVacunas item : db) {
            lines.add(item.getPersona().getNombre()
                    + " - " + item.getMarca()
                    + " - " + format.format(item.getFecha()));

        }
        return lines;
    }

}
