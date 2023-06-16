/**
 * Clase de ejemplo que muestra cómo evitar un "code smell" utilizando el método de extracción de método.
 */
public class EjemploCodeSmell {

    /**
     * Método principal que muestra el resultado de la operación en función del número proporcionado.
     *
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        int numero = 5;
        String resultado = obtenerResultado(numero);
        System.out.println(resultado);
    }

    /**
     * Obtiene el resultado de la operación según el número proporcionado.
     *
     * @param numero el número para el cual se obtendrá el resultado
     * @return el resultado de la operación
     */
    public static String obtenerResultado(int numero) {
        String resultado = "";

        if (numero > 0) {
            resultado = "El número es positivo";
        } else if (numero < 0) {
            resultado = "El número es negativo";
        } else {
            resultado = "El número es cero";
        }

        return resultado;
    }
}


