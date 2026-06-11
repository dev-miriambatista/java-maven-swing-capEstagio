package View;

import org.example.Model.Empresa;

import javax.swing.*;
import java.awt.*;

public class TelaEmpresa extends JInternalFrame {

    public TelaEmpresa() {

        setTitle("Cadastro Empresa");

        setClosable(true);

        setMaximizable(true);

        setSize(450, 500);

        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        JLabel labelCNPJ = new JLabel("CNPJ");
        labelCNPJ.setBounds(30, 30, 130, 25);
        add(labelCNPJ);

        JTextField campoCNPJ = new JTextField();
        campoCNPJ.setBounds(180, 30, 180, 35);

        Estilo.estilizarCampo(campoCNPJ);

        add(campoCNPJ);

        JLabel labelRSocial = new JLabel("Razão Social");
        labelRSocial.setBounds(30, 80, 130, 25);
        add(labelRSocial);

        JTextField campoRSocial = new JTextField();
        campoRSocial.setBounds(180, 80, 180, 35);

        Estilo.estilizarCampo(campoRSocial);

        add(campoRSocial);

        JLabel labelNFantasia = new JLabel("Nome Fantasia");
        labelNFantasia.setBounds(30, 130, 130, 25);
        add(labelNFantasia);

        JTextField campoNFantasia = new JTextField();
        campoNFantasia.setBounds(180, 130, 180, 35);

        Estilo.estilizarCampo(campoNFantasia);

        add(campoNFantasia);

        JLabel labelEndereco = new JLabel("Endereço");
        labelEndereco.setBounds(30, 180, 130, 25);
        add(labelEndereco);

        JTextField campoEndereco = new JTextField();
        campoEndereco.setBounds(180, 180, 180, 35);

        Estilo.estilizarCampo(campoEndereco);

        add(campoEndereco);

        JLabel labelTel = new JLabel("Telefone");
        labelTel.setBounds(30, 230, 130, 25);
        add(labelTel);

        JTextField campoTel = new JTextField();
        campoTel.setBounds(180, 230, 180, 35);

        Estilo.estilizarCampo(campoTel);

        add(campoTel);

        JLabel labelContato = new JLabel("Contato Responsável");
        labelContato.setBounds(30, 280, 130, 25);
        add(labelContato);

        JTextField campoContato = new JTextField();
        campoContato.setBounds(180, 280, 180, 35);

        Estilo.estilizarCampo(campoContato);

        add(campoContato);

        JLabel labelObs = new JLabel("Observações");
        labelObs.setBounds(30, 330, 130, 25);
        add(labelObs);

        JTextField campoObs = new JTextField();
        campoObs.setBounds(180, 330, 180, 35);

        Estilo.estilizarCampo(campoObs);

        add(campoObs);

        JButton botaoSalvar = new JButton("Salvar");

        botaoSalvar.setBounds(180, 400, 120, 40);

        Estilo.estilizarBotao(botaoSalvar);

        add(botaoSalvar);

        botaoSalvar.addActionListener(e -> {

            boolean valido = true;

            JTextField[] camposObrigatorios = {
                    campoCNPJ,
                    campoRSocial,
                    campoNFantasia,
                    campoEndereco,
                    campoTel,
                    campoContato
            };

            for (JTextField campo : camposObrigatorios) {

                if (campo.getText().trim().isEmpty()) {

                    Estilo.aplicarBorda(
                            campo,
                            Estilo.COR_ERRO
                    );

                    valido = false;

                } else {

                    Estilo.aplicarBorda(
                            campo,
                            Estilo.COR_BORDA
                    );
                }
            }

            if (!valido) return;

            Empresa empresa = new Empresa();

            // empresa.setCNPJ(campoCNPJ.getText());

            // empresa.setRazaoSocial(campoRSocial.getText());
        });

        setVisible(true);
    }
}