
package com.mycompany.taller1;
import java.util.Scanner;

public class TALLER1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese su salario bruto: ");
        double salario_bruto = sc.nextDouble();
        System.out.println("Ingrese su gratificación (en caso de no tener ingrese 0)");
        double gratificacion = sc.nextDouble();
            salario_bruto = salario_bruto + gratificacion;
        
        
        
        System.out.print("Ingrese su AFP actual.(Capital, Cuprum, Habitat, Modelo, Planvital, Provida, Uno)");
        String afp = sc.next();
        
        double descuento_afp = 0;
        AFP Afp = new AFP();
        
        if(afp.equals("Capital")){
            descuento_afp = Afp.Capital(salario_bruto);
            System.out.println(descuento_afp);
        }
        else if (afp.equals("Cuprum")){
            descuento_afp = Afp.Cuprum(salario_bruto);
            System.out.println(descuento_afp);
        }
        else if (afp.equals("Habitat")){
            descuento_afp = Afp.Habitat(salario_bruto);
            System.out.println(descuento_afp);
        }
        else if (afp.equals("Modelo")){
            descuento_afp = Afp.Modelo(salario_bruto);
            System.out.println(descuento_afp);
        }
        else if (afp.equals("Planvital")){
            descuento_afp = Afp.Planvital(salario_bruto);
            System.out.println(descuento_afp);
        }
        else if (afp.equals("Provida")){
            descuento_afp = Afp.Provida(salario_bruto);
            System.out.println(descuento_afp);
        }
        else if (afp.equals("Uno")){
            descuento_afp = Afp.Uno(salario_bruto);  
            System.out.println(descuento_afp);
        }
        
        System.out.println("Ingrese su sistema de salud actual.(Fonasa o Isapre)");
        String salud = sc.next();
        SistemaSalud Salud = new SistemaSalud();
        double descuento_salud = 0;
        if(salud.equals("Fonasa")){
            descuento_salud = Salud.Fonasa(salario_bruto);
            System.out.println(descuento_salud);
        }
        else if (salud.equals("Isapre")){
            System.out.println("Ingrese el valor de su plan en UF");
            double uf = sc.nextDouble();
            descuento_salud = Salud.Isapre(uf);
            System.out.println(descuento_salud);
        }
        SeguroCesantia cesantia=new SeguroCesantia();
        System.out.println(cesantia.Cesantia(salario_bruto));
        int salario_liquido = (int) (salario_bruto - descuento_afp - descuento_salud-cesantia.Cesantia(salario_bruto));
        System.out.println("Su salario liquido corresponde a: " + salario_liquido);
        
    }
}
