/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.view;

import javax.swing.JDialog;
import javax.swing.JTextArea;

/**
 *
 * @author Gabriel
 */
public class InserirEntrada extends javax.swing.JFrame {

    /**
     * Creates new form InserirEntrada
     */
    public InserirEntrada() {
        initComponents();
     myInitComponents();
    }

public void myInitComponents() {
    
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        listarAluno = new javax.swing.JMenuItem();
        inserirAluno = new javax.swing.JMenuItem();
        excluirAluno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        listarTreino = new javax.swing.JMenuItem();
        inserirTreino = new javax.swing.JMenuItem();
        vincularTreino = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        listarMensalidade = new javax.swing.JMenuItem();
        inserirMensalidade = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        listarEntrada = new javax.swing.JMenuItem();
        inserirEntrada = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );

        jMenu1.setText("Alunos");

        listarAluno.setText("Listar");
        listarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarAlunoActionPerformed(evt);
            }
        });
        jMenu1.add(listarAluno);

        inserirAluno.setText("Inserir");
        inserirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirAlunoActionPerformed(evt);
            }
        });
        jMenu1.add(inserirAluno);

        excluirAluno.setText("Excluir");
        excluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirAlunoActionPerformed(evt);
            }
        });
        jMenu1.add(excluirAluno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Treinos");

        listarTreino.setText("Listar");
        listarTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarTreinoActionPerformed(evt);
            }
        });
        jMenu2.add(listarTreino);

        inserirTreino.setText("Inserir");
        inserirTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirTreinoActionPerformed(evt);
            }
        });
        jMenu2.add(inserirTreino);

        vincularTreino.setText("Vincular a um aluno");
        vincularTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vincularTreinoActionPerformed(evt);
            }
        });
        jMenu2.add(vincularTreino);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Mensalidades");

        listarMensalidade.setText("Listar");
        listarMensalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarMensalidadeActionPerformed(evt);
            }
        });
        jMenu3.add(listarMensalidade);

        inserirMensalidade.setText("Inserir");
        inserirMensalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirMensalidadeActionPerformed(evt);
            }
        });
        jMenu3.add(inserirMensalidade);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Entrada");

        listarEntrada.setText("Listar");
        listarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarEntradaActionPerformed(evt);
            }
        });
        jMenu4.add(listarEntrada);

        inserirEntrada.setText("Inserir");
        inserirEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirEntradaActionPerformed(evt);
            }
        });
        jMenu4.add(inserirEntrada);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    
    }// </editor-fold>                        
 private void inserirAlunoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        //Inserir Alunos
        dispose();
        InserirAluno frame = new InserirAluno();
        frame.setVisible(true);
    }                                            

    private void listarAlunoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        dispose();
        ListarAluno frame = new ListarAluno();
        frame.setVisible(true);
    }                                           

    private void excluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        dispose();
        ExcluirAluno frame = new ExcluirAluno();
        frame.setVisible(true);
    }                                            

    private void vincularTreinoActionPerformed(java.awt.event.ActionEvent evt) {                                               
        dispose();
        VincularTreinoAluno frame = new VincularTreinoAluno();
        frame.setVisible(true);
    }                                              

    private void inserirTreinoActionPerformed(java.awt.event.ActionEvent evt) {                                              
        dispose();
        InserirTreino frame = new InserirTreino();
        frame.setVisible(true);
    }                                             

    private void listarTreinoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        dispose();
        ListarTreino frame = new ListarTreino();
        frame.setVisible(true);
    }                                            

    private void listarMensalidadeActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        dispose();
        ListarMensalidade frame = new ListarMensalidade();
        frame.setVisible(true);
    }                                                 

    private void inserirMensalidadeActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
        dispose();
        InserirMensalidade frame = new InserirMensalidade();
        frame.setVisible(true);
    }                                                  

    private void listarEntradaActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        dispose();
        ListarEntrada frame = new ListarEntrada();
        frame.setVisible(true);
    }                                             

    private void inserirEntradaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
      dispose();
      InserirEntrada frame = new InserirEntrada();
      frame.setVisible(true);
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
        jSeparator1 = new javax.swing.JSeparator();
        codAluno = new javax.swing.JTextField();
        botaoInserir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inserir Entrada");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 52)); // NOI18N
        jLabel1.setText("Inserir Entrada");

        codAluno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codAluno.setToolTipText("");
        codAluno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código do Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        botaoInserir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoInserir.setText("Inserir");
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(306, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(303, 303, 303))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoInserir)
                    .addComponent(codAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(codAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(botaoInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed
    int codigo = Integer.parseInt(codAluno.getText());        // TODO add your handling code here:
    inserirEntrada(codigo);
    }//GEN-LAST:event_botaoInserirActionPerformed
                                         
  private void inserirEntrada(int codigoAluno){
        JDialog resultado = new JDialog();
        resultado.setTitle("Entrada");
        String dados = "Inserir os dados da entrada aqui";
        JTextArea areaDados = new JTextArea(dados);
        areaDados.setEditable(false);
        resultado.add(areaDados);
        resultado.setSize(500,500);
        resultado.setVisible(true);
    
    }
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
            java.util.logging.Logger.getLogger(InserirEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirEntrada().setVisible(true);
            }
        });
    }
  private javax.swing.JMenuItem excluirAluno;
    private javax.swing.JMenuItem inserirAluno;
    private javax.swing.JMenuItem inserirEntrada;
    private javax.swing.JMenuItem inserirMensalidade;
    private javax.swing.JMenuItem inserirTreino;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem listarAluno;
    private javax.swing.JMenuItem listarEntrada;
    private javax.swing.JMenuItem listarMensalidade;
    private javax.swing.JMenuItem listarTreino;
    private javax.swing.JMenuItem vincularTreino;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoInserir;
    private javax.swing.JTextField codAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
