/**
la clase SeguroCesantia se encarga de calcular el descuento de seguro de cesantía del salario bruto.
*/
package com.mycompany.taller1;


public class SeguroCesantia {
 /**
 * Calcula el descuento por seguro de cesantía del salario bruto.
 * @parametro salario_bruto el salario bruto del trabajador
 * @return el descuento por seguro de cesantía del salario bruto
 */
    public double Cesantia(double salario_bruto){
        return salario_bruto * 0.006;
        
    }
}
