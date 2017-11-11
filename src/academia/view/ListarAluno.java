/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.view;
import javax.swing.JTextArea;
import javax.swing.JDialog;
import academia.arquivo.AtivoArquivo;
import academia.arquivo.InativoArquivo;
import academia.bean.Ativo;
import academia.bean.Inativo;
import academia.exceptions.Log;
import academia.exceptions.NaoExisteException;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class ListarAluno extends javax.swing.JFrame {
    private final Log log = new Log();
    private final AtivoArquivo arquivoAtivo = new AtivoArquivo();
    private final InativoArquivo arquivoInativo = new InativoArquivo();
    /**
     * Creates new form ListarAluno
     */
    public ListarAluno() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buscaAlunoRadio = new javax.swing.JRadioButton();
        listaAlunoRadio = new javax.swing.JRadioButton();
        codigoAluno = new javax.swing.JTextField();
        buscaBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listar Aluno");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 550));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 56)); // NOI18N
        jLabel1.setText("Listar Alunos");

        buttonGroup1.add(buscaAlunoRadio);
        buscaAlunoRadio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscaAlunoRadio.setText("Buscar aluno");
        buscaAlunoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaAlunoRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(listaAlunoRadio);
        listaAlunoRadio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        listaAlunoRadio.setText("Listar todos");
        listaAlunoRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAlunoRadioActionPerformed(evt);
            }
        });

        codigoAluno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codigoAluno.setBorder(javax.swing.BorderFactory.createTitledBorder("Código do Aluno"));

        buscaBotao.setText("Busca");
        buscaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(351, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(283, 283, 283))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buscaBotao)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(listaAlunoRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buscaAlunoRadio))
                                .addGap(18, 18, 18)
                                .addComponent(codigoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(282, 282, 282))))
            .addComponent(jSeparator1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buscaAlunoRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(listaAlunoRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscaBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
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

    private void buscaAlunoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaAlunoRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaAlunoRadioActionPerformed

    private void listaAlunoRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAlunoRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaAlunoRadioActionPerformed

    private void buscaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaBotaoActionPerformed
        // Ação do botão
        if(buscaAlunoRadio.isSelected()){
            if(codigoAluno.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Preencha o campo de código !");
            }else{
                try{
                    int codigo = Integer.parseInt(codigoAluno.getText());
                    Ativo AlunoAtivo = new Ativo(); 
                    try {
                        AlunoAtivo=arquivoAtivo.buscaAtivoCodigo(codigo);
                        buscaAluno(AlunoAtivo);
                    }catch(NaoExisteException ex){
                        log.getLogger().log(Level.SEVERE, ex.getMessage());
                        JOptionPane.showMessageDialog(null, "Não existe um aluno com esse código !");
                        codigoAluno.setText("");
                    }
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Esse Campo só aceita números" ,"Informação",JOptionPane.INFORMATION_MESSAGE);
                    codigoAluno.setText("");
                }
            }
        }else{
            //função Listar Todos
            ArrayList<Ativo> alunos;
            ArrayList<Inativo> inativos;
            try {
                alunos = arquivoAtivo.listaAtivo();
                inativos = arquivoInativo.listaInativo();
                listarTodos(alunos,inativos);
            } catch (NaoExisteException ex) {
                log.getLogger().log(Level.SEVERE, ex.getMessage());
                JOptionPane.showMessageDialog(null, "Não tem nenhum aluno cadastrado !");
                codigoAluno.setText("");
            }
            
        }
        
    }//GEN-LAST:event_buscaBotaoActionPerformed
    private void listarTodos(ArrayList<Ativo> alunos,ArrayList<Inativo> inativos){
        /*
        ArrayList<Ativo> listas = new ArrayList();
        AtivoArquivo arquivo = new AtivoArquivo();
        listas=arquivo.listaAtivo();
        */
        JDialog resultado = new JDialog();
        resultado.setTitle("Listar todos");
        StringBuilder TodosDados = new StringBuilder();
        Ativo AlunoAtivo;
        Inativo AlunoInativo;
        for (int i = 0; i < alunos.size(); i++) {
            AlunoAtivo = alunos.get(i);
            if(i==0){
                String dados = " Aluno Nº "+i+"\n Nome: "+AlunoAtivo.getNome()+"\n Endereço: "+AlunoAtivo.getEndereco()+"\n RG: "+AlunoAtivo.getRG()+"\n Telefone: "+AlunoAtivo.getTelefone()+"\n Idade: "+AlunoAtivo.descobreIdade(AlunoAtivo.getData_nasc())+"\n";
                TodosDados.append(dados);
            }else{
                String dados = "\n\n Aluno Nº"+i+"\n Nome: "+AlunoAtivo.getNome()+"\n Endereço: "+AlunoAtivo.getEndereco()+"\n RG: "+AlunoAtivo.getRG()+"\n Telefone: "+AlunoAtivo.getTelefone()+"\n Idade: "+AlunoAtivo.descobreIdade(AlunoAtivo.getData_nasc())+"\n";
                TodosDados.append(dados);
            }
            AlunoInativo = inativos.get(i);
            if(i==0){
                String dados = "------------------------Alunos Invalidados----------------------------"+"\n Nome: "+AlunoInativo.getNome()+"\n Endereço: "+AlunoInativo.getEndereco()+"\n RG: "+AlunoInativo.getRG()+"\n Telefone: "+AlunoInativo.getTelefone()+"\n Idade: "+AlunoInativo.descobreIdade(AlunoInativo.getData_nasc());
                TodosDados.append(dados);
            }else{
                String dados = "\n\n Nome: "+AlunoInativo.getNome()+"\n Endereço: "+AlunoInativo.getEndereco()+"\n RG: "+AlunoInativo.getRG()+"\n Telefone: "+AlunoInativo.getTelefone()+"\n Idade: "+AlunoInativo.descobreIdade(AlunoInativo.getData_nasc());
                TodosDados.append(dados);
            }
        }
        JTextArea areaDados = new JTextArea(TodosDados.toString());   
        areaDados.setEditable(false);
        resultado.add(areaDados);
        resultado.setSize(500,500);
        resultado.setVisible(true);
    
    }
    private void buscaAluno(Ativo AlunoAtivo){
        JDialog resultado = new JDialog();
        resultado.setTitle("Busca aluno");
        String dados = " Nome: "+AlunoAtivo.getNome()+"\n Endereço: "+AlunoAtivo.getEndereco()+"\n RG: "+AlunoAtivo.getRG()+"\n Telefone: "+AlunoAtivo.getTelefone()+"\n Idade: "+AlunoAtivo.descobreIdade(AlunoAtivo.getData_nasc());
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
            java.util.logging.Logger.getLogger(ListarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarAluno().setVisible(true);
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
    private javax.swing.JRadioButton buscaAlunoRadio;
    private javax.swing.JButton buscaBotao;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField codigoAluno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton listaAlunoRadio;
    // End of variables declaration//GEN-END:variables
}
