package View;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;

public class Estilo {

    // CORES
    public static final Color COR_BORDA = Color.GRAY;

    public static final Color COR_ERRO = Color.RED;

    public static final Color COR_FUNDO = Color.WHITE;

    // BORDA ARREDONDADA
    public static void aplicarBorda(JTextField campo, Color cor) {

        campo.setBorder(new AbstractBorder() {

            @Override
            public void paintBorder(Component c,
                                    Graphics g,
                                    int x,
                                    int y,
                                    int width,
                                    int height) {

                Graphics2D g2 = (Graphics2D) g.create();

                g2.setRenderingHint(
                        RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON
                );

                g2.setColor(cor);

                g2.setStroke(new BasicStroke(1.5f));

                g2.drawRoundRect(
                        x,
                        y,
                        width - 1,
                        height - 1,
                        12,
                        12
                );

                g2.dispose();
            }

            @Override
            public Insets getBorderInsets(Component c) {

                return new Insets(8, 12, 8, 12);
            }
        });
    }

    public static void estilizarTabela(JTable tabela, int[] larguras) {
        for (int i = 0; i < larguras.length; i++) {
            tabela.getColumnModel().getColumn(i).setPreferredWidth(larguras[i]);
        }
    }

    // ESTILO DOS CAMPOS
    public static void estilizarCampo(JTextField campo) {

        aplicarBorda(campo, COR_BORDA);

        campo.setOpaque(true);

        campo.setBackground(COR_FUNDO);

        campo.setForeground(Color.BLACK);

        campo.setCaretColor(Color.BLACK);

        campo.setFont(new Font("Arial", Font.PLAIN, 14));
    }

    // ESTILO DOS BOTÕES
        public static void estilizarBotao(JButton botao){

        botao.setFocusPainted(false);

        botao.setBackground(new Color(230, 230, 230));

        botao.setForeground(Color.BLACK);

        botao.setFont(new Font("Arial", Font.BOLD, 14));

        botao.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
}