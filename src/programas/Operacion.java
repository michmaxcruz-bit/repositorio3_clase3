
package programas;

import java.util.Scanner;
public class Operacion {
    public static void main(String[] args){
        double n1,n2,suma,promedio;
        Scanner lectura=new Scanner(System.in);
        
        System.out.println("ingresar numero 1: ");
        n1=lectura.nextDouble();
        System.out.println("Ingresar numero 2: ");
        n2=lectura.nextDouble();
        
        suma=n1+n2;
        promedio=suma/2;
        
        System.out.println("la suma de los dos numeros es: "+suma);
        System.out.println("El promedio de los numeros es:" +promedio);
    } 
}
