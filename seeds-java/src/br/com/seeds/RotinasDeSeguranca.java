/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.seeds;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class RotinasDeSeguranca extends javax.swing.JFrame {

    /**
     * Creates new form RotinasDeSeguranca
     */
    public RotinasDeSeguranca() {
        initComponents();
        setLocationRelativeTo(null);
        jBExecutar.requestFocus();
        txtNomeDaBaseDeDados.setDocument(new LimiteCampos.FixedLengthDocument(100));
        baseDeDadosEmUso();
    }

    public void baseDeDadosEmUso() {
        String linha, linha2, linha3;
        try {
            FileReader arq = new FileReader("../seeds-java/basededados.txt");
            FileReader arq2 = new FileReader("../seeds-java/ip.txt");
            FileReader arq3 = new FileReader("../seeds-java/porta.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            BufferedReader lerArq2 = new BufferedReader(arq2);
            BufferedReader lerArq3 = new BufferedReader(arq3);
            linha = lerArq.readLine(); // lê a primeira linha
            linha2 = lerArq2.readLine(); // lê a primeira linha
            linha3 = lerArq3.readLine(); // lê a primeira linha
            while (linha != null) {
                txtNomeDaBaseDeDados.setText(linha);
                txtEnderecoIPv4.setText(linha2);
                txtPorta.setText(linha3);
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }
            arq.close();
            arq2.close();
            arq3.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo.\n",
                    e.getMessage());
        }


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
        txtNomeDoArquivo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNomeDaBaseDeDados = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtEnderecoIPv4 = new javax.swing.JTextField();
        txtPorta = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jBExecutar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rotinas de Segurança - Backup");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        txtNomeDoArquivo.setEditable(false);
        txtNomeDoArquivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeDoArquivo.setText("seeds");

        jLabel1.setText("Nome do arquivo: ");

        txtNomeDaBaseDeDados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeDaBaseDeDados.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeDaBaseDeDadosFocusLost(evt);
            }
        });
        txtNomeDaBaseDeDados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeDaBaseDeDadosKeyTyped(evt);
            }
        });

        jLabel2.setText("Base de dados: ");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuração - Banco de dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario.setText("root");

        jLabel3.setText("Usuário:");

        jLabel4.setText("Senha:");

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSenha.setText("nuubpmuf");

        txtEnderecoIPv4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPorta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setText("Endereço IPv4:");

        jLabel7.setText("Porta:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(txtUsuario)
                    .addComponent(txtPorta))
                .addGap(27, 27, 27)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEnderecoIPv4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtEnderecoIPv4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeDoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeDaBaseDeDados, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeDoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeDaBaseDeDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2});

        jBExecutar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBExecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/Novo.png"))); // NOI18N
        jBExecutar.setText("Executar");
        jBExecutar.setToolTipText("Gera um novo arquivo de backup sem sobrescrever o anterior.");
        jBExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExecutarActionPerformed(evt);
            }
        });
        jBExecutar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBExecutarKeyPressed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/mysql-database-view.png"))); // NOI18N
        jButton3.setText("Gerenciador Mysql-Front");
        jButton3.setToolTipText("O MySQL-Front é programa gráfico para gerenciamento de banco de dados MySQL.");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/darkblue-folder-script.png"))); // NOI18N
        jButton4.setText("Diretório");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jBExecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExecutarActionPerformed
        if (!txtNomeDaBaseDeDados.getText().equals("localhost")) {
            this.dispose();
            new TestBackup().setVisible(true);
        }
        if (txtEnderecoIPv4.getText().equals("localhost")) {

            if (txtNomeDaBaseDeDados.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane,
                        "Informar a base de dados a ser criada.\n"
                        + "Exemplo: predioii",
                        "", JOptionPane.ERROR_MESSAGE);
                txtNomeDaBaseDeDados.requestFocus();
            } else {
                if (txtNomeDaBaseDeDados.getText().contains(".")) {
                    JOptionPane.showMessageDialog(rootPane,
                            "Não informar a extensão da base de dados.\n"
                            + "Exemplo: predioi",
                            "Nome de arquivo inválido", JOptionPane.WARNING_MESSAGE);

                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".sql", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".SQL", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".sQL", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".sQl", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".sqL", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".SqL", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".Sql", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".SQl", ""));

                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".txt", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".TXT", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".Txt", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".TXt", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".tXT", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".txT", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".tXt", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".TxT", ""));

                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".doc", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".DOC", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".Doc", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".doC", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".Doc", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".doC", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".DoC", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".dOc", ""));

                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".pdf", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".PDF", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".Pdf", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".pdF", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".Pdf", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".PDf", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".PdF", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".PdF", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".docx", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".DOCX", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace(".", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace("exe", ""));
                    txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().replace("EXE", ""));
                } else {
                    int numerodobackup = 1;
                    String nomeDoArquivo = txtNomeDoArquivo.getText().trim();
                    File diretorio = new File("C:/backup-seeds/");
                    File bck = new File("C:/backup-seeds/" + nomeDoArquivo + ".sql");
                    File bcks = new File("C:/backup-seeds/" + nomeDoArquivo + ".sql");
                    if (!diretorio.isDirectory()) {
                        new File("C:/backup-seeds/").mkdir();
                        JOptionPane.showMessageDialog(rootPane, "Os arquivos de Backup seram salvos em:\n"
                                + "C:/backup-seeds/");
                    } else {
                    }
                    try {
                        if (!bcks.isFile()) {
                            String nomeBkp = "seeds.sql";
                            String dump = "cmd.exe /c mysqldump --user=" + txtUsuario.getText().trim() + " --password=" + txtSenha.getText().trim() + " " + txtNomeDaBaseDeDados.getText().trim() + " > C:/backup-seeds/" + nomeBkp;
                            Runtime bkp = Runtime.getRuntime();
                            try {
                                bkp.exec(dump);
                            } catch (IOException ex) {
                                Logger.getLogger(RotinasDeSeguranca.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            JOptionPane.showMessageDialog(rootPane, "Backup realizado com sucesso");
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Backup realizado com sucesso");
                            while (bck.isFile()) {
                                numerodobackup++;
                                bck = new File("" + "C:/backup-seeds/" + "seeds" + numerodobackup + ".sql");
                            }
                            Runtime.getRuntime().exec("cmd.exe /c mysqldump --user=" + txtUsuario.getText().trim() + " --password=" + txtSenha.getText().trim() + " " + txtNomeDaBaseDeDados.getText().trim() + " > " + bck);
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }//GEN-LAST:event_jBExecutarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Runtime.getRuntime().exec("C:/Arquivos de Programas/MySQL-Front/MySQL-Front.exe"); //e assim  
        } catch (Exception e) {
            int selection = JOptionPane.showConfirmDialog(this,
                    "Erro ao abrir Mysql-Front.\n"
                    + "Aplicação não encontrada!"
                    + "Deseja fazer o Download do aplicativo?",
                    "Seeds", JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (selection == JOptionPane.OK_OPTION) {
                BareBonesBrowserLaunch.openURL("http://www.mysqlfront.de/");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        File diretorio = new File("C:/backup-seeds/");
        if (!diretorio.isDirectory()) {
            new File("C:/backup-seeds/").mkdir();
            try {
                Runtime.getRuntime().exec("explorer C:\\backup-seeds");
            } catch (IOException ex) {
                Logger.getLogger(RotinasDeSeguranca.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                Runtime.getRuntime().exec("explorer C:\\backup-seeds");
            } catch (IOException ex) {
                Logger.getLogger(RotinasDeSeguranca.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtNomeDaBaseDeDadosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeDaBaseDeDadosKeyTyped
        txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().toString().toLowerCase());
    }//GEN-LAST:event_txtNomeDaBaseDeDadosKeyTyped

    private void txtNomeDaBaseDeDadosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeDaBaseDeDadosFocusLost
        txtNomeDaBaseDeDados.setText(txtNomeDaBaseDeDados.getText().toString().toLowerCase());
    }//GEN-LAST:event_txtNomeDaBaseDeDadosFocusLost

    private void jBExecutarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBExecutarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_jBExecutarKeyPressed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        if (!txtNomeDaBaseDeDados.getText().equals("localhost")) {
            this.dispose();
            new TestBackup().setVisible(true);
        }
    }//GEN-LAST:event_jPanel1MouseEntered

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RotinasDeSeguranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RotinasDeSeguranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RotinasDeSeguranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RotinasDeSeguranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RotinasDeSeguranca().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExecutar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtEnderecoIPv4;
    private javax.swing.JTextField txtNomeDaBaseDeDados;
    private javax.swing.JTextField txtNomeDoArquivo;
    private javax.swing.JFormattedTextField txtPorta;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
