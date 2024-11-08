public class Invertido {
    public static String invertir(String original){
        String[] palabras = original.split(" ");
        String inverso = "";

        for (int i = palabras.length - 1; i >= 0 ; i--) {
            inverso += palabras[i] + " ";
        }

        return inverso;
    }
    public static void main(String[] args) {
        String original = "Esto es una frase";

        System.out.println(invertir(original));
    }
}
