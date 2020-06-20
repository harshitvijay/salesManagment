
package supermarket;

import java.awt.print.PrinterException;
import javax.swing.table.TableModel;


public class Print extends javax.swing.JFrame {

  
    public Print() {
        initComponents();
    }
    
    String lsub;
    String lpay;
    String lbal;
    public Print(String sub, String pay, String bal, TableModel tablemodel) throws PrinterException {
        initComponents();
        this.lsub = sub;
        this.lpay = pay;
        this.lbal = bal;
        txtprint.setText(txtprint.getText() + "*****************************************************************************************************\n");
        txtprint.setText(txtprint.getText() + "*****************Super POS***************************************************************************\n");
        txtprint.setText(txtprint.getText() + "\n");
        txtprint.setText(txtprint.getText() + "\n");
        txtprint.setText(txtprint.getText() + "Product" + "\t\t" + "Price"  + "\t\t" + "Total\n");
        
        for(int i=0; i <tablemodel.getRowCount();i++){
              String product = tablemodel.getValueAt(i, 1).toString();
              String price = tablemodel.getValueAt(i, 2).toString();
              String total = tablemodel.getValueAt(i, 4).toString();
              txtprint.setText(txtprint.getText() + product + "\t" + price  + "\t" + total);
        }
        txtprint.setText(txtprint.getText() + "\n");
        txtprint.setText(txtprint.getText() + "\n");
        txtprint.setText(txtprint.getText() + "\t"+ "Sub Total : " + sub +"\n");
        txtprint.setText(txtprint.getText() + "\t"+ "Payment   : " + pay +"\n");
        txtprint.setText(txtprint.getText() + "\t"+ "Balance   : " + bal +"\n");
        txtprint.setText(txtprint.getText() + "\n");
        txtprint.setText(txtprint.getText() + "\n");
        txtprint.setText(txtprint.getText() + "*****************Super POS***************************************************************************\n");
        txtprint.setText(txtprint.getText() + "*****************************************************************************************************\n");
        txtprint.print();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtprint = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(210, 307));

        txtprint.setColumns(20);
        txtprint.setRows(5);
        jScrollPane1.setViewportView(txtprint);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Print.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Print().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtprint;
    // End of variables declaration//GEN-END:variables
}
