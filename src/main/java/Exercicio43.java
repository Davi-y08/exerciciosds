import javax.swing.*;

public class Exercicio43 extends javax.swing.JFrame {

    public Exercicio43() {
        initComponents();
        int numero = 30;
        while(numero >= 1){
            if ((numero % 4) == 0){
                LabelActionWhile("[" + String.valueOf(numero) + "]");
            } else {
                LabelActionWhile(String.valueOf(numero));
            }
            numero--;
        }
        LabelActionWhile("Acabou!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public int posicaoY = 10;
    private void LabelActionWhile(String n){
        posicaoY += 20;
        JLabel lblWhile = new JLabel();
        lblWhile.setText(n);
        lblWhile.setVisible(true);
        lblWhile.setSize(150, 40);
        lblWhile.setLocation(200, posicaoY);
        getContentPane().add(lblWhile);
        this.revalidate();
        this.repaint();
    }
    
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio43().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
