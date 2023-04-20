/**
La clase SistemaSalud se encarga de calcular los descuentos por salud según el sistema de salud al que esté afiliado el empleado.
*/
package com.mycompany.taller1;


public class SistemaSalud {
 /**
 * Calcula el descuento correspondiente al sistema de salud Fonasa
 * @parametro salario_bruto Salario bruto del empleado
 * @return El descuento correspondiente al sistema de salud Fonasa
 */
    public double Fonasa(double salario_bruto){
        return salario_bruto * 0.07;
    }
/**
 * Calcula el descuento correspondiente al sistema de salud Isapre
 * @parametro uf Valor del plan de salud de la Isapre en UF
 * @return El descuento correspondiente al sistema de salud Isapre
 */
    public double Isapre(double uf){
        return uf * 35682,07;
    }
}
