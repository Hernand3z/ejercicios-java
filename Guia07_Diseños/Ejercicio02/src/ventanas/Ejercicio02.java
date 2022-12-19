package ventanas;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Ejercicio 2.
 *
 * Elaborar un programa en modo GUI que capture dos números por teclado en
 * cuadros de texto para que luego, el usuario pueda realizar las cuatro
 * operaciones básicas dando clic en el botón que corresponda a cada operación.
 *
 * @author Hernández
 */
public class Ejercicio02 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio02
     */
    public Ejercicio02() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PanelNumeroPrimero = new javax.swing.JPanel();
        txtNumPrimero = new javax.swing.JTextField();
        PanelNumeroSegundo = new javax.swing.JPanel();
        txtNumSegundo = new javax.swing.JTextField();
        btnSumar = new javax.swing.JPanel();
        btnSumarLabel = new javax.swing.JLabel();
        btnRestar = new javax.swing.JPanel();
        btnRestarLabel = new javax.swing.JLabel();
        btnMultiplicar = new javax.swing.JPanel();
        btnMultiplicarLabel = new javax.swing.JLabel();
        btnDividir = new javax.swing.JPanel();
        btnDividirLabel = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JPanel();
        btnLimpiarLabel = new javax.swing.JLabel();
        PanelResultado = new javax.swing.JPanel();
        jLabelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel1.setText("Primer Número:");

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setText("Segundo Número:");

        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 17)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Operaciones matemáticas básicas");

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setText("Resultado:");

        PanelNumeroPrimero.setBackground(new java.awt.Color(226, 226, 226));

        txtNumPrimero.setBackground(new java.awt.Color(226, 226, 226));
        txtNumPrimero.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        txtNumPrimero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 226, 226)));

        javax.swing.GroupLayout PanelNumeroPrimeroLayout = new javax.swing.GroupLayout(PanelNumeroPrimero);
        PanelNumeroPrimero.setLayout(PanelNumeroPrimeroLayout);
        PanelNumeroPrimeroLayout.setHorizontalGroup(
            PanelNumeroPrimeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNumeroPrimeroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNumPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelNumeroPrimeroLayout.setVerticalGroup(
            PanelNumeroPrimeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNumeroPrimeroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNumPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelNumeroSegundo.setBackground(new java.awt.Color(226, 226, 226));

        txtNumSegundo.setBackground(new java.awt.Color(226, 226, 226));
        txtNumSegundo.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        txtNumSegundo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 226, 226)));

        javax.swing.GroupLayout PanelNumeroSegundoLayout = new javax.swing.GroupLayout(PanelNumeroSegundo);
        PanelNumeroSegundo.setLayout(PanelNumeroSegundoLayout);
        PanelNumeroSegundoLayout.setHorizontalGroup(
            PanelNumeroSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNumeroSegundoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNumSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelNumeroSegundoLayout.setVerticalGroup(
            PanelNumeroSegundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNumeroSegundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNumSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSumar.setBackground(new java.awt.Color(29, 192, 110));

        btnSumarLabel.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnSumarLabel.setForeground(new java.awt.Color(255, 255, 255));
        btnSumarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSumarLabel.setText("Sumar");
        btnSumarLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSumarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSumarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSumarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSumarLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSumarLayout = new javax.swing.GroupLayout(btnSumar);
        btnSumar.setLayout(btnSumarLayout);
        btnSumarLayout.setHorizontalGroup(
            btnSumarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSumarLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btnSumarLayout.setVerticalGroup(
            btnSumarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSumarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        btnRestar.setBackground(new java.awt.Color(29, 192, 110));

        btnRestarLabel.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnRestarLabel.setForeground(new java.awt.Color(255, 255, 255));
        btnRestarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRestarLabel.setText("Restar");
        btnRestarLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRestarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRestarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRestarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRestarLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRestarLayout = new javax.swing.GroupLayout(btnRestar);
        btnRestar.setLayout(btnRestarLayout);
        btnRestarLayout.setHorizontalGroup(
            btnRestarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRestarLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btnRestarLayout.setVerticalGroup(
            btnRestarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRestarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        btnMultiplicar.setBackground(new java.awt.Color(29, 192, 110));

        btnMultiplicarLabel.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnMultiplicarLabel.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMultiplicarLabel.setText("Multiplicar");
        btnMultiplicarLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMultiplicarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMultiplicarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMultiplicarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMultiplicarLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnMultiplicarLayout = new javax.swing.GroupLayout(btnMultiplicar);
        btnMultiplicar.setLayout(btnMultiplicarLayout);
        btnMultiplicarLayout.setHorizontalGroup(
            btnMultiplicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMultiplicarLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btnMultiplicarLayout.setVerticalGroup(
            btnMultiplicarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMultiplicarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        btnDividir.setBackground(new java.awt.Color(29, 192, 110));

        btnDividirLabel.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnDividirLabel.setForeground(new java.awt.Color(255, 255, 255));
        btnDividirLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDividirLabel.setText("Dividir");
        btnDividirLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDividirLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDividirLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDividirLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDividirLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnDividirLayout = new javax.swing.GroupLayout(btnDividir);
        btnDividir.setLayout(btnDividirLayout);
        btnDividirLayout.setHorizontalGroup(
            btnDividirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDividirLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btnDividirLayout.setVerticalGroup(
            btnDividirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDividirLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        btnLimpiar.setBackground(new java.awt.Color(248, 104, 104));

        btnLimpiarLabel.setFont(new java.awt.Font("Roboto", 1, 13)); // NOI18N
        btnLimpiarLabel.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLimpiarLabel.setText("Limpiar");
        btnLimpiarLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnLimpiarLayout = new javax.swing.GroupLayout(btnLimpiar);
        btnLimpiar.setLayout(btnLimpiarLayout);
        btnLimpiarLayout.setHorizontalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLimpiarLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btnLimpiarLayout.setVerticalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLimpiarLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        PanelResultado.setBackground(new java.awt.Color(226, 226, 226));

        jLabelResultado.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N

        javax.swing.GroupLayout PanelResultadoLayout = new javax.swing.GroupLayout(PanelResultado);
        PanelResultado.setLayout(PanelResultadoLayout);
        PanelResultadoLayout.setHorizontalGroup(
            PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelResultadoLayout.setVerticalGroup(
            PanelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanelNumeroPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(PanelNumeroSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelNumeroPrimero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(PanelNumeroSegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMultiplicarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplicarLabelMouseClicked
        if (txtNumPrimero.getText().trim().isEmpty() || txtNumSegundo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Campos vacios!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            double primerNumero = Double.parseDouble(txtNumPrimero.getText());
            double segundoNumero = Double.parseDouble(txtNumSegundo.getText());

            double resultado = primerNumero * segundoNumero;

            jLabelResultado.setText(String.valueOf(resultado));
        }
    }//GEN-LAST:event_btnMultiplicarLabelMouseClicked

    private void btnMultiplicarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplicarLabelMouseEntered
        btnMultiplicar.setBackground(new Color(26, 162, 94));
    }//GEN-LAST:event_btnMultiplicarLabelMouseEntered

    private void btnMultiplicarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplicarLabelMouseExited
        btnMultiplicar.setBackground(new Color(29, 192, 110));
    }//GEN-LAST:event_btnMultiplicarLabelMouseExited

    private void btnSumarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumarLabelMouseClicked

        if (txtNumPrimero.getText().trim().isEmpty() || txtNumSegundo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Campos vacios!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            double primerNumero = Double.parseDouble(txtNumPrimero.getText());
            double segundoNumero = Double.parseDouble(txtNumSegundo.getText());

            double resultado = primerNumero + segundoNumero;

            jLabelResultado.setText(String.valueOf(resultado));
        }
    }//GEN-LAST:event_btnSumarLabelMouseClicked

    private void btnSumarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumarLabelMouseEntered
        btnSumar.setBackground(new Color(26, 162, 94));
    }//GEN-LAST:event_btnSumarLabelMouseEntered

    private void btnSumarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumarLabelMouseExited
        btnSumar.setBackground(new Color(29, 192, 110));
    }//GEN-LAST:event_btnSumarLabelMouseExited

    private void btnRestarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestarLabelMouseClicked
        if (txtNumPrimero.getText().trim().isEmpty() || txtNumSegundo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Campos vacios!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            double primerNumero = Double.parseDouble(txtNumPrimero.getText());
            double segundoNumero = Double.parseDouble(txtNumSegundo.getText());

            double resultado = primerNumero - segundoNumero;

            jLabelResultado.setText(String.valueOf(resultado));
        }
    }//GEN-LAST:event_btnRestarLabelMouseClicked

    private void btnRestarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestarLabelMouseEntered
        btnRestar.setBackground(new Color(26, 162, 94));
    }//GEN-LAST:event_btnRestarLabelMouseEntered

    private void btnRestarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestarLabelMouseExited
        btnRestar.setBackground(new Color(29, 192, 110));
    }//GEN-LAST:event_btnRestarLabelMouseExited

    private void btnDividirLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDividirLabelMouseClicked
        if (txtNumPrimero.getText().trim().isEmpty() || txtNumSegundo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Campos vacios!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            double primerNumero = Double.parseDouble(txtNumPrimero.getText());
            double segundoNumero = Double.parseDouble(txtNumSegundo.getText());

            double resultado = primerNumero / segundoNumero;

            jLabelResultado.setText(String.valueOf(resultado));
        }
    }//GEN-LAST:event_btnDividirLabelMouseClicked

    private void btnDividirLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDividirLabelMouseEntered
        btnDividir.setBackground(new Color(26, 162, 94));
    }//GEN-LAST:event_btnDividirLabelMouseEntered

    private void btnDividirLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDividirLabelMouseExited
        btnDividir.setBackground(new Color(29, 192, 110));
    }//GEN-LAST:event_btnDividirLabelMouseExited

    private void btnLimpiarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarLabelMouseClicked
        txtNumPrimero.setText("");
        txtNumSegundo.setText("");
        jLabelResultado.setText("");
    }//GEN-LAST:event_btnLimpiarLabelMouseClicked

    private void btnLimpiarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarLabelMouseEntered
        btnLimpiar.setBackground(new Color(233, 78, 78));
    }//GEN-LAST:event_btnLimpiarLabelMouseEntered

    private void btnLimpiarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarLabelMouseExited
        btnLimpiar.setBackground(new Color(248, 104, 104));
    }//GEN-LAST:event_btnLimpiarLabelMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ejercicio02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelNumeroPrimero;
    private javax.swing.JPanel PanelNumeroSegundo;
    private javax.swing.JPanel PanelResultado;
    private javax.swing.JPanel btnDividir;
    private javax.swing.JLabel btnDividirLabel;
    private javax.swing.JPanel btnLimpiar;
    private javax.swing.JLabel btnLimpiarLabel;
    private javax.swing.JPanel btnMultiplicar;
    private javax.swing.JLabel btnMultiplicarLabel;
    private javax.swing.JPanel btnRestar;
    private javax.swing.JLabel btnRestarLabel;
    private javax.swing.JPanel btnSumar;
    private javax.swing.JLabel btnSumarLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNumPrimero;
    private javax.swing.JTextField txtNumSegundo;
    // End of variables declaration//GEN-END:variables
}
