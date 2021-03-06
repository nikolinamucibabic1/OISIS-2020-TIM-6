package view;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Recept;

public class SellMedicamentRecipe extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Container c; 
    private JLabel title; 
    private JLabel lekKolicina; 
    private JTextField tkolicina;
    private JButton kreiraj;
    private JComboBox comboBox;
	
	public SellMedicamentRecipe(ArrayList<Recept> recepti) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize((int) 600, 300);
		setLocationRelativeTo(null);
		setTitle("Prodaja leka");
		
		setResizable(false); 
		  
        c = getContentPane(); 
        c.setLayout(null); 

        title = new JLabel("Prodaja leka");
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(300, 30); 
        title.setLocation(200, 30); 
        c.add(title); 
        
        lekKolicina = new JLabel("Sifra recepta"); 
        lekKolicina.setFont(new Font("Arial", Font.PLAIN, 20)); 
        lekKolicina.setSize(200, 20); 
        lekKolicina.setLocation(30, 100); 
        c.add(lekKolicina);
        
        Integer[] stringLekovi = new Integer[recepti.size()];
        for(int i=0;i<recepti.size();i++) {
        	stringLekovi[i] = recepti.get(i).getSifra();
        }
        
        comboBox = new JComboBox(stringLekovi);
        comboBox.setSize(200, 20); 
        comboBox.setLocation(250, 100);
        c.add(comboBox);
        
        kreiraj = new JButton("Prodaj");
        		
        kreiraj.setSize(150, 40); 
        kreiraj.setLocation(220, 150); 
        c.add(kreiraj);
  
        setVisible(true); 
	}

	public Container getC() {
		return c;
	}

	public void setC(Container c) {
		this.c = c;
	}

	public void setTitle(JLabel title) {
		this.title = title;
	}

	public JLabel getLekKolicina() {
		return lekKolicina;
	}

	public void setLekKolicina(JLabel lekKolicina) {
		this.lekKolicina = lekKolicina;
	}

	public JTextField getTkolicina() {
		return tkolicina;
	}

	public void setTkolicina(JTextField tkolicina) {
		this.tkolicina = tkolicina;
	}

	public JButton getKreiraj() {
		return kreiraj;
	}

	public void setKreiraj(JButton kreiraj) {
		this.kreiraj = kreiraj;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}
	
	

}
