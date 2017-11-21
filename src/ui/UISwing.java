/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import data.Shape;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author ferrelenator
 */
public class UISwing extends javax.swing.JFrame implements UI {

    private int select,sfigure=9;
    private ArrayList<Shape> figures;
    private ImageIcon[] images;
    private boolean think,first=true,change=false;
    /**
     * Creates new form MyNewGUI
     */
    public UISwing() {
        initComponents();
        
        
        Rgroup.add(Rcircle);
        Rgroup.add(Rsemicircle);
        Rgroup.add(Rsquare);
        Rgroup.add(Rrectangle);
        Rgroup.add(Rtrapezoid);
        Rgroup.add(Requilateral);
        Rgroup.add(Risoceles);
        Rgroup.add(Rscalene);
        
        images=new ImageIcon[]{new ImageIcon("src/resources/Circulo.png"),new ImageIcon("src/resources/Semicirculo.png"),
            new ImageIcon("src/resources/cuadrado.png"),new ImageIcon("src/resources/Rectangulo.png"),
            new ImageIcon("src/resources/Trapezoide.png"),new ImageIcon("src/resources/Equliatero.png"),
            new ImageIcon("src/resources/Escaleno.png"),new ImageIcon("src/resources/Isoseles.png")
        };
    
       
        def();
        setVisible(true);
        
    }
    
    public void def(){
        think=true;
        Tdata1.setText("0");
        Tdata2.setText("0");
        Tdata3.setText("0");
        Tdata4.setText("0");
        Tdata5.setText("0");
        Licon.setText(" ");
        Larea.setText(" ");
        Lperi.setText(" ");
        Tdata1.setVisible(false);
        Ldata1.setVisible(false);
        Tdata2.setVisible(false);
        Ldata2.setVisible(false);
        Tdata3.setVisible(false);
        Ldata3.setVisible(false);
        Tdata4.setVisible(false);
        Ldata4.setVisible(false);
        Tdata5.setVisible(false);
        Ldata5.setVisible(false);

    }
    
    
    @Override
    public void printShapeAreaPerimeter(Shape shape) {
       Larea.setText(Double.toString(shape.getArea()));
       Lperi.setText(Double.toString(shape.getPerimeter()));
       model.addElement(shape.toString().concat("Area =").concat(Double.toString(shape.getArea()).concat(" Perimetro=").concat(Double.toString(shape.getPerimeter()))));
                }

    @Override
    public void Menu() {
       }

