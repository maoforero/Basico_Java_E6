import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        System.out.println("Entrega 6");
        reverse("Hola Mundo");

        // 1. Crea un array unidimensional de String y recórrelo, mostrando únicamente sus valores.

        System.out.println("Punto 1");
        String[] unidimensionalArray = {"Manzada", "Pera", "Uva", "Lulo"};

        for (int positionArray = 0; positionArray < unidimensionalArray.length; positionArray++){
            System.out.println(unidimensionalArray[positionArray]);
        }

        // 2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        System.out.println("Punto 2");
        int[][] bidimensionalArray = {{1,2,3},{4,5,6}};

        for (int positionA = 0; positionA < bidimensionalArray.length; positionA++){
            for(int positionB = 0; positionB < bidimensionalArray[positionA].length; positionB++){
                System.out.println("Posicion: " + bidimensionalArray[positionA][positionB]);
            }
        }

        // 3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2do y el 3er elemento y muestra el resultado.
        System.out.println("Punto 3");
        Vector<String> ejemploVector = new Vector<String>();

        ejemploVector.add("A");
        ejemploVector.add("B");
        ejemploVector.add("C");
        ejemploVector.add("D");
        ejemploVector.add("E");

        ejemploVector.remove(1);
        ejemploVector.remove(2);

        System.out.println(ejemploVector);

        // 4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        System.out.println("Punto 4");
        String explicacion4 = "Al tener una capacidad por defecto si se añade un elemento por encima de la capacidad tendremos fallos en la ejecución.";
        System.out.println(explicacion4);

        // 5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.

        System.out.println("Punto 5");
        ArrayList<String> ejemploArrayList = new ArrayList<String>();
        ejemploArrayList.add("Cleopatra");
        ejemploArrayList.add("Alejandro Magno");
        ejemploArrayList.add("Julio Cesar");
        ejemploArrayList.add("Tutamkamon");

        LinkedList<String> ejemploLinkedList = new LinkedList();

        ejemploLinkedList.addAll(ejemploArrayList);

        for (int elemento = 0; elemento <  ejemploArrayList.size(); elemento++){
            System.out.println("ArrayList posición: " + elemento + " ArrayList Elemento: " + ejemploArrayList.get(elemento));
            System.out.println("LinkedList posición: " + elemento + " LinkedList elemento: " + ejemploLinkedList.get(elemento) );
        }

        // 6. Crea un ArrayList de tipo int y utilizando un bucle rellenalo con elementos 1 a 10. A continuacion con otro bucle
        // recorrelo y elimina los numeros pares. Por ultimo, vuelve a recorrerlo y muestra el ArrayList final.

        ArrayList<Integer> arrayNumeros = new ArrayList<Integer>();

        for(int n = 1; n < 11; n ++){
            arrayNumeros.add(n);
        }

        System.out.println("Agreando numeros: " + arrayNumeros);

        for(int i = 0; i < arrayNumeros.size(); i++){
            if( arrayNumeros.get(i) % 2 == 0){
                arrayNumeros.remove(arrayNumeros.get(i));
            }
        }

        System.out.println("Solo numeros impares: " + arrayNumeros);

        for(int l = 0; l < arrayNumeros.size(); l++){
            System.out.println("Recorriendo Array posicion " + l + " Elemento: " + arrayNumeros.get(l));
        }

        // 7. Crea una funcion dividePorCero. Debe generar una excepcion (throws) a su llamante del tipo ArithMethicException que sera
        // Capturada por su llamante main. Si se dispara la excepcion, mostraremos el mensaje "Esto no puede hacerse". Sino "Demo Codigo.

        dividePorCero(10);
        dividePorCero(0);

    }

    public static Integer dividePorCero(Integer numero) throws ArithmeticException{
        try{
            numero = numero / 0;
        }catch(ArithmeticException e){
            System.out.println("Esto no puede hacerse.");
        }

        System.out.println("Demo de codigo");
        return 0;
    }


    public static String reverse(String texto){


        for (int i = 0; i <  texto.length(); i++){
            System.out.println(texto.charAt(i));

        }
        return null;
    }


    public static String dosParametros(String fileIn, String fileOut){
        InputStream fileInIS = new InputStream();
        }
        return fileIn;
    }

}