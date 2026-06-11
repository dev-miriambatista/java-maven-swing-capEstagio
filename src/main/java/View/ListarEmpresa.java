package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ListarEmpresa extends JInternalFrame {

    public ListarEmpresa() {
        setTitle("Lista de Empresas");
        setClosable(true);      // permite fechar a janela interna com o X
        setMaximizable(true);   // permite maximizar a janela interna
        setSize(800, 500);
        setLayout(null);// desativa o layout automático, posicionamento manual com setBounds


        DefaultTableModel TabelaEmpresas = new DefaultTableModel(new String[]{
                "CNPJ",
                "Razão Social",
                "Nome Fantasia",
                "Endereço",
                "Telefone",
                "Nome do Responsável"
        }, 0);

        JTable TB_Empresa = new JTable(TabelaEmpresas);
        Estilo.estilizarTabela(TB_Empresa, new int[]{80, 150, 150, 80, 200, 100});
        TB_Empresa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane scroll = new JScrollPane(TB_Empresa);

        scroll.setBounds(10, 50, 900, 380);
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

        Estilo.estilizarBotao(botaoEditar);
        Estilo.estilizarBotao(botaoExcluir);
        Estilo.estilizarBotao(botaoNovo);
    }
}
