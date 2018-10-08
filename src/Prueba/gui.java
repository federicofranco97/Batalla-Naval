
package Prueba;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class gui extends javax.swing.JFrame {

    static int vidas=5;
    static int muertos=0;
    static int disponibles=4;
    static int hundidosUsr=0;
    
    private JButton [] fila1= new JButton[4];
    private JButton [] fila2= new JButton[4];
    private JButton [] fila3= new JButton[4];
    private JButton [] fila4= new JButton[4];
    private JButton [] botonesPc= new JButton[16];
    
    public void bloquearPc(){
        botonesPc[0]=btn1;
        botonesPc[1]=btn2;
        botonesPc[2]=btn3;
        botonesPc[3]=btn4;
        botonesPc[4]=btn5;
        botonesPc[5]=btn6;
        botonesPc[6]=btn7;
        botonesPc[7]=btn8;
        botonesPc[8]=btn9;
        botonesPc[9]=btn10;
        botonesPc[10]=btn11;
        botonesPc[11]=btn12;
        botonesPc[12]=btn13;
        botonesPc[13]=btn14;
        botonesPc[14]=btn15;
        botonesPc[15]=btn16;
        
        //Deshabilita todos los botones de la pc para que el usuario no los marque
        for(int i=0;i<botonesPc.length;i++){
            botonesPc[i].setEnabled(false);
        }
        
    }//fin bloquear pc
    
    public void habilitarPc(){
        for(int i=0;i<botonesPc.length;i++){
            botonesPc[i].setEnabled(true);
        }
    }
    
    public void disparoPc(){
        if (vidas>0){
        int fila = (int) (Math.random()*3);
        int columna = (int) (Math.random()*3);
        String contenido="";
        if (fila==0){
            contenido=fila1[columna].getText();
        }
        if (fila==1){
            contenido=fila2[columna].getText();
        }
        if (fila==2){
            contenido=fila3[columna].getText();
        }
        if (fila==3){
            contenido=fila4[columna].getText();
        }
        
        if(contenido.equals("   B   ")){
            JOptionPane.showMessageDialog(null, "La pc ha hundido uno de tus barcos");
            //Codigo que se puede editar haciendo una lista de una lista que contiene botones.
        if (fila==0){
            fila1[columna].setText("   X   ");
        }
        if (fila==1){
            fila2[columna].setText("   X   ");
        }
        if (fila==2){
            fila3[columna].setText("   X   ");
        }
        if (fila==3){
            fila4[columna].setText("   X   ");
        }
            
        }else{
            JOptionPane.showMessageDialog(null, "La Pc ha fallado el tiro");
        }
        
        }
    }//fin disparo pc
    
    public void funcVictoria(){
        victoria gane = new victoria();
        gane.setVisible(true);
        this.setVisible(false);
    }
    
    public void funcDerrota(){
        derrota perdi = new derrota();
        perdi.setVisible(true);
        this.setVisible(false);
        
    }
    
    public void disparoPc1(){
        int fila = (int) (Math.random()*3);
        int columna = (int) (Math.random()*3);
        
        switch(fila){
            case 0:
                switch(columna){
                    case 0:
                        if (usr1.getText().equals("   B   ")){
                            JOptionPane.showMessageDialog(null, "La pc hundio un barco");
                            usr1.setText("   X   ");
                            usr1.setEnabled(false);
                            hundidosUsr++;
                        }else{
                            JOptionPane.showMessageDialog(null,"La pc Ha fallado el tiro");
                            usr1.setEnabled(false);
                        }
                        break;
                    
                    case 1:
                        if (usr2.getText().equals("   B   ")){
                            JOptionPane.showMessageDialog(null, "La pc hundio un barco");
                            usr2.setText("   X   ");
                            usr2.setEnabled(false);
                            hundidosUsr++;
                        }else{
                            JOptionPane.showMessageDialog(null,"La pc Ha fallado el tiro");
                            usr2.setEnabled(false);
                        }
                        break;
                    case 2:
                        if (usr3.getText().equals("   B   ")){
                            JOptionPane.showMessageDialog(null, "La pc hundio un barco");
                            usr3.setText("   X   ");
                            usr3.setEnabled(false);
                            hundidosUsr++;
                        }else{
                            JOptionPane.showMessageDialog(null,"La pc Ha fallado el tiro");
                            usr3.setEnabled(false);
                        }
                        break;
                    case 3:
                        if (usr4.getText().equals("   B   ")){
                            JOptionPane.showMessageDialog(null, "La pc hundio un barco");
                            usr4.setText("   X   ");
                            usr4.setEnabled(false);
                            hundidosUsr++;
                        }else{
                            JOptionPane.showMessageDialog(null,"La pc Ha fallado el tiro");
                            usr4.setEnabled(false);
                        }
                        break;
                }//Fin fila 1
                
            //INICIO FILA 2    
            case 1:
                switch(columna){
                    case 0:
                        if (usr5.getText().equals("   B   ")){
                            JOptionPane.showMessageDialog(null, "La pc hundio un barco");
                            usr5.setText("   X   ");
                            usr5.setEnabled(false);
                            hundidosUsr++;
                        }else{
                            JOptionPane.showMessageDialog(null,"La pc Ha fallado el tiro");
                            usr5.setEnabled(false);
                        }
                        break;
                    
                    case 1:
                        if (usr6.getText().equals("   B   ")){
                            JOptionPane.showMessageDialog(null, "La pc hundio un barco");
                            usr6.setText("   X   ");
                            usr6.setEnabled(false);
                            hundidosUsr++;
                        }else{
                            JOptionPane.showMessageDialog(null,"La pc Ha fallado el tiro");
                            usr6.setEnabled(false);
                        }
                        break;
                    case 2:
                        if (usr7.getText().equals("   B   ")){
                            JOptionPane.showMessageDialog(null, "La pc hundio un barco");
                            usr7.setText("   X   ");
                            usr7.setEnabled(false);
                            hundidosUsr++;
                        }else{
                            JOptionPane.showMessageDialog(null,"La pc Ha fallado el tiro");
                            usr7.setEnabled(false);
                        }
                        break;
                    case 3:
                        if (usr8.getText().equals("   B   ")){
                            JOptionPane.showMessageDialog(null, "La pc hundio un barco");
                            usr8.setText("   X   ");
                            usr8.setEnabled(false);
                            hundidosUsr++;
                        }else{
                            JOptionPane.showMessageDialog(null,"La pc Ha fallado el tiro");
                            usr8.setEnabled(false);
                        }
                        break;               
                }//Fin switch columnas 2
//FIN FILA 2
             
            case 2:
                switch(columna){
                    case 0:
                        if (usr9.getText().equals("   B   ")){
                            JOptionPane.showMessageDialog(null, "La pc hundio un barco");
                            usr9.setText("   X   ");
                            usr9.setEnabled(false);
                            hundidosUsr++;
                        }else{
                            JOptionPane.showMessageDialog(null,"La pc Ha fallado el tiro");
                            usr9.setEnabled(false);
                        }
                        break;
                    
                    case 1:
                        if (usr10.getText().equals("   B   ")){
                            JOptionPane.showMessageDialog(null, "La pc hundio un barco");
                            usr10.setText("   X   ");
                            usr10.setEnabled(false);
                            hundidosUsr++;
                        }else{
                            JOptionPane.showMessageDialog(null,"La pc Ha fallado el tiro");
                            usr10.setEnabled(false);
                        }
                        break;
                    case 2:
                        if (usr11.getText().equals("   B   ")){
                            JOptionPane.showMessageDialog(null, "La pc hundio un barco");
                            usr11.setText("   X   ");
                            usr11.setEnabled(false);
                            hundidosUsr++;
                        }else{
                            JOptionPane.showMessageDialog(null,"La pc Ha fallado el tiro");
                            usr11.setEnabled(false);
                        }
                        break;
                    case 3:
                        if (usr12.getText().equals("   B   ")){
                            JOptionPane.showMessageDialog(null, "La pc hundio un barco");
                            usr12.setText("   X   ");
                            usr12.setEnabled(false);
                            hundidosUsr++;
                        }else{
                            JOptionPane.showMessageDialog(null,"La pc Ha fallado el tiro");
                            usr12.setEnabled(false);
                        }
                        break;               
                }//Fin switch columnas 3
                
            case 3:
                switch(columna){
                    case 0:
                        if (usr13.getText().equals("   B   ")){
                            JOptionPane.showMessageDialog(null, "La pc hundio un barco");
                            usr13.setText("   X   ");
                            usr13.setEnabled(false);
                            hundidosUsr++;
                        }else{
                            JOptionPane.showMessageDialog(null,"La pc Ha fallado el tiro");
                            usr13.setEnabled(false);
                        }
                        break;
                    
                    case 1:
                        if (usr14.getText().equals("   B   ")){
                            JOptionPane.showMessageDialog(null, "La pc hundio un barco");
                            usr14.setText("   X   ");
                            usr14.setEnabled(false);
                            hundidosUsr++;
                        }else{
                            JOptionPane.showMessageDialog(null,"La pc Ha fallado el tiro");
                            usr14.setEnabled(false);
                        }
                        break;
                    case 2:
                        if (usr15.getText().equals("   B   ")){
                            JOptionPane.showMessageDialog(null, "La pc hundio un barco");
                            usr15.setText("   X   ");
                            usr15.setEnabled(false);
                            hundidosUsr++;
                        }else{
                            JOptionPane.showMessageDialog(null,"La pc Ha fallado el tiro");
                            usr15.setEnabled(false);
                        }
                        break;
                    case 3:
                        if (usr16.getText().equals("   B   ")){
                            JOptionPane.showMessageDialog(null, "La pc hundio un barco");
                            usr16.setText("   X   ");
                            usr16.setEnabled(false);
                            hundidosUsr++;
                        }else{
                            JOptionPane.showMessageDialog(null,"La pc Ha fallado el tiro");
                            usr16.setEnabled(false);
                        }
                        break;               
                }//Fin switch columnas 4
                
                
                
        
            }//FIN SWITCH FILA
    }//FIN DISPARO PC
    
    public void checkBarcos(){
        if (muertos==4){
            JOptionPane.showMessageDialog(null, "Destruiste todos los barcos del enemigo, GANASTE");
            vidas=0;
            funcVictoria();
        }
    }
    
    public void asignarBotones(){
        fila1[0]=usr1;
        fila1[1]=usr2;
        fila1[2]=usr3;
        fila1[3]=usr4;
        fila2[0]=usr5;
        fila2[1]=usr6;
        fila2[2]=usr7;
        fila2[3]=usr8;
        fila3[0]=usr9;
        fila3[1]=usr10;
        fila3[2]=usr11;
        fila3[3]=usr12;
        fila4[0]=usr13;
        fila4[1]=usr14;
        fila4[2]=usr15;
        fila4[3]=usr16;
        
        
    }
    public void mirarVidas(){
        if (vidas==0){
            JOptionPane.showMessageDialog(null, "Te quedaste sin vidas, PERDISTE");
            funcDerrota();
        }
    }
    
   
    public gui() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        state1 = new javax.swing.JButton();
        state2 = new javax.swing.JButton();
        state3 = new javax.swing.JButton();
        state4 = new javax.swing.JButton();
        state5 = new javax.swing.JButton();
        state6 = new javax.swing.JButton();
        state7 = new javax.swing.JButton();
        state8 = new javax.swing.JButton();
        state9 = new javax.swing.JButton();
        state10 = new javax.swing.JButton();
        state11 = new javax.swing.JButton();
        state12 = new javax.swing.JButton();
        state13 = new javax.swing.JButton();
        state14 = new javax.swing.JButton();
        state15 = new javax.swing.JButton();
        state16 = new javax.swing.JButton();
        gp1 = new javax.swing.ButtonGroup();
        btnExit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btn1 = new javax.swing.JButton();
        btnVidas = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHundidos = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        usr14 = new javax.swing.JButton();
        usr15 = new javax.swing.JButton();
        usr6 = new javax.swing.JButton();
        usr16 = new javax.swing.JButton();
        usr5 = new javax.swing.JButton();
        usr7 = new javax.swing.JButton();
        usr8 = new javax.swing.JButton();
        usr9 = new javax.swing.JButton();
        usr10 = new javax.swing.JButton();
        usr11 = new javax.swing.JButton();
        usr1 = new javax.swing.JButton();
        usr2 = new javax.swing.JButton();
        usr3 = new javax.swing.JButton();
        usr4 = new javax.swing.JButton();
        usr12 = new javax.swing.JButton();
        usr13 = new javax.swing.JButton();
        btnAsignar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        state1.setText("0");
        state1.setVisible(false);

        state2.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        state2.setForeground(new java.awt.Color(60, 63, 65));
        state2.setText("0");
        state2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        state2.setHideActionText(true);
        state2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                state2ComponentHidden(evt);
            }
        });
        state2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                state2ActionPerformed(evt);
            }
        });

        state3.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        state3.setForeground(new java.awt.Color(60, 63, 65));
        state3.setText("0");
        state3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        state3.setHideActionText(true);
        state3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                state3ComponentHidden(evt);
            }
        });
        state3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                state3ActionPerformed(evt);
            }
        });

        state4.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        state4.setForeground(new java.awt.Color(60, 63, 65));
        state4.setText("0");
        state4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        state4.setHideActionText(true);
        state4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                state4ComponentHidden(evt);
            }
        });
        state4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                state4ActionPerformed(evt);
            }
        });

        state5.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        state5.setForeground(new java.awt.Color(60, 63, 65));
        state5.setText("0");
        state5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        state5.setHideActionText(true);
        state5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                state5ComponentHidden(evt);
            }
        });
        state5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                state5ActionPerformed(evt);
            }
        });

        state6.setText("0");
        state1.setVisible(false);

        state7.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        state7.setForeground(new java.awt.Color(60, 63, 65));
        state7.setText("0");
        state7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        state7.setHideActionText(true);
        state7.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                state7ComponentHidden(evt);
            }
        });
        state7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                state7ActionPerformed(evt);
            }
        });

        state8.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        state8.setForeground(new java.awt.Color(60, 63, 65));
        state8.setText("0");
        state8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        state8.setHideActionText(true);
        state8.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                state8ComponentHidden(evt);
            }
        });
        state8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                state8ActionPerformed(evt);
            }
        });

        state9.setText("0");
        state1.setVisible(false);

        state10.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        state10.setForeground(new java.awt.Color(60, 63, 65));
        state10.setText("0");
        state10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        state10.setHideActionText(true);
        state10.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                state10ComponentHidden(evt);
            }
        });
        state10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                state10ActionPerformed(evt);
            }
        });

        state11.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        state11.setForeground(new java.awt.Color(60, 63, 65));
        state11.setText("0");
        state11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        state11.setHideActionText(true);
        state11.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                state11ComponentHidden(evt);
            }
        });
        state11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                state11ActionPerformed(evt);
            }
        });

        state12.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        state12.setForeground(new java.awt.Color(60, 63, 65));
        state12.setText("0");
        state12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        state12.setHideActionText(true);
        state12.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                state12ComponentHidden(evt);
            }
        });
        state12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                state12ActionPerformed(evt);
            }
        });

        state13.setText("0");
        state1.setVisible(false);

        state14.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        state14.setForeground(new java.awt.Color(60, 63, 65));
        state14.setText("0");
        state14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        state14.setHideActionText(true);
        state14.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                state14ComponentHidden(evt);
            }
        });
        state14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                state14ActionPerformed(evt);
            }
        });

        state15.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        state15.setForeground(new java.awt.Color(60, 63, 65));
        state15.setText("0");
        state15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        state15.setHideActionText(true);
        state15.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                state15ComponentHidden(evt);
            }
        });
        state15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                state15ActionPerformed(evt);
            }
        });

        state16.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        state16.setForeground(new java.awt.Color(60, 63, 65));
        state16.setText("0");
        state16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        state16.setHideActionText(true);
        state16.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                state16ComponentHidden(evt);
            }
        });
        state16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                state16ActionPerformed(evt);
            }
        });

        gp1.add(btn1);
        gp1.add(btn2);
        gp1.add(btn3);
        gp1.add(btn4);
        gp1.add(btn5);
        gp1.add(btn6);
        gp1.add(btn7);
        gp1.add(btn8);
        gp1.add(btn9);
        gp1.add(btn10);
        gp1.add(btn11);
        gp1.add(btn12);
        gp1.add(btn13);
        gp1.add(btn14);
        gp1.add(btn15);
        gp1.add(btn16);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Batalla Naval Beta");
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(421, 560));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(270, 490, 101, 32);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(6, 312, 416, 10);

        btn1.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btn1.setForeground(new java.awt.Color(60, 63, 65));
        btn1.setText(" ");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn1.setHideActionText(true);
        btn1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btn1ComponentHidden(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(27, 146, 79, 30);

        btnVidas.setText(" ");
        btnVidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVidasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVidas);
        btnVidas.setBounds(120, 90, 50, 32);

        btn2.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btn2.setForeground(new java.awt.Color(60, 63, 65));
        btn2.setText(" ");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn2.setHideActionText(true);
        btn2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btn2ComponentHidden(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(118, 146, 79, 30);

        btn3.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btn3.setForeground(new java.awt.Color(60, 63, 65));
        btn3.setText(" ");
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn3.setHideActionText(true);
        btn3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btn3ComponentHidden(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(209, 146, 79, 30);

        btn4.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btn4.setForeground(new java.awt.Color(60, 63, 65));
        btn4.setText(" ");
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn4.setHideActionText(true);
        btn4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btn4ComponentHidden(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(300, 146, 79, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/vidas.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 90, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/hundidos.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 90, 130, 29);

        btnHundidos.setText(" ");
        btnHundidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHundidosActionPerformed(evt);
            }
        });
        getContentPane().add(btnHundidos);
        btnHundidos.setBounds(320, 90, 50, 32);

        btn5.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btn5.setForeground(new java.awt.Color(60, 63, 65));
        btn5.setText(" ");
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn5.setHideActionText(true);
        btn5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btn5ComponentHidden(evt);
            }
        });
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(118, 182, 79, 30);

        btn6.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btn6.setForeground(new java.awt.Color(60, 63, 65));
        btn6.setText(" ");
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn6.setHideActionText(true);
        btn6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btn6ComponentHidden(evt);
            }
        });
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(27, 182, 79, 30);

        btn7.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btn7.setForeground(new java.awt.Color(60, 63, 65));
        btn7.setText(" ");
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn7.setHideActionText(true);
        btn7.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btn7ComponentHidden(evt);
            }
        });
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(209, 182, 79, 30);

        btn8.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btn8.setForeground(new java.awt.Color(60, 63, 65));
        btn8.setText(" ");
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn8.setHideActionText(true);
        btn8.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btn8ComponentHidden(evt);
            }
        });
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(300, 182, 79, 30);

        btn9.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btn9.setForeground(new java.awt.Color(60, 63, 65));
        btn9.setText(" ");
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn9.setHideActionText(true);
        btn9.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btn9ComponentHidden(evt);
            }
        });
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(27, 218, 79, 30);

        btn10.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btn10.setForeground(new java.awt.Color(60, 63, 65));
        btn10.setText(" ");
        btn10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn10.setHideActionText(true);
        btn10.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btn10ComponentHidden(evt);
            }
        });
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn10);
        btn10.setBounds(118, 218, 79, 30);

        btn11.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btn11.setForeground(new java.awt.Color(60, 63, 65));
        btn11.setText(" ");
        btn11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn11.setHideActionText(true);
        btn11.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btn11ComponentHidden(evt);
            }
        });
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn11);
        btn11.setBounds(209, 218, 79, 30);

        btn12.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btn12.setForeground(new java.awt.Color(60, 63, 65));
        btn12.setText(" ");
        btn12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn12.setHideActionText(true);
        btn12.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btn12ComponentHidden(evt);
            }
        });
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn12);
        btn12.setBounds(300, 218, 79, 30);

        btn13.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btn13.setForeground(new java.awt.Color(60, 63, 65));
        btn13.setText(" ");
        btn13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn13.setHideActionText(true);
        btn13.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btn13ComponentHidden(evt);
            }
        });
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        getContentPane().add(btn13);
        btn13.setBounds(27, 254, 79, 30);

        btn14.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btn14.setForeground(new java.awt.Color(60, 63, 65));
        btn14.setText(" ");
        btn14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn14.setHideActionText(true);
        btn14.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btn14ComponentHidden(evt);
            }
        });
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });
        getContentPane().add(btn14);
        btn14.setBounds(118, 254, 79, 30);

        btn15.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btn15.setForeground(new java.awt.Color(60, 63, 65));
        btn15.setText(" ");
        btn15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn15.setHideActionText(true);
        btn15.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btn15ComponentHidden(evt);
            }
        });
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });
        getContentPane().add(btn15);
        btn15.setBounds(209, 254, 79, 30);

        btn16.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        btn16.setForeground(new java.awt.Color(60, 63, 65));
        btn16.setText(" ");
        btn16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn16.setHideActionText(true);
        btn16.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                btn16ComponentHidden(evt);
            }
        });
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });
        getContentPane().add(btn16);
        btn16.setBounds(300, 254, 79, 30);

        usr14.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        usr14.setForeground(new java.awt.Color(60, 63, 65));
        usr14.setText(" ");
        usr14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usr14.setHideActionText(true);
        usr14.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                usr14ComponentHidden(evt);
            }
        });
        usr14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr14ActionPerformed(evt);
            }
        });
        getContentPane().add(usr14);
        usr14.setBounds(113, 442, 79, 30);

        usr15.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        usr15.setForeground(new java.awt.Color(60, 63, 65));
        usr15.setText(" ");
        usr15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usr15.setHideActionText(true);
        usr15.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                usr15ComponentHidden(evt);
            }
        });
        usr15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr15ActionPerformed(evt);
            }
        });
        getContentPane().add(usr15);
        usr15.setBounds(204, 442, 79, 30);

        usr6.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        usr6.setForeground(new java.awt.Color(60, 63, 65));
        usr6.setText(" ");
        usr6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usr6.setHideActionText(true);
        usr6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                usr6ComponentHidden(evt);
            }
        });
        usr6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr6ActionPerformed(evt);
            }
        });
        getContentPane().add(usr6);
        usr6.setBounds(113, 370, 79, 30);

        usr16.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        usr16.setForeground(new java.awt.Color(60, 63, 65));
        usr16.setText(" ");
        usr16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usr16.setHideActionText(true);
        usr16.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                usr16ComponentHidden(evt);
            }
        });
        usr16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr16ActionPerformed(evt);
            }
        });
        getContentPane().add(usr16);
        usr16.setBounds(295, 442, 79, 30);

        usr5.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        usr5.setForeground(new java.awt.Color(60, 63, 65));
        usr5.setText(" ");
        usr5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usr5.setHideActionText(true);
        usr5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                usr5ComponentHidden(evt);
            }
        });
        usr5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr5ActionPerformed(evt);
            }
        });
        getContentPane().add(usr5);
        usr5.setBounds(22, 370, 79, 30);

        usr7.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        usr7.setForeground(new java.awt.Color(60, 63, 65));
        usr7.setText(" ");
        usr7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usr7.setHideActionText(true);
        usr7.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                usr7ComponentHidden(evt);
            }
        });
        usr7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr7ActionPerformed(evt);
            }
        });
        getContentPane().add(usr7);
        usr7.setBounds(204, 370, 79, 30);

        usr8.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        usr8.setForeground(new java.awt.Color(60, 63, 65));
        usr8.setText(" ");
        usr8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usr8.setHideActionText(true);
        usr8.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                usr8ComponentHidden(evt);
            }
        });
        usr8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr8ActionPerformed(evt);
            }
        });
        getContentPane().add(usr8);
        usr8.setBounds(295, 370, 79, 30);

        usr9.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        usr9.setForeground(new java.awt.Color(60, 63, 65));
        usr9.setText(" ");
        usr9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usr9.setHideActionText(true);
        usr9.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                usr9ComponentHidden(evt);
            }
        });
        usr9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr9ActionPerformed(evt);
            }
        });
        getContentPane().add(usr9);
        usr9.setBounds(22, 406, 79, 30);

        usr10.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        usr10.setForeground(new java.awt.Color(60, 63, 65));
        usr10.setText(" ");
        usr10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usr10.setHideActionText(true);
        usr10.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                usr10ComponentHidden(evt);
            }
        });
        usr10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr10ActionPerformed(evt);
            }
        });
        getContentPane().add(usr10);
        usr10.setBounds(113, 406, 79, 30);

        usr11.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        usr11.setForeground(new java.awt.Color(60, 63, 65));
        usr11.setText(" ");
        usr11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usr11.setHideActionText(true);
        usr11.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                usr11ComponentHidden(evt);
            }
        });
        usr11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr11ActionPerformed(evt);
            }
        });
        getContentPane().add(usr11);
        usr11.setBounds(204, 406, 79, 30);

        usr1.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        usr1.setForeground(new java.awt.Color(60, 63, 65));
        usr1.setText(" ");
        usr1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usr1.setHideActionText(true);
        usr1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                usr1ComponentHidden(evt);
            }
        });
        usr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr1ActionPerformed(evt);
            }
        });
        getContentPane().add(usr1);
        usr1.setBounds(22, 334, 79, 30);

        usr2.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        usr2.setForeground(new java.awt.Color(60, 63, 65));
        usr2.setText(" ");
        usr2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usr2.setHideActionText(true);
        usr2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                usr2ComponentHidden(evt);
            }
        });
        usr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr2ActionPerformed(evt);
            }
        });
        getContentPane().add(usr2);
        usr2.setBounds(113, 334, 79, 30);

        usr3.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        usr3.setForeground(new java.awt.Color(60, 63, 65));
        usr3.setText(" ");
        usr3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usr3.setHideActionText(true);
        usr3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                usr3ComponentHidden(evt);
            }
        });
        usr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr3ActionPerformed(evt);
            }
        });
        getContentPane().add(usr3);
        usr3.setBounds(204, 334, 79, 30);

        usr4.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        usr4.setForeground(new java.awt.Color(60, 63, 65));
        usr4.setText(" ");
        usr4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usr4.setHideActionText(true);
        usr4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                usr4ComponentHidden(evt);
            }
        });
        usr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr4ActionPerformed(evt);
            }
        });
        getContentPane().add(usr4);
        usr4.setBounds(295, 334, 79, 30);

        usr12.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        usr12.setForeground(new java.awt.Color(60, 63, 65));
        usr12.setText(" ");
        usr12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usr12.setHideActionText(true);
        usr12.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                usr12ComponentHidden(evt);
            }
        });
        usr12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr12ActionPerformed(evt);
            }
        });
        getContentPane().add(usr12);
        usr12.setBounds(295, 406, 79, 30);

        usr13.setFont(new java.awt.Font("Eras Demi ITC", 1, 12)); // NOI18N
        usr13.setForeground(new java.awt.Color(60, 63, 65));
        usr13.setText(" ");
        usr13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usr13.setHideActionText(true);
        usr13.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                usr13ComponentHidden(evt);
            }
        });
        usr13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usr13ActionPerformed(evt);
            }
        });
        getContentPane().add(usr13);
        usr13.setBounds(22, 442, 79, 30);

        btnAsignar.setText("Guardar Barcos");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAsignar);
        btnAsignar.setBounds(20, 490, 120, 32);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/titulo.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 10, 310, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/blanco.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 0, 220, 80);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/blanco.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 480, 220, 80);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/blanco.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 220, 80);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/blanco.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 480, 220, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fff.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 1, 420, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       //ASDASD
    }//GEN-LAST:event_formMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
      String dato = this.state1.getText();
      int valor=Integer.parseInt(dato);
      if (valor==1){
          JOptionPane.showMessageDialog(null, "Barco Hundido!");
          btnVidas.setText(""+vidas);
          muertos++;
          btnHundidos.setText(""+muertos);
          btn1.setText("   X   ");
          checkBarcos();
          btn1.setEnabled(false);
      }else{
          JOptionPane.showMessageDialog(null, "Has Fallado el tiro, pierdes una vida.");
          vidas--;
          btnVidas.setText(""+vidas);
          mirarVidas();
          btn1.setEnabled(false);
          
      }
      if(hundidosUsr<4){
          disparoPc();
      }
          
      if(hundidosUsr==4){
          JOptionPane.showMessageDialog(null, "Has Perdido, la pc hundio todos tus barcos.");
          System.exit(0);
      }
      
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ComponentHidden

    private void btnVidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVidasActionPerformed

    private void btn2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn2ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ComponentHidden

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
      String dato = this.state2.getText();
      int valor=Integer.parseInt(dato);
      if (valor==1){
          JOptionPane.showMessageDialog(null, "Barco Hundido!");
          btnVidas.setText(""+vidas);
          muertos++;
          btnHundidos.setText(""+muertos);
          btn2.setText("   X   ");
          checkBarcos();
          btn2.setEnabled(false);
          
      }else{
          JOptionPane.showMessageDialog(null, "Has Fallado el tiro, pierdes una vida.");
          vidas--;
          btnVidas.setText(""+vidas);
          mirarVidas();
          btn2.setEnabled(false);
          
          
      }
      
      if(hundidosUsr<4){
          disparoPc();
      }
          
      if(hundidosUsr==4){
          JOptionPane.showMessageDialog(null, "Has Perdido, la pc hundio todos tus barcos.");
          System.exit(0);
      }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn3ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_btn3ComponentHidden

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
      String dato = this.state3.getText();
      int valor=Integer.parseInt(dato);
      if (valor==1){
          JOptionPane.showMessageDialog(null, "Barco Hundido!");
          btnVidas.setText(""+vidas);
          muertos++;
          btnHundidos.setText(""+muertos);
          btn3.setText("   X   ");
          checkBarcos();
          btn3.setEnabled(false);
      }else{
          JOptionPane.showMessageDialog(null, "Has Fallado el tiro, pierdes una vida.");
          vidas--;
          btnVidas.setText(""+vidas);
          mirarVidas();btn3.setEnabled(false);
      }
      if(hundidosUsr<4){
          disparoPc();
      }
          
      if(hundidosUsr==4){
          JOptionPane.showMessageDialog(null, "Has Perdido, la pc hundio todos tus barcos.");
          System.exit(0);
      }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn4ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ComponentHidden

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
      String dato = this.state4.getText();
      int valor=Integer.parseInt(dato);
      if (valor==1){
          JOptionPane.showMessageDialog(null, "Barco Hundido!");
          btnVidas.setText(""+vidas);
          muertos++;
          btnHundidos.setText(""+muertos);
          btn4.setText("   X   ");
          checkBarcos();
          btn4.setEnabled(false);
      }else{
          JOptionPane.showMessageDialog(null, "Has Fallado el tiro, pierdes una vida.");
          vidas--;
          btnVidas.setText(""+vidas);
          mirarVidas();btn4.setEnabled(false);
          
      }
      if(hundidosUsr<4){
          disparoPc();
      }
          
      if(hundidosUsr==4){
          JOptionPane.showMessageDialog(null, "Has Perdido, la pc hundio todos tus barcos.");
          System.exit(0);
      }
    }//GEN-LAST:event_btn4ActionPerformed

    private void state2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_state2ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_state2ComponentHidden

    private void state2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_state2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_state2ActionPerformed

    private void state3ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_state3ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_state3ComponentHidden

    private void state3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_state3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_state3ActionPerformed

    private void state4ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_state4ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_state4ComponentHidden

    private void state4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_state4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_state4ActionPerformed

    private void btnHundidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHundidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHundidosActionPerformed

    private void btn5ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn5ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_btn5ComponentHidden

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
      String dato = this.state5.getText();
      int valor=Integer.parseInt(dato);
      if (valor==1){
          JOptionPane.showMessageDialog(null, "Barco Hundido!");
          btnVidas.setText(""+vidas);
          muertos++;
          btnHundidos.setText(""+muertos);
          btn5.setText("   X   ");
          checkBarcos();
          btn5.setEnabled(false);
      }else{
          JOptionPane.showMessageDialog(null, "Has Fallado el tiro, pierdes una vida.");
          vidas--;
          btnVidas.setText(""+vidas);
          mirarVidas();
          btn5.setEnabled(false);
      }
      if(hundidosUsr<4){
          disparoPc();
      }
          
      if(hundidosUsr==4){
          JOptionPane.showMessageDialog(null, "Has Perdido, la pc hundio todos tus barcos.");
          System.exit(0);
      }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn6ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_btn6ComponentHidden

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
      String dato = this.state6.getText();
      int valor=Integer.parseInt(dato);
      if (valor==1){
          JOptionPane.showMessageDialog(null, "Barco Hundido!");
          btnVidas.setText(""+vidas);
          muertos++;
          btnHundidos.setText(""+muertos);
          btn6.setText("   X   ");
          checkBarcos();
          btn6.setEnabled(false);
      }else{
          JOptionPane.showMessageDialog(null, "Has Fallado el tiro, pierdes una vida.");
          vidas--;
          btnVidas.setText(""+vidas);
          mirarVidas();
          btn6.setEnabled(false);
      }
      if(hundidosUsr<4){
          disparoPc();
      }
          
      if(hundidosUsr==4){
          JOptionPane.showMessageDialog(null, "Has Perdido, la pc hundio todos tus barcos.");
          System.exit(0);
      }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn7ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_btn7ComponentHidden

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
      String dato = this.state7.getText();
      int valor=Integer.parseInt(dato);
      if (valor==1){
          JOptionPane.showMessageDialog(null, "Barco Hundido!");
          btnVidas.setText(""+vidas);
          muertos++;
          btnHundidos.setText(""+muertos);
          btn7.setText("   X   ");
          checkBarcos();
          btn7.setEnabled(false);
      }else{
          JOptionPane.showMessageDialog(null, "Has Fallado el tiro, pierdes una vida.");
          vidas--;
          btnVidas.setText(""+vidas);
          mirarVidas();
          btn7.setEnabled(false);
      }
      if(hundidosUsr<4){
          disparoPc();
      }
          
      if(hundidosUsr==4){
          JOptionPane.showMessageDialog(null, "Has Perdido, la pc hundio todos tus barcos.");
          System.exit(0);
      }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn8ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_btn8ComponentHidden

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
      String dato = this.state8.getText();
      int valor=Integer.parseInt(dato);
      if (valor==1){
          JOptionPane.showMessageDialog(null, "Barco Hundido!");
          btnVidas.setText(""+vidas);
          muertos++;
          btnHundidos.setText(""+muertos);
          btn8.setText("   X   ");
          checkBarcos();
          btn8.setEnabled(false);
      }else{
          JOptionPane.showMessageDialog(null, "Has Fallado el tiro, pierdes una vida.");
          vidas--;
          btnVidas.setText(""+vidas);
          mirarVidas();btn8.setEnabled(false);
          
      }
      if(hundidosUsr<4){
          disparoPc();
      }
          
      if(hundidosUsr==4){
          JOptionPane.showMessageDialog(null, "Has Perdido, la pc hundio todos tus barcos.");
          System.exit(0);
      }
    }//GEN-LAST:event_btn8ActionPerformed

    private void state5ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_state5ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_state5ComponentHidden

    private void state5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_state5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_state5ActionPerformed

    private void state7ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_state7ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_state7ComponentHidden

    private void state7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_state7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_state7ActionPerformed

    private void state8ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_state8ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_state8ComponentHidden

    private void state8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_state8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_state8ActionPerformed

    private void btn9ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn9ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_btn9ComponentHidden

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        String dato = this.state9.getText();
      int valor=Integer.parseInt(dato);
      if (valor==1){
          JOptionPane.showMessageDialog(null, "Barco Hundido!");
          btnVidas.setText(""+vidas);
          muertos++;
          btnHundidos.setText(""+muertos);
          btn9.setText("   X   ");
          checkBarcos();
          btn9.setEnabled(false);
      }else{
          JOptionPane.showMessageDialog(null, "Has Fallado el tiro, pierdes una vida.");
          vidas--;
          btnVidas.setText(""+vidas);
          mirarVidas();
          btn9.setEnabled(false);
      }
      if(hundidosUsr<4){
          disparoPc();
      }
          
      if(hundidosUsr==4){
          JOptionPane.showMessageDialog(null, "Has Perdido, la pc hundio todos tus barcos.");
          System.exit(0);
      }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn10ComponentHidden
        
    }//GEN-LAST:event_btn10ComponentHidden

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        String dato = this.state10.getText();
      int valor=Integer.parseInt(dato);
      if (valor==1){
          JOptionPane.showMessageDialog(null, "Barco Hundido!");
          btnVidas.setText(""+vidas);
          muertos++;
          btnHundidos.setText(""+muertos);
          btn10.setText("   X   ");
          checkBarcos();
          btn10.setEnabled(false);
      }else{
          JOptionPane.showMessageDialog(null, "Has Fallado el tiro, pierdes una vida.");
          vidas--;
          btnVidas.setText(""+vidas);
          mirarVidas(); btn10.setEnabled(false);
          
      }
      if(hundidosUsr<4){
          disparoPc();
      }
          
      if(hundidosUsr==4){
          JOptionPane.showMessageDialog(null, "Has Perdido, la pc hundio todos tus barcos.");
          System.exit(0);
      }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn11ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_btn11ComponentHidden

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        String dato = this.state11.getText();
      int valor=Integer.parseInt(dato);
      if (valor==1){
          JOptionPane.showMessageDialog(null, "Barco Hundido!");
          btnVidas.setText(""+vidas);
          muertos++;
          btnHundidos.setText(""+muertos);
          btn11.setText("   X   ");
          checkBarcos();
          btn11.setEnabled(false);
      }else{
          JOptionPane.showMessageDialog(null, "Has Fallado el tiro, pierdes una vida.");
          vidas--;
          btnVidas.setText(""+vidas);
          mirarVidas();btn11.setEnabled(false);
          
      }
      if(hundidosUsr<4){
          disparoPc();
      }
          
      if(hundidosUsr==4){
          JOptionPane.showMessageDialog(null, "Has Perdido, la pc hundio todos tus barcos.");
          System.exit(0);
      }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn12ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_btn12ComponentHidden

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        String dato = this.state12.getText();
      int valor=Integer.parseInt(dato);
      if (valor==1){
          JOptionPane.showMessageDialog(null, "Barco Hundido!");
          btnVidas.setText(""+vidas);
          muertos++;
          btnHundidos.setText(""+muertos);
          btn12.setText("   X   ");
          checkBarcos();
          btn12.setEnabled(false);
      }else{
          JOptionPane.showMessageDialog(null, "Has Fallado el tiro, pierdes una vida.");
          vidas--;
          btnVidas.setText(""+vidas);
          mirarVidas();btn12.setEnabled(false);
          
      }
      if(hundidosUsr<4){
          disparoPc();
      }
          
      if(hundidosUsr==4){
          JOptionPane.showMessageDialog(null, "Has Perdido, la pc hundio todos tus barcos.");
          System.exit(0);
      }
    }//GEN-LAST:event_btn12ActionPerformed

    private void state10ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_state10ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_state10ComponentHidden

    private void state10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_state10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_state10ActionPerformed

    private void state11ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_state11ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_state11ComponentHidden

    private void state11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_state11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_state11ActionPerformed

    private void state12ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_state12ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_state12ComponentHidden

    private void state12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_state12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_state12ActionPerformed

    private void btn13ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn13ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_btn13ComponentHidden

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        String dato = this.state13.getText();
      int valor=Integer.parseInt(dato);
      if (valor==1){
          JOptionPane.showMessageDialog(null, "Barco Hundido!");
          btnVidas.setText(""+vidas);
          muertos++;
          btnHundidos.setText(""+muertos);
          btn13.setText("   X   ");
          checkBarcos();
          btn13.setEnabled(false);
      }else{
          JOptionPane.showMessageDialog(null, "Has Fallado el tiro, pierdes una vida.");
          vidas--;
          btnVidas.setText(""+vidas);
          mirarVidas(); btn13.setEnabled(false);
          
      }
      if(hundidosUsr<4){
          disparoPc();
      }
          
      if(hundidosUsr==4){
          JOptionPane.showMessageDialog(null, "Has Perdido, la pc hundio todos tus barcos.");
          System.exit(0);
      }
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn14ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_btn14ComponentHidden

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        String dato = this.state14.getText();
      int valor=Integer.parseInt(dato);
      if (valor==1){
          JOptionPane.showMessageDialog(null, "Barco Hundido!");
          btnVidas.setText(""+vidas);
          muertos++;
          btnHundidos.setText(""+muertos);
          btn14.setText("   X   ");
          checkBarcos();
          btn14.setEnabled(false);
      }else{
          JOptionPane.showMessageDialog(null, "Has Fallado el tiro, pierdes una vida.");
          vidas--;
          btnVidas.setText(""+vidas);
          mirarVidas();btn14.setEnabled(false);
          
      }
      if(hundidosUsr<4){
          disparoPc();
      }
          
      if(hundidosUsr==4){
          JOptionPane.showMessageDialog(null, "Has Perdido, la pc hundio todos tus barcos.");
          System.exit(0);
      }
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn15ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_btn15ComponentHidden

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        String dato = this.state15.getText();
      int valor=Integer.parseInt(dato);
      if (valor==1){
          JOptionPane.showMessageDialog(null, "Barco Hundido!");
          btnVidas.setText(""+vidas);
          muertos++;
          btnHundidos.setText(""+muertos);
          btn15.setText("   X   ");
          checkBarcos();
          btn15.setEnabled(false);
      }else{
          JOptionPane.showMessageDialog(null, "Has Fallado el tiro, pierdes una vida.");
          vidas--;
          btnVidas.setText(""+vidas);
          mirarVidas();
          btn15.setEnabled(false);
      }
      if(hundidosUsr<4){
          disparoPc();
      }
          
      if(hundidosUsr==4){
          JOptionPane.showMessageDialog(null, "Has Perdido, la pc hundio todos tus barcos.");
          System.exit(0);
      }
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btn16ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_btn16ComponentHidden

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        String dato = this.state16.getText();
      int valor=Integer.parseInt(dato);
      if (valor==1){
          JOptionPane.showMessageDialog(null, "Barco Hundido!");
          btnVidas.setText(""+vidas);
          muertos++;
          btnHundidos.setText(""+muertos);
          btn16.setText("   X   ");
          checkBarcos();
          btn16.setEnabled(false);
      }else{
          JOptionPane.showMessageDialog(null, "Has Fallado el tiro, pierdes una vida.");
          vidas--;
          btnVidas.setText(""+vidas);
          mirarVidas();btn16.setEnabled(false);
          
      }
      if(hundidosUsr<4){
          disparoPc();
      }
          
      if(hundidosUsr==4){
          JOptionPane.showMessageDialog(null, "Has Perdido, la pc hundio todos tus barcos.");
          System.exit(0);
      }
    }//GEN-LAST:event_btn16ActionPerformed

    private void state14ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_state14ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_state14ComponentHidden

    private void state14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_state14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_state14ActionPerformed

    private void state15ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_state15ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_state15ComponentHidden

    private void state15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_state15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_state15ActionPerformed

    private void state16ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_state16ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_state16ComponentHidden

    private void state16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_state16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_state16ActionPerformed

    private void usr14ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_usr14ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_usr14ComponentHidden

    private void usr14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr14ActionPerformed
        if (disponibles>0){
        usr14.setText("   B   ");
        usr14.setEnabled(false);disponibles--;
        }else{
            JOptionPane.showMessageDialog(null, "No quedan barcos disponibles");
            usr14.setEnabled(false);
        }
    }//GEN-LAST:event_usr14ActionPerformed

    private void usr15ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_usr15ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_usr15ComponentHidden

    private void usr15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr15ActionPerformed
        if (disponibles>0){
        usr15.setText("   B   ");
        usr15.setEnabled(false);disponibles--;
        }else{
            JOptionPane.showMessageDialog(null, "No quedan barcos disponibles");
            usr15.setEnabled(false);
        }
    }//GEN-LAST:event_usr15ActionPerformed

    private void usr6ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_usr6ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_usr6ComponentHidden

    private void usr6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr6ActionPerformed
        if (disponibles>0){
        usr6.setText("   B   ");
        usr6.setEnabled(false);disponibles--;
        }else{
            JOptionPane.showMessageDialog(null, "No quedan barcos disponibles");
            usr16.setEnabled(false);
        }
    }//GEN-LAST:event_usr6ActionPerformed

    private void usr16ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_usr16ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_usr16ComponentHidden

    private void usr16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr16ActionPerformed
        if (disponibles>0){
        usr16.setText("   B   ");
        usr16.setEnabled(false);disponibles--;
        }else{
            JOptionPane.showMessageDialog(null, "No quedan barcos disponibles");
            usr16.setEnabled(false);
        }
    }//GEN-LAST:event_usr16ActionPerformed

    private void usr5ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_usr5ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_usr5ComponentHidden

    private void usr5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr5ActionPerformed
        if (disponibles>0){
        usr5.setText("   B   ");
        usr5.setEnabled(false);disponibles--;
        }else{
            JOptionPane.showMessageDialog(null, "No quedan barcos disponibles");
            usr5.setEnabled(false);
        }
    }//GEN-LAST:event_usr5ActionPerformed

    private void usr7ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_usr7ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_usr7ComponentHidden

    private void usr7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr7ActionPerformed
        if (disponibles>0){
        usr7.setText("   B   ");
        usr7.setEnabled(false);disponibles--;
        }else{
            JOptionPane.showMessageDialog(null, "No quedan barcos disponibles");
            usr7.setEnabled(false);
        }
    }//GEN-LAST:event_usr7ActionPerformed

    private void usr8ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_usr8ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_usr8ComponentHidden

    private void usr8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr8ActionPerformed
        if (disponibles>0){
        usr8.setText("   B   ");
        usr8.setEnabled(false);disponibles--;
        }else{
            JOptionPane.showMessageDialog(null, "No quedan barcos disponibles");
            usr8.setEnabled(false);
        }
    }//GEN-LAST:event_usr8ActionPerformed

    private void usr9ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_usr9ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_usr9ComponentHidden

    private void usr9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr9ActionPerformed
        if (disponibles>0){
        usr9.setText("   B   ");
        usr9.setEnabled(false);disponibles--;
        }else{
            JOptionPane.showMessageDialog(null, "No quedan barcos disponibles");
            usr9.setEnabled(false);
        }
    }//GEN-LAST:event_usr9ActionPerformed

    private void usr10ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_usr10ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_usr10ComponentHidden

    private void usr10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr10ActionPerformed
        if (disponibles>0){
        usr10.setText("   B   ");
        usr10.setEnabled(false);disponibles--;
        }else{
            JOptionPane.showMessageDialog(null, "No quedan barcos disponibles");
            usr10.setEnabled(false);
        }
    }//GEN-LAST:event_usr10ActionPerformed

    private void usr11ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_usr11ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_usr11ComponentHidden

    private void usr11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr11ActionPerformed
        if (disponibles>0){
        usr11.setText("   B   ");
        usr11.setEnabled(false);disponibles--;
        }else{
            JOptionPane.showMessageDialog(null, "No quedan barcos disponibles");
            usr11.setEnabled(false);
        }
    }//GEN-LAST:event_usr11ActionPerformed

    private void usr1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_usr1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_usr1ComponentHidden

    private void usr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr1ActionPerformed
       if (disponibles>0){
        usr1.setText("   B   ");
       usr1.setEnabled(false);disponibles--;
       }else{
            JOptionPane.showMessageDialog(null, "No quedan barcos disponibles");
            usr1.setEnabled(false);
        }
    }//GEN-LAST:event_usr1ActionPerformed

    private void usr2ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_usr2ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_usr2ComponentHidden

    private void usr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr2ActionPerformed
        if (disponibles>0){
        usr2.setText("   B   ");
        usr2.setEnabled(false);disponibles--;
        }else{
            JOptionPane.showMessageDialog(null, "No quedan barcos disponibles");
            usr2.setEnabled(false);
        }
    }//GEN-LAST:event_usr2ActionPerformed

    private void usr3ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_usr3ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_usr3ComponentHidden

    private void usr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr3ActionPerformed
        if (disponibles>0){
        usr3.setText("   B   ");
        usr3.setEnabled(false);disponibles--;
        }else{
            JOptionPane.showMessageDialog(null, "No quedan barcos disponibles");
            usr3.setEnabled(false);
        }
    }//GEN-LAST:event_usr3ActionPerformed

    private void usr4ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_usr4ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_usr4ComponentHidden

    private void usr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr4ActionPerformed
        if (disponibles>0){
        usr4.setText("   B   ");
        usr4.setEnabled(false);disponibles--;
        }else{
            JOptionPane.showMessageDialog(null, "No quedan barcos disponibles");
            usr4.setEnabled(false);
        }
    }//GEN-LAST:event_usr4ActionPerformed

    private void usr12ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_usr12ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_usr12ComponentHidden

    private void usr12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr12ActionPerformed
        if (disponibles>0){
        usr12.setText("   B   ");
        usr12.setEnabled(false); disponibles--;   
        }else{
            JOptionPane.showMessageDialog(null, "No quedan barcos disponibles");
            usr12.setEnabled(false);
        }
        
    }//GEN-LAST:event_usr12ActionPerformed

    private void usr13ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_usr13ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_usr13ComponentHidden

    private void usr13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usr13ActionPerformed
        if (disponibles>0){
        usr13.setText("   B   ");
        usr13.setEnabled(false);
        disponibles--;
        }else{
            JOptionPane.showMessageDialog(null, "No quedan barcos disponibles");
            usr13.setEnabled(false);
        }
    }//GEN-LAST:event_usr13ActionPerformed

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        asignarBotones();
        habilitarPc();
    }//GEN-LAST:event_btnAsignarActionPerformed

    
    
    
    
    //Crear aleatoriamente los barcos de la pc
    public void barcosPc(){
        //Inicializa las variables en los valores originales
        btnVidas.setText(""+vidas);
        btnHundidos.setText("0");
        
        
        //Linea 1      
        int at1 = (int) (Math.random()*3);
        switch(at1){
            case 0:
                state1.setText("1");
                break;
            case 1:
                state2.setText("1");
                break;
            case 2:
                state3.setText("1");
                break;
            case 3:
                state4.setText("1");
                break;
            
        } //Fin linea 1----------------------
        
        //Linea 2      
        int at2 = (int) (Math.random()*3);
        switch(at2){
            case 0:
                state5.setText("1");
                break;
            case 1:
                state6.setText("1");
                break;
            case 2:
                state7.setText("1");
                break;
            case 3:
                state8.setText("1");
                break;
            
        } //Fin linea 2------------
        
        //Linea 3      
        int at3 = (int) (Math.random()*3);
        switch(at3){
            case 0:
                state9.setText("1");
                break;
            case 1:
                state10.setText("1");
                break;
            case 2:
                state11.setText("1");
                break;
            case 3:
                state12.setText("1");
                break;
            
        } //Fin linea 3----------------------
        
        //Linea 4      
        int at4 = (int) (Math.random()*3);
        switch(at4){
            case 0:
                state13.setText("1");
                break;
            case 1:
                state14.setText("1");
                break;
            case 2:
                state15.setText("1");
                break;
            case 3:
                state16.setText("1");
                break;
            
        } //Fin linea 4----------------------
        
    }//fin barcos pc
    
    
    
    
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
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHundidos;
    private javax.swing.JButton btnVidas;
    private javax.swing.ButtonGroup gp1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton state1;
    private javax.swing.JButton state10;
    private javax.swing.JButton state11;
    private javax.swing.JButton state12;
    private javax.swing.JButton state13;
    private javax.swing.JButton state14;
    private javax.swing.JButton state15;
    private javax.swing.JButton state16;
    private javax.swing.JButton state2;
    private javax.swing.JButton state3;
    private javax.swing.JButton state4;
    private javax.swing.JButton state5;
    private javax.swing.JButton state6;
    private javax.swing.JButton state7;
    private javax.swing.JButton state8;
    private javax.swing.JButton state9;
    private javax.swing.JButton usr1;
    private javax.swing.JButton usr10;
    private javax.swing.JButton usr11;
    private javax.swing.JButton usr12;
    private javax.swing.JButton usr13;
    private javax.swing.JButton usr14;
    private javax.swing.JButton usr15;
    private javax.swing.JButton usr16;
    private javax.swing.JButton usr2;
    private javax.swing.JButton usr3;
    private javax.swing.JButton usr4;
    private javax.swing.JButton usr5;
    private javax.swing.JButton usr6;
    private javax.swing.JButton usr7;
    private javax.swing.JButton usr8;
    private javax.swing.JButton usr9;
    // End of variables declaration//GEN-END:variables
}
