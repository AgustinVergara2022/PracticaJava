package ClaveMorse;


public class ClaveMorse {
    private static final String[] morseAlphabet = {".-", "-...", "-.-.", /* Agregar más letras Morse según sea necesario */};
    private static final String[] alphabet = {"A", "B", "C", /* Agregar más letras según sea necesario */};

    public static String encodeToMorse(String sentence) {
        StringBuilder morseCode = new StringBuilder();
        String[] words = sentence.toUpperCase().split(" ");
        
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                String character = String.valueOf(word.charAt(i));
                int index = character.charAt(0) - 'A';
                if (index >= 0 && index < alphabet.length) {
                    morseCode.append(morseAlphabet[index]).append(" ");
                }
            }
            morseCode.append("   "); // Tres espacios entre palabras en clave Morse
        }

        return morseCode.toString().trim();
    }

    public static String decodeFromMorse(String morseCode) {
        StringBuilder decodedSentence = new StringBuilder();
        String[] words = morseCode.split("   ");
        
        for (String word : words) {
            String[] morseLetters = word.split(" ");
            for (String morseLetter : morseLetters) {
                for (int i = 0; i < morseAlphabet.length; i++) {
                    if (morseLetter.equals(morseAlphabet[i])) {
                        decodedSentence.append(alphabet[i]);
                        break;
                    }
                }
            }
            decodedSentence.append(" "); // Espacio entre letras en español
        }

        return decodedSentence.toString().trim();
    }

    public static void main(String[] args) {
        String spanishSentence = "HOLA MUNDO";
        String morseCode = encodeToMorse(spanishSentence);
        System.out.println("Frase en clave Morse: " + morseCode);

        String decodedSentence = decodeFromMorse(morseCode);
        System.out.println("Frase decodificada: " + decodedSentence);
    }
    
    
}
