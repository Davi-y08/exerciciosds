import javax.swing.JLabel;

public class Exercicio49 extends javax.swing.JFrame {
    public Exercicio49() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        n1 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JTextField();
        n2 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JTextField();
        n3 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JTextField();
        n4 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JTextField();
        n5 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JTextField();
        n6 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        n1.setText("Digite um primeiro número inteiro:");

        n2.setText("Digite um segundo número inteiro:");

        n3.setText("Digite um terceiro número inteiro:");

        n4.setText("Digite um quarto número inteiro:");

        n5.setText("Digite um quinto número inteiro:");

        n6.setText("Digite um sexto número inteiro:");

        btn1.setText("Enviar");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(btn1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(n1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(n2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(n3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl3))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(n5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl5)
                                    .addGap(15, 15, 15))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(n6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl6)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(n4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n1)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n6))
                .addGap(18, 18, 18)
                .addComponent(btn1)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        primeiroN = Integer.parseInt(lbl1.getText());
        segundoN = Integer.parseInt(lbl2.getText());
        terceiroN = Integer.parseInt(lbl3.getText());
        quartoN = Integer.parseInt(lbl4.getText());
        quintoN = Integer.parseInt(lbl5.getText());
        sextoN = Integer.parseInt(lbl6.getText());
        
        int contadorPares = 0;
        int contadorImpares = 0;
        
        int[] numeros = {primeiroN, segundoN, terceiroN, quartoN, quintoN, sextoN};
        for (int i = 0; i <= 5; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        
        JLabel lblWhile = new JLabel();
        lblWhile.setText("Quantidade de números pares: " + contadorPares + " | Quantidade de números ímpares: " + contadorImpares);
        lblWhile.setVisible(true);
        lblWhile.setSize(500, 40);
        lblWhile.setLocation(175, 150);
        getContentPane().add(lblWhile);
        this.revalidate();
        this.repaint();
        
        btn1.setVisible(false);
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        lbl3.setVisible(false);
        lbl4.setVisible(false);
        lbl5.setVisible(false);
        lbl6.setVisible(false);
        n1.setVisible(false);
        n2.setVisible(false);
        n3.setVisible(false);
        n4.setVisible(false);
        n5.setVisible(false);
        n6.setVisible(false);
    }//GEN-LAST:event_btn1ActionPerformed

    private int primeiroN = 0;
    private int segundoN = 0;
    private int terceiroN = 0;
    private int quartoN = 0;
    private int quintoN = 0;
    private int sextoN = 0;
    
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio49().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JTextField lbl1;
    private javax.swing.JTextField lbl2;
    private javax.swing.JTextField lbl3;
    private javax.swing.JTextField lbl4;
    private javax.swing.JTextField lbl5;
    private javax.swing.JTextField lbl6;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n2;
    private javax.swing.JLabel n3;
    private javax.swing.JLabel n4;
    private javax.swing.JLabel n5;
    private javax.swing.JLabel n6;
    // End of variables declaration//GEN-END:variables
}
