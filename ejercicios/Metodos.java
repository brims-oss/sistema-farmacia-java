package ejercicios;
import javax.swing.JOptionPane;

public class Metodos {
    public static double calcularDescuento(double precioOriginal, double porcentajeDescuento) {
        return precioOriginal - (precioOriginal * (porcentajeDescuento / 100));
    }

    public static double aplicarIVA(double precioBase) {
        return precioBase * 1.15;
    }

    public static void main(String[] args) {
        try {
            String input = JOptionPane.showInputDialog(null, "Ingrese el precio del medicamento ($):", "Caja Registradora", JOptionPane.QUESTION_MESSAGE);
            if (input != null && !input.isEmpty()) {
                double precioInicial = Double.parseDouble(input);
                double precioConDescuento = calcularDescuento(precioInicial, 10);
                double precioFinal = aplicarIVA(precioConDescuento);

                String ticket = String.format("🧾 TICKET DE VENTA\n\nPrecio Original: $%.2f\nDescuento aplicado (10%%): $%.2f\nTotal a Pagar (con IVA 15%%): $%.2f", 
                                              precioInicial, precioConDescuento, precioFinal);
                JOptionPane.showMessageDialog(null, ticket, "Transacción Exitosa", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Por favor ingrese un número válido.", "Error de Sistema", JOptionPane.ERROR_MESSAGE);
        }
    }
}