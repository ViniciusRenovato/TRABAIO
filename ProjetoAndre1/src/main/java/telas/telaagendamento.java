/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import Entidades.Agendamento;
import dao.Dao;
import java.util.List;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Matheus
 */
public class telaagendamento extends javax.swing.JFrame {

    Dao dao = new Dao();
    private List <Agendamento> lista;

    public telaagendamento() {
        initComponents();
        CarregaLista();   
    }

    private void CarregaLista(){
        
        lista = dao.listaNative(Agendamento.class);
        
        String[] columnNames = new String[]{
          "ID","Nome","Data", "Horario", "Serviço", "Funcionario"
                
        };
        Object[][] data = new Object[lista.size()][columnNames.length];
        for (int i = 0; i < lista.size(); i++) {
            data[i][0] = lista.get(i).getId();
            data[i][1] = lista.get(i).getCadastroCliente().getNome();
            data[i][2] = lista.get(i).getDataAtendimento();
            data[i][3] = lista.get(i).getHorario();
            data[i][4] = lista.get(i).getServicos().getNomeServico();
            data[i][5] = lista.get(i).getFuncionario().getNomeFuncionario();
         
        }
        tableagenda.setModel(new DefaultTableModel(data, columnNames));
    } 
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        adicionar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        retornar = new javax.swing.JButton();
        listaagendamento = new javax.swing.JScrollPane();
        tableagenda = new javax.swing.JTable();
        canvas1 = new java.awt.Canvas();
        recibo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Agendamento");

        adicionar.setText("Adicionar");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        modificar.setText("Remarcar horário");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        remover.setText("Remover");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });

        retornar.setText("Retornar");
        retornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarActionPerformed(evt);
            }
        });

        tableagenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome","Data", "Horario", "Serviço", "Funcionario"
            }
        ));
        tableagenda.getTableHeader().setReorderingAllowed(false);
        listaagendamento.setViewportView(tableagenda);

        recibo.setText("Recibo");
        recibo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reciboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listaagendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(66, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modificar)
                        .addGap(18, 18, 18)
                        .addComponent(remover, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(recibo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
            .addGroup(layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(retornar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(listaagendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionar)
                    .addComponent(modificar)
                    .addComponent(remover)
                    .addComponent(recibo))
                .addGap(18, 18, 18)
                .addComponent(retornar)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        new cadastrodoagendamento().setVisible(true);
        dispose();
    }//GEN-LAST:event_adicionarActionPerformed

    private void retornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarActionPerformed
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_retornarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        new atualizaragendamento(lista.get(tableagenda.getSelectedRow())).setVisible(true);
        dispose();
    }//GEN-LAST:event_modificarActionPerformed

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
       dao.remove(lista.get(tableagenda.getSelectedRow()));
       CarregaLista();
    }//GEN-LAST:event_removerActionPerformed

    private void reciboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reciboActionPerformed
        new telarecibo(lista.get(tableagenda.getSelectedRow())).setVisible(true);
        dispose();
    }//GEN-LAST:event_reciboActionPerformed

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
            java.util.logging.Logger.getLogger(telaagendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaagendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaagendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaagendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaagendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane listaagendamento;
    private javax.swing.JButton modificar;
    private javax.swing.JButton recibo;
    private javax.swing.JButton remover;
    private javax.swing.JButton retornar;
    private javax.swing.JTable tableagenda;
    // End of variables declaration//GEN-END:variables


}



