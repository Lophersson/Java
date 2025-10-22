import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class financiera extends JFrame {
    private JTextField txtCantidad, txtAnios, txtIncremento;
    private JTextArea txtResultados;

    public financiera() {
        super("Simulación financiera");

        // Configuración visual: modo oscuro y fuentes grises
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 440);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(24, 24, 36));
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(11, 10, 0, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblCantidad = new JLabel("Cantidad inicial (€):");
        lblCantidad.setForeground(new Color(210, 210, 210));
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(lblCantidad, gbc);

        txtCantidad = new JTextField("130000000");
        stylizeInput(txtCantidad);
        gbc.gridy++;
        panel.add(txtCantidad, gbc);

        JLabel lblAnios = new JLabel("Años:");
        lblAnios.setForeground(new Color(210, 210, 210));
        gbc.gridy++;
        panel.add(lblAnios, gbc);

        txtAnios = new JTextField("40");
        stylizeInput(txtAnios);
        gbc.gridy++;
        panel.add(txtAnios, gbc);

        JLabel lblIncremento = new JLabel("Incremento anual (%):");
        lblIncremento.setForeground(new Color(210, 210, 210));
        gbc.gridy++;
        panel.add(lblIncremento, gbc);

        txtIncremento = new JTextField("1.80");
        stylizeInput(txtIncremento);
        gbc.gridy++;
        panel.add(txtIncremento, gbc);

        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBackground(new Color(50, 60, 120));
        btnCalcular.setForeground(new Color(230, 230, 230));
        btnCalcular.setFocusPainted(false);
        gbc.gridy++;
        panel.add(btnCalcular, gbc);

        txtResultados = new JTextArea(8, 27);
        txtResultados.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        txtResultados.setBackground(new Color(17, 17, 25));
        txtResultados.setForeground(new Color(200, 200, 200));
        txtResultados.setLineWrap(true);
        txtResultados.setWrapStyleWord(true);
        txtResultados.setEditable(false);
        txtResultados.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));

        JScrollPane scroll = new JScrollPane(txtResultados);
        scroll.setBorder(BorderFactory.createEmptyBorder());
        gbc.gridy++;
        panel.add(scroll, gbc);

        add(panel);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });

        calcular();
    }

    private void estilizarLabel(JLabel label) {
        label.setForeground(new Color(192, 192, 192));
        label.setFont(new Font("Segoe UI", Font.BOLD, 15));
    }

    private void stylizeInput(JTextField tf) {
        tf.setBackground(new Color(25, 25, 48));
        tf.setForeground(new Color(200, 200, 200));
        tf.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        tf.setCaretColor(new Color(120, 200, 250));
        tf.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(50, 50, 85)),
                BorderFactory.createEmptyBorder(5, 9, 5, 9)
        ));
    }

    private void calcular() {
        try {
            double cantidad = Double.parseDouble(txtCantidad.getText().trim());
            // Notas: años e incremento actualmente no influyen en el cálculo, pero puedes usarlos si lo deseas
            int anios = Integer.parseInt(txtAnios.getText().trim());
            double incremento = Double.parseDouble(txtIncremento.getText().trim().replace(",", "."));

            double cantidadNeta = cantidad * 0.80;
            double impuesto = cantidadNeta * 0.035;
            double rentabilidadNeta = cantidadNeta * 0.06 * 0.70;
            double liquidoPercibir = rentabilidadNeta - impuesto;
            double liquidoMensual = liquidoPercibir / 14.0;

            txtResultados.setText(
                String.format("Cantidad neta (80%%):         %, .2f €\n", cantidadNeta) +
                String.format("Impuesto (3,5%%):             %, .2f €\n", impuesto) +
                String.format("Rentabilidad neta (70%% de 6%%): %, .2f €\n", rentabilidadNeta) +
                String.format("Líquido a percibir anual:     %, .2f €\n", liquidoPercibir) +
                String.format("Líquido mensual / 14 pagas:   %, .2f €", liquidoMensual)
            );
        } catch (Exception ex) {
            txtResultados.setText("Introduce valores numéricos válidos.");
        }
    }

    public static void main(String[] args) {
        // Para usar look and feel del sistema si se desea:
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } catch(ClassNotFoundException ignored){} catch (IllegalAccessException ignored) {
        } catch (InstantiationException ignored) {
        } catch (UnsupportedLookAndFeelException ignored) {
        }
        SwingUtilities.invokeLater(() -> new CalculadoraFinanciera().setVisible(true));
    }
}
