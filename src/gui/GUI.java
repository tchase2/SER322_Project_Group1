package gui;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public GUI() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	final String url = "jdbc:sqlite:db/test.db";
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        ViewComboBox = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        QueryItemComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        QueryComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ViewComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Player","Session","Map","Vehicle","Item","Clothing","Throwable","Weapon","Armor","Ammo","Standard","Booster","Healing Item","BackPack" }));
        ViewComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewComboBoxActionPerformed(evt);
            }
        });

        jLabel19.setText("What would you like to view:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(ViewComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addGap(11, 11, 11)
                .addComponent(ViewComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("View", jPanel1);

        QueryItemComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item", "How many _____ are on the map.","How many Vehicles have: ","How many _____ Items Are there on the map."}));
        QueryItemComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueryItemComboBoxActionPerformed(evt);
                String Selected = QueryItemComboBox.getSelectedItem().toString();
                if(Selected == "How many _____ are on the map.") {
                    QueryComboBox.removeAllItems();
                    QueryComboBox.addItem("GROZA");
                    QueryComboBox.addItem("AKM");
                    QueryComboBox.addItem("MedKit");
                    QueryComboBox.addItem("M416");
                    QueryComboBox.addItem("Smoke Grenade");
                    QueryComboBox.addItem("Level 3 Helmet");
                    QueryComboBox.addItem("Pan");
                }
                else if(Selected == "How many Vehicles have: ") {
                    QueryComboBox.removeAllItems();
                    QueryComboBox.addItem("4 Seats");
                    QueryComboBox.addItem("Top speed of 70 Mph");
                    QueryComboBox.addItem("");
                }
                else if(Selected == "How many _____ Items Are there on the map.") {
                    QueryComboBox.removeAllItems();
                    //Spaces added so there are no duplicates
                    QueryComboBox.addItem("M4 ");
                    QueryComboBox.addItem("AKM ");
                    QueryComboBox.addItem("Vehicles");
                }
                
                
            }
        });
        QueryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueryComboBoxActionPerformed(evt);
                String Selected = QueryComboBox.getSelectedItem().toString();
                String Query;
                String Output="";
                int size = 0;
                if(Selected == "GROZA") {
                	Query = "SELECT * FROM WEAPON WHERE Name = \"GROZA\"";
                	try (Connection conn = DriverManager.getConnection(url);
                           PreparedStatement pstmt  = conn.prepareStatement(Query)){
                           ResultSet rs  = pstmt.executeQuery();                   
                           // loop through the result set
                           while (rs.next()) {
                                          Output= Output +
                                                  rs.getString("name") +  "\t" + 
                            		   			  rs.getString("type") + "\t" +
                                                  rs.getInt("bulletSpeed") + "\t" +
                                                  rs.getInt("fireRate") + "\t" +
                                                  rs.getInt("damage") + "\t" +
                                                  rs.getInt("currentMagCapacity") + "\t" +
                                                  rs.getInt("maxMagCapacity") + "\n";
                                                  size++;
                           }
                           jTextArea1.setText("Total Number of Groza's on the map:"+ size + "\nHere's the data: \n" +Output);
                       } catch (SQLException e) {
                           System.out.println(e.getMessage());
                       }
                	
                }
                else if(Selected == "AKM") {
                	Query = "SELECT* FROM WEAPON WHERE Name = \"AKM\"";
                	try (Connection conn = DriverManager.getConnection(url);
                            PreparedStatement pstmt  = conn.prepareStatement(Query)){
                            ResultSet rs  = pstmt.executeQuery(); 
                            size =0;
                            Output="";
                            // loop through the result set
                            while (rs.next()) {
                                           Output= Output +
                                                   rs.getString("name") +  "\t" + 
                                                   rs.getString("type") + "\t" +
                                                   rs.getInt("bulletSpeed") + "\t" +
                                                   rs.getInt("fireRate") + "\t" +
                                                   rs.getInt("damage") + "\t" +
                                                   rs.getInt("currentMagCapacity") + "\t" +
                                                   rs.getInt("maxMagCapacity") + "\n";
                                                   size++;
                            }
                            jTextArea1.setText("Total Number of AKM's on the map:"+ size + "\nHere's the data: \n" +Output);
                        } catch (SQLException e) {
                            System.out.println(e.getMessage());
                        }
                }
                else if(Selected == "MedKit") {
                	Query = "SELECT * Name FROM HEALING_ITEM WHERE Name = \"MedKit\"";
                	try (Connection conn = DriverManager.getConnection(url);
                            PreparedStatement pstmt  = conn.prepareStatement(Query)){
                            ResultSet rs  = pstmt.executeQuery();    
                            size =0;
                            Output="";
                            // loop through the result set
                            while (rs.next()) {
                                //healing Item not in Create.java
                                
                                
                                
                                
                                
                                
                            }
                }catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                	
                
                }
                else if(Selected == "M416") {
                	Query = "SELECT * Name FROM WEAPON WHERE Name =\"M416\"";
                	try (Connection conn = DriverManager.getConnection(url);
                            PreparedStatement pstmt  = conn.prepareStatement(Query)){
                            ResultSet rs  = pstmt.executeQuery();
                            size =0;
                            Output="";
                            // loop through the result set
                            while (rs.next()) {
                                           Output= Output +
                                                   rs.getString("name") +  "\t" + 
                                                   rs.getString("type") + "\t" +
                                                   rs.getInt("bulletSpeed") + "\t" +
                                                   rs.getInt("fireRate") + "\t" +
                                                   rs.getInt("damage") + "\t" +
                                                   rs.getInt("currentMagCapacity") + "\t" +
                                                   rs.getInt("maxMagCapacity") + "\n";
                                                   size++;
                            }
                            jTextArea1.setText("Total Number of M416's on the map:"+ size + "\nHere's the data: \n" +Output);
                        } catch (SQLException e) {
                            System.out.println(e.getMessage());
                        }
                }
                else if(Selected == "Smoke Grenade") {
                	Query = "SELECT * FROM throwable WHERE name = \"Smoke Grenade\"";
                	
                	size =0;
                    Output="";
                    try (Connection conn = DriverManager.getConnection(url);
                            PreparedStatement pstmt  = conn.prepareStatement(Query)){
                            ResultSet rs  = pstmt.executeQuery();                   
                            // loop through the result set
                            while (rs.next()) {
                                Output= Output +
                                        rs.getString("name") +  "\t" +
                                        rs.getString("type") +  "\t" +
                                        rs.getInt("damage") + "\t" +
                                        rs.getInt("quantity") + "\t" +"\n";
                                        size++;
                            }
                            jTextArea1.setText("Total Number of Smoke Grenades is: "+ size +"\nHere's The data:\n"+ Output);
                }catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                }
                else if(Selected == "Level 3 Helmet") {
                	Query = "SELECT * FROM Armor WHERE name = \"Level 3 Helmet\"";
                    try (Connection conn = DriverManager.getConnection(url);
                            PreparedStatement pstmt  = conn.prepareStatement(Query)){
                            ResultSet rs  = pstmt.executeQuery();                   
                            // loop through the result set
                            size =0;
                            Output="";
                            while (rs.next()) {
                                Output = Output +
                                        rs.getString("name") +  "\t" +
                                        rs.getString("slot") +  "\t" +
                                        rs.getInt("durability") + "\t" +
                                        rs.getInt("rating") + "\t" +
                                        rs.getInt("tier") + "\t" + "\n";
                                
                            }
                            jTextArea1.setText("Total Number of level 3 helmets is: "+ size +"\nHere's The data:\n"+ Output);
                }catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                }
                else if(Selected == "Pan") {
                	Query = "SELECT FROM WHERE";
                    try (Connection conn = DriverManager.getConnection(url);
                            PreparedStatement pstmt  = conn.prepareStatement(Query)){
                            ResultSet rs  = pstmt.executeQuery();                   
                            // loop through the result set
                            size =0;
                            Output="";
                            while (rs.next()) {
                                
                            }
                }catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                }
                else if(Selected == "4 Seats") {
                	Query = "SELECT FROM WHERE";
                    try (Connection conn = DriverManager.getConnection(url);
                            PreparedStatement pstmt  = conn.prepareStatement(Query)){
                            ResultSet rs  = pstmt.executeQuery();                   
                            // loop through the result set
                            size =0;
                            Output="";
                            while (rs.next()) {
                                
                            }
                }catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                }
                else if(Selected == "Top speed of 70 Mph") {
                	Query = "SELECT FROM WHERE";
                    try (Connection conn = DriverManager.getConnection(url);
                            PreparedStatement pstmt  = conn.prepareStatement(Query)){
                            ResultSet rs  = pstmt.executeQuery();                   
                            // loop through the result set
                            size =0;
                            Output="";
                            while (rs.next()) {
                                
                            }
                }catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                }
                else if(Selected == "M4 ") {
                	Query = "SELECT FROM WHERE";
                    try (Connection conn = DriverManager.getConnection(url);
                            PreparedStatement pstmt  = conn.prepareStatement(Query)){
                            ResultSet rs  = pstmt.executeQuery();                   
                            // loop through the result set
                            size =0;
                            Output="";
                            while (rs.next()) {
                                
                            }
                }catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                }
                else if(Selected == "AKM ") {
                	Query = "SELECT FROM WHERE";
                    try (Connection conn = DriverManager.getConnection(url);
                            PreparedStatement pstmt  = conn.prepareStatement(Query)){
                            ResultSet rs  = pstmt.executeQuery();                   
                            // loop through the result set
                            size =0;
                            Output="";
                            while (rs.next()) {
                                
                            }
                }catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                }
                else if(Selected == "Vehicles") {
                	Query = "SELECT FROM WHERE";
                    try (Connection conn = DriverManager.getConnection(url);
                            PreparedStatement pstmt  = conn.prepareStatement(Query)){
                            ResultSet rs  = pstmt.executeQuery();                   
                            // loop through the result set
                            size =0;
                            Output="";
                            while (rs.next()) {
                                
                            }
                }catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                }
                else if(Selected == "") {
                	Query = "SELECT FROM WHERE";
                    try (Connection conn = DriverManager.getConnection(url);
                            PreparedStatement pstmt  = conn.prepareStatement(Query)){
                            ResultSet rs  = pstmt.executeQuery();                   
                            // loop through the result set
                            size =0;
                            Output="";
                            while (rs.next()) {
                                
                            }
                }catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                }
                else if(Selected == "") {
                	Query = "SELECT FROM WHERE";
                    try (Connection conn = DriverManager.getConnection(url);
                            PreparedStatement pstmt  = conn.prepareStatement(Query)){
                            ResultSet rs  = pstmt.executeQuery();                   
                            // loop through the result set
                            size =0;
                            Output="";
                            while (rs.next()) {
                                
                            }
                }catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
                }
                
                
            }
        });

        jLabel1.setText("Item you would like to know more about:");

        jLabel18.setText("What would you like to Know:");

        QueryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(QueryComboBox, 0, 873, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addComponent(jLabel1)
                        .addComponent(QueryItemComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QueryItemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QueryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Query", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Query");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewComboBoxActionPerformed

    private void QueryItemComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QueryItemComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QueryItemComboBoxActionPerformed
    
    private void QueryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QueryItemComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QueryItemComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JComboBox<String> QueryComboBox = new javax.swing.JComboBox<String>();
    private static javax.swing.JComboBox<String> QueryItemComboBox = new javax.swing.JComboBox<String>();
    private static javax.swing.JComboBox<String> ViewComboBox = new javax.swing.JComboBox<String>();
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
    
    
    
    public static void init() {
        ViewComboBox.addItem("Player");
        ViewComboBox.addItem("Session");
        ViewComboBox.addItem("Map");
        ViewComboBox.addItem("Vehicle");
        ViewComboBox.addItem("Item");
        ViewComboBox.addItem("Clothing");
        ViewComboBox.addItem("Throwable");
        ViewComboBox.addItem("Weapon");
        ViewComboBox.addItem("Armor");
        ViewComboBox.addItem("Ammo");
        ViewComboBox.addItem("Standard");
        ViewComboBox.addItem("Booster");
        ViewComboBox.addItem("Healing Item");
        ViewComboBox.addItem("Backpack");
        //"Player","Session","Map","Vehicle","Item","Clothing","Throwable","Weapon","Armor","Ammo","Standard","Booster","Healing Item","BackPack"
    }
    
}