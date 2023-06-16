/**
 * Clase principal que realiza operaciones en una cuenta bancaria.
 */
public class Main {

    /**
     * Método principal que crea una cuenta, realiza operaciones y muestra el saldo actual.
     *
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        float cantidad = 500.50f;
        operativa_cuenta(cuenta1, cantidad);
    }

    /**
     * Realiza las operaciones en la cuenta especificada e imprime el saldo actual.
     *
     * @param cuenta la cuenta en la que se realizarán las operaciones
     * @param cantidad la cantidad a ingresar en la cuenta
     */
    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        double saldoActual;

        saldoActual = cuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}




