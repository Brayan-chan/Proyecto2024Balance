package com.Proyecto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class BalancesGeneradosForm extends JFrame {

    private JTextField buscarTextField;
    private JComboBox<String> archivosComboBox;
    private JTextArea balanceTextArea;

    public BalancesGeneradosForm() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Balances Generados");
        JPanel mostrarPanel = new JPanel(new BorderLayout());
        
        // Panel para el buscador
        JPanel buscarPanel = new JPanel(new BorderLayout());
        buscarPanel.setBackground(new Color(78, 184, 223));
        buscarTextField = new JTextField(20);
        buscarTextField.setPreferredSize(new Dimension(150, 30));
        
        // Botón de búsqueda con icono
        JButton buscarButton = new JButton();
        buscarButton.setIcon(new ImageIcon(getClass().getResource("/com/imagenes/search.png")));
        buscarButton.setPreferredSize(new Dimension(40, 30));
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarArchivo();
            }
        });
        buscarPanel.add(buscarTextField, BorderLayout.CENTER);
        buscarPanel.add(buscarButton, BorderLayout.EAST);
        
        // Panel para botones y combo box
        JPanel botonPanel = new JPanel(new BorderLayout());
        botonPanel.setBackground(new Color(78, 184, 223));
        
        // Botón de actualización con icono
        JButton actualizarButton = new JButton();
        actualizarButton.setIcon(new ImageIcon(getClass().getResource("/com/imagenes/editing.png")));
        actualizarButton.setPreferredSize(new Dimension(40, 30));
        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarBalance();
            }
        });
        
        // Botón de eliminación con icono
        JButton eliminarButton = new JButton();
        eliminarButton.setIcon(new ImageIcon(getClass().getResource("/com/imagenes/trash.png")));
        eliminarButton.setPreferredSize(new Dimension(40, 30));
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarBalance();
            }
        });
        
        // Combo box para archivos
        archivosComboBox = new JComboBox<>();
        archivosComboBox.setPreferredSize(new Dimension(150, 30));
        
        // Agregar componentes al panel de botones
        botonPanel.add(archivosComboBox, BorderLayout.WEST);
        botonPanel.add(actualizarButton, BorderLayout.CENTER);
        botonPanel.add(eliminarButton, BorderLayout.EAST);
        
        // Panel para el área de texto
        balanceTextArea = new JTextArea(10, 30);
        
        // Agregar componentes al panel principal
        mostrarPanel.add(buscarPanel, BorderLayout.NORTH);
        mostrarPanel.add(botonPanel, BorderLayout.CENTER);
        mostrarPanel.add(new JScrollPane(balanceTextArea), BorderLayout.SOUTH);
        
        add(mostrarPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void buscarArchivo() {
        String buscar = buscarTextField.getText();
        archivosComboBox.removeAllItems();
        balanceTextArea.setText("");
        File directorio = new File(".");
        File[] archivos = directorio.listFiles();
        for (File archivo : archivos) {
            if (archivo.isFile() && archivo.getName().toLowerCase().contains(buscar.toLowerCase())) {
                archivosComboBox.addItem(archivo.getName());
            }
        }
    }

    private void actualizarBalance() {
        String nombreArchivo = (String) archivosComboBox.getSelectedItem();
        if (nombreArchivo != null) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo));
                String linea;
                StringBuilder contenido = new StringBuilder();
                while ((linea = reader.readLine()) != null) {
                    contenido.append(linea).append("\n");
                }
                reader.close();
                balanceTextArea.setText(contenido.toString());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo.");
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un archivo para actualizar.");
        }
    }

    private void eliminarBalance() {
        String nombreArchivo = (String) archivosComboBox.getSelectedItem();
        if (nombreArchivo != null) {
            File archivo = new File(nombreArchivo);
            if (archivo.exists()) {
                if (archivo.delete()) {
                    JOptionPane.showMessageDialog(this, "Archivo eliminado correctamente.");
                    archivosComboBox.removeItem(nombreArchivo);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al eliminar el archivo.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "El archivo no existe.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un archivo para eliminar.");
        }
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BalancesGeneradosForm();
            }
        });
    }
}