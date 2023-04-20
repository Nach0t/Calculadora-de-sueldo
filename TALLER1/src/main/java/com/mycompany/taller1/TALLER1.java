
package com.mycompany.taller1;
import java.util.Scanner;

public class TALLER1 {
/**
 * Este método es el punto de entrada del programa Taller1. 
 * Recibe la entrada del usuario para el salario bruto, gratificación, AFP y sistema de salud.
 * Luego, calcula el salario bruto con gratificación, los descuentos por AFP y sistema de salud, el descuento por seguro de cesantía y el salario líquido resultante.
 *
 * @autores: Ignacio Rehbein y Claudio Díaz.
 */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese su salario bruto: ");
        double salario_bruto = sc.nextDouble();
        System.out.println("¿Poose gratificación? (Si o No)");
        String gratificacion = sc.next();
        
        // Calcula el salario bruto con gratificación en caso de que el usuario responda "Si"
            if (gratificacion.equals("Si")) {
        salario_bruto = salario_bruto + (salario_bruto * 0.25);
            }
            
        // Pide al usuario que ingrese su AFP y calcula el descuento correspondiente.
        System.out.println("Ingrese su AFP actual.(Capital, Cuprum, Habitat, Modelo, Planvital, Provida, Uno)");
        String afp = sc.next();
        double descuento_afp = 0;
        AFP Afp = new AFP();
        if(afp.equals("Capital")){
            descuento_afp = Afp.Capital(salario_bruto);
           System.out.println("El descuento de su AFP es de "+descuento_afp);
        }
        else if (afp.equals("Cuprum")){
            descuento_afp = Afp.Cuprum(salario_bruto);
            System.out.println("El descuento de su AFP es de "+descuento_afp);
        }
        else if (afp.equals("Habitat")){
            descuento_afp = Afp.Habitat(salario_bruto);
           System.out.println("El descuento de su AFP es de "+descuento_afp);
        }
        else if (afp.equals("Modelo")){
            descuento_afp = Afp.Modelo(salario_bruto);
            System.out.println("El descuento de su AFP es de "+descuento_afp);
        }
        else if (afp.equals("Planvital")){
            descuento_afp = Afp.Planvital(salario_bruto);
            System.out.println("El descuento de su AFP es de "+descuento_afp);
        }
        else if (afp.equals("Provida")){
            descuento_afp = Afp.Provida(salario_bruto);
            System.out.println("El descuento de su AFP es de "+descuento_afp);
        }
        else if (afp.equals("Uno")){
            descuento_afp = Afp.Uno(salario_bruto);  
            System.out.println("El descuento de su AFP es de "+descuento_afp);
        }
        
        System.out.println("Ingrese su sistema de salud actual.(Fonasa o Isapre)");
        String salud = sc.next();
        SistemaSalud Salud = new SistemaSalud();
        double descuento_salud = 0;
        // Calcula el descuento de salud en el caso de que el usuario ingrese "Fonasa"
        if(salud.equals("Fonasa")){
            descuento_salud = Salud.Fonasa(salario_bruto);
           System.out.println("El descuento de su Fonasa es de "+descuento_salud);
        }
        // Calcula el descuento de salud en el caso de que el usuario ingrese "Isapre" segun el valor en UF de su plan.
        else if (salud.equals("Isapre")){
            System.out.println("Ingrese el valor de su plan en UF");
            double uf = sc.nextDouble();
            descuento_salud = Salud.Isapre(uf);
           System.out.println("El descuento de su Isapre es de "+descuento_salud);
        }
        SeguroCesantia cesantia=new SeguroCesantia();
        System.out.println("El descuento por seguro de cesantía es de "+cesantia.Cesantia(salario_bruto));
        int salario_liquido = (int) (salario_bruto - descuento_afp - descuento_salud-cesantia.Cesantia(salario_bruto));
        System.out.println("Su salario liquido es: " + salario_liquido);
        
    }
}
