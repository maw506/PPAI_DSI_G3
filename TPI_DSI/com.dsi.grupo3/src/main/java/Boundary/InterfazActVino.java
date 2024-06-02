package Boundary;

import Control.GestorActualizaciones;
import Entidades.Vino;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;


public class InterfazActVino extends JFrame {
    private JPanel panel;
    private List<JCheckBox> checkboxes;
    private GestorActualizaciones gestor;
    
    public InterfazActVino(GestorActualizaciones gestor) {
        // Configurar el frame
        setTitle("Importar Actualizaciones de Vino");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel y establecer su layout
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        JButton button = new JButton("Importar Actualizaciones de Vino");
        button.setBounds(50, 50, 300, 100);
        button.addActionListener(e -> gestor.importarActualizacionesVino());

        panel.add(Box.createVerticalGlue());
        panel.add(button);
        panel.add(Box.createVerticalGlue());

        // Añadir el panel al frame
        getContentPane().add(panel);

        // Hacer visible la interfaz
        setVisible(true);
    }

    public void InterfazMostrarBodegas(List<String> bodegasConAct) {
        // Asumo que el gestor me envía solo el nombre de las bodegas
        panel.removeAll();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        
        this.checkboxes = new ArrayList<>();
        for (String b: bodegasConAct) {
            JCheckBox checkBox = new JCheckBox(b);
            checkboxes.add(checkBox);
        }
        panel.add((Component) checkboxes);
        JButton btnActualizar = new JButton("Actualizar Bodegas");
        btnActualizar.addActionListener(e -> actualizarBodegas());
        add(btnActualizar);
        setVisible(true);
    }

    public void InterfazMostrarActualizaciones(List<Vino> vinosAux) {
        panel.removeAll();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        for (Vino vino : vinosAux) {
            JTextArea detalles = new JTextArea(vino.toString());
            detalles.setEditable(false);
            add(new JScrollPane(detalles));
        }

        // Panel de botones
        JButton btnConfirmar = new JButton("Confirmar");
        JButton btnCancelar = new JButton("Cancelar");
        btnConfirmar.addActionListener(e -> gestor.confirmarActualizacion());
        btnCancelar.addActionListener(e -> gestor.cancelarActualizacion());
        panel.add(btnConfirmar);
        panel.add(btnCancelar);
        add(panel);

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
    }
}

