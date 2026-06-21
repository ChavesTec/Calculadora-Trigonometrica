/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.trigonometrica;

import java.util.Scanner;


public class CalculadoraTrigonometrica {

    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        int unidadAngular;
        System.out.println("Escoja la Unidad angular");
        
        System.out.println("Escriba 1 para radianes");
        System.out.println("Escriba 2 para grados");
        unidadAngular = teclado.nextInt();
        if (unidadAngular == 1){
        System.out.println("Escoja la medida del angulo en radianes");
        double medida= teclado.nextDouble();
        System.out.println("Escriba 1 para funciones trigonometricas normales");
        System.out.println("Escriba 2 para funciones trigonometricas inversas");
        System.out.println("Escriba 3 para funciones trigonometricas hiperbólicas");
        
        int tipo;
        tipo = teclado.nextInt();
        String funcionEspecifica;
        
        if (tipo ==1){
        System.out.println("Escriba 1 para seno");
        System.out.println("Escriba 2 para coseno");
        System.out.println("Escriba 3 para tangente");
        int tipo_dos=teclado.nextInt();
        switch (tipo_dos){
            case 1: funcionEspecifica="Seno";
                System.out.println("Radianes: " + Math.sin(medida));                
            break;
            case 2: funcionEspecifica="Coseno";
            System.out.println("Radianes: " + Math.cos(medida));
            break;
            case 3: funcionEspecifica="Tangente";
            System.out.println("Radianes: " + Math.tan(medida));
            break;
            default: funcionEspecifica="Inexistente";
        }
        } 
        
        else{  
        if(tipo==2){
        System.out.println("Escriba 1 para Arcoseno");
        System.out.println("Escriba 2 para Arcocoseno");
        System.out.println("Escriba 3 para Arcotangente");
        
        int tipo_dos=teclado.nextInt();
        switch (tipo_dos){
            case 1: funcionEspecifica="ArcoSeno";
            System.out.println("Radianes: " + Math.asin(medida));
            break;
            case 2: funcionEspecifica="ArcoCoseno";
            System.out.println("Radianes" + Math.acos(medida));
            break;
            case 3: funcionEspecifica="ArcoTangente";
            System.out.println("Radianes" + Math.atan(medida));
            break;
            default: funcionEspecifica="Inexistente";
        }
        }
        
        else{       
        if (tipo==3){
        System.out.println("Escriba 1 para seno hiperbólico");
        System.out.println("Escriba 2 para coseno hiperbólico");
        System.out.println("Escriba 3 para tangente hiperbólico");     
        int tipo_dos=teclado.nextInt();
        switch (tipo_dos){
            case 1: funcionEspecifica="seno hiperbólico";
            System.out.println("Radianes" + Math.sinh(medida));
             break;
            case 2: funcionEspecifica="coseno hiperbólico";
            System.out.println("Radianes" + Math.cosh(medida));
             break;
            case 3: funcionEspecifica="tangente hiperbólico";
            System.out.println("Radianes" +Math.tanh(medida));
            break;
            default: funcionEspecifica="Inexistente";
                }
                }
        else {funcionEspecifica="Inexistente";
        }
        }
            }
            System.out.println("La funcion seleccionada es "+ funcionEspecifica);
        }
        else{
            if (unidadAngular == 2){
        System.out.println("Escoja la medida del angulo en grados");
        double medida= teclado.nextDouble();
        System.out.println("Escriba 1 para funciones trigonometricas normales");
        System.out.println("Escriba 2 para funciones trigonometricas inversas");
        System.out.println("Escriba 3 para funciones trigonometricas hiperbólicas");
        
        int tipo;
        tipo = teclado.nextInt();
        String funcionEspecifica;
        
        if (tipo ==1){
        System.out.println("Escriba 1 para seno");
        System.out.println("Escriba 2 para coseno");
        System.out.println("Escriba 3 para tangente");
        int tipo_dos=teclado.nextInt();
        switch (tipo_dos){
            case 1: funcionEspecifica="Seno";
                System.out.println("Grados: " + Math.sin(Math.toRadians(medida)));                
            break;
            case 2: funcionEspecifica="Coseno";
            System.out.println("Grados: " + Math.cos(Math.toRadians(medida)));
            break;
            case 3: funcionEspecifica="Tangente";
            System.out.println("Grados: " +  Math.tan(Math.toRadians(medida)));
            break;
            default: funcionEspecifica="Inexistente";
        }
        } 
        
        else{  
        if(tipo==2){
        System.out.println("Escriba 1 para Arcoseno");
        System.out.println("Escriba 2 para Arcocoseno");
        System.out.println("Escriba 3 para Arcotangente");
        
        int tipo_dos=teclado.nextInt();
        switch (tipo_dos){
            case 1: funcionEspecifica="ArcoSeno";
            System.out.println("Grados: " + Math.asin(Math.toRadians(medida)));
            break;
            case 2: funcionEspecifica="ArcoCoseno";
            System.out.println("Grados" + Math.acos(Math.toRadians(medida)));
            break;
            case 3: funcionEspecifica="ArcoTangente";
            System.out.println("Grados" + + Math.atan(Math.toRadians(medida)));
            break;
            default: funcionEspecifica="Inexistente";
        }
        }
        
        else{       
        if (tipo==3){
        System.out.println("Escriba 1 para seno hiperbólico");
        System.out.println("Escriba 2 para coseno hiperbólico");
        System.out.println("Escriba 3 para tangente hiperbólico");     
        int tipo_dos=teclado.nextInt();
        switch (tipo_dos){
            case 1: funcionEspecifica="seno hiperbólico";
            System.out.println("Grados" + Math.sinh(Math.toRadians(medida)));
             break;
            case 2: funcionEspecifica="coseno hiperbólico";
            System.out.println("Grados "+ Math.cosh(Math.toRadians(medida)));
             break;
            case 3: funcionEspecifica="tangente hiperbólico";
            System.out.println("Grados"+  Math.tanh(Math.toRadians(medida)));
            break;
            default: funcionEspecifica="Inexistente";
                }
                }
        else {funcionEspecifica="Inexistente";
        }
        }
            }
            System.out.println("La funcion seleccionada es "+ funcionEspecifica);
        }
    
        }
        
    }
        }
    
        
        
       
        
  
        
    
