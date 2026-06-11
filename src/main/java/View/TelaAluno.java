package View;

import Repository.AlunoRepository;
import org.example.Model.Aluno;

import javax.swing.*;
import java.awt.*;

public class TelaAluno extends JInternalFrame {

    public TelaAluno() {

        setTitle("Cadastro Aluno");
        setClosable(true);
        setMaximizable(true);
        setSize(450, 500);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel labelMatricula = new JLabel("Matrícula");
        labelMatricula.setBounds(30, 30, 130, 25);
        add(labelMatricula);

        JTextField campoMatricula = new JTextField();
        campoMatricula.setBounds(180, 30, 180, 35);
        Estilo.estilizarCampo(campoMatricula);
        add(campoMatricula);

        JLabel labelNome = new JLabel("Nome");
        labelNome.setBounds(30, 80, 130, 25);
        add(labelNome);

        JTextField campoNome = new JTextField();
        campoNome.setBounds(180, 80, 180, 35);
        Estilo.estilizarCampo(campoNome);
        add(campoNome);

        JLabel labelCurso = new JLabel("Curso");
        labelCurso.setBounds(30, 130, 130, 25);
        add(labelCurso);

        JTextField campoCurso = new JTextField();
        campoCurso.setBounds(180, 130, 180, 35);
        Estilo.estilizarCampo(campoCurso);
        add(campoCurso);

        JLabel labelPeriodo = new JLabel("Período");
        labelPeriodo.setBounds(30, 180, 130, 25);
        add(labelPeriodo);

        JTextField campoPeriodo = new JTextField();
        campoPeriodo.setBounds(180, 180, 180, 35);
        Estilo.estilizarCampo(campoPeriodo);
        add(campoPeriodo);

        JLabel labelEmail = new JLabel("E-mail");
        labelEmail.setBounds(30, 230, 130, 25);
        add(labelEmail);

        JTextField campoEmail = new JTextField();
        campoEmail.setBounds(180, 230, 180, 35);
        Estilo.estilizarCampo(campoEmail);
        add(campoEmail);

        JLabel labelTel = new JLabel("Telefone");
        labelTel.setBounds(30, 280, 130, 25);
        add(labelTel);

        JTextField campoTel = new JTextField();
        campoTel.setBounds(180, 280, 180, 35);
        Estilo.estilizarCampo(campoTel);
        add(campoTel);

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
                    campoMatricula,
                    campoNome,
                    campoCurso,
                    campoPeriodo,
                    campoEmail,
                    campoTel
            };

            for (JTextField campo : camposObrigatorios) {
                if (campo.getText().trim().isEmpty()) {
                    Estilo.aplicarBorda(campo, Estilo.COR_ERRO);
                    valido = false;
                } else {
                    Estilo.aplicarBorda(campo, Estilo.COR_BORDA);
                }
            }

            if (!valido) return;

            Aluno aluno = new Aluno();
            aluno.setMatricula(campoMatricula.getText());
            aluno.setNome(campoNome.getText());
            aluno.setCurso(campoCurso.getText());
            aluno.setPeriodo(Integer.parseInt(campoPeriodo.getText()));
            aluno.setEmail(campoEmail.getText());
            aluno.setTelefone(campoTel.getText());
            aluno.setObs(campoObs.getText());

            AlunoRepository.cadastrar(aluno);

            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
        });

        setVisible(true);
    }
}