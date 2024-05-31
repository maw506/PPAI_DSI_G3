package Boundary;   

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Control.GestorActualizaciones;

public class InterfazBodega extends JFrame {
    private GestorActualizaciones gestor;

    public InterfazBodega(GestorActualizaciones gestor) {
        super("Bodega");

        this.gestor = gestor;

        // Configurar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Botón para importar actualizaciones de vino
        JButton btnImportar = new JButton("Importar Actualizaciones de Vino");
        btnImportar.setBounds(50, 50, 300, 100);
        btnImportar.addActionListener(e -> importarActVino());
        panel.add(btnImportar);

        // Agregar panel a la ventana
        add(panel);

        // Hacer visible la ventana
        setVisible(true);
    }

    private void importarActVino() {
        // Crear un nuevo gestor y le envía las bodegas y la fecha actual
        gestor.importarActVino();
    }
}
