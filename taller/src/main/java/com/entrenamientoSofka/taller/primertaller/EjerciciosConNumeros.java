package com.entrenamientoSofka.taller.primertaller;

import org.springframework.boot.web.context.WebServerInitializedEvent;

public class EjerciciosConNumeros {
    public Integer numero;
    public Integer bandera;

    public void cuadradoDeLosNumeros(int rango){
        this.numero = rango;
        this.bandera=1;
        while (bandera<=numero){
            System.out.println("-----------------------------");
            System.out.println("Resultado: " + bandera*bandera);
            System.out.println("-----------------------------");
            bandera++;
        }

    }

    public int multiplicarPrimerosNumerosNaturales(){
        this.bandera=1;
        int resultado=1;
        do{
            resultado *=bandera;
            bandera++;

        }while (bandera<=5);
        return resultado;
    }

    public  void imprimirResultado(){
       int resultado= this.multiplicarPrimerosNumerosNaturales();
        System.out.println("-----------------------------");
        System.out.println("Resultado: " + resultado);
        System.out.println("-----------------------------");


    }

    public static void main(String[] args) {
        EjerciciosConNumeros ejerciciosConNumeros = new EjerciciosConNumeros();
       // ejerciciosConNumeros.cuadradoDeLosNumeros(5);
        ejerciciosConNumeros.imprimirResultado();

    }
}
