
package com.mycompany.taller1;
/**
La clase AFP contiene los métodos para calcular el descuento que corresponde
a una AFP en específico, a partir del sueldo bruto ingresado.
*/

public class AFP {
    /**
Calcula el descuento correspondiente a la AFP Capital, a partir del salario bruto ingresado.
@return el descuento correspondiente a la AFP Capital.
*/
    public double Capital(double salario_bruto){
        return salario_bruto * 0.1144;
    }
/**
Calcula el descuento correspondiente a la AFP Cuprum, a partir del salario bruto ingresado.
@return el descuento correspondiente a la AFP Cuprum.
*/
    public double Cuprum(double salario_bruto){
        return salario_bruto * 0.1144;
    }
    /**
Calcula el descuento correspondiente a la AFP Modelo, a partir del salario bruto ingresado.
@return el descuento correspondiente a la AFP Modelo.
*/
    public double Modelo(double salario_bruto){
        return salario_bruto * 0.1058;
    }
    /**
Calcula el descuento correspondiente a la AFP Uno, a partir del salario bruto ingresado.
@return el descuento correspondiente a la AFP Uno.
*/
    public double Uno(double salario_bruto){
        return salario_bruto * 0.1069;
    }
    /**
Calcula el descuento correspondiente a la AFP Provida, a partir del salario bruto ingresado.
@return el descuento correspondiente a la AFP Provida.
*/
    public double Provida(double salario_bruto){
        return salario_bruto * 0.1145;
    }
    /**
Calcula el descuento correspondiente a la AFP Planvital, a partir del salario bruto ingresado.
@return el descuento correspondiente a la AFP Planvital.
*/
    public double Planvital(double salario_bruto){
        return salario_bruto * 0.1116;
    }
    /**
Calcula el descuento correspondiente a la AFP Habitat, a partir del salario bruto ingresado.
@return el descuento correspondiente a la AFP Habitat.
*/
    public double Habitat(double salario_bruto){
        return salario_bruto * 0.1127;
    }
    
}
