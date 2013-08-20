/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * JFPesquisaClientes.java
 *
 * Created on 05/01/2009, 17:09:20
 */
package br.com.seeds;

import Classes.Acesso;
import Classes.Cliente;
import Classes.Contrato;
import ClassesDAO.AcessoDAO;
import ClassesDAO.ClientesDAO;
import ClassesDAO.ContasRDAO;
import ClassesDAO.ContratoDAO;
import ClassesDAO.ContratoParcelaDAO;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guilherme
 */
public class BuscarClientesContratosExcluir extends javax.swing.JFrame {

    StringBuffer nome = new StringBuffer();
    StringBuffer nomes = new StringBuffer();
    int apagar = 0;
    String s, f;

    /**
     * Creates new form JFPesquisaClientes
     */
    public BuscarClientesContratosExcluir() {
        initComponents();
        setLocationRelativeTo(this);
        jTextField1.requestFocus();
    }
    String parametroPesquisa = "";
    String campo;
    private String nomeCliente = "teste não vai aparecer";
    private String contratoCliente = "teste não vai aparecer";
    private int codigoCliente;

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void setAcao(ActionListener parametro) {
        btnOk.addActionListener(parametro);
    }

    public void GrabvarDadosContrato() throws IOException {

        if (nomeCliente.equals("") || contratoCliente.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Não foi possível transferir os dados",
                    "Atualizando",
                    JOptionPane.ERROR_MESSAGE);
            this.dispose();


        } else {
            FileWriter arq = new FileWriter("../seeds-java/contratospagamentos.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf(nomeCliente);
            arq.close();
            gravarContrato();
        }
    }

    public void gravarContrato() throws IOException {
        FileWriter arq2 = new FileWriter("../seeds-java/contratospagamentosaluno.txt");
        PrintWriter gravarArq = new PrintWriter(arq2);
        gravarArq.printf(contratoCliente);
        arq2.close();
    }

