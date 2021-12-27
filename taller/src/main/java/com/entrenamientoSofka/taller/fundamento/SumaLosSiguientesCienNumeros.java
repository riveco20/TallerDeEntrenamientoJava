package com.entrenamientoSofka.taller.fundamento;

import javax.security.auth.callback.TextOutputCallback;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumaLosSiguientesCienNumeros {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        String texto=" ";
        System.out.println("------------------------");
        System.out.println("Buenaos dias bienvenido");
        System.out.println("Ingrese un numero entero");
        try {
            texto = buffer.readLine();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("------------------------");

        int intervalo = Integer.parseInt(texto) + 10;
        int bandera =Integer.parseInt(texto);
        int suma=0;
        while (bandera<=intervalo){
            suma+=bandera;
            bandera++;
        }
        System.out.println("------------------------------------");
        System.out.println("El resultado de la suma es: " + suma );
        System.out.println("------------------------------------");

    }
}
