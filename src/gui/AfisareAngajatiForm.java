
package gui;

import controllers.MainController;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import model.Angajat;


public class AfisareAngajatiForm extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DefaultListModel<Angajat> model1;
  
    public AfisareAngajatiForm() {
        initComponents();
        setLocationRelativeTo(null);
        
        model1 = new DefaultListModel<>();
        jList1.setModel(model1);
        
        afisareAngajati();
    }
    
    private void afisareAngajati(){
        model1.clear();
        ArrayList<Angajat> angajati = MainController.getInstance().getAngajati();
        
        for(Angajat a: angajati){
            model1.addElement(a);
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
