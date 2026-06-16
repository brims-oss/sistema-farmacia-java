package ejercicios;
import javax.swing.JOptionPane;

public class Matrices {
    public static void main(String[] args) {
        String[][] estantes = {
            {"[Paracetamol]", "[Ibuprofeno]", "[Aspirina]"},
            {"[Amoxicilina]", "[Azitromicina]", "[Penicilina]"},
            {"[Vitamina C]", "[Vitamina D]", "[Complejo B]"}
        };
        StringBuilder vistaEstantes = new StringBuilder("🏪 MAPA DE ESTANTES DE LA FARMACIA\n\n");

        for (int fila = 0; fila < estantes.length; fila++) {
            vistaEstantes.append("Estante ").append(fila + 1).append(":  ");
            for (int col = 0; col < estantes[fila].length; col++) {
                vistaEstantes.append(estantes[fila][col]).append("  ");
            }
            vistaEstantes.append("\n\n");
        }
        JOptionPane.showMessageDialog(null, vistaEstantes.toString(), "Organización de Inventario", JOptionPane.INFORMATION_MESSAGE);
    }
}