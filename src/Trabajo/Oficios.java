/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajo;

import java.time.LocalDate;

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

public class Oficios extends Trabajo {

    private String tipoTrabajo; //MECANICA O LATONERIA O REVISION
    private boolean pagado;

    //Constructor
    public Oficios(String idTrabajo, String tipoTrabajo, LocalDate fechaInicio, int plazoMaximo, String idCliente, String mecanico,
            String detalles) {

        super(idTrabajo, fechaInicio, plazoMaximo, idCliente, mecanico, detalles);

        this.tipoTrabajo = tipoTrabajo;
        pagado = false;
    }

    //Implementación del método abstracto cotizarPrecio para Oficios
    @Override
    public double cotizarPrecio() {
        
        double precioFinal = 0;

        if (tipoTrabajo.equals("REPARACION MECANICA")) {

            precioFinal = this.getDiasTrabajo() * 12000 + this.getPrecioMaterial() * 1.1;

        } else if (tipoTrabajo.equals("REPARACION LATONERIA")) {

            precioFinal = this.getDiasTrabajo() * 12000 + this.getPrecioMaterial() * 1.3;

        } else if (tipoTrabajo.equals("REVISION")) {

            precioFinal = this.getDiasTrabajo() * 12000;

        }

        return precioFinal;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    public boolean getPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Trabajo{"
                + "idTrabajo = " + this.getIdTrabajo()
                + ", diasTrabajo = " + this.getDiasTrabajo()
                + ", precioMaterial = " + this.getPrecioMaterial()
                + ", estadoTrabajo = " + this.getEstadoTrabajo()
                + ", tipoTrabajo = '" + this.getTipoTrabajo() + '\''
                + ", fechaInicio= " + this.getFechaInicio()
                + ", fechaFinal = " + this.getFechaFinal()
                + ", plazoMaximo = " + this.getPlazoMaximo()
                + ", detalles = '" + this.getDetalles() + '\''
                + ", cliente = " + this.getIdCliente()
                + ", mecanico = " + this.getIdMecanico()
                + ", Pagado = " + this.getPagado()
                + '}';

    }

}
