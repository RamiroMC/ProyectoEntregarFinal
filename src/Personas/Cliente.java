/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import ObjetosApp.Vehiculo;
import Trabajo.Oficios;
import java.io.Serializable;
import java.util.ArrayList;

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

public class Cliente extends Persona implements Serializable {

    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private ArrayList<Oficios> oficios = new ArrayList<>();

    public Cliente(String id, String nombre, Vehiculo vehiculo) {
        super(id, nombre);
        this.vehiculos.add(vehiculo);

    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Oficios> getOficios() {
        return oficios;
    }

    public void setOficios(ArrayList<Oficios> oficios) {
        this.oficios = oficios;
    }

  

}
