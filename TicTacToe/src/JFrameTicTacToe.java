import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.*;


public class JFrameTicTacToe extends javax.swing.JFrame {

   
    public JFrameTicTacToe() {
        initComponents();
        this.setResizable(false);
        this.setTitle("Tic Tac Toe");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn3 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblplayerWho = new javax.swing.JLabel();
        lblXCounter = new javax.swing.JLabel();
        lblOCounter = new javax.swing.JLabel();
        btnplayagain = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        btn6 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        btn5 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        btn4 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        btn8 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        btn9 = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn1.setBorder(null);
        btn1.setBorderPainted(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn2.setBorder(null);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn3.setBorder(null);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Win Count");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("X  : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 0));
        jLabel3.setText("O  : ");

        lblplayerWho.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblplayerWho.setForeground(new java.awt.Color(255, 255, 255));
        lblplayerWho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblplayerWho.setText("Player X's Turn");

        lblXCounter.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblXCounter.setForeground(new java.awt.Color(255, 255, 255));
        lblXCounter.setText("0");

        lblOCounter.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblOCounter.setForeground(new java.awt.Color(255, 255, 255));
        lblOCounter.setText("0");

        btnplayagain.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnplayagain.setText("Play Again");
        btnplayagain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplayagainActionPerformed(evt);
            }
        });

        btnexit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblXCounter)
                            .addComponent(lblOCounter))
                        .addGap(18, 18, 18))
                    .addComponent(btnplayagain, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnexit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblplayerWho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblXCounter, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblOCounter))
                .addGap(40, 40, 40)
                .addComponent(lblplayerWho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnplayagain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn6.setBorder(null);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn5.setBorder(null);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn4.setBorder(null);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn7.setBorder(null);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn8.setBorder(null);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn9.setBorder(null);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    JFrame frame;
    int xCount = 0;
    int oCount = 0;
    String startgame = "X";
    
    //storing of values = for scoring
    int b1 = 10;
    int b2 = 10;
    int b3 = 10;
    int b4 = 10;
    int b5 = 10;
    int b6 = 10;
    int b7 = 10;
    int b8 = 10;
    int b9 = 10;
    
    //tie
    int i = 0;
    
    private void choosePlayer () {
        //CHECKING WHICH PLAYER NEXT
        if(startgame.equalsIgnoreCase("X")){
            startgame = "O";
            lblplayerWho.setText("Player O's Turn");
        }
        else {
            startgame = "X";
            lblplayerWho.setText("Player X's Turn");
        }       
    }
    
    private void finalWinnerChecker () {
        if (xCount == 3) {
            JOptionPane.showMessageDialog(frame, "Player  X  is the Winner, O sucks", "Tic Tac Toe - Winner", JOptionPane.INFORMATION_MESSAGE);
            newGame();
        }
        else if (oCount == 3) {
            JOptionPane.showMessageDialog(frame, "Player  O  is the Winner, X sucks", "Tic Tac Toe - Winner", JOptionPane.INFORMATION_MESSAGE);
            newGame();
        }       
    }
    
    private void levelDone () {
        i = 0;
        
        btn1.setText(null);
        btn2.setText(null);
        btn3.setText(null);
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
        btn7.setText(null);
        btn8.setText(null);
        btn9.setText(null);
        
        b1 = 10;
        b2 = 10;
        b3 = 10;
        b4 = 10;
        b5 = 10;
        b6 = 10;
        b7 = 10;
        b8 = 10;
        b9 = 10;
        
        finalWinnerChecker ();
    }
    
    private void newGame () {
        //COUNTER
       xCount = 0;
       oCount = 0;

       //PLAYER SCORES = RESET
       lblXCounter.setText("0");
       lblOCounter.setText("0");
       
       //RESET BOARD VALUES
       btn1.setText(null);
       btn2.setText(null);
       btn3.setText(null);
       btn4.setText(null);
       btn5.setText(null);
       btn6.setText(null);
       btn7.setText(null);
       btn8.setText(null);
       btn9.setText(null);
       
       //PlayerWho
       lblplayerWho.setText("Player X's Turn");
       
       //BTN VALUE HOLDER
       b1 = 10;
       b2 = 10;
       b3 = 10;
       b4 = 10;
       b5 = 10;
       b6 = 10;
       b7 = 10;
       b8 = 10;
       b9 = 10;
       
       //TILES VALUE HOLDER
       i=0;
    }
    
    private void winningGame () {
        //X Player Possible Answers
        if(b1 == 1 && b2 == 1 && b3 == 1) {
            JOptionPane.showMessageDialog(frame, "Player  X  wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            lblXCounter.setText(String.valueOf(xCount));
            levelDone();
            
        }
        
        else if(b4 == 1 && b5 == 1 && b6 == 1) {
            JOptionPane.showMessageDialog(frame, "Player  X  wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            lblXCounter.setText(String.valueOf(xCount));
            levelDone();
            
        }  
        
        else if(b7 == 1 && b8 == 1 && b9 == 1) {
            JOptionPane.showMessageDialog(frame, "Player  X  wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            lblXCounter.setText(String.valueOf(xCount));
            levelDone();
            
        }
        
        else if(b1 == 1 && b4 == 1 && b7 == 1) {
            JOptionPane.showMessageDialog(frame, "Player  X  wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            lblXCounter.setText(String.valueOf(xCount));
            levelDone();
            
        }
        else if(b2 == 1 && b5 == 1 && b8 == 1) {
            JOptionPane.showMessageDialog(frame, "Player  X  wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            lblXCounter.setText(String.valueOf(xCount));
            levelDone();
            
        }
        else if(b3 == 1 && b6 == 1 && b9 == 1) {
            JOptionPane.showMessageDialog(frame, "Player  X  wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            lblXCounter.setText(String.valueOf(xCount));
            levelDone();
            
        }
        else if(b1 == 1 && b5 == 1 && b9 == 1) {
            JOptionPane.showMessageDialog(frame, "Player  X  wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            lblXCounter.setText(String.valueOf(xCount));
            levelDone();
            
        }
        else if(b3 == 1 && b5 == 1 && b7 == 1) {
            JOptionPane.showMessageDialog(frame, "Player  X  wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            lblXCounter.setText(String.valueOf(xCount));
            levelDone();
            
        }
        
        //O Player Possible Answers
        else if(b1 == 0 && b2 == 0 && b3 == 0) {
            JOptionPane.showMessageDialog(frame, "Player  O  wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            lblOCounter.setText(String.valueOf(oCount));
            levelDone();
            
        }
        
        else if(b4 == 0 && b5 == 0 && b6 == 0) {
            JOptionPane.showMessageDialog(frame, "Player  O  wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            lblOCounter.setText(String.valueOf(oCount));
            levelDone();
            
        }  
        
        else if(b7 == 0 && b8 == 0 && b9 == 0) {
            JOptionPane.showMessageDialog(frame, "Player  O  wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            lblOCounter.setText(String.valueOf(oCount));
            levelDone();
            
        }
        
        else if(b1 == 0 && b4 == 0 && b7 == 0) {
            JOptionPane.showMessageDialog(frame, "Player  O  wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            lblOCounter.setText(String.valueOf(oCount));
            levelDone();
            
        }
        else if(b2 == 0 && b5 == 0 && b8 == 0) {
            JOptionPane.showMessageDialog(frame, "Player  O  wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            lblOCounter.setText(String.valueOf(oCount));
            levelDone();
            
        }
        else if(b3 == 0 && b6 == 0 && b9 == 0) {
            JOptionPane.showMessageDialog(frame, "Player  O  wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            lblOCounter.setText(String.valueOf(oCount));
            levelDone();
            
            
        }
        else if(b1 == 0 && b5 == 0 && b9 == 0) {
            JOptionPane.showMessageDialog(frame, "Player  O  wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            lblOCounter.setText(String.valueOf(oCount));
            levelDone();
            
        }
        else if(b3 == 0 && b5 == 0 && b7 == 0) {
            JOptionPane.showMessageDialog(frame, "Player  O  wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            lblOCounter.setText(String.valueOf(oCount));
            levelDone();
            
        }
        else if(i==9) {
            JOptionPane.showMessageDialog(frame, "Two Dumb Bitches haha", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            levelDone();
            
            
            
        }
        
    }
    
    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnplayagainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplayagainActionPerformed
       
       //COUNTER
       xCount = 0;
       oCount = 0;

       //PLAYER SCORES = RESET
       lblXCounter.setText("0");
       lblOCounter.setText("0");
       
       //RESET BOARD VALUES
       btn1.setText(null);
       btn2.setText(null);
       btn3.setText(null);
       btn4.setText(null);
       btn5.setText(null);
       btn6.setText(null);
       btn7.setText(null);
       btn8.setText(null);
       btn9.setText(null);
       
       //PlayerWho
       lblplayerWho.setText("Player X's Turn");
       
       //BTN VALUE HOLDER
       b1 = 10;
       b2 = 10;
       b3 = 10;
       b4 = 10;
       b5 = 10;
       b6 = 10;
       b7 = 10;
       b8 = 10;
       b9 = 10;
       
       //TILES VALUE HOLDER
       i=0;
       
       
    }//GEN-LAST:event_btnplayagainActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        btn1.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")) {
            btn1.setForeground(Color.ORANGE);
            b1 = 1;
            i++;
        }
        else {
            btn1.setForeground(Color.GREEN);
            b1 = 0;
            i++;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btn2.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")) {
            btn2.setForeground(Color.ORANGE);
            b2 = 1;
            i++;
        }
        else {
            btn2.setForeground(Color.GREEN);
            b2 = 0;
            i++;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btn3.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")) {
            btn3.setForeground(Color.ORANGE);
            b3 = 1;
            i++;
        }
        else {
            btn3.setForeground(Color.GREEN);
            b3 = 0;
            i++;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btn4.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")) {
            btn4.setForeground(Color.ORANGE);
            b4 = 1;
            i++;
        }
        else {
            btn4.setForeground(Color.GREEN);
            b4 = 0;
            i++;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btn5.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")) {
            btn5.setForeground(Color.ORANGE);
            b5 = 1;
            i++;
        }
        else {
            btn5.setForeground(Color.GREEN);
            b5 = 0;
            i++;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")) {
            btn6.setForeground(Color.ORANGE);
            b6 = 1;
            i++;
        }
        else {
            btn6.setForeground(Color.GREEN);
            b6 = 0;
            i++;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btn7.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")) {
            btn7.setForeground(Color.ORANGE);
            b7 = 1;
            i++;
        }
        else {
            btn7.setForeground(Color.GREEN);
            b7 = 0;
            i++;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btn8.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")) {
            btn8.setForeground(Color.ORANGE);
            b8 = 1;
            i++;
        }
        else {
            btn8.setForeground(Color.GREEN);
            b8 = 0;
            i++;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btn9.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")) {
            btn9.setForeground(Color.ORANGE);
            b9 = 1;
            i++;
        }
        else {
            btn9.setForeground(Color.GREEN);
            b9 = 0;
            i++;
        }
        choosePlayer();
        winningGame();
    }//GEN-LAST:event_btn9ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnplayagain;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblOCounter;
    private javax.swing.JLabel lblXCounter;
    private javax.swing.JLabel lblplayerWho;
    // End of variables declaration//GEN-END:variables
}
