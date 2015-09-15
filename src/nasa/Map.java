/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nasa;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.StrictMath.abs;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class Map extends javax.swing.JFrame {

    /**
     * Creates new form Map
     */
    public Map() {
        initComponents();
        this.setSize(1200,620);
        this.dispose();
        this.setUndecorated(true);
        this.setTitle("Nacaome Aeronautics and Space Administration");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        start.addItem("NO SELECTION");
        destiny.addItem("NO SELECTION");
        destination.addItem("NO SELECTION");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InsertCoordinates = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        cancel2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CY = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        CX = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        background = new javax.swing.JLabel();
        EditPlanet = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        cancel1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CYE = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        CXE = new javax.swing.JSpinner();
        cb_edit = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tf_nameE = new javax.swing.JTextField();
        background1 = new javax.swing.JLabel();
        DeletePlanet = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        cancel = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cb_delete = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        background3 = new javax.swing.JLabel();
        mainScreen = new javax.swing.JPanel();
        close_button = new javax.swing.JLabel();
        start = new javax.swing.JComboBox();
        destiny = new javax.swing.JComboBox();
        button_route = new javax.swing.JButton();
        sp_peso = new javax.swing.JSpinner();
        route = new javax.swing.JLabel();
        edit = new javax.swing.JLabel();
        plus = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        planet = new javax.swing.JLabel();
        ok_button = new javax.swing.JLabel();
        warp = new javax.swing.JLabel();
        destination = new javax.swing.JComboBox();
        travel = new javax.swing.JLabel();
        JNS = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        map = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jPanel1.setLayout(null);

        cancel2.setFont(new java.awt.Font("Star Jedi", 1, 12)); // NOI18N
        cancel2.setText("cancel");
        cancel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel2MouseClicked(evt);
            }
        });
        jPanel1.add(cancel2);
        cancel2.setBounds(230, 170, 110, 20);

        jLabel1.setFont(new java.awt.Font("Star Jedi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("insert coordinates");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 40, 250, 40);

        jLabel3.setFont(new java.awt.Font("Swis721 Blk BT", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText(",");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 100, 20, 60);

        CY.setFont(new java.awt.Font("Star Jedi", 1, 16)); // NOI18N
        CY.setModel(new javax.swing.SpinnerNumberModel(100, 100, 400, 10));
        jPanel1.add(CY);
        CY.setBounds(210, 120, 70, 30);

        jLabel5.setFont(new java.awt.Font("Swis721 Blk BT", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("[");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 100, 30, 60);

        CX.setFont(new java.awt.Font("Star Jedi", 1, 16)); // NOI18N
        CX.setModel(new javax.swing.SpinnerNumberModel(80, 80, 630, 10));
        jPanel1.add(CX);
        CX.setBounds(110, 120, 70, 30);

        jButton1.setFont(new java.awt.Font("Star Jedi", 1, 12)); // NOI18N
        jButton1.setText("accept");
        jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 170, 110, 20);

        jLabel6.setFont(new java.awt.Font("Swis721 Blk BT", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("]");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(290, 100, 30, 60);

        tf_name.setFont(new java.awt.Font("Star Jedi", 0, 12)); // NOI18N
        tf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameActionPerformed(evt);
            }
        });
        jPanel1.add(tf_name);
        tf_name.setBounds(130, 80, 140, 30);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nasa/Coordinates.png"))); // NOI18N
        jPanel1.add(background);
        background.setBounds(0, 0, 384, 210);

        InsertCoordinates.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(null);

        cancel1.setFont(new java.awt.Font("Star Jedi", 1, 12)); // NOI18N
        cancel1.setText("cancel");
        cancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel1MouseClicked(evt);
            }
        });
        jPanel2.add(cancel1);
        cancel1.setBounds(230, 170, 110, 20);

        jLabel4.setFont(new java.awt.Font("Star Jedi", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("edit planet");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(60, 40, 160, 40);

        jLabel7.setFont(new java.awt.Font("Swis721 Blk BT", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText(",");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(190, 100, 20, 60);

        CYE.setFont(new java.awt.Font("Star Jedi", 1, 16)); // NOI18N
        CYE.setModel(new javax.swing.SpinnerNumberModel(100, 100, 400, 10));
        jPanel2.add(CYE);
        CYE.setBounds(210, 120, 70, 30);

        jLabel8.setFont(new java.awt.Font("Swis721 Blk BT", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText("[");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(80, 100, 30, 60);

        CXE.setFont(new java.awt.Font("Star Jedi", 1, 16)); // NOI18N
        CXE.setModel(new javax.swing.SpinnerNumberModel(80, 80, 630, 10));
        jPanel2.add(CXE);
        CXE.setBounds(110, 120, 70, 30);

        cb_edit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_editItemStateChanged(evt);
            }
        });
        cb_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_editActionPerformed(evt);
            }
        });
        jPanel2.add(cb_edit);
        cb_edit.setBounds(220, 50, 110, 25);

        jButton2.setFont(new java.awt.Font("Star Jedi", 1, 12)); // NOI18N
        jButton2.setText("accept");
        jButton2.setBorderPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(40, 170, 110, 20);

        jLabel9.setFont(new java.awt.Font("Swis721 Blk BT", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setText("]");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(290, 100, 30, 60);

        tf_nameE.setFont(new java.awt.Font("Star Jedi", 0, 12)); // NOI18N
        tf_nameE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameEActionPerformed(evt);
            }
        });
        jPanel2.add(tf_nameE);
        tf_nameE.setBounds(130, 80, 140, 30);

        background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nasa/Coordinates.png"))); // NOI18N
        jPanel2.add(background1);
        background1.setBounds(0, 0, 384, 210);

        EditPlanet.getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel4.setLayout(null);

        cancel.setFont(new java.awt.Font("Star Jedi", 1, 12)); // NOI18N
        cancel.setText("cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        jPanel4.add(cancel);
        cancel.setBounds(220, 130, 110, 20);

        jLabel14.setFont(new java.awt.Font("Star Jedi", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 255, 255));
        jLabel14.setText("Delete planet");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(110, 40, 210, 40);

        cb_delete.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_deleteItemStateChanged(evt);
            }
        });
        cb_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_deleteActionPerformed(evt);
            }
        });
        jPanel4.add(cb_delete);
        cb_delete.setBounds(120, 90, 160, 25);

        jButton4.setFont(new java.awt.Font("Star Jedi", 1, 12)); // NOI18N
        jButton4.setText("accept");
        jButton4.setBorderPainted(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(50, 130, 110, 20);

        background3.setFont(new java.awt.Font("Star Jedi", 1, 12)); // NOI18N
        background3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nasa/Coordinates.png"))); // NOI18N
        jPanel4.add(background3);
        background3.setBounds(0, 0, 384, 210);

        DeletePlanet.getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        mainScreen.setLayout(null);

        close_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nasa/close.png"))); // NOI18N
        close_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_buttonMouseClicked(evt);
            }
        });
        mainScreen.add(close_button);
        close_button.setBounds(1130, 10, 60, 60);

        start.setEnabled(false);
        start.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                startItemStateChanged(evt);
            }
        });
        mainScreen.add(start);
        start.setBounds(840, 480, 120, 30);

        destiny.setEnabled(false);
        destiny.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                destinyItemStateChanged(evt);
            }
        });
        mainScreen.add(destiny);
        destiny.setBounds(1030, 480, 120, 30);

        button_route.setFont(new java.awt.Font("Star Jedi", 1, 12)); // NOI18N
        button_route.setText("accept");
        button_route.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_routeMouseClicked(evt);
            }
        });
        mainScreen.add(button_route);
        button_route.setBounds(940, 530, 100, 20);
        mainScreen.add(sp_peso);
        sp_peso.setBounds(970, 480, 50, 30);

        route.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nasa/b_nroute.png"))); // NOI18N
        mainScreen.add(route);
        route.setBounds(810, 400, 368, 170);

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nasa/edit_sign.png"))); // NOI18N
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        mainScreen.add(edit);
        edit.setBounds(1060, 210, 50, 50);

        plus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nasa/add_sign.png"))); // NOI18N
        plus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusMouseClicked(evt);
            }
        });
        mainScreen.add(plus);
        plus.setBounds(1010, 210, 50, 50);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nasa/delete_sign.png"))); // NOI18N
        delete.setText("delete");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        mainScreen.add(delete);
        delete.setBounds(1110, 210, 50, 50);

        planet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nasa/b_add.png"))); // NOI18N
        mainScreen.add(planet);
        planet.setBounds(810, 200, 370, 74);

        ok_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nasa/ok_button.png"))); // NOI18N
        ok_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ok_buttonMouseClicked(evt);
            }
        });
        mainScreen.add(ok_button);
        ok_button.setBounds(1100, 330, 50, 44);

        warp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nasa/warpN.png"))); // NOI18N
        warp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                warpMouseClicked(evt);
            }
        });
        mainScreen.add(warp);
        warp.setBounds(840, 330, 90, 43);

        destination.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                destinationItemStateChanged(evt);
            }
        });
        mainScreen.add(destination);
        destination.setBounds(930, 340, 150, 25);

        travel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nasa/travel.png"))); // NOI18N
        mainScreen.add(travel);
        travel.setBounds(810, 280, 370, 115);

        JNS.setFont(new java.awt.Font("Star Jedi", 1, 36)); // NOI18N
        JNS.setForeground(new java.awt.Color(255, 255, 255));
        JNS.setText("navigation system");
        mainScreen.add(JNS);
        JNS.setBounds(200, 480, 440, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nasa/folder.png"))); // NOI18N
        mainScreen.add(jLabel2);
        jLabel2.setBounds(650, 470, 90, 90);

        map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nasa/screen.png"))); // NOI18N
        mainScreen.add(map);
        map.setBounds(0, -10, 1200, 630);

        jButton3.setText("jButton3");
        mainScreen.add(jButton3);
        jButton3.setBounds(1080, 350, 81, 26);

        getContentPane().add(mainScreen);
        mainScreen.setBounds(0, 0, 1200, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    public Icon imageToIcon(Image image){
        ImageIcon imgIcon = new ImageIcon(image);
        Icon iconReturn=(Icon)imgIcon;
        return iconReturn;
    }
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
       // COORDINATES
       int x = (int)CX.getValue();
       int y = (int)CY.getValue();
       
       int acceptX = 0;
       int acceptY = 0;
       
      
       for(int i = 0; i < coordinates.size(); i++){
            if(i%2 == 0){ // Coordenada X
                if(abs(x-(int)coordinates.get(i)) >= 50 ){
                    acceptX++;
                    System.out.println("PlanetaX " + i + " esta suficientemente alejado");
                }
            }
            else{ // Coordenada Y
                if(abs(y-(int)coordinates.get(i)) >= 50 ){
                    acceptY++;
                    System.out.println("PlanetaY " + i + " esta suficientemente alejado");
                }
            }    
        } //fin for
       
        
       if(tf_name.getText().equals("")){
            JOptionPane.showMessageDialog(map, "Falta nombre");
       }
       else{
            
        if(acceptY == coordinates.size()/2 || acceptX == coordinates.size()/2){ //ADD Planet
             JLabel newPlanet = new JLabel();
             newPlanet.setLocation(0,0);
             newPlanet.setSize(65,65);

             String newP = "C:\\Users\\Oscar\\Documents\\NetBeansProjects\\NASA\\src\\nasa\\";
             Random r = new Random();
             int random = r.nextInt(11);

             boolean isThere = false;

             String im = "p" + random + ".png";
             newP += im;
             
             
             BufferedImage image = null;
                  File f = new File(newP);
                  try {
                      image = ImageIO.read(f);
                  } catch (IOException ex) {
                      System.out.println("");
                  }
            newPlanet.setIcon(imageToIcon(image));
            newPlanet.setLocation(x, y);
            newPlanet.setSize(image.getWidth(), image.getHeight());
            newPlanet.setVisible(true);
            
            //Add spaceship
            if(cont == 0){
                image = null;
                f = new File("C:\\Users\\Oscar\\Documents\\NetBeansProjects\\NASA\\src\\nasa\\spaceship.png");
                  try {
                      image = ImageIO.read(f);
                  } catch (IOException ex) {
                      System.out.println("");
                  }
                spaceship.setLocation(x,y);
                spaceship.setIcon(imageToIcon(image));
                map.add(spaceship);
                spaceship.setSize(image.getWidth(),image.getHeight());
                spaceship.setVisible(true);
             }
            
            map.add(newPlanet);

            //Add coordinates to arraylist
            coordinates.add(x);
            coordinates.add(y);

            //Add planet to graph
            Planet p = new Planet(tf_name.getText(),x,y);
            grafo.addPlanet(p);

            //Change label name
            newPlanet.setName("planet" + cont);
            labels.add(newPlanet);
            cont++;

            //Add planet 
            if(cont > 1){
                start.setEnabled(true);
                destiny.setEnabled(true);
            }
            else{
                start.setEnabled(false);
                destiny.setEnabled(false);
            }

            //Add item to comboBox
            start.addItem(p);
            destiny.addItem(p);
            destination.addItem(p);
            
        } 
       
        else{
            JOptionPane.showMessageDialog(map, "ERROR");
        }
        InsertCoordinates.setVisible(false);     
    } 
           
     CX.setValue(80);
     CY.setValue(100);
     
     tf_name.setText("");
     printLines();
     map.repaint();
     
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nameActionPerformed

    private void startItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_startItemStateChanged
        int option = start.getSelectedIndex();
        System.out.println("Option = " + option );
        if(start.isEnabled() && option > 0){
            labels.get(option-1).setBorder(BorderFactory.createLineBorder(Color.RED,3));
            start.setEnabled(false);
        }
        printLines();
    }//GEN-LAST:event_startItemStateChanged

    private void destinyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_destinyItemStateChanged
        int option = destiny.getSelectedIndex();
        if(destiny.isEnabled() && option > 0){
            labels.get(option-1).setBorder(BorderFactory.createLineBorder(Color.RED,3));
            destiny.setEnabled(false);
        }
        printLines();
    }//GEN-LAST:event_destinyItemStateChanged

    private void button_routeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_routeMouseClicked
 
       if(start.getSelectedIndex() == destiny.getSelectedIndex() || start.getSelectedIndex() == 0 || destiny.getSelectedIndex() == 0){
           JOptionPane.showMessageDialog(map, "Invalid Route");
           start.setEnabled(true);
           destiny.setEnabled(true);
       }
       
       else{
            for(int i = 0; i < labels.size(); i++){
                labels.get(i).setBorder(null);
            }
            
            //Add route
            grafo.addRoute(grafo.getPlanetIn(start.getSelectedIndex()-1),grafo.getPlanetIn(destiny.getSelectedIndex()-1),(int)sp_peso.getValue());
            printLines();
            printLines();
            
            start.setSelectedIndex(0);
            destiny.setSelectedIndex(0);
            start.setEnabled(true);
            destiny.setEnabled(true);     
       } 
       
      
    }//GEN-LAST:event_button_routeMouseClicked

    private void plusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusMouseClicked
      InsertCoordinates.dispose();
      InsertCoordinates.setUndecorated(true);
      InsertCoordinates.pack();
      InsertCoordinates.setModal(true);
      InsertCoordinates.setLocation(882, 240);
      InsertCoordinates.setSize(383,210);
      InsertCoordinates.setVisible(true);
      printLines();
    }//GEN-LAST:event_plusMouseClicked

    private void warpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_warpMouseClicked
        BufferedImage image = null; 
        if(selectedWarp == false){
            File f = new File("C:\\Users\\Oscar\\Documents\\NetBeansProjects\\NASA\\src\\nasa\\warpS.png");
                 try {
                     image = ImageIO.read(f);
                 } catch (IOException ex) {
                     System.out.println("");
                 }
            selectedWarp = true;
        }
        else{
           File f = new File("C:\\Users\\Oscar\\Documents\\NetBeansProjects\\NASA\\src\\nasa\\warpN.png");
                 try {
                     image = ImageIO.read(f);
                 } catch (IOException ex) {
                     System.out.println("");
                 }
            selectedWarp = false; 
        }
        warp.setIcon(imageToIcon(image));
    }//GEN-LAST:event_warpMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       (grafo.getPlanetIn(cb_edit.getSelectedIndex()-1)).setName(tf_nameE.getText());
       (grafo.getPlanetIn(cb_edit.getSelectedIndex()-1)).setXCoordinate((int)CXE.getValue());
       (grafo.getPlanetIn(cb_edit.getSelectedIndex()-1)).setYCoordinate((int)CYE.getValue());
       
       (labels.get(cb_edit.getSelectedIndex()-1)).setLocation((int)CXE.getValue(), (int)CYE.getValue());
       EditPlanet.setVisible(false);
       cb_edit.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf_nameEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nameEActionPerformed

    private void cb_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_editActionPerformed

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
      
      cb_edit.removeAllItems();
      cb_edit.addItem("NO SELECTION");
      for(int i = 0; i < grafo.getPlanets().size(); i++){
          cb_edit.addItem(grafo.getPlanets().get(i));
      }
        
      EditPlanet.dispose();
      EditPlanet.setUndecorated(true);
      EditPlanet.pack();
      EditPlanet.setModal(true);
      EditPlanet.setLocation(882, 240);
      EditPlanet.setSize(383,210);
      EditPlanet.setVisible(true);
      
    }//GEN-LAST:event_editMouseClicked

    private void cb_editItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_editItemStateChanged
      if(cb_edit.getSelectedIndex() == 0){
        tf_nameE.setText("");
        CXE.setValue(0);
        CYE.setValue(0);
        CXE.setEnabled(false);
        CYE.setEnabled(false);
      }
      else{
        try{
            tf_nameE.setText(((Planet)cb_edit.getSelectedItem()).getName());
            CXE.setValue(((Planet)cb_edit.getSelectedItem()).getXCoordinate());
            CYE.setValue(((Planet)cb_edit.getSelectedItem()).getYCoordinate());
            CXE.setEnabled(true);
            CYE.setEnabled(true);
        }
        catch(Exception e){
            
        }
       
        
      }
     
    }//GEN-LAST:event_cb_editItemStateChanged

    private void close_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_buttonMouseClicked
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_close_buttonMouseClicked

    private void cb_deleteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_deleteItemStateChanged
        if(cb_delete.getSelectedIndex() == 0){
            
        }
        else{
            try{
                (labels.get(cb_delete.getSelectedIndex()-1)).setBorder(BorderFactory.createDashedBorder(Color.RED, 10, 2));
            }
            catch(Exception e){
                
            }          
        }
        
        cb_delete.setEnabled(false);
        printLines();
    }//GEN-LAST:event_cb_deleteItemStateChanged

    private void cb_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_deleteActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        
        if(cb_delete.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(planet, "NO SELECTED PLANET");
        }
        
        else{
            map.remove(labels.get(cb_delete.getSelectedIndex()-1));
            map.repaint();
            System.out.println("Delete label in" + (cb_delete.getSelectedIndex()-1));
            labels.remove(cb_delete.getSelectedIndex()-1);
            
            //Remove from graph
            Planet selectedP = grafo.getPlanetIn(cb_delete.getSelectedIndex()-1);
            grafo.removeRoutesOf(selectedP);
            grafo.removePlanetIn(cb_delete.getSelectedIndex()-1);
            
            DeletePlanet.setVisible(false);
            cont--;
            
            //Remover de todos los comboboxes
            start.removeAllItems();
            start.addItem("NO SELECTION");
            for(int i = 0; i < grafo.getPlanets().size(); i++){
                start.addItem(grafo.getPlanets().get(i));
            }
            start.repaint();
            start.revalidate();
            
            destiny.removeAllItems();
            destiny.addItem("NO SELECTION");
            for(int i = 0; i < grafo.getPlanets().size(); i++){
                destiny.addItem(grafo.getPlanets().get(i));
            }
            destiny.repaint();
            destiny.revalidate();
            
            for (Object coordinate : coordinates) {
                System.out.println(coordinate);
            }
            
            destination.removeAllItems();
            destination.addItem("NO SELECTION");
            for(int i = 0; i < grafo.getPlanets().size(); i++){
                destination.addItem(grafo.getPlanets().get(i));
            }
            destination.repaint();
            destination.revalidate();
          
            //Delete coordinates
            coordinates.remove(cb_delete.getSelectedIndex()*2-1);
            coordinates.remove(cb_delete.getSelectedIndex()*2-2);
            
            printLines();

        }
        printLines();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
      cb_delete.removeAllItems();
      cb_delete.addItem("NO SELECTION");
      for(int i = 0; i < grafo.getPlanets().size(); i++){
          cb_delete.addItem(grafo.getPlanets().get(i));
      }
      
        System.out.println("SE LIMPIO EL CB DE DESTINY");
      
      cb_delete.setEnabled(true);
          
      DeletePlanet.dispose();
      DeletePlanet.setUndecorated(true);
      DeletePlanet.pack();
      DeletePlanet.setModal(true);
      DeletePlanet.setLocation(882, 240);
      DeletePlanet.setSize(383,210);
      DeletePlanet.setVisible(true);
      printLines();
    }//GEN-LAST:event_deleteMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
      DeletePlanet.setVisible(false);
    }//GEN-LAST:event_cancelMouseClicked

    private void cancel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel1MouseClicked
        EditPlanet.setVisible(false);
    }//GEN-LAST:event_cancel1MouseClicked

    private void cancel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel2MouseClicked
        InsertCoordinates.setVisible(false);
    }//GEN-LAST:event_cancel2MouseClicked

    private void ok_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ok_buttonMouseClicked
        //TRAVEL
        Thread hilo = new TravelingSpaceship(this);       
        hilo.start();
    }//GEN-LAST:event_ok_buttonMouseClicked

    private void destinationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_destinationItemStateChanged
        if(destination.getSelectedIndex() == 0){
            
        }
        else{
             planetDest = grafo.getPlanetIn(destination.getSelectedIndex()-1);
        }
       
    }//GEN-LAST:event_destinationItemStateChanged
  
    private void printLines(){
        if(start.getSelectedIndex() != 0 && destiny.getSelectedIndex() != 0){
            Graphics g = getGraphics();
            Graphics2D g2 = (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setPaint(Color.RED);
            g2.setStroke(new BasicStroke(5));
            
            for (int i = 0; i < grafo.getRoutes().size(); i++) {
            g2.draw(new Line2D.Double((grafo.getRoutes().get(i)).getNodo1().getXCoordinate()+30,
                    (grafo.getRoutes().get(i)).getNodo1().getYCoordinate()+20,
                    (grafo.getRoutes().get(i)).getNodo2().getXCoordinate()+30,
                    (grafo.getRoutes().get(i)).getNodo2().getYCoordinate()+20));
            }
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
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Map().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner CX;
    private javax.swing.JSpinner CXE;
    private javax.swing.JSpinner CY;
    private javax.swing.JSpinner CYE;
    private javax.swing.JDialog DeletePlanet;
    private javax.swing.JDialog EditPlanet;
    private javax.swing.JDialog InsertCoordinates;
    private javax.swing.JLabel JNS;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background1;
    private javax.swing.JLabel background3;
    private javax.swing.JButton button_route;
    private javax.swing.JButton cancel;
    private javax.swing.JButton cancel1;
    private javax.swing.JButton cancel2;
    private javax.swing.JComboBox cb_delete;
    private javax.swing.JComboBox cb_edit;
    private javax.swing.JLabel close_button;
    private javax.swing.JLabel delete;
    private javax.swing.JComboBox destination;
    private javax.swing.JComboBox destiny;
    private javax.swing.JLabel edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel mainScreen;
    private javax.swing.JLabel map;
    private javax.swing.JLabel ok_button;
    private javax.swing.JLabel planet;
    private javax.swing.JLabel plus;
    private javax.swing.JLabel route;
    private javax.swing.JSpinner sp_peso;
    private javax.swing.JComboBox start;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_nameE;
    private javax.swing.JLabel travel;
    private javax.swing.JLabel warp;
    // End of variables declaration//GEN-END:variables
    ArrayList <String> usedPlanets = new ArrayList();
    ArrayList coordinates = new ArrayList();
    ArrayList <JLabel> labels = new ArrayList();
    JLabel spaceship = new JLabel();
    Grafo grafo = new Grafo();
    int cont;
    Planet planetDest;
    boolean selectedWarp = false;
}