    @Override
    public int figures(ArrayList<Shape> figure) {
        
        if(change){
    figure.get(figure.size()-1).calculator();
    printShapeAreaPerimeter(figure.get(figure.size()-1));
    change=false;
        }
      System.out.println("esta aqui");
        while(think){
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(UISwing.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("paso aqui");
        
        
       return select;}

    @Override
    public int newfigure() {
        if(sfigure==9){
            JOptionPane.showMessageDialog(this,"No hay ninguna figura seleccionada" );
        }
       try{
           Double.parseDouble(Tdata1.getText());
           Double.parseDouble(Tdata2.getText());
           Double.parseDouble(Tdata3.getText());
           Double.parseDouble(Tdata4.getText());
           Double.parseDouble(Tdata5.getText());
       }catch(NumberFormatException ex){sfigure =9;JOptionPane.showMessageDialog(this,"Numero no valido" );}
       
       if(first && sfigure !=9 ){
           Bcal.setEnabled(true);
           first=false;
       }
        think=true;
      return sfigure; }

    @Override
    public int deletefigure(ArrayList<Shape> figure) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double newCircle() {
        change=true;
      return Double.parseDouble(Tdata1.getText());
    }

    @Override
    public double newEquilateral() {
      change=true;
      return Double.parseDouble(Tdata1.getText());  }

    @Override
    public double[] newIsoceles() {
     change=true;
      return new double[]{Double.parseDouble(Tdata1.getText()),Double.parseDouble(Tdata2.getText())};
    }

    @Override
    public double[] newScaleno() {
    change=true;
    return new double[]{Double.parseDouble(Tdata1.getText()),Double.parseDouble(Tdata2.getText()),Double.parseDouble(Tdata3.getText())};
    }

    @Override
    public double newSquare() {
      change=true;
      return Double.parseDouble(Tdata1.getText()); }

    @Override
    public double[] newRecatangle() {
        change=true;
      return new double[]{Double.parseDouble(Tdata1.getText()),Double.parseDouble(Tdata2.getText())}; }

    @Override
    public double[] newTrapezoid() {
    change=true;
    return new double[]{Double.parseDouble(Tdata1.getText()),Double.parseDouble(Tdata2.getText()),Double.parseDouble(Tdata3.getText()),Double.parseDouble(Tdata4.getText()),Double.parseDouble(Tdata5.getText())};
     }

    @Override
    public void errorMsg() {
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Rgroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        model=new DefaultListModel<>();
        jList = new javax.swing.JList<>();
        Rcircle = new javax.swing.JRadioButton();
        Rsemicircle = new javax.swing.JRadioButton();
        Rsquare = new javax.swing.JRadioButton();
        Rrectangle = new javax.swing.JRadioButton();
        Rtrapezoid = new javax.swing.JRadioButton();
        Requilateral = new javax.swing.JRadioButton();
        Risoceles = new javax.swing.JRadioButton();
        Rscalene = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        Tdata1 = new javax.swing.JTextField();
        Ldata1 = new javax.swing.JLabel();
        Tdata2 = new javax.swing.JTextField();
        Ldata2 = new javax.swing.JLabel();
        Ldata3 = new javax.swing.JLabel();
        Tdata3 = new javax.swing.JTextField();
        Ldata4 = new javax.swing.JLabel();
        Tdata4 = new javax.swing.JTextField();
        Ldata5 = new javax.swing.JLabel();
        Tdata5 = new javax.swing.JTextField();
        Lperi = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Larea = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Licon = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Bcal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 18)); // NOI18N

        jList.setModel(model);
        jList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(jList);

        Rcircle.setText("Circulo");
        Rcircle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RcircleMouseClicked(evt);
            }
        });

        Rsemicircle.setText("Semicirculo");
        Rsemicircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RsemicircleActionPerformed(evt);
            }
        });

        Rsquare.setText("Cuadrado");
        Rsquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RsquareActionPerformed(evt);
            }
        });

        Rrectangle.setText("Rectangulo");
        Rrectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RrectangleActionPerformed(evt);
            }
        });

        Rtrapezoid.setText("Trapezoide");
        Rtrapezoid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RtrapezoidActionPerformed(evt);
            }
        });

        Requilateral.setText("T. Equilatero");
        Requilateral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequilateralActionPerformed(evt);
            }
        });

        Risoceles.setText("T. Isoceles");
        Risoceles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RisocelesActionPerformed(evt);
            }
        });

        Rscalene.setText("T. Escaleno");
        Rscalene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RscaleneActionPerformed(evt);
            }
        });

        jLabel2.setText("Figuras disonibles");

        Tdata1.setText("jTextField1");

        Ldata1.setText("jLabel3");

        Tdata2.setText("jTextField1");

        Ldata2.setText("jLabel3");

        Ldata3.setText("jLabel3");

        Tdata3.setText("jTextField1");

        Ldata4.setText("jLabel3");

        Tdata4.setText("jTextField1");

        Ldata5.setText("jLabel3");

        Tdata5.setText("jTextField1");

        Lperi.setText("AQUI SE MUESTRA");

        jLabel12.setText("Perimetro:");

        Larea.setText("AQUI SE MUESTRA");

        jLabel10.setText("Area :");

        Licon.setText("IMAGENICON");

        jLabel13.setText("Datos");

        Bcal.setText("Calcular");
        Bcal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcalActionPerformed(evt);
            }
        });

        jLabel1.setText("Historial");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Rcircle)
                                            .addComponent(Rsemicircle)
                                            .addComponent(Rsquare)
                                            .addComponent(Rrectangle))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Rtrapezoid)
                                            .addComponent(Requilateral)
                                            .addComponent(Risoceles)
                                            .addComponent(Rscalene)))
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Larea, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Lperi, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Bcal)
                                        .addGap(18, 18, 18)
                                        .addComponent(Licon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Tdata1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Ldata1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Tdata2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Ldata2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Tdata3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Ldata3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Tdata4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Ldata4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Tdata5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Ldata5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(7, 7, 7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Rcircle)
                                .addGap(3, 3, 3)
                                .addComponent(Rsemicircle)
                                .addGap(3, 3, 3)
                                .addComponent(Rsquare)
                                .addGap(3, 3, 3)
                                .addComponent(Rrectangle))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Rtrapezoid)
                                .addGap(2, 2, 2)
                                .addComponent(Requilateral)
                                .addGap(2, 2, 2)
                                .addComponent(Risoceles)
                                .addGap(2, 2, 2)
                                .addComponent(Rscalene)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Larea, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(Lperi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tdata1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ldata1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tdata2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ldata2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tdata3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ldata3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tdata4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ldata4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Tdata5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Ldata5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Licon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bcal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu2.setText("Menu");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RcircleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RcircleMouseClicked
        sfigure=1;
        Tdata1.setText("");
        Tdata2.setText("0");
        Tdata3.setText("0");
        Tdata4.setText("0");
        Tdata5.setText("0");        
        Ldata1.setText("Radio");
        Tdata1.setVisible(true);
        Ldata1.setVisible(true);
        Licon.setIcon(images[0]);
    }//GEN-LAST:event_RcircleMouseClicked

    private void BcalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcalActionPerformed
        select=2;
        think=false;
    }//GEN-LAST:event_BcalActionPerformed

    private void jListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListMouseClicked

    }//GEN-LAST:event_jListMouseClicked

    private void RsemicircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RsemicircleActionPerformed
        sfigure=2;
        Tdata1.setText("");
        Tdata2.setText("0");
        Tdata3.setText("0");
        Tdata4.setText("0");
        Tdata5.setText("0");  
        Ldata1.setText("Radio");
        Tdata1.setVisible(true);
        Ldata1.setVisible(true);
        Tdata2.setVisible(false);
        Ldata2.setVisible(false);
        Tdata3.setVisible(false);
        Ldata3.setVisible(false);
        Tdata4.setVisible(false);
        Ldata4.setVisible(false);
        Tdata5.setVisible(false);
        Ldata5.setVisible(false);
        Licon.setIcon(images[1]);
    }//GEN-LAST:event_RsemicircleActionPerformed

    private void RsquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RsquareActionPerformed
        sfigure=3;
        Tdata1.setText("");
        Tdata2.setText("0");
        Tdata3.setText("0");
        Tdata4.setText("0");
        Tdata5.setText("0");  
        Ldata1.setText("Arista");
        Tdata1.setVisible(true);
        Ldata1.setVisible(true);
        Tdata2.setVisible(false);
        Ldata2.setVisible(false);
        Tdata3.setVisible(false);
        Ldata3.setVisible(false);
        Tdata4.setVisible(false);
        Ldata4.setVisible(false);
        Tdata5.setVisible(false);
        Ldata5.setVisible(false);
        Licon.setIcon(images[2]);
    }//GEN-LAST:event_RsquareActionPerformed

    private void RrectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RrectangleActionPerformed
        sfigure=4;
        Tdata1.setText("");
        Tdata2.setText("");
        Tdata3.setText("0");
        Tdata4.setText("0");
        Tdata5.setText("0");  
        Ldata1.setText("Base");
        Ldata2.setText("Altura");
        Tdata1.setVisible(true);
        Ldata1.setVisible(true);
        Tdata2.setVisible(true);
        Ldata2.setVisible(true);
        Tdata3.setVisible(false);
        Ldata3.setVisible(false);
        Tdata4.setVisible(false);
        Ldata4.setVisible(false);
        Tdata5.setVisible(false);
        Ldata5.setVisible(false);
        Licon.setIcon(images[3]);
    }//GEN-LAST:event_RrectangleActionPerformed

    private void RtrapezoidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RtrapezoidActionPerformed
        sfigure=5;
        Tdata1.setText("");
        Tdata2.setText("");
        Tdata3.setText("");
        Tdata4.setText("");
        Tdata5.setText("");  
        Ldata1.setText("Base A");
        Ldata2.setText("Base B");
        Ldata3.setText("Lado A");
        Ldata4.setText("Lado B");
        Ldata5.setText("Angulo A-A");
        Tdata1.setVisible(true);
        Ldata1.setVisible(true);
        Tdata2.setVisible(true);
        Ldata2.setVisible(true);
        Tdata3.setVisible(true);
        Ldata3.setVisible(true);
        Tdata4.setVisible(true);
        Ldata4.setVisible(true);
        Tdata5.setVisible(true);
        Ldata5.setVisible(true);
        Licon.setIcon(images[4]);
    }//GEN-LAST:event_RtrapezoidActionPerformed

    private void RequilateralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequilateralActionPerformed
        sfigure=6;
        Tdata1.setText("");
        Tdata2.setText("0");
        Tdata3.setText("0");
        Tdata4.setText("0");
        Tdata5.setText("0");  
        Ldata1.setText("Lado");
        Tdata1.setVisible(true);
        Ldata1.setVisible(true);
        Tdata2.setVisible(false);
        Ldata2.setVisible(false);
        Tdata3.setVisible(false);
        Ldata3.setVisible(false);
        Tdata4.setVisible(false);
        Ldata4.setVisible(false);
        Tdata5.setVisible(false);
        Ldata5.setVisible(false);
        Licon.setIcon(images[5]);
    }//GEN-LAST:event_RequilateralActionPerformed

    private void RisocelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RisocelesActionPerformed
        sfigure=7;
        Tdata1.setText("");
        Tdata2.setText("");
        Tdata3.setText("0");
        Tdata4.setText("0");
        Tdata5.setText("0");  
        Ldata1.setText("Base");
        Ldata2.setText("Altura");
        Tdata1.setVisible(true);
        Ldata1.setVisible(true);
        Tdata2.setVisible(true);
        Ldata2.setVisible(true);
        Tdata3.setVisible(false);
        Ldata3.setVisible(false);
        Tdata4.setVisible(false);
        Ldata4.setVisible(false);
        Tdata5.setVisible(false);
        Ldata5.setVisible(false);
        Licon.setIcon(images[6]);
    }//GEN-LAST:event_RisocelesActionPerformed

    private void RscaleneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RscaleneActionPerformed
        sfigure=8;
        Tdata1.setText("");
        Tdata2.setText("");
        Tdata3.setText("");
        Tdata4.setText("0");
        Tdata5.setText("0");  
        Ldata1.setText("Lado A");
        Ldata2.setText("Lado B");
        Ldata3.setText("Lado C");
        Tdata1.setVisible(true);
        Ldata1.setVisible(true);
        Tdata2.setVisible(true);
        Ldata2.setVisible(true);
        Tdata3.setVisible(true);
        Ldata3.setVisible(true);
        Tdata4.setVisible(false);
        Ldata4.setVisible(false);
        Tdata5.setVisible(false);
        Ldata5.setVisible(false);
        Licon.setIcon(images[7]);
    }//GEN-LAST:event_RscaleneActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcal;
    private javax.swing.JLabel Larea;
    private javax.swing.JLabel Ldata1;
    private javax.swing.JLabel Ldata2;
    private javax.swing.JLabel Ldata3;
    private javax.swing.JLabel Ldata4;
    private javax.swing.JLabel Ldata5;
    private javax.swing.JLabel Licon;
    private javax.swing.JLabel Lperi;
    private javax.swing.JRadioButton Rcircle;
    private javax.swing.JRadioButton Requilateral;
    private javax.swing.ButtonGroup Rgroup;
    private javax.swing.JRadioButton Risoceles;
    private javax.swing.JRadioButton Rrectangle;
    private javax.swing.JRadioButton Rscalene;
    private javax.swing.JRadioButton Rsemicircle;
    private javax.swing.JRadioButton Rsquare;
    private javax.swing.JRadioButton Rtrapezoid;
    private javax.swing.JTextField Tdata1;
    private javax.swing.JTextField Tdata2;
    private javax.swing.JTextField Tdata3;
    private javax.swing.JTextField Tdata4;
    private javax.swing.JTextField Tdata5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList;
    private DefaultListModel<String> model;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    // End of variables declaration//GEN-END:variables

    
}
