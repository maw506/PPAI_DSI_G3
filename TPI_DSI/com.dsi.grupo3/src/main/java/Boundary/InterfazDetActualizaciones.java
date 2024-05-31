package Boundary;

import java.util.List;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import Control.GestorActualizaciones;
import Entidades.Bodega;
import Entidades.Vino;

public class InterfazDetActualizaciones extends JFrame {
    private GestorActualizaciones gestor;

    public InterfazDetActualizaciones(List<Vino> vinosAux) {
        super("Detalles de Actualización");

        // Configurar la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        for (Vino vino : vinosAux) {
            JTextArea detalles = new JTextArea(vino.toString());
            detalles.setEditable(false);
            add(new JScrollPane(detalles));
        }

        // Panel de botones
        JPanel panelBotones = new JPanel();
        JButton btnConfirmar = new JButton("Confirmar");
        JButton btnCancelar = new JButton("Cancelar");
        panelBotones.add(btnConfirmar);
        panelBotones.add(btnCancelar);
        add(panelBotones);

        // Acciones de los botones
        btnConfirmar.addActionListener(e -> gestor.confirmarActualizacion());
        btnCancelar.addActionListener(e -> gestor.cancelarActualizacion());

        // Hacer visible la ventana
        setVisible(true);
    }
}
