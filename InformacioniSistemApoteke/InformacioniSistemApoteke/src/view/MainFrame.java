package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.ActionManager;
import model.Korisnik;

public class MainFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static MainFrame instance = null;
	private ActionManager actionManager = new ActionManager();
	private JPanel centralni = new JPanel(new BorderLayout());
	private JButton pretragaLekoviBtn;
	private JButton pretragaReceptiBtn;
	private JButton registracija;
	private JButton prikazKorisnika;
	private JButton kreirajLek;
	private JButton prodajLek;
	private JButton izmeniLek;
	private JButton izbrisiLek;
	private JButton kreirajRecept;
	private JButton izbrisiRecept;
	private JButton prikaziTransakcije;
	private Korisnik user;
	
	public static MainFrame getInstance() {
		if (instance == null) {
			instance = new MainFrame();
			instance.getActionManager().initialize();
			instance.initialize();
		}
		return instance;

	}

	private void initialize() {

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setSize((int) (screenSize.width / 1.1), 600);
		setLocationRelativeTo(null);
		setTitle("InformacioniSistemApoteke");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		registracija = new JButton(MainFrame.getInstance().getActionManager().getRegisterUserController());
		registracija.setPreferredSize(new Dimension(150, 20));
		registracija.setName("Registracija");
		registracija.setText("Registracija");
		registracija.setEnabled(false);
		prikazKorisnika = new JButton(MainFrame.getInstance().getActionManager().getShowAllUsersController());
		prikazKorisnika.setPreferredSize(new Dimension(150, 20));
		prikazKorisnika.setName("Prikaz korisnika");
		prikazKorisnika.setText("Prikaz korisnika");
		prikazKorisnika.setEnabled(false);
		JButton lekoviBtn = new JButton(MainFrame.getInstance().getActionManager().getShowAllMedicamentsController());
		lekoviBtn.setPreferredSize(new Dimension(150, 20));
		lekoviBtn.setName("Prikaz lekova");
		lekoviBtn.setText("Prikaz lekova");
		JButton receptiBtn = new JButton(MainFrame.getInstance().getActionManager().getShowAllRecipesController());
		receptiBtn.setPreferredSize(new Dimension(150, 20));
		receptiBtn.setName("Prikaz recepata");
		receptiBtn.setText("Prikaz recepata");
		pretragaLekoviBtn = new JButton(MainFrame.getInstance().getActionManager().getSearchMedicamentsController());
		pretragaLekoviBtn.setPreferredSize(new Dimension(150, 20));
		pretragaLekoviBtn.setName("Pretraga lekova");
		pretragaLekoviBtn.setText("Pretraga lekova");
		pretragaLekoviBtn.setVisible(false);
		pretragaReceptiBtn = new JButton(MainFrame.getInstance().getActionManager().getSearchRecipesController());
		pretragaReceptiBtn.setPreferredSize(new Dimension(150, 20));
		pretragaReceptiBtn.setName("Pretraga recepata");
		pretragaReceptiBtn.setText("Pretraga recepata");
		pretragaReceptiBtn.setVisible(false);
		kreirajLek = new JButton(MainFrame.getInstance().getActionManager().getCreateMedicamentController());
		kreirajLek.setPreferredSize(new Dimension(150, 20));
		kreirajLek.setName("Kreiraj lek");
		kreirajLek.setText("Kreiraj lek");
		kreirajLek.setEnabled(false);
		prodajLek = new JButton(MainFrame.getInstance().getActionManager().getSellMedicament());
		prodajLek.setPreferredSize(new Dimension(150, 20));
		prodajLek.setName("Prodaj lek");
		prodajLek.setText("Prodaj lek");
		prodajLek.setEnabled(false);
		izmeniLek = new JButton(MainFrame.getInstance().getActionManager().getEditMedicamentController());
		izmeniLek.setPreferredSize(new Dimension(150, 20));
		izmeniLek.setName("Izmeni lek");
		izmeniLek.setText("Izmeni lek");
		izmeniLek.setEnabled(false);
		kreirajRecept = new JButton(MainFrame.getInstance().getActionManager().getCreateRecipeController());
		kreirajRecept.setPreferredSize(new Dimension(150, 20));
		kreirajRecept.setName("Kreiraj recept");
		kreirajRecept.setText("Kreiraj recept");
		kreirajRecept.setEnabled(false);
		izbrisiLek = new JButton(MainFrame.getInstance().getActionManager().getDeleteMedicamentController());
		izbrisiLek.setPreferredSize(new Dimension(150, 20));
		izbrisiLek.setName("Izbrisi lek");
		izbrisiLek.setText("Izbrisi lek");
		izbrisiLek.setEnabled(false);
		izbrisiRecept = new JButton(MainFrame.getInstance().getActionManager().getDeleteRecipeController());
		izbrisiRecept.setPreferredSize(new Dimension(150, 20));
		izbrisiRecept.setName("Izbrisi recept");
		izbrisiRecept.setText("Izbrisi recept");
		izbrisiRecept.setEnabled(false);
		prikaziTransakcije = new JButton(MainFrame.getInstance().getActionManager().getListTransactionsController());
		prikaziTransakcije.setPreferredSize(new Dimension(150, 20));
		prikaziTransakcije.setName("Izvestaj");
		prikaziTransakcije.setText("Izvestaj");
		prikaziTransakcije.setEnabled(false);
		
		JPanel panelGore = new JPanel(new BorderLayout());
		JPanel gornji = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel srednji = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel donji = new JPanel(new FlowLayout(FlowLayout.LEFT));
		gornji.add(registracija);
		gornji.add(prikazKorisnika);
		srednji.add(lekoviBtn);
		srednji.add(kreirajLek);
		srednji.add(izmeniLek);
		srednji.add(prodajLek);
		srednji.add(izbrisiLek);
		srednji.add(prikaziTransakcije);
		srednji.add(pretragaLekoviBtn);
		donji.add(receptiBtn);
		donji.add(kreirajRecept);
		donji.add(izbrisiRecept);
		donji.add(pretragaReceptiBtn);
		
		panelGore.add(gornji,BorderLayout.NORTH);
		panelGore.add(srednji,BorderLayout.CENTER);
		panelGore.add(donji,BorderLayout.SOUTH);
		
		add(panelGore, BorderLayout.NORTH);
		add(centralni, BorderLayout.CENTER);
	}
	
	public ActionManager getActionManager() {
		return actionManager;
	}

	public void setActionManager(ActionManager actionManager) {
		this.actionManager = actionManager;
	}

	public JPanel getCentralni() {
		return centralni;
	}

	public void setCentralni(JPanel centralni) {
		this.centralni = centralni;
	}

	public JButton getPretragaLekoviBtn() {
		return pretragaLekoviBtn;
	}

	public void setPretragaLekoviBtn(JButton pretragaLekoviBtn) {
		this.pretragaLekoviBtn = pretragaLekoviBtn;
	}

	public JButton getPretragaReceptiBtn() {
		return pretragaReceptiBtn;
	}

	public void setPretragaReceptiBtn(JButton pretragaReceptiBtn) {
		this.pretragaReceptiBtn = pretragaReceptiBtn;
	}

	public Korisnik getUser() {
		return user;
	}

	public void setUser(Korisnik user) {
		this.user = user;
	}

	public JButton getRegistracija() {
		return registracija;
	}

	public void setRegistracija(JButton registracija) {
		this.registracija = registracija;
	}

	public JButton getPrikazKorisnika() {
		return prikazKorisnika;
	}

	public void setPrikazKorisnika(JButton prikazKorisnika) {
		this.prikazKorisnika = prikazKorisnika;
	}

	public JButton getKreirajLek() {
		return kreirajLek;
	}

	public void setKreirajLek(JButton kreirajLek) {
		this.kreirajLek = kreirajLek;
	}

	public JButton getIzmeniLek() {
		return izmeniLek;
	}

	public void setIzmeniLek(JButton izmeniLek) {
		this.izmeniLek = izmeniLek;
	}

	public JButton getKreirajRecept() {
		return kreirajRecept;
	}

	public void setKreirajRecept(JButton kreirajRecept) {
		this.kreirajRecept = kreirajRecept;
	}

	public JButton getIzbrisiLek() {
		return izbrisiLek;
	}

	public void setIzbrisiLek(JButton izbrisiLek) {
		this.izbrisiLek = izbrisiLek;
	}

	public JButton getIzbrisiRecept() {
		return izbrisiRecept;
	}

	public void setIzbrisiRecept(JButton izbrisiRecept) {
		this.izbrisiRecept = izbrisiRecept;
	}

	public JButton getProdajLek() {
		return prodajLek;
	}

	public void setProdajLek(JButton prodajLek) {
		this.prodajLek = prodajLek;
	}

	public JButton getPrikaziTransakcije() {
		return prikaziTransakcije;
	}

	public void setPrikaziTransakcije(JButton prikaziTransakcije) {
		this.prikaziTransakcije = prikaziTransakcije;
	}
	
}