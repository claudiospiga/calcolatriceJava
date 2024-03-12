package pacchetto;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Calcolatrice extends JFrame {
    private JTextArea outputArea; // Dichiarato come attributo di classe

    public Calcolatrice() {
        JFrame frame = new JFrame("calcolatrice");
        setTitle("calcolatrice");
        setSize(900, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        outputArea = new JTextArea();
        outputArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(outputArea);

        JButton addizioneButton = new JButton("addizione ");
        JButton sottrazioneButton = new JButton("sottrazione");
        JButton moltiplicazioneButton = new JButton(" moltiplicazione");
        JButton divisioneButton = new JButton("divisione");

        addizioneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addizione(); // Ora può accedere a outputArea
            }
        });

        sottrazioneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sottrazione(); // Ora può accedere a outputArea
            }
        });

        moltiplicazioneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moltiplicazione();
            }
        });

        divisioneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                divisione();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 4));
        buttonPanel.add(addizioneButton);
        buttonPanel.add(sottrazioneButton);
        buttonPanel.add(moltiplicazioneButton);
        buttonPanel.add(divisioneButton);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addizione() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("inserisci il primo numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("inserisci il secondo numero"));
        outputArea.append(String.valueOf(num1 + num2) + "\n");
    }

    private void sottrazione() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il primo numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il secondo numero"));
        outputArea.append(String.valueOf(num1 - num2) + "\n");
    }
    
    private void moltiplicazione() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il primo numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il secondo numero"));
        outputArea.append(String.valueOf(num1 * num2) + "\n");
    }
    private void divisione() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il primo numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Inserisci il secondo numero"));
        outputArea.append(String.valueOf(num1 / num2) + "\n");
    }
  //metodo main 
  		public static void main(String[] args) {
  			SwingUtilities.invokeLater(new Runnable() {
  				@Override
  				public void run() {
  					Calcolatrice pm = new Calcolatrice();
  					pm.setVisible(true);
  					
  				}
  			});
  			
  		}
    
    
    
    
    
    
    
    
    
}