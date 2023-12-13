/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import java.io.Serializable;

/**
 *
 * @author Mondongo
 */

/************************************************************************
Palabra de honor:
* No he discutido ni mostrado el código de mi programa con alguien que no sea mi compañero,
* Profesor o con el monitor asignado a este curso.
*
* No he utilizado código obtenido de otro u otros estudiantes,
* O cualquier otra fuente no autorizada, ya sea modificado o sin modificar.
*
* Si cualquier código o documentación utilizada en mi programa
* Fue obtenido de otra fuente, tal como un libro de texto o notas del curso
* debe ser claramente señalado con una cita apropiada en
* los comentarios de mi programa.
*
* Ramiro Mejía Conde - 0222220018
* Dylan Jhair Simancas Coavas - 0222220001
************************************************** ********************* */

public class Mecanico extends Persona implements Serializable {

    //Atributos
    private String contraseña;

    //Constructor
    public Mecanico(String nombre, String contraseña, String id) {

        super(id, nombre);
        this.contraseña = contraseña;

    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
