/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.view;

import br.ufs.view.panels.FuncionarioJPanelView;
import br.ufs.view.panels.PacienteJPanelView;
import br.ufs.view.panels.PatrimonioJPanelView;
import java.awt.Color;

/**
 *
 * @author Murilo Formiga
 */
public class HomeView extends javax.swing.JFrame {

    /**
     * Creates new form HomeView
     */
    public HomeView() {
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

        jPanelSide = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelPaciente = new javax.swing.JPanel();
        jLabelIconPaciente = new javax.swing.JLabel();
        jLabelPaciente = new javax.swing.JLabel();
        jPanelFuncionario = new javax.swing.JPanel();
        jLabelIconFuncionario = new javax.swing.JLabel();
        jLabelFuncionario = new javax.swing.JLabel();
        jPanelPatrimonio = new javax.swing.JPanel();
        jLabelIconPatrimonio = new javax.swing.JLabel();
        jLabelPatrimonio = new javax.swing.JLabel();
        jPanelMain = new javax.swing.JPanel();
        jPanelTopBar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clínica Médica");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setFocusTraversalPolicyProvider(true);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(780, 600));

        jPanelSide.setBackground(new java.awt.Color(20, 182, 130));
        jPanelSide.setMaximumSize(new java.awt.Dimension(300, 436));
        jPanelSide.setPreferredSize(new java.awt.Dimension(210, 436));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ClínicaMédica");

        jPanelPaciente.setBackground(new java.awt.Color(20, 208, 130));
        jPanelPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelPacienteMouseClicked(evt);
            }
        });
        jPanelPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIconPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufs/view/images/guest_filled_32px.png"))); // NOI18N
        jPanelPaciente.add(jLabelIconPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 70, 50));

        jLabelPaciente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPaciente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPaciente.setText("Pacientes");
        jPanelPaciente.add(jLabelPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 2, 210, 50));

        jPanelFuncionario.setBackground(new java.awt.Color(20, 208, 130));
        jPanelFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelFuncionarioMouseClicked(evt);
            }
        });
        jPanelFuncionario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIconFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufs/view/images/group_32px.png"))); // NOI18N
        jPanelFuncionario.add(jLabelIconFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 70, 50));

        jLabelFuncionario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFuncionario.setText("Funcionários");
        jPanelFuncionario.add(jLabelFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 2, 210, 50));

        jPanelPatrimonio.setBackground(new java.awt.Color(20, 208, 130));
        jPanelPatrimonio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelPatrimonioMouseClicked(evt);
            }
        });
        jPanelPatrimonio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIconPatrimonio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIconPatrimonio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufs/view/images/checklist_32px.png"))); // NOI18N
        jPanelPatrimonio.add(jLabelIconPatrimonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 70, 50));

        jLabelPatrimonio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPatrimonio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPatrimonio.setText("Patrimônio");
        jPanelPatrimonio.add(jLabelPatrimonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 2, 210, 50));

        javax.swing.GroupLayout jPanelSideLayout = new javax.swing.GroupLayout(jPanelSide);
        jPanelSide.setLayout(jPanelSideLayout);
        jPanelSideLayout.setHorizontalGroup(
            jPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelSideLayout.createSequentialGroup()
                .addGroup(jPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSideLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3))
                    .addGroup(jPanelSideLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPatrimonio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelSideLayout.setVerticalGroup(
            jPanelSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSideLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setPreferredSize(new java.awt.Dimension(440, 460));
        jPanelMain.setLayout(new javax.swing.BoxLayout(jPanelMain, javax.swing.BoxLayout.LINE_AXIS));

        jPanelTopBar.setBackground(new java.awt.Color(91, 240, 183));
        jPanelTopBar.setPreferredSize(new java.awt.Dimension(600, 71));
        jPanelTopBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelSide, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelTopBar, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanelSide, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTopBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPacienteMouseClicked
        jPanelPaciente.setBackground(Color.GREEN);
        jPanelFuncionario.setBackground(new Color(20, 208, 130));//Alterar Cor de fundo
        jPanelPatrimonio.setBackground(new Color(20, 208, 130));//Alterar Cor de fundo
        PacienteJPanelView p = new PacienteJPanelView();
        jPanelMain.removeAll();//limpar Jpanel
        jPanelMain.add(p);
        //p.setVisible(true);
        this.pack(); 
    }//GEN-LAST:event_jPanelPacienteMouseClicked

    private void jPanelFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFuncionarioMouseClicked
        jPanelFuncionario.setBackground(Color.GREEN);
        jPanelPatrimonio.setBackground(new Color(20, 208, 130));//Alterar Cor de fundo
        jPanelPaciente.setBackground(new Color(20, 208, 130));//Alterar Cor de fundo
        FuncionarioJPanelView f = new FuncionarioJPanelView();
        jPanelMain.removeAll();//limpar Jpanel
        jPanelMain.add(f);
        this.pack();
    }//GEN-LAST:event_jPanelFuncionarioMouseClicked

    private void jPanelPatrimonioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPatrimonioMouseClicked
       jPanelPatrimonio.setBackground(Color.GREEN);
       jPanelPaciente.setBackground(new Color(20, 208, 130));//Alterar Cor de fundo
       jPanelFuncionario.setBackground(new Color(20, 208, 130));//Alterar Cor de fundo
        PatrimonioJPanelView p = new PatrimonioJPanelView();
        jPanelMain.removeAll();//limpar Jpanel
        jPanelMain.add(p);
        this.pack();
    }//GEN-LAST:event_jPanelPatrimonioMouseClicked

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
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFuncionario;
    private javax.swing.JLabel jLabelIconFuncionario;
    private javax.swing.JLabel jLabelIconPaciente;
    private javax.swing.JLabel jLabelIconPatrimonio;
    private javax.swing.JLabel jLabelPaciente;
    private javax.swing.JLabel jLabelPatrimonio;
    private javax.swing.JPanel jPanelFuncionario;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelPaciente;
    private javax.swing.JPanel jPanelPatrimonio;
    private javax.swing.JPanel jPanelSide;
    private javax.swing.JPanel jPanelTopBar;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
