package ejercicios;
import javax.swing.JOptionPane;

public class Ciclos {
    public static void main(String[] args) {
        int cantidadFrascos = 5;
        StringBuilder reporte = new StringBuilder("Iniciando revisión de Lote de Paracetamol:\n\n");

        for (int frasco = 1; frasco <= cantidadFrascos; frasco++) {
            reporte.append("💊 Frasco #").append(frasco).append(": Revisado - Fecha de caducidad OK\n");
        }
        reporte.append("\n✅ Todo el lote ha sido revisado con éxito.");
        
        JOptionPane.showMessageDialog(null, reporte.toString(), "Sistema de Farmacia - Control de Lotes", JOptionPane.INFORMATION_MESSAGE);
    }
}