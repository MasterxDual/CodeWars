/*Crea un programa que encuentre todos los números primos dentro de un rango de números proporcionado por el usuario. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el numero desde donde quiere visualizar los numeros primos");
        Integer lowerLimit = scan.nextInt();
        System.out.println("Ingrese el numero hasta donde quiere visualizar los numeros primos");
        Integer upperLimit = scan.nextInt();
        Integer count = 0;

        for (int i = lowerLimit; i <= upperLimit; i++) {
            if(i == 1) { //1 no es considerado un numero primo
                i++;
            }             
            for (int j = 1; j < i-1; j++) {
                if(i%(j+1) != 0) { //Como hago para imprimir i solo si ocurre esa condicion desde j=1 hasta j=i-1? No tengo que imprimirlo cada vez que la condicion de esta linea se cumple
                    count++; //sino cada vez que se cumplan TODAS las condiciones mencionadas arriba
                }
                /*if(i%2!= 0 && i%3!=0 && i%4!=0)
                if(i%[2, upperLimit-1]!=0)*/
            }
            if(count == (upperLimit-2)) {
                System.out.println(i);
            }
        }
    }
}
