public class Main {

    //Almacena el color de los calcetines
    static String[] calcetines = {"azul", "verde", "azul", "rojo"};

    public static void main(String args[]) {

        //Inicializa la variable de pares incompletos y
        int paresIncompletos = 0;
        boolean[] contado = new boolean[calcetines.length];

        //Cuenta la cantidad de veces que aparece un color
        for (int i = 0; i < calcetines.length; i++) {
            if (contado[i]) continue; // Evita contar el mismo color varias veces

            int count = 0;
            for (int j = 0; j < calcetines.length; j++) {
                if (calcetines[i].equals(calcetines[j])) {
                    count++;
                    contado[j] = true; // Marca como contado
                }
            }

            // Marca el color que sea impar
            if (count % 2 != 0) {
                paresIncompletos++;
            }
        }

        System.out.println("Cantidad de pares incompletos: " + paresIncompletos);
    }
}