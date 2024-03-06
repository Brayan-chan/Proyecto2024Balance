package com.Proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class BalanceGeneralForm extends JFrame {

    private JTextField entidadTextField, fechaTextField, activosCirculantesTextField, activosFijosTextField,
            activosDiferidosTextField, pasivosCirculantesTextField, pasivosFijosTextField, pasivosDiferidosTextField,
            contadorTextField, autorizadorTextField;

    public BalanceGeneralForm() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Generar Balance");
        JPanel generarPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        generarPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        entidadTextField = new JTextField(20);
        fechaTextField = new JTextField(10);
        activosCirculantesTextField = new JTextField(10);
        activosFijosTextField = new JTextField(10);
        activosDiferidosTextField = new JTextField(10);
        pasivosCirculantesTextField = new JTextField(10);
        pasivosFijosTextField = new JTextField(10);
        pasivosDiferidosTextField = new JTextField(10);
        contadorTextField = new JTextField(20);
        autorizadorTextField = new JTextField(20);

        JButton generarTxtButton = new JButton("Generar txt");
        generarTxtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarTxt();
            }
        });

        generarPanel.add(new JLabel("Nombre de Entidad:"));
        generarPanel.add(entidadTextField);
        generarPanel.add(new JLabel("Fecha del Balance:"));
        generarPanel.add(fechaTextField);
        generarPanel.add(new JLabel("Activos Circulantes:"));
        generarPanel.add(activosCirculantesTextField);
        generarPanel.add(new JLabel("Activos Fijos:"));
        generarPanel.add(activosFijosTextField);
        generarPanel.add(new JLabel("Activos Diferidos:"));
        generarPanel.add(activosDiferidosTextField);
        generarPanel.add(new JLabel("Pasivos Circulantes:"));
        generarPanel.add(pasivosCirculantesTextField);
        generarPanel.add(new JLabel("Pasivos Fijos:"));
        generarPanel.add(pasivosFijosTextField);
        generarPanel.add(new JLabel("Pasivos Diferidos:"));
        generarPanel.add(pasivosDiferidosTextField);
        generarPanel.add(new JLabel("Nombre del Contador:"));
        generarPanel.add(contadorTextField);
        generarPanel.add(new JLabel("Nombre del Autorizador:"));
        generarPanel.add(autorizadorTextField);

        generarPanel.add(new JLabel());
        generarPanel.add(generarTxtButton);

        add(generarPanel, BorderLayout.NORTH);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void generarTxt() {
        try {
            String nombreArchivo = JOptionPane.showInputDialog(this, "Ingrese el nombre del archivo:");
            BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo + ".txt"));
            writer.write("Nombre de Entidad: " + entidadTextField.getText() + "\n");
            writer.write("Fecha del Balance: " + fechaTextField.getText() + "\n");
            writer.write("Activos Circulantes: " + activosCirculantesTextField.getText() + "\n");
            writer.write("Activos Fijos: " + activosFijosTextField.getText() + "\n");
            writer.write("Activos Diferidos: " + activosDiferidosTextField.getText() + "\n");
            writer.write("Pasivos Circulantes: " + pasivosCirculantesTextField.getText() + "\n");
            writer.write("Pasivos Fijos: " + pasivosFijosTextField.getText() + "\n");
            writer.write("Pasivos Diferidos: " + pasivosDiferidosTextField.getText() + "\n");
            writer.write("Nombre del Contador: " + contadorTextField.getText() + "\n");
            writer.write("Nombre del Autorizador: " + autorizadorTextField.getText() + "\n");
            writer.close();
            JOptionPane.showMessageDialog(this, "Archivo generado exitosamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al generar el archivo.");
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BalanceGeneralForm();
            }
        });
    }
}


