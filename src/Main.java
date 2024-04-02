import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        char[] alphabetLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' '};

        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
                ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", " "};

        // Code logic: alphabetLetters[0] == A <==> morseCode[0] == ".-" => A == ".-"

        String userWord = scanner.nextLine();   //Palabra que ingresa el usuario

        int [] result = new int[userWord.length()];

        if ( !userWord.isEmpty() && userWord.matches("[a-zA-Z ]+") ) {
            String upperCaseWord = userWord.toUpperCase();
            char[] userWordArray = upperCaseWord.toCharArray();

            for (int i = 0; i < userWordArray.length; i++){         //Recorre el arreglo userWordArray
                for (int j = 0; j < alphabetLetters.length; j++) {  //Recorre el arreglo alphabetLetters
                    if (userWordArray[i] == alphabetLetters[j]) {
                        result[i] = j;
                        break;
                    }
                }
            }
            printCodeMorse(result,morseCode);
        }
        else if (!userWord.isEmpty() && userWord.matches("[\\.\\- ]+")){
            List<Integer> positions = new ArrayList<>();
            String[] userLetters = userWord.split(" ");             //userWord pasa a ser un array de strings separando cada simbolo Morse

            for (int i = 0; i < userLetters.length; i++) {
                for (int j = 0; j <morseCode.length; j++){
                    if (userLetters[i].equals(morseCode[j])){
                        positions.add(j);
                    }
                }
                if (userLetters[i].equals("")){         //Entre palabras completas se agrega -1 como marcador de espacios
                    positions.add(-1);
                }
            }

            printAlphabet(positions,alphabetLetters);
        }
        else if ( userWord.isEmpty() ){
            System.out.println("No ingresaste ninguna palabra");
        }
        else {
            System.out.println("Los caracteres ingresados NO estan permitidos");
        }


        scanner.close();
    }
    public static void printCodeMorse(int[] result, String[] morseCode ){
        for (int indexRes : result){
            if (morseCode[indexRes] .equals(" ")){                    //En codigo Morse, entre palabras debe haber 2 espacios
                System.out.print(morseCode[indexRes]);
            }
            else {
                System.out.print(morseCode[indexRes] + " ");    //En codigo Morse, entre cada "letra" debe haber 1 espacio
            }
        }
    }

    public static void printAlphabet(List<Integer> positions, char[] alphabetLetters ){
        for (int pos : positions){
            if (pos == -1){
                System.out.print(" ");
            }
            else {
                System.out.print(alphabetLetters[pos]);
            }
        }
    }
}