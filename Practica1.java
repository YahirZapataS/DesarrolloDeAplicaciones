public class Practica1 {
    public static void main(String[] args) {
        String text = "Este autobus va muy lento, si no acelera llegare muy tarde a clases y"
        + "no podre presentar el examen, el profesor no va a creerme, reprobaré"
        + " y ¿Que sera de mi? Ni si quiera es mi culpa, pero todos actuaran como"
        + " or to take arms against a sea of troubles,"
        + " asi fuera.";

        int spaces = 0, vowels = 0, letters = 0;

        text = text.toLowerCase();
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (Character.isLetter(c)) {
                letters++;
                if ("aeiouáéíóúü".indexOf(c) != -1) {
                    vowels++;
                }
            } else if (Character.isWhitespace(c)) {
                spaces++;
            }
        }

        System.out.println("The text contained vowels: " + vowels + "\n"
        + "consonants " + (letters - vowels) + "\n" + "spaces: " + spaces);
    }
}