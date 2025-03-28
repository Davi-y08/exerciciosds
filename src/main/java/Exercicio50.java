import javax.swing.*;
import java.util.Random;
public class Exercicio50 extends javax.swing.JFrame {

  
    public Exercicio50() {
        initComponents();
        lblExibicao.setVisible(false);
        lblMaiorQue5.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciar = new javax.swing.JButton();
        lblExibicao = new javax.swing.JLabel();
        lblDivisiveis = new javax.swing.JLabel();
        lblMaiorQue5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIniciar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnIniciar.setText("Iniciar ");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        lblExibicao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblExibicao.setText("Numeros sorteados: ");

        lblDivisiveis.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblDivisiveis.setText("Números divisiveis por 3: ");

        lblMaiorQue5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblMaiorQue5.setText("Números maiores que 5: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDivisiveis)
                            .addComponent(lblExibicao)
                            .addComponent(lblMaiorQue5))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblExibicao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(lblMaiorQue5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(lblDivisiveis)
                .addGap(143, 143, 143)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
      mainAction();
      lblExibicao.setVisible(true);
    }//GEN-LAST:event_btnIniciarActionPerformed
    
    private int[] randomNumbers = new int[20]; 
    
    private void mainAction(){
        
        btnIniciar.setEnabled(false);
        
        int i = 0;
        Random random = new Random();
        
        while(i < randomNumbers.length){
            int numRandomAux = random.nextInt(10); 
            randomNumbers[i] = numRandomAux;
            i++;
        }
        
        verificacoes();
        
    }
    
    private void verificacoes(){
        int i = 0;
        while(i < randomNumbers.length){
            int numeroAuxiliar = randomNumbers[i];
            labelNumbers(numeroAuxiliar);
            i++;
            if(numeroAuxiliar > 5){
                labelMaiorQue5(numeroAuxiliar);
            }
            if(numeroAuxiliar % 3 == 0){
                divisiveisPor3(numeroAuxiliar);
            }
        }
    }
    
    private int posicaoY = 25;
    private int posicaoX = 10;
    
    private void labelNumbers(int numero){
        posicaoX += 20;
        
        if(posicaoX == 350){
            posicaoY += 30;
            posicaoX = 30;
        }
        
        JLabel lblRandom = new JLabel();
        lblRandom.setText(numero + ", ");
        lblRandom.setVisible(true);
        lblRandom.setSize(150, 70);
        lblRandom.setLocation(posicaoX, posicaoY);
        this.add(lblRandom);
        this.revalidate();
        this.repaint();
    }
    
    private int posicaoYMaior = 150;
    private int posicaoXMaior = 10;
    
    private void labelMaiorQue5(int numero){   
        lblMaiorQue5.setVisible(true);
        posicaoXMaior += 20; 
        
        if(posicaoXMaior == 350){
            posicaoYMaior += 30;
            posicaoXMaior = 30;
        }
        
        JLabel lblMaior = new JLabel();
        lblMaior.setText(numero + ", ");
        lblMaior.setVisible(true);
        lblMaior.setSize(150, 70);
        lblMaior.setLocation(posicaoXMaior, posicaoYMaior);
        this.add(lblMaior);
        this.revalidate();
        this.repaint();
    }
    
    private void divisiveisPor3(int divisivel){
        
    }

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercicio50().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel lblDivisiveis;
    private javax.swing.JLabel lblExibicao;
    private javax.swing.JLabel lblMaiorQue5;
    // End of variables declaration//GEN-END:variables
}
