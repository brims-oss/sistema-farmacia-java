package ejercicios;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Listas {
    public static void main(String[] args) {
        ArrayList<String> carrito = new ArrayList<>();
        carrito.add("💊 Caja de Paracetamol");
        carrito.add("🧴 Alcohol en Gel");
        carrito.add("🩹 Paquete de Curitas");

        StringBuilder ticketInicial = new StringBuilder("🛒 CARRITO ACTUAL:\n\n");
        for (String item : carrito) {
            ticketInicial.append("- ").append(item).append("\n");
        }
        ticketInicial.append("\nTotal artículos: ").append(carrito.size());
        JOptionPane.showMessageDialog(null, ticketInicial.toString(), "Revisión", JOptionPane.INFORMATION_MESSAGE);

        carrito.remove("🧴 Alcohol en Gel");
        JOptionPane.showMessageDialog(null, "Se devolvió 'Alcohol en Gel'.", "Modificación", JOptionPane.WARNING_MESSAGE);

        StringBuilder ticketFinal = new StringBuilder("🛒 CARRITO FINAL:\n\n");
        for (String item : carrito) {
            ticketFinal.append("- ").append(item).append("\n");
        }
        ticketFinal.append("\nTotal a facturar: ").append(carrito.size());
        JOptionPane.showMessageDialog(null, ticketFinal.toString(), "Listo para pagar", JOptionPane.INFORMATION_MESSAGE);
    }
}