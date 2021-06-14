package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.Persona;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class FileRepository implements Repository {
    @Override
    public void save(Persona persona, String sintomas, String marca, int dosis, Date fecha) {

        SimpleDateFormat format = new SimpleDateFormat("dd,MM,yyyy hh:mm:ss");
        String text = persona.getNombre() + " " + marca + " " + format.format(fecha) + "\n";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("db.txt", true));
            writer.append(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<String> get() {

        return null;
    }
}
