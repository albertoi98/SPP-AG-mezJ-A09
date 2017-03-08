/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.agómezj.a9.p2;
import java.util.Scanner;
/**
 *
 * @author Alberto
 */
public class SPPAGómezJA9P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        matrices();
}
public static int pedirDimension(String x, String y){
        Scanner kb=new Scanner(System.in);
        int dim=0;
        boolean flag;
        do{
            System.out.println("Ingrese la dimension: "+x+" de la matriz "+y);
            
        try{
            dim=kb.nextInt();
            
            flag=true;
        }catch(Exception ex){
            flag=false;
            System.out.println("El número insertado no es entero"+ex);
            kb.nextLine();
        }
    }while(flag==false);
    return dim;
    }
public static int pedirDatos(int a, int b){
        Scanner kb=new Scanner(System.in);
        int dato=0;
        boolean flag;
        do{
            System.out.println("Ingrese el dato de la posicion "+a+b);
            
        try{
            dato=kb.nextInt();
            
            flag=true;
        }catch(Exception ex){
            flag=false;
            System.out.println("El número insertado no es entero"+ex);
            kb.nextLine();
        }
    }while(flag==false);
    return dato;
}
    public static void matrices(){
        int n1,m1,n2,m2;
        int suma1=0;
        int suma2=0;
        int sumaTotal=0;
        n1=pedirDimension("1","1");
        m1=pedirDimension("2","1");
        n2=pedirDimension("1","2");
        m2=pedirDimension("2","2");
        int[][] matriz1= new int[n1][m1];
        int[][] matriz2= new int[n2][m2];
        
        for (int i=0; i < n1; i++) {
            for (int j=0; j < m1; j++) {
                System.out.println("Matriz 1");
                matriz1[i][j] = pedirDatos(i,j);
            }
            
        }
        for (int i=0; i < n2; i++) {
            for (int j=0; j < m2; j++) {
                System.out.println("Matriz 2");
                matriz2[i][j] = pedirDatos(i,j);
            }
            
        }
        for (int i=0; i < n1; i++) {
            for (int j=0; j < m1; j++) {
                
                suma1=suma1+matriz1[i][j];
            }
            
        }
        for (int i=0; i < n2; i++) {
            for (int j=0; j < m2; j++) {
                
                suma2=suma2+matriz2[i][j];
            }
            
        }
        sumaTotal=suma1+suma2;
        System.out.println("La suma total es: "+ sumaTotal);
    }
}
    

