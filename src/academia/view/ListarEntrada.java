/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia.view;

import academia.arquivo.AtivoArquivo;
import academia.arquivo.CatracaArquivo;
import academia.bean.Ativo;
import academia.bean.Catraca;
import academia.exceptions.Log;
import academia.exceptions.NaoExisteException;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author Gabriel
 */
public class ListarEntrada extends javax.swing.JFrame {
    private final Log log = new Log();
    private final CatracaArquivo arquivoEntrada = new CatracaArquivo();
    private final AtivoArquivo arquivoAtivo = new AtivoArquivo();
    /**
     * Creates new form ListarEntrada
     */
    public ListarEntrada() {
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
        buscarRadio = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        codEntrada = new javax.swing.JTextField();
        buscarBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listar Entrada");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 52)); // NOI18N
        jLabel1.setText("Listar Entrada");

        buttonGroup1.add(buscarRadio);
        buscarRadio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarRadio.setText("Buscar Um");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setText("Listar todos");

        codEntrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        codEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Código da Entrada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        buscarBotao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buscarBotao.setText("Buscar");
        buscarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addGap(144, 144, 144)
                                .addComponent(buscarBotao))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buscarRadio)
                                .addGap(18, 18, 18)
                                .addComponent(codEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(312, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codEntrada)
                    .addComponent(buscarRadio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(buscarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
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

    private void buscarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBotaoActionPerformed
          if(buscarRadio.isSelected()){
            try{
                int codigo = Integer.parseInt(codEntrada.getText());
                Catraca entrada;
                try {
                        entrada=arquivoEntrada.buscaEntradaCodigo(codigo);
                        buscaEntrada(entrada);
                    }catch(NaoExisteException ex){
                        log.getLogger().log(Level.SEVERE, ex.getMessage());
                        JOptionPane.showMessageDialog(null, "Não existe uma mensalidade com esse código !");
                        codEntrada.setText("");
                    }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Esse Campo só aceita números" ,"Informação",JOptionPane.INFORMATION_MESSAGE);
                codEntrada.setText("");
            }
        }else{
            ArrayList<Catraca> entradas;
            try{
                entradas = arquivoEntrada.listaEntradas();
                listarTodos(entradas);
            }catch(NaoExisteException ex){
                log.getLogger().log(Level.SEVERE, ex.getMessage());
                JOptionPane.showMessageDialog(null, "Não tem nenhuma entrada cadastrada !");
                codEntrada.setText("");
            }
        }
    }//GEN-LAST:event_buscarBotaoActionPerformed
  private void listarTodos(ArrayList<Catraca> entradas){
        JDialog resultado = new JDialog();
        resultado.setTitle("Listar todos");
        StringBuilder TodosDados = new StringBuilder();
        Ativo aluno;
        Catraca entrada;
        for (int i = 0; i < entradas.size(); i++) {
            try{
                entrada=entradas.get(i);
                aluno=arquivoAtivo.buscaAtivoCodigo(entrada.getCod_aluno());
                if(i==0){
                    String dados = " Entrada Nº "+i+"\n Data: "+entrada.getData_entrada()+"\n Nome do aluno: "+aluno.getNome()+"\n Telefone: "+aluno.getTelefone();
                    TodosDados.append(dados);
                }else{
                    String dados = "\n\n Entrada Nº "+i+"\n Data: "+entrada.getData_entrada()+"\n Nome do aluno: "+aluno.getNome()+"\n Telefone: "+aluno.getTelefone();
                    TodosDados.append(dados);
                }
            }catch(NaoExisteException ex){
                log.getLogger().log(Level.SEVERE, ex.getMessage());
                entrada=entradas.get(i);
                if(i==0){
                    String dados = " Entrada Nº "+i+"\n Data: "+entrada.getData_entrada()+"\n Dados do aluno não foram encontrados.";
                    TodosDados.append(dados);
                }else{
                    String dados = "\n\n Entrada Nº "+i+"\n Data: "+entrada.getData_entrada()+"\n Dados do aluno não foram encontrados.";
                    TodosDados.append(dados);
                }
            }
            
        }
        JTextArea areaDados = new JTextArea(TodosDados.toString());
        areaDados.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaDados);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        resultado.add(scroll);
    
        
        resultado.setSize(500,500);
        resultado.setVisible(true);
    
    }
        private void buscaEntrada(Catraca entrada){
        JDialog resultado = new JDialog();
        resultado.setTitle("Busca entrada");
        Ativo aluno;
        try{
            aluno=arquivoAtivo.buscaAtivoCodigo(entrada.getCod_aluno());
            String dados = " Data: "+entrada.getData_entrada()+"\n Nome do aluno: "+aluno.getNome()+"\n Telefone: "+aluno.getTelefone();
            JTextArea areaDados = new JTextArea(dados);
            areaDados.setEditable(false);
            resultado.add(areaDados);
            resultado.setSize(500,500);
            resultado.setVisible(true);
        }catch(NaoExisteException ex){
            log.getLogger().log(Level.SEVERE, ex.getMessage());
            String dados = " Data: "+entrada.getData_entrada()+"\n Dados do aluno não foram encontrados.";
            JTextArea areaDados = new JTextArea(dados);
            areaDados.setEditable(false);
            resultado.add(areaDados);
            resultado.setSize(500,500);
            resultado.setVisible(true);
            codEntrada.setText("");
        }
    
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
            java.util.logging.Logger.getLogger(ListarEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarEntrada().setVisible(true);
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
    private javax.swing.JButton buscarBotao;
    private javax.swing.JRadioButton buscarRadio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField codEntrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
