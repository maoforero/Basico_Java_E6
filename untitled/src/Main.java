

public class Main {
    public static void main(String[] args) {
        System.out.println("Entrega 6");
        reverse("Hola Mundo");

        String[] unidimensionalArray = {"Manzada", "Pera", "Uva", "Lulo"};

        for (int positionArray = 0; positionArray < unidimensionalArray.length; positionArray++){
            System.out.println(unidimensionalArray[positionArray]);
        }
    }


    public static String reverse(String texto){


        for (int i = 0; i <  texto.length(); i++){
            System.out.println(texto.charAt(i));

        }


        return null;
    }
}