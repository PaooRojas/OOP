package com.ucreativa.vacunacion.services;
import com.ucreativa.vacunacion.entities.Amigo;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.repositories.Repository;

import java.util.Date;
import java.util.List;

public class BitacoraService {

    private Repository repository;
    public BitacoraService(Repository repository){
        this.repository = repository;
    }
    public void save(String nombre, String cedula, String txtEdad, String txtriesgo,String txtisAmigo,String relacion,String facebook,String parentesco,String marca,String sintomas,String txtdosis) {
        int edad = Integer.parseInt(txtEdad);
        int dosis = Integer.parseInt(txtdosis);
        boolean isAmigo = txtisAmigo.equals("S");
        boolean riesgo = txtriesgo.equals("S");
        Persona persona;
        if (isAmigo) {
            persona = new Amigo(nombre, cedula, edad, riesgo, relacion, facebook);
        } else {
            persona = new Familiar(nombre, cedula, edad, riesgo, parentesco);
        }
        this.repository.save(persona, sintomas, marca, dosis, new Date());
    }

    public List<String> get(){
        return this.repository.get();
    }

}
