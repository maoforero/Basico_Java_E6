

public class Main {
    public static void main(String[] args) {
        System.out.println("Entrega 6");
        reverse("Hola Mundo");

        String[] unidimensionalArray = {"Manzada", "Pera", "Uva", "Lulo"};

        for (int positionArray = 0; positionArray < unidimensionalArray.length; positionArray++){
            System.out.println(unidimensionalArray[positionArray]);
        }

        int[][] bidimensionalArray = {{1,2,3},{4,5,6}};

        for (int positionA = 0; positionA < bidimensionalArray.length; positionA++){
            for(int positionB = 0; positionB < bidimensionalArray[positionA].length; positionB++){
                System.out.println("Posicion: " + bidimensionalArray[positionA][positionB]);
            }
        }
    }


    public static String reverse(String texto){


        for (int i = 0; i <  texto.length(); i++){
            System.out.println(texto.charAt(i));

        }


        return null;
    }
}