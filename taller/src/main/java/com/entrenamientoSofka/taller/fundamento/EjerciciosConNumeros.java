package com.entrenamientoSofka.taller.fundamento;

import java.util.Scanner;

public class EjerciciosConNumeros {

    public Integer bandera;
    Scanner entrada= new Scanner(System.in);

    public void numerosImparesMenores(){
        System.out.println("---------------------------");
        System.out.println("Ingrese un numero por favor");
        Integer numeroRango = this.entrada.nextInt();
        System.out.println("---------------------------");
        for (this.bandera=1; bandera<=numeroRango; bandera++){
            if(bandera%2==0){
                System.out.println("El numero: " + this.bandera + " Es par");
            }
        }

    }

    public void solucuinCuadratica(){
        System.out.println("Ecuacion cuadratica ax^2 + bx +c");
        System.out.println("Ingrese los coeficiente a,b y c");
        System.out.println("Valor de a: ");
        double a=this.entrada.nextDouble();
        System.out.println("Valor de b: ");
        double b=this.entrada.nextDouble();
        System.out.println("Valor de c: ");
        double c=this.entrada.nextDouble();
        double descriminate = Math.pow(b,2) - 4*(a*c);

        double resultadoUno=0;
        double resultadoDos=0;
        if(descriminate<0){
            System.out.println("La ecuacion "+ a+"(x^2)" + "(+)"+ b +"x"+ ("+") +c + "No tiene solucion en los numero reales");
        }
        else {
            resultadoUno =(-b+(Math.sqrt(descriminate)))/2;
            resultadoDos=(-b-(Math.sqrt(descriminate)))/2;
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("La solucion a la ecuaciones: ");
            System.out.println("x1: " + resultadoUno);
            System.out.println("x2: " + resultadoDos);
            System.out.println("Forma general: " + ("(x1")+(-resultadoUno)+(")") + ("(x2")+(-resultadoDos)+(")"));
            System.out.println("-------------------------------------------------------------------------------");

        }
        }

    public static void main(String[] args) {
        EjerciciosConNumeros ejerciciosConNumeros = new EjerciciosConNumeros();
        //ejerciciosConNumeros.numerosImparesMenores();
        ejerciciosConNumeros.solucuinCuadratica();
    }
}
