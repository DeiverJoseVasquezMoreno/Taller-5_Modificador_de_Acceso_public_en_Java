public class TestCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("12345", 5000.0, "Ahorros");
        System.out.println("Tipo de cuenta: " + cuenta.tipoCuenta); // Acceso permitido
        cuenta.mostrarDetalles();

        // Error de compilación: The field CuentaBancaria.numeroCuenta is not visible
        // System.out.println(cuenta.numeroCuenta);

        cuenta.setSaldo(6000.0);
        System.out.println("Nuevo saldo: " + cuenta.getSaldo());
    }
}
