package ejercicios;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Archivos {
    public static void main(String[] args) {
        String cliente = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente para generar la factura:", "Facturación", JOptionPane.QUESTION_MESSAGE);
        
        if (cliente != null && !cliente.trim().isEmpty()) {
            String nombreArchivo = "Factura_" + cliente.replaceAll(" ", "_") + ".txt";
            try {
                FileWriter escritor = new FileWriter(nombreArchivo);
                escritor.write("=== FARMACIA LA SALUD ===\n");
                escritor.write("Cliente: " + cliente + "\n");
                escritor.write("-------------------------\n");
                escritor.write("- Caja de Paracetamol\n");
                escritor.write("- Paquete de Curitas\n");
                escritor.write("Total pagado: $12.50\n");
                escritor.write("¡Gracias por su compra!");
                escritor.close();
                
                JOptionPane.showMessageDialog(null, "✅ Factura guardada como:\n" + nombreArchivo, "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "❌ Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}