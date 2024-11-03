public class TestEmpleado {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos", 2500.0);
        System.out.println("Nombre: " + empleado.nombre); // Acceso permitido
        System.out.println("Salario: " + empleado.getSalario());

        empleado.setSalario(3000.0);
        System.out.println("Nuevo Salario: " + empleado.getSalario());
    }
}
