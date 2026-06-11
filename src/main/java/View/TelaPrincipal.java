package View;

import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {
        setTitle("CapEstagio");
        setSize(1000, 600);
        setUndecorated(true);
        setShape(new RoundRectangle2D.Double(0, 0, 1200, 600, 30, 30));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane desktopPane = new JDesktopPane();
        add(desktopPane, BorderLayout.CENTER);

        JMenu menuCadastros = new JMenu("Cadastros");

        JMenuItem itemAluno = new JMenuItem("Aluno");
        itemAluno.addActionListener(e -> {
            TelaAluno tela = new TelaAluno();
            desktopPane.add(tela);
            tela.setVisible(true);
        });

        JMenuItem itemEmpresa = new JMenuItem("Empresa");
        itemEmpresa.addActionListener(e -> {
            TelaEmpresa tela = new TelaEmpresa();
            desktopPane.add(tela);
            tela.setVisible(true);
        });

        JMenuItem itemSair = new JMenuItem("Sair");
        itemSair.addActionListener(e -> System.exit(0));

        menuCadastros.add(itemAluno);
        menuCadastros.add(itemEmpresa);
        menuCadastros.add(itemSair);

        JMenu menuRelatorios = new JMenu("Relatórios");

        JMenuItem itemAlunoRel = new JMenuItem("Aluno");
        itemAlunoRel.addActionListener(e -> {
            ListarAluno tela = new ListarAluno();
            desktopPane.add(tela);
            tela.setVisible(true);
        });

        JMenuItem itemEmpresaRel = new JMenuItem("Empresa");
        itemEmpresaRel.addActionListener(e -> {
            ListarEmpresa tela = new ListarEmpresa();
            desktopPane.add(tela);
            tela.setVisible(true);
        });

        menuRelatorios.add(itemAlunoRel);
        menuRelatorios.add(itemEmpresaRel);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menuCadastros);
        menuBar.add(menuRelatorios);
        setJMenuBar(menuBar);

        setVisible(true);
    }
}