
package com.mycompany.atv;

import javax.swing.*;

public class CadastroGUI extends JFrame {
    private JTextField textField;
    private JButton cadastrarButton;
    private JButton verCadastroButton;
    private Cadastro cadastro;

    public CadastroGUI(Cadastro cadastro) {
        this.cadastro = cadastro;
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setSize(300, 200);

        JPanel panel = new JPanel();
        textField = new JTextField(20);
        cadastrarButton = new JButton("Cadastrar");
        verCadastroButton = new JButton("Ver Cadastros");

        cadastrarButton.addActionListener(e -> cadastrar());
        verCadastroButton.addActionListener(e -> verCadastros());

        panel.add(textField);
        panel.add(cadastrarButton);
        panel.add(verCadastroButton);

        getContentPane().add(panel);
    }

    private void cadastrar() {
        String texto = textField.getText();
        cadastro.cadastrar(texto);
        JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
        textField.setText(""); // Limpa o campo de texto após o cadastro
    }

    private void verCadastros() {
        JOptionPane.showMessageDialog(this, cadastro.getTodosCadastros(), "Cadastros", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Cadastro cadastro = new Cadastro();
            new CadastroGUI(cadastro).setVisible(true);
        });
    }
}