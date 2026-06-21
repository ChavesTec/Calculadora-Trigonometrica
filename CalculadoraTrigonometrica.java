/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.trigonometrica;

import java.util.Scanner;


public class CalculadoraTrigonometrica {

    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.println("Escoja la medida del angulo en radianes");
        var medida= teclado.nextInt();
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
            System.out.println(Math.sin(medida));
           
            break;
            case 2: funcionEspecifica="Coseno";
            System.out.println(Math.cos(medida));
            break;
            case 3: funcionEspecifica="Tangente";
            System.out.println(Math.tan(medida));
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
            System.out.println(Math.asin(medida));
            break;
            case 2: funcionEspecifica="ArcoCoseno";
            System.out.println(Math.acos(medida));
            break;
            case 3: funcionEspecifica="ArcoTangente";
            System.out.println(Math.atan(medida));
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
            System.out.println(Math.sinh(medida));
             break;
            case 2: funcionEspecifica="coseno hiperbólico";
            System.out.println(Math.cosh(medida));
             break;
            case 3: funcionEspecifica="tangente hiperbólico";
            System.out.println(Math.tanh(medida));
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
    
        
        
       
        
  
        
    
