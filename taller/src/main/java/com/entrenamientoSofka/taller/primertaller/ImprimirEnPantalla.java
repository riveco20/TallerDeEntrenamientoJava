package com.entrenamientoSofka.taller.primertaller;

public class ImprimirEnPantalla {
    public String mensaje ="hola";
    public int bandera;

    public void imprimirSencillo(){
        System.out.println("-----------");
        System.out.println("Hola");
        System.out.println("-----------");
    }

    public void imprimirfor(int bandera){
        this.bandera = bandera;
        if(bandera!=0){
            for(int i =1;i<=bandera;i++){
                System.out.println("-----------");
                System.out.println("Hola" + " "+ i);
                System.out.println("-----------");
            }

        }
        else {
            System.out.println("vandera debe tener un valor valido");
        }

    }

    public void impirmirWhile(int bandera){
        this.bandera=bandera;
        int contador=1;
        while (contador<=bandera){

            System.out.println("-----------");
            System.out.println("Hola" + " " + contador);
            System.out.println("-----------");
            contador++;
        }

    }

    public void imprimirDoWhile(int bandera){
        this.bandera=bandera;
        int contador=1;
        do{

            System.out.println("-----------");
            System.out.println("Hola" + " " + contador);
            System.out.println("-----------");
            contador++;
        }while (contador<=bandera);
    }

    public void imprimirSwitch(int bandera){
        switch (bandera){
            case 0:
                System.out.println("El valor debe ser mayor que cero");
                break;
            default:
                int contador =1;
                while (contador<=bandera){

                    System.out.println("-----------");
                    System.out.println("Hola" + " " + contador);
                    System.out.println("-----------");
                    contador++;
                }
                break;
        }

    }

    public void imprimirUsandoContinueYbreak(int bandera){
        this.bandera=bandera;
        for (int i = 0; i <=bandera; i++) {
            if(bandera<=0){
                System.out.println("El numero ingresado debe ser mayor que cero ");
                break;
            }
            else if(i<bandera) {
                System.out.println("---------------");
                System.out.println("Hola" + " " + (i + 1));
                System.out.println("---------------");
            }
            else {
                break;
            }
            }

    }

    public static void main(String[] args) {
        ImprimirEnPantalla imprimirEnPantalla = new ImprimirEnPantalla();
       // imprimirEnPantalla.imprimirSencillo();
       // imprimirEnPantalla.imprimirfor(5);
       // imprimirEnPantalla.impirmirWhile(5);
       // imprimirEnPantalla.imprimirDoWhile(5);
       // imprimirEnPantalla.imprimirSwitch(5);
        imprimirEnPantalla.imprimirUsandoContinueYbreak(5);
    }



}