    public void NowString() {
        Date now = new Date();
        DateFormat df = DateFormat.getDateInstance();
        DateFormat dg = DateFormat.getTimeInstance();
        s = df.format(now);
        f = dg.format(now);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        rowSorterToStringConverter1 = new converter.RowSorterToStringConverter();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnOk = new javax.swing.JButton();

        rowSorterToStringConverter1.setTable(masterTable);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deletar Contratos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${rowSorter}"), jTextField1, org.jdesktop.beansbinding.BeanProperty.create("text"), "");
        binding.setConverter(rowSorterToStringConverter1);
        bindingGroup.addBinding(binding);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel1.setText("Localizar: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(321, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        masterTable.setModel(getDadosTabelaContratoPesquisa());
        masterTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(masterTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/cancelar.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnOk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/imagens/edit-delete.png"))); // NOI18N
        btnOk.setText("Excluir");
        btnOk.setToolTipText("Excluir fisicamente o registro.");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(684, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnOk, jButton1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnOk, jButton1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
}//GEN-LAST:event_jButton1ActionPerformed

private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
        BuscarClientesContratosExcluir.this.dispose();
    }
}//GEN-LAST:event_jTextField1KeyPressed

private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
    if (jTextField1.getText().length() >= 255) {
        evt.consume();
    }
}//GEN-LAST:event_jTextField1KeyTyped

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        int linha = 0;
        linha = masterTable.getSelectedRow();
        int selection = JOptionPane.showConfirmDialog(this,
                "Deseja excluir o registro permanentemente?\n"
                + "Contrato: " + masterTable.getValueAt(linha, 0).toString() + "\n"
                + "Cliente: " + masterTable.getValueAt(linha, 3).toString() + "",
                "Seeds", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (selection == JOptionPane.OK_OPTION) {

            
            if (linha == -1) {
                linha = 0;
            } else {

                try {
                    AcessoDAO daos = new AcessoDAO();
                    Acesso okay = new Acesso();
                    NowString();
                    okay.setUsuario(0);
                    okay.setData(s);
                    okay.setHora(f);
                    okay.setDescricao("Exclusão do contrato efetuado [Interface - Deletar Contratos]\n"
                            + "Contrato: " + masterTable.getValueAt(linha, 0).toString() + "\n"
                            + "Aluno/Local: " + masterTable.getValueAt(linha, 1).toString() + "/" + masterTable.getValueAt(linha, 2).toString() + " \n"
                            + "Nome: " + masterTable.getValueAt(linha, 3).toString() + "");
                    daos.adicionarAcesso(okay);
                    okay = null;
                    daos.desconectar();
                } catch (Exception e) {
                }

                contratoCliente = masterTable.getValueAt(linha, 0).toString();
                Contrato ContratoDeletarRegistro = new Contrato();
                try {

                    ContratoDAO dao = new ContratoDAO();
                    ContratoParcelaDAO daos = new ContratoParcelaDAO();
                    ContasRDAO daoss = new ContasRDAO();

                    ContratoDeletarRegistro.setCodigo(Integer.parseInt(contratoCliente));

                    dao.deletarContrato(ContratoDeletarRegistro);
                    daos.deletarContratoParcela(Integer.parseInt(contratoCliente));
                    daoss.deletarParcelasContrato(Integer.parseInt(contratoCliente));
                    //falta agora as parcelas
                    dao.desconectar();
                } catch (Exception e) {
                }
                JOptionPane.showMessageDialog(rootPane, "Efetuado",
                        "Seeds", JOptionPane.INFORMATION_MESSAGE);
                try {
                    new Contratos().setVisible(true);
                } catch (Exception e) {
                }
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnOkActionPerformed

    /**
     * @param args the command line arguments
     */
    public DefaultTableModel getDadosTabelaContratoPesquisa() {

        try {
            ClientesDAO daos = new ClientesDAO();
            Cliente cliente = new Cliente();

            ContratoDAO dao = new ContratoDAO();
               apagar = nome.length();//Devolve o número de caracteres do objeto Stringbuffer apagar
                    nome.delete(0, apagar);
                    nome.append(parametroPesquisa);
                    apagar = nomes.length();//Devolve o número de caracteres do objeto Stringbuffer apagar
                    nomes.delete(0, apagar);
                    nomes.append(campo);
            List<Contrato> lista = dao.pesquisaContrato(nome, nomes);
            Object[][] dados = new Object[lista.size()][4];

            for (int us = 0; us < lista.size(); us++) {
                apagar = nome.length();//Devolve o número de caracteres do objeto Stringbuffer apagar
                nome.delete(0, apagar);
                nome.append(lista.get(us).getCodigo_aluno());
                apagar = nomes.length();//Devolve o número de caracteres do objeto Stringbuffer apagar
                nomes.delete(0, apagar);
                nomes.append(lista.get(us).getLocalidade());
                cliente = daos.carregarClienteInativoPeloCodigo(nome, nomes);

                if (cliente.getNome().equals("nulo")) {
                    apagar = nome.length();//Devolve o número de caracteres do objeto Stringbuffer apagar
                    nome.delete(0, apagar);
                    nome.append(lista.get(us).getCodigo_aluno());
                    apagar = nomes.length();//Devolve o número de caracteres do objeto Stringbuffer apagar
                    nomes.delete(0, apagar);
                    nomes.append(lista.get(us).getLocalidade());
                    cliente = daos.carregarClientePeloCodigo(nome, nomes);
                }

                dados[us][0] = lista.get(us).getCodigo();
                dados[us][1] = lista.get(us).getCodigo_aluno();
                dados[us][2] = lista.get(us).getLocalidade();
                dados[us][3] = cliente.getNome();

            }
            lista = null;
            cliente = null;
            dao.desconectar();
            daos.desconectar();
            String[] nomeColunas = {"CONTRATO", "Aluno", "Localidade", "Nome"};
            return new DefaultTableModel(dados, nomeColunas);

        } catch (Exception e) {
            return null;
        }
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getcontratoCliente() {
        return contratoCliente;
    }

    public void setcontratoCliente(String nomeCliente) {
        this.contratoCliente = contratoCliente;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable masterTable;
    private converter.RowSorterToStringConverter rowSorterToStringConverter1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
