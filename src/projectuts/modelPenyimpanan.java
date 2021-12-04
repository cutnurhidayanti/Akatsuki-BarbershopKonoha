package projectuts;

import javax.swing.table.DefaultTableModel;

public class modelPenyimpanan {
    private DefaultTableModel tabel = new DefaultTableModel();
     public modelPenyimpanan(){
         
         getTabel().addColumn("No.");
         getTabel().addColumn("Nama");
         getTabel().addColumn("Jumlah");
         getTabel().addColumn("Harga");
         getTabel().addColumn("total");
                  
     }
     
     public DefaultTableModel getTabel(){
         return tabel;
     }
    
}