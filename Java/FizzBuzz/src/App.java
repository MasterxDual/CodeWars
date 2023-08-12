/*Para los números del 1 al 100, imprime "Fizz" si el número es divisible por 3, "Buzz" si es divisible por 5, y "FizzBuzz" si 
es divisible por ambos. Si no es divisible ni por 3 ni por 5, simplemente imprime el número. */

import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        /* for (int i = 1; i <= 100; i++) {
            if(i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        IntStream.rangeClosed(1, 100).mapToObj(i -> 
            (i % 5 == 0) ? (i % 3 == 0 ? "FizzBuzz" : "Buzz") : (i % 3 == 0 ? "Fizz" : i)).forEach(System.out::println);
            
        IntStream.rangeClosed(1, 100).mapToObj(i -> 
            (i % 5 == 0) ? (i % 3 == 0 ? "FizzBuzz" : "Buzz") : (i % 3 == 0 ? "Fizz" : i)).forEach(e -> System.out.println(e)); */

        for (Object objeto : IntStream.rangeClosed(1, 100).mapToObj(i -> 
            (i % 5 == 0) ? (i % 3 == 0 ? "FizzBuzz" : "Buzz") : (i % 3 == 0 ? "Fizz" : i)).toList()) {
            if(objeto instanceof String) {
                System.out.println("Esta es mi cadena de texto: " + (String)objeto);
            } else if(objeto instanceof Integer) {
                System.out.println("Este es mi numero entero: " + (Integer)objeto);
            }
        }

        //El usuario ingresa un numero, y que me imprima del 0 hasta ese numero
        System.out.println("Ingrese el número límite del rango");
        IntStream.rangeClosed(0, Integer.parseInt(System.console().readLine())).forEach(e -> System.out.println(e));
    }
}
