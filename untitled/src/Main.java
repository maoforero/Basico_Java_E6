import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        System.out.println("Entrega 6");
        reverse("Hola Mundo");

        // 1. Crea un array unidimensional de String y recórrelo, mostrando únicamente sus valores.
        String[] unidimensionalArray = {"Manzada", "Pera", "Uva", "Lulo"};

        for (int positionArray = 0; positionArray < unidimensionalArray.length; positionArray++){
            System.out.println(unidimensionalArray[positionArray]);
        }

        // 2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        int[][] bidimensionalArray = {{1,2,3},{4,5,6}};

        for (int positionA = 0; positionA < bidimensionalArray.length; positionA++){
            for(int positionB = 0; positionB < bidimensionalArray[positionA].length; positionB++){
                System.out.println("Posicion: " + bidimensionalArray[positionA][positionB]);
            }
        }

        // 3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2do y el 3er elemento y muestra el resultado.

        Vector<String> ejemploVector = new Vector<String>();

        ejemploVector.add("A");
        ejemploVector.add("B");
        ejemploVector.add("C");
        ejemploVector.add("D");
        ejemploVector.add("E");

        ejemploVector.remove(1);
        ejemploVector.remove(2);

        System.out.println(ejemploVector);



    }


    public static String reverse(String texto){


        for (int i = 0; i <  texto.length(); i++){
            System.out.println(texto.charAt(i));

        }


        return null;
    }
}