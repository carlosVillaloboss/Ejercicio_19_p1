package com.mycompany.ejercicio_19_p1;
import java.util.Scanner;

public class Ejercicio_19_p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese valor del lado del triangulo equilatero: ");
        double lado= scanner.nextDouble();
                
        double perimetro= lado*3;
        double altura= Math.sqrt(Math.pow(lado,2)+Math.pow(lado,2));
        double area= (lado*altura)/2;
        
        System.out.println("El perimetro del traingulo es: " +perimetro);
        System.out.println("La altura del traingulo es: " +altura);
        System.out.println("El area del traingulo es: " +area);
        
        scanner.close();
    }
}
