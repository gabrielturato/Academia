/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.view;

import academia.arquivo.AtivoArquivo;
import academia.bean.Ativo;
import academia.exceptions.ExisteException;
import academia.exceptions.Log;
import java.time.LocalDate;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class InserirAluno extends javax.swing.JFrame {
    private final AtivoArquivo arquivoAtivo = new AtivoArquivo();
    private final Log log = new Log();
    /**
     * Creates new form InserirAluno
     */
    public InserirAluno() {
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
        nomeAluno = new javax.swing.JTextField();
        dia = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        ano = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        enderecoAluno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        telefoneAluno = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        rgAluno = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inserir Aluno");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 550));

        nomeAluno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome do Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        nomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeAlunoActionPerformed(evt);
            }
        });

        dia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });

        mes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        mes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mês", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesActionPerformed(evt);
            }
        });

        ano.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" }));
        ano.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ano", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Data de Aniversário");

        enderecoAluno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enderecoAluno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("Inserir Aluno");

        telefoneAluno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        try {
            telefoneAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefoneAluno.setToolTipText("Ex: 3451-9935");
        telefoneAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneAlunoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Inserir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        rgAluno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        try {
            rgAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        rgAluno.setToolTipText("Ex: 3451-9935");
        rgAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(323, 323, 323))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nomeAluno)
                            .addComponent(telefoneAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(enderecoAluno)
                                    .addComponent(rgAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jButton1)))
                        .addGap(219, 219, 219))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rgAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enderecoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesActionPerformed

    private void nomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeAlunoActionPerformed

    private void telefoneAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneAlunoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(nomeAluno.getText().length()==0||enderecoAluno.getText().length()==0||rgAluno.getText().length()==0||telefoneAluno.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos !");
            nomeAluno.setText("");
            enderecoAluno.setText("");
            rgAluno.setText("");
            telefoneAluno.setText("");
        }else{
            
            //Campos 
            String nome = nomeAluno.getText();
            String endereco = enderecoAluno.getText();
            String rg = rgAluno.getText();
            String telefone = telefoneAluno.getText();
            //Aniversário
            String diaString = dia.getSelectedItem().toString();
            int diaNiver = Integer.parseInt(diaString);
            String mesString = mes.getSelectedItem().toString();
            int mesNiver = Integer.parseInt(mesString);
            String anoString = ano.getSelectedItem().toString();
            int anoNiver = Integer.parseInt(anoString);
            //Inserção
        
            Ativo AlunoAtivo = new Ativo();
            AlunoAtivo.setData_nasc(LocalDate.of(anoNiver, mesNiver, diaNiver));
            AlunoAtivo.setEndereco(endereco);
            AlunoAtivo.setNome(nome);
            AlunoAtivo.setRG(rg);
            AlunoAtivo.setTelefone(telefone);

            try {
                boolean sucesso=arquivoAtivo.adicionaAtivo(AlunoAtivo);
                if(sucesso==true){
                    JOptionPane.showMessageDialog(null, "Aluno inserido com sucesso !");
                    nomeAluno.setText("");
                    enderecoAluno.setText("");
                    rgAluno.setText("");
                    telefoneAluno.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Falha ao inserir o aluno !");
                    nomeAluno.setText("");
                    enderecoAluno.setText("");
                    rgAluno.setText("");
                    telefoneAluno.setText("");
                }
            } catch (ExisteException ex) {
                log.getLogger().log(Level.SEVERE, ex.getMessage());
                JOptionPane.showMessageDialog(null, "Já existe esse aluno !");
                nomeAluno.setText("");
                enderecoAluno.setText("");
                rgAluno.setText("");
                telefoneAluno.setText("");
            } 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rgAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(InserirAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirAluno().setVisible(true);
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
    private javax.swing.JComboBox<String> ano;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JTextField enderecoAluno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JFormattedTextField rgAluno;
    private javax.swing.JFormattedTextField telefoneAluno;
    // End of variables declaration//GEN-END:variables
}
