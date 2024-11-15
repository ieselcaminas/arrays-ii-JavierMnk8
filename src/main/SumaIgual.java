public class SumaIgual {
    public static String sumaIgual(int [] num, int numUsuario){
        String suma = "";
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == numUsuario){
                    suma += "["+ num[i] + " + " + num[j] + "] ";
                }
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        //int numUsuario = 15;
        int numUsuario = Utilidades.leerEntero("Introduce un número");
        int[] num = {2, 5, 12, 6, 7, 10, 3, 8, 4, 13, 1, 15};
        String suma = sumaIgual(num, numUsuario);

        System.out.println(suma);
    }
}
