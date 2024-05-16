
package com.mycompany.atv;

import java.util.ArrayList;

public class Cadastro {
    private ArrayList<String> cadastros;

    public Cadastro() {
        cadastros = new ArrayList<>();
    }

    public void cadastrar(String item) {
        cadastros.add(item);
    }

    public String getTodosCadastros() {
        StringBuilder sb = new StringBuilder();
        for (String cadastro : cadastros) {
            sb.append(cadastro).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        CadastroGUI gui = new CadastroGUI(cadastro);
        gui.setVisible(true);
    }
}