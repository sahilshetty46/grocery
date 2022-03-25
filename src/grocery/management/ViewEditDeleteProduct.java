/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery.management;
import dao.CategoryDao;
import model.Product;
import dao.ProductDao;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Category;
/**
 *
 * @author SANATH
 */
public class ViewEditDeleteProduct extends javax.swing.JFrame
{

    /**
     * Creates new form ViewEditDeleteProduct
     */
    public ViewEditDeleteProduct()
    {
        initComponents();
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }
    
    public void validateFields()
    {
        String name=txtName.getText();
        String price=txtPrice.getText();
        String category=(String)jComboBox1.getSelectedItem();
        String mfgdate=txtMfgDate.getText();
        String expdate=txtExpDate.getText();
        if(!name.equals("") && !price.equals("") && category!=null && !mfgdate.equals("") && !expdate.equals(""))
            btnUpdate.setEnabled(true);
        else
            btnUpdate.setEnabled(false);
    }

    /**
     * This method is called from within the
     * constructor to initialize the form.
     * WARNING: Do NOT modify this code. The
     * content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtMfgDate = new javax.swing.JTextField();
        txtExpDate = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentShown(java.awt.event.ComponentEvent evt)
            {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View Bills & Order Placed Details.png"))); // NOI18N
        jLabel1.setText("View,Edit,Delete Product");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 35, 256, -1));

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, 30, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 149, 34, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 46, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Category");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 59, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 34, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MfgDate");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ExpDate");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        lbId.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbId.setForeground(new java.awt.Color(255, 255, 255));
        lbId.setText("00");
        getContentPane().add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 149, 220, -1));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 225, -1));

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtPriceActionPerformed(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtPriceKeyReleased(evt);
            }
        });
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 225, -1));

        txtMfgDate.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtMfgDate.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtMfgDateKeyReleased(evt);
            }
        });
        getContentPane().add(txtMfgDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 225, -1));

        txtExpDate.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtExpDate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtExpDateActionPerformed(evt);
            }
        });
        txtExpDate.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtExpDateKeyReleased(evt);
            }
        });
        getContentPane().add(txtExpDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 225, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 225, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Name", "Category", "Price", "MfgDate", "ExpDate"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 140, 640, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/full-page-background.PNG"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtPriceActionPerformed
    {//GEN-HEADEREND:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtExpDateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtExpDateActionPerformed
    {//GEN-HEADEREND:event_txtExpDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExpDateActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBox1ActionPerformed
    {//GEN-HEADEREND:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtNameKeyReleased
    {//GEN-HEADEREND:event_txtNameKeyReleased
        validateFields();
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtPriceKeyReleased
    {//GEN-HEADEREND:event_txtPriceKeyReleased
        validateFields();
    }//GEN-LAST:event_txtPriceKeyReleased

    private void txtMfgDateKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtMfgDateKeyReleased
    {//GEN-HEADEREND:event_txtMfgDateKeyReleased
        validateFields();
    }//GEN-LAST:event_txtMfgDateKeyReleased

    private void txtExpDateKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtExpDateKeyReleased
    {//GEN-HEADEREND:event_txtExpDateKeyReleased
        validateFields();
    }//GEN-LAST:event_txtExpDateKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUpdateActionPerformed
    {//GEN-HEADEREND:event_btnUpdateActionPerformed
        Product product=new Product();
        int id=Integer.parseInt(lbId.getText());
        product.setId(id);
        product.setName(txtName.getText());
        product.setCategory((String)jComboBox1.getSelectedItem());
        product.setPrice(txtPrice.getText());
        product.setMfgdate(txtMfgDate.getText());
        product.setExpdate(txtExpDate.getText());
        ProductDao.update(product);
        setVisible(false);
        new ViewEditDeleteProduct().setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt)//GEN-FIRST:event_formComponentShown
    {//GEN-HEADEREND:event_formComponentShown
        DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
        ArrayList<Product> list=ProductDao.getAllRecords();
        Iterator<Product> itr=list.iterator();
        while(itr.hasNext())
        {
            Product productObj=itr.next();
            dtm.addRow(new Object[]{productObj.getId(),productObj.getName(),productObj.getCategory(),productObj.getPrice(),productObj.getMfgdate(),productObj.getExpdate()});
        }
    }//GEN-LAST:event_formComponentShown

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTable1MouseClicked
    {//GEN-HEADEREND:event_jTable1MouseClicked
        int index=jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String id=model.getValueAt(index, 0).toString();
        lbId.setText(id);
        String name=model.getValueAt(index, 1).toString();
        txtName.setText(name);
        String category=model.getValueAt(index, 2).toString();
        String price=model.getValueAt(index, 3).toString();
        txtPrice.setText(price);
        String mfgdate=model.getValueAt(index, 4).toString();
        txtMfgDate.setText(mfgdate);
        String expdate=model.getValueAt(index, 5).toString();
        txtExpDate.setText(expdate);
        
        btnUpdate.setEnabled(true);    //when clicking a row then all fields in the side shd be updated
        btnDelete.setEnabled(true);    
        jComboBox1.removeAllItems();
        jComboBox1.addItem(category);
        ArrayList<Category> categoryList=CategoryDao.getAllRecords();
        Iterator<Category> categoryItr=categoryList.iterator();
        while(categoryItr.hasNext())
        {
            Category categoryObj=categoryItr.next();
            if(!categoryObj.getName().equals(category))
                jComboBox1.addItem(categoryObj.getName());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteActionPerformed
    {//GEN-HEADEREND:event_btnDeleteActionPerformed
        String id=lbId.getText();
        int a=JOptionPane.showConfirmDialog(null,"Do you want to Delete this Product","Select", JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            ProductDao.delete(id);
            setVisible(false);
            new ViewEditDeleteProduct().setVisible(true);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnClearActionPerformed
    {//GEN-HEADEREND:event_btnClearActionPerformed
        setVisible(false);
        new ViewEditDeleteProduct().setVisible(true);
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ViewEditDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ViewEditDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ViewEditDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ViewEditDeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ViewEditDeleteProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbId;
    private javax.swing.JTextField txtExpDate;
    private javax.swing.JTextField txtMfgDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}