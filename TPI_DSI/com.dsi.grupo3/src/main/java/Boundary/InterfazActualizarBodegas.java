package Boundary;

import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

import Control.GestorActualizaciones;

public class InterfazActualizarBodegas extends JFrame {
    private GestorActualizaciones gestor;
    private List<JCheckBox> checkboxes;

    public InterfazActualizarBodegas(GestorActualizaciones gestor, List<String> bodegasConAct) {
        super("Actualizar Bodegas");

        this.gestor = gestor;
        this.checkboxes = new ArrayList<>();

        // Configurar la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Agregar checkboxes con los nombres de las bodegas
        for (String nombreBodega : bodegasConAct) {
            JCheckBox checkBox = new JCheckBox(nombreBodega);
            checkboxes.add(checkBox);
            add(checkBox);
        }

        // Botón para actualizar bodegas
        JButton btnActualizar = new JButton("Actualizar Bodegas");
        btnActualizar.addActionListener(e -> actualizarBodegas());
        add(btnActualizar);

        // Hacer visible la ventana
        setVisible(true);
    }

    private void actualizarBodegas() {
        List<String> bodegasSeleccionadas = new ArrayList<>();
        for (JCheckBox checkBox : checkboxes) {
            if (checkBox.isSelected()) {
                bodegasSeleccionadas.add(checkBox.getText());
            }
        }
        gestor.tomarSeleccionBodegas(bodegasSeleccionadas);
        dispose();  // Cerrar la ventana después de la actualización
    }
}
