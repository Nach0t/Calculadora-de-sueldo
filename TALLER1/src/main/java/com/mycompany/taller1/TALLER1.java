
package com.mycompany.taller1;
import java.util.Scanner;

public class TALLER1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese su salario bruto: ");
        double salario_bruto = sc.nextDouble();
        System.out.println("¿Poose gratificación? (Si o No)");
        String gratificacion = sc.next();
            salario_bruto = salario_bruto + (salario_bruto * 0.25);
            System.out.println(salario_bruto);
        
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
        if(salud.equals("Fonasa")){
            descuento_salud = Salud.Fonasa(salario_bruto);
           System.out.println("El descuento de su Fonasa es de "+descuento_salud);
        }
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
