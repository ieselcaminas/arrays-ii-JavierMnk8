public class Duplicados {
    //Si entiendes el + 1, entiendes el ejercicio
    public static String duplicados(int [] nums){
        String resultado = "";
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    resultado += " " + nums[j];
                }
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        int [] nums = {12, 6, 2, 6, 5, 2, 12};
        String resultado = duplicados(nums);

        System.out.println(resultado);
    }
}