import javax.swing.*;

public class Exercicio45 extends javax.swing.JFrame {

    public Exercicio45() {
        initComponents();
        lbl3.setVisible(false);
        txt3.setVisible(false);
        btnEnviarIncremento.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEnviar = new javax.swing.JButton();
        btnEnviarIncremento = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        lbl2 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        lbl3 = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEnviar.setText("ENVIAR");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnEnviarIncremento.setText("Enviar incremento");
        btnEnviarIncremento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarIncrementoActionPerformed(evt);
            }
        });

        lbl1.setText("Digite o primeiro valor:");

        lbl2.setText("Digite o segundo valor:");

        lbl3.setText("Digite o valor do incremento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEnviar)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEnviarIncremento)
                        .addGap(129, 129, 129))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2))
                .addGap(18, 18, 18)
                .addComponent(btnEnviar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl3))
                .addGap(18, 18, 18)
                .addComponent(btnEnviarIncremento)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        primeiroValor = Integer.parseInt(txt1.getText());
        segundoValor = Integer.parseInt(txt2.getText());
        lbl3.setVisible(true);
        txt3.setVisible(true);
        btnEnviarIncremento.setVisible(true);
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        btnEnviar.setVisible(false);
        txt1.setVisible(false);
        txt2.setVisible(false);
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnEnviarIncrementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarIncrementoActionPerformed
        incremento = Integer.parseInt(txt3.getText());
        if(primeiroValor > segundoValor){
            while(primeiroValor >= segundoValor){
                labelAction();
                primeiroValor-=incremento;
            }
        }else{
            while(primeiroValor <= segundoValor){
                labelAction();
                primeiroValor+=incremento;
            }
        }
    }//GEN-LAST:event_btnEnviarIncrementoActionPerformed
     
    private int primeiroValor = 0;
    private int segundoValor = 0;
    private int incremento = 0;
    private int posicaoY = 50;                                               
   
    private void labelAction(){
        posicaoY+=20;
        JLabel myLbl = new JLabel();
        myLbl.setText("Valor: " + primeiroValor);
        myLbl.setVisible(true);
        myLbl.setSize(150, 40);
        myLbl.setLocation(70, posicaoY);
        getContentPane().add(myLbl);
        this.revalidate();
        this.repaint();
    }
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio45().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnEnviarIncremento;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}
