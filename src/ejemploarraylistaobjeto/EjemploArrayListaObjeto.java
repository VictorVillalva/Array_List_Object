package ejemploarraylistaobjeto;

import java.util.ArrayList;
import java.util.Scanner;


public class EjemploArrayListaObjeto {
    
    static ArrayList<F1> formula = new ArrayList();
    static Scanner es = new Scanner (System.in);
    static Scanner model = new Scanner (System.in);
    static Scanner pilo = new Scanner (System.in);
    static Scanner salir = new Scanner (System.in);
    
    
    public static void leerFormula1(){
        String escuderia;
        String modelo;
        String piloto;
        String escudero;
        
        F1 aux;
        int i,N;
        
        do{
            System.out.println("¿Numero de equipos? ");
            N = es.nextInt();
        }while(N < 0);
            es.nextLine();
        for(i = 1 ; i <= N ; i++){
            System.out.println("Equipo " + i);
            System.out.print("Escuderia : ");
            escuderia = es.nextLine();
            System.out.print("Modelo : ");
            modelo = es.nextLine();
            System.out.print("Piloto : ");
            piloto = es.nextLine();
            System.out.print("Escudero : ");
            escudero = es.nextLine();
            
            es.nextLine();
            
            aux = new F1();
            
            aux.setEscuderia(escuderia);
            aux.setModelo(modelo);
            aux.setPiloto(piloto);
            aux.setEscudero(escudero);   
            
            formula.add(aux);
        }
    }
    
    public static void mostrarFormula(){      
        for(int i = 0; i< formula.size(); i++)
            System.out.println(formula.get(i));  //se invoca el método toString de la clase Coche
    }  
    
    
    public static void mostrarPorModelo(){
        String modelo;
        System.out.print("\nIntroduce modelo: ");
        modelo = model.next();
        System.out.println("Coche del modelo " + modelo);
        for(int i = 0; i<formula.size(); i++){
            if(formula.get(i).getModelo().equalsIgnoreCase(modelo))
                System.out.println(formula.get(i));
        }
    }    
    
    public static void mostrarPorPiloto(){
        String piloto;
        System.out.print("Introducir nombre del piloto : ");
        piloto = pilo.nextLine();
        System.out.println("Equipo del piloto " + piloto);
        for(int i = 0; i<formula.size(); i++){
            if(formula.get(i).getPiloto().equalsIgnoreCase(piloto))
                System.out.println(formula.get(i));
        }
    }  
    

    public static void main(String[] args) {
        int opc,sel,se;
        System.out.println(" BIENVENIDOS A FORMULA 1 ");
      
            leerFormula1();
            System.out.println("Equipos Introducidos : ");
            mostrarFormula();
            
            
            do{
            System.out.println("\n 1. Mostrar por modelo"
                    + "\n 2. Mostrar por piloto"
                    + "\n 3. Salir");
            sel = es.nextInt();
            switch(sel){
                case 1 :
                    mostrarPorModelo();
                break;
                case 2 :
                    mostrarPorPiloto();
                break;
                case 3 :
                    System.exit(0);
            }
            
                System.out.println("\n ¿Continuar? 1 = Si 0 = No");
                se = salir.nextInt();
            }while(se==1);
 
            //mostrarPorModelo();
            //mostrarPorPiloto();
    }
}