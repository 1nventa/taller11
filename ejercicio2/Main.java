public class Main {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Juan", 1500);
        gerente.mostrarDetalles();

        Empleado vendedor = new Vendedor("Ana", 300);
        vendedor.mostrarDetalles();
    }
}