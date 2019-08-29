/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.view.panels;


import br.ufs.view.buscar.paciente.BuscarMarcarExameView;
import br.ufs.view.buscar.paciente.BuscarPacienteCadastroView;
import br.ufs.view.buscar.paciente.BuscarPacienteVisualizarView;
import br.ufs.view.buscar.paciente.BuscarVisualizarExameView;
import br.ufs.view.cadastros.CadastrarFuncionarioView;
import br.ufs.view.cadastros.CadastrarPacienteView;
import java.awt.Color;

/**
 *
 * @author Murilo Formiga
 */
public class FuncionarioJPanelView extends javax.swing.JPanel {

    /**
     * Creates new form ClienteJPanelView
     */
    public FuncionarioJPanelView() {
        initComponents();
        btnCadastrarEscalaTrabalho.setBackground(new Color(20, 150, 90));
        btnVisualizarEscalaTrabalho.setBackground(new Color(20, 150, 90));
        btnVisualizarAgenda.setBackground(new Color(20, 150, 90));
        btnCadastrarAgenda.setBackground(new Color(20, 150, 90));
        btnCadastrarFuncionario.setBackground(new Color(20, 150, 90));
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
        jPanel2 = new javax.swing.JPanel();
        btnCadastrarEscalaTrabalho = new javax.swing.JButton();
        btnVisualizarEscalaTrabalho = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        btnVisualizarAgenda = new javax.swing.JButton();
        btnCadastrarAgenda = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnCadastrarFuncionario = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(2, 2));

        jPanel2.setBackground(new java.awt.Color(20, 182, 130));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Escala de Trabalho\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setOpaque(false);

        btnCadastrarEscalaTrabalho.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrarEscalaTrabalho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadastrarEscalaTrabalho.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarEscalaTrabalho.setText("Cadastrar");
        btnCadastrarEscalaTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarEscalaTrabalhoActionPerformed(evt);
            }
        });

        btnVisualizarEscalaTrabalho.setBackground(new java.awt.Color(255, 255, 255));
        btnVisualizarEscalaTrabalho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVisualizarEscalaTrabalho.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizarEscalaTrabalho.setText("Visualizar");
        btnVisualizarEscalaTrabalho.setBorder(null);
        btnVisualizarEscalaTrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarEscalaTrabalhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVisualizarEscalaTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
            .addComponent(btnCadastrarEscalaTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnCadastrarEscalaTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizarEscalaTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 99, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        jPanel21.setBackground(new java.awt.Color(20, 182, 130));
        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agenda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel21.setOpaque(false);

        btnVisualizarAgenda.setBackground(new java.awt.Color(255, 255, 255));
        btnVisualizarAgenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVisualizarAgenda.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizarAgenda.setText("Visualizar");
        btnVisualizarAgenda.setBorder(null);
        btnVisualizarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarAgendaActionPerformed(evt);
            }
        });

        btnCadastrarAgenda.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrarAgenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadastrarAgenda.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarAgenda.setText("Cadastrar");
        btnCadastrarAgenda.setBorder(null);
        btnCadastrarAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarAgendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVisualizarAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(btnCadastrarAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(btnCadastrarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 99, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel21);

        jPanel26.setBackground(new java.awt.Color(20, 182, 130));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "...", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel26.setOpaque(false);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel26);

        jPanel33.setBackground(new java.awt.Color(20, 182, 130));
        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "...", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel33.setOpaque(false);

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel33);

        add(jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        btnCadastrarFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastrarFuncionario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCadastrarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarFuncionario.setText("Cadastrar Novo Funcionário");
        btnCadastrarFuncionario.setBorder(null);
        btnCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(324, Short.MAX_VALUE)
                .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel3);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisualizarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarAgendaActionPerformed
    
    //btnVisualizarExame.setEnabled(false);
    }//GEN-LAST:event_btnVisualizarAgendaActionPerformed

    private void btnCadastrarEscalaTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarEscalaTrabalhoActionPerformed
       
        //btnCadastrarConsulta.setEnabled(false);
    }//GEN-LAST:event_btnCadastrarEscalaTrabalhoActionPerformed

    private void btnCadastrarAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAgendaActionPerformed
        
        //btnMarcarExame.setEnabled(false);
    }//GEN-LAST:event_btnCadastrarAgendaActionPerformed

    private void btnCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFuncionarioActionPerformed
        new CadastrarFuncionarioView().setVisible(true);
        //btnCadastrarPaciente.setEnabled(false);
    }//GEN-LAST:event_btnCadastrarFuncionarioActionPerformed

    private void btnVisualizarEscalaTrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarEscalaTrabalhoActionPerformed
        
        //btnVisualizarConsulta.setEnabled(false);
    }//GEN-LAST:event_btnVisualizarEscalaTrabalhoActionPerformed

    /*public void ativarJButton(){
        btnCadastrarConsulta.setEnabled(true);
        btnCadastrarPaciente.setEnabled(true);
        btnCadastrarProntuario.setEnabled(true);
        btnCriarAtestado.setEnabled(true);
        btnMarcarExame.setEnabled(true);
        btnVisualizarAtestado.setEnabled(true);
        btnVisualizarConsulta.setEnabled(true);
        btnVisualizarExame.setEnabled(true);
        btnVisualizarProntuario.setEnabled(true);
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarAgenda;
    private javax.swing.JButton btnCadastrarEscalaTrabalho;
    private javax.swing.JButton btnCadastrarFuncionario;
    private javax.swing.JButton btnVisualizarAgenda;
    private javax.swing.JButton btnVisualizarEscalaTrabalho;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel33;
    // End of variables declaration//GEN-END:variables

}
