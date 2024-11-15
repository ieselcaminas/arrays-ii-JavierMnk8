public class Iguales {
    public static boolean sonIguales(int [] array, int [] arrayClone){
        if (array.length != arrayClone.length){
            return false;
        }
        for (int i = 0; i < array.length; i++) {
                if (array[i] != arrayClone[i]){
                    return false;
                }
        }
        return true;
    }
    public static void main(String[] args) {
        int [] array = {12, 34, 2, 8};
        int [] arrayClone = array.clone();

        boolean esIgual = sonIguales(array, arrayClone);
        System.out.println(esIgual);
    }
}