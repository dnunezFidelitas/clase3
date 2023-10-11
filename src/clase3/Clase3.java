/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //exampleFor();
        //exampleWhile1();
        //exampleWhile2();
        //exampleDoWhile();
        
        //exercise1();
        //exercise2();
        //exercise3();
        //exercise4();    
        //exercise5();    
        exercise6();  
    }
    /**
     * metodo de ejemplo para la sentencia for
     */
    public static void exampleFor(){
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("!!!Feliz año nuevo!!!");
    }
    
    /**
     * metodo de ejemplo para la sentencia while
     */
    public static void exampleWhile1(){
        int i=0;
        while (i < 5) {            
            System.out.println("El valor de I es: " +i);
            i++;
        }        
    }
    
    /**
     * metodo de ejemplo para la sentencia while
     */
    public static void exampleWhile2(){
        int i=1, suma =0;
        
        while (i <= 10) {            
            suma +=i; 
            i++;
        }        
        System.out.println("La sumaria es: "+ suma);
    }
    
    /**
     * metodo que imprime una figura de rectangulo
     */
    public static void exercise1(){
        String row="";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                row+="@";
            }
            row+="\n";
        }
        System.out.println(row);
    }
    
    /**
     * Ejercicio 1
     * Cree un proyecto que imprima un rectángulo de 10 símbolos
     * en 5 líneas, pero sólo puede imprimir una a la vez.
     */
    public static void exampleDoWhile(){
        int i =0;
        do{
            System.out.println("Hola. i vale; "+(i+1));
            System.out.println("Hola. i vale; "+i+1);
            i++;
        }while (i <5);
        
    }
    
    /**
     * Ejercicio 2
     * Desarrolle un nuevo proyecto que le solicite al usuario un número
     * y muestre la tabla de multiplicar de dicho número
     */
    public static void exercise2(){
        // solicita la data
        String data = JOptionPane.showInputDialog("Digite el numero para ver su tabla de multiplicar");
        int number = Integer.parseInt(data);
        String view = "";
        
        // relaliza la lógica para de multiplicación recorre un ciclo del 1 al 10 y lo multiplica por el numero digitado
        for (int i = 1; i <= 10; i++) {
            int resultado= i * number;
            //System.out.println(number + " X " + i + " = " + resultado );
            view += number + " X " + i + " = " + resultado + "\n";
            
        }
        //System.out.println(view);
        JOptionPane.showMessageDialog(null, view);
    }
    
    
    /**
     * Ejercicio 3
     * Desarrolle un programa que solicite un valor y dibuje un triángulo
     * con el número de filas indicado. Por ejemplo: Si el número
     * indicado es 5, entonces:
     */
     public static void exercise3(){
        // solicita la data
        String data = JOptionPane.showInputDialog("Digite el numero para ver su tabla de multiplicar");
        int number = Integer.parseInt(data);
        int i = 1;
        
        //proceso que imprime
        while (i<=number){
            //declara la variable que va a imprimir vacia 
            String print="";
            for (int j = 0; j < i; j++) {
                // llena la variable print
                print +="*";
            }
            i++;
            System.out.println(print);
        }
    }
    
    /**
     * Ejercicio 4
     * Desarrolle un programa que le muestre al usuario los valores
     * entre 20 y 30 (inclusive) y su correspondiente valor al
     * cuadrado
     */ 
    public static void exercise4(){
        int value=20, finish=30; // value 
        while(value <=finish){
            System.out.println("El valor es "+ value + " su cuadrado es "+ (value*value));
            //System.out.println("El valor es "+ valor + " su cuadrado es "+ Math.pow(value, 2));
            value++;
        }
    }
    
    
      /**
     * Ejercicio 5
     * Desarrolle un programa que solicite una cantidad de
     * estudiantes y posteriormente solicite la nota para cada uno de
     * ellos. Calcule la nota promedio, la nota mayor, la nota menor y la
     * cantidad de estudiantes aprobados. Se aprueba al menos con 70
     */ 
    public static void exercise5(){
        // solicita la cantidad de estudiantes
        String data = JOptionPane.showInputDialog("Digite la cantidad de estudiantes");
        int total = Integer.parseInt(data);
        int sum =0, average=0, min=100, max=0 , approved=0;
        //proceso solicita cada uno de las notas de los estudiantes
        for (int i = 0; i < total; i++) {
            String data2 = JOptionPane.showInputDialog("Digite la nota del estudiante " + (i+1));
            int nota = Integer.parseInt(data2);
            
            //se realiza la suma de las notas al final lo vamos a utilizar para saber el promedio
            sum+=nota;
            
            //proceso para saber si es menor
            if (nota<=min){
                min=nota;
            }
            if (nota>=max){
                max=nota;
            }
            if (nota>=70){
                approved++;
            }
            
        }
        average=sum/total;
        JOptionPane.showMessageDialog(null, "Nota promedio="+ average + "\n"
                                                      + "Nota Maxima  ="+ max + "\n"
                                                      + "Nota Minima  ="+ min + "\n"
                                                      + "Aprobados    ="+ approved  );
    }
    
    
     /**
     * Ejercicio 6
     * Modifique el ejercicio anterior para que no se tenga que definir
     * la cantidad de estudiantes, sino que, cuando la nota ingresada
     * sea negativa, se deje de solicitar la información.
     */ 
    public static void exercise6(){
        // solicita la cantidad de estudiantes
        
        int sum =0, average=0, min=100, max=0 , approved=0, nota =0, total=1;
        //proceso solicita cada uno de las notas de los estudiantes
        do{
            String data2 = JOptionPane.showInputDialog("Digite la nota del estudiante " + (total));
            nota = Integer.parseInt(data2);
            
            //se realiza la suma de las notas al final lo vamos a utilizar para saber el promedio
            sum+=nota;
            
            //proceso para saber si es menor
            if (nota<=min ){
                min=nota;
            }
            if (nota>=max){
                max=nota;
            }
            if (nota>=70){
                approved++;
            }
            total++;
        }while (nota >=0);
        average=sum/total;
        if (total>2)
            JOptionPane.showMessageDialog(null, "Nota promedio="+ average + "\n"
                                                      + "Nota Maxima  ="+ max + "\n"
                                                      + "Nota Minima  ="+ min + "\n"
                                                      + "Aprobados    ="+ approved  );
        else 
            JOptionPane.showMessageDialog(null, "No hay estudiantes" );
    }
}
