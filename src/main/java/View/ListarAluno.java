package View;

import Repository.AlunoRepository;
import org.example.Model.Aluno;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ListarAluno extends JInternalFrame {

    public ListarAluno() {
        setTitle("Lista de Alunos");
        setClosable(true);
        setMaximizable(true);
        setSize(950, 500);
        setLayout(null);

        DefaultTableModel TabelaAlunos = new DefaultTableModel(new String[]{
                "Matricula",
                "Nome",
                "Curso",
                "Periodo",
                "E-mail",
                "Telefone"
        }, 0);

        List<Aluno> alunos = new AlunoRepository().listar();
        for (Aluno aluno : alunos) {
            TabelaAlunos.addRow(new Object[]{
                    aluno.getMatricula(),
                    aluno.getNome(),
                    aluno.getCurso(),
                    aluno.getPeriodo(),
                    aluno.getEmail(),
                    aluno.getTelefone()
            });
        }

        JTable TB_Aluno = new JTable(TabelaAlunos);
        Estilo.estilizarTabela(TB_Aluno, new int[]{80, 150, 160, 60, 260, 150});
        TB_Aluno.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane scroll = new JScrollPane(TB_Aluno);
        scroll.setBounds(10, 50, 850, 380);
        add(scroll);

        JButton botaoNovo = new JButton("Novo");
        botaoNovo.setBounds(280, 25, 100, 20);
        add(botaoNovo);

        JButton botaoEditar = new JButton("Editar");
        botaoEditar.setBounds(180, 25, 100, 20);
        add(botaoEditar);

        JButton botaoExcluir = new JButton("Excluir");
        botaoExcluir.setBounds(80, 25, 100, 20);
        add(botaoExcluir);

        Estilo.estilizarBotao(botaoNovo);
        Estilo.estilizarBotao(botaoEditar);
        Estilo.estilizarBotao(botaoExcluir);
    }
}