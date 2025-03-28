import javax.swing.*;

public class Exercicio47 extends javax.swing.JFrame {

    public Exercicio47() {
        initComponents();
        int soma = 0;
        int numero = 500; 

        while (numero >= 0) {
            soma += numero;
            numero -= 50;
        }
        JLabel lblWhile = new JLabel();
        lblWhile.setText(String.valueOf(soma));
        lblWhile.setVisible(true);
        lblWhile.setSize(150, 40);
        lblWhile.setLocation(200, 100);
        getContentPane().add(lblWhile);
        this.revalidate();
        this.repaint();
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

        public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio47().setVisible(true);
            }
        });
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

