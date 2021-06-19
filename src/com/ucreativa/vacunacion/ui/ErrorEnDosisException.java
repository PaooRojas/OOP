package com.ucreativa.vacunacion.ui;

public class ErrorEnDosisException extends Exception {

    public ErrorEnDosisException(String dosis){
        super("Dosis incorrecta:" + dosis);
    }
}
