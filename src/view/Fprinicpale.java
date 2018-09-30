package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Pokemon;
import model.PokemonFeu;
import model.PokemonInsecte;
import model.PokemonMer;

import javax.swing.ListSelectionModel;
import javax.swing.JList;

public class Fprinicpale extends JFrame {

	private JPanel contentPane;
	private JTextField txtNom;
	private JTextField txtEnergie;
	private JTextField txtPoids;
	private JTextField txtnbNageoire;
	private JTextField txtVitesseEau;
	private JTextField txtTaille;
	private JTextField txtNbBouledeFeu;
	private JTextField txtNbAiles;
	private JTextField txtPuissanceFeu;
	private JTextField txtNbPattes;
	private JTextField txtVitesseVol;
	private JTextField txtVitesseSol;
	public ArrayList<Pokemon> arrayListePokemon = new ArrayList<Pokemon>();
	public DefaultListModel model = new DefaultListModel();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fprinicpale frame = new Fprinicpale();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fprinicpale() {
		setTitle("Cr\u00E9ation de PokePoke");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(21, 291, 89, 23);
		contentPane.add(btnAjouter);
		
		txtNom = new JTextField();
		txtNom.setBounds(10, 58, 100, 20);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		JLabel lblNomPokemon = new JLabel("Nom Pokemon :");
		lblNomPokemon.setBounds(10, 33, 100, 14);
		contentPane.add(lblNomPokemon);
		
		JComboBox comboBoxTypePoke = new JComboBox();
		comboBoxTypePoke.setModel(new DefaultComboBoxModel(new String[] {"Pokemon", "Feu", "Eau", "Insecte"}));
		comboBoxTypePoke.setBounds(146, 58, 100, 20);
		contentPane.add(comboBoxTypePoke);
		
		JLabel lblTypePokemon = new JLabel("Type Pokemon :");
		lblTypePokemon.setBounds(146, 33, 100, 14);
		contentPane.add(lblTypePokemon);
		
		JLabel lblEnergie = new JLabel("Energie :");
		lblEnergie.setBounds(427, 33, 100, 14);
		contentPane.add(lblEnergie);
		
		txtEnergie = new JTextField();
		txtEnergie.setBounds(427, 58, 100, 20);
		contentPane.add(txtEnergie);
		txtEnergie.setColumns(10);
		
		JLabel lblPoids = new JLabel("Poids :");
		lblPoids.setBounds(294, 33, 100, 14);
		contentPane.add(lblPoids);
		
		txtPoids = new JTextField();
		txtPoids.setBounds(294, 58, 100, 20);
		contentPane.add(txtPoids);
		txtPoids.setColumns(10);
	
		
		txtnbNageoire = new JTextField();
		txtnbNageoire.setEnabled(false);
		txtnbNageoire.setBounds(146, 170, 100, 20);
		contentPane.add(txtnbNageoire);
		txtnbNageoire.setColumns(10);
		
		JLabel lblNombresNageoires = new JLabel("Nombres Nageoires :");
		lblNombresNageoires.setBounds(146, 145, 138, 14);
		contentPane.add(lblNombresNageoires);
		
		txtVitesseEau = new JTextField();
		txtVitesseEau.setEnabled(false);
		txtVitesseEau.setBounds(146, 114, 100, 20);
		contentPane.add(txtVitesseEau);
		txtVitesseEau.setColumns(10);
		
		JLabel lblVitesseEau = new JLabel("Vitesse Eau :");
		lblVitesseEau.setBounds(146, 89, 100, 14);
		contentPane.add(lblVitesseEau);
		
		txtTaille = new JTextField();
		txtTaille.setEnabled(false);
		txtTaille.setBounds(10, 114, 100, 20);
		contentPane.add(txtTaille);
		txtTaille.setColumns(10);
		
		JLabel lblTaille = new JLabel("Taille :");
		lblTaille.setVerticalAlignment(SwingConstants.TOP);
		lblTaille.setHorizontalAlignment(SwingConstants.LEFT);
		lblTaille.setBounds(10, 89, 100, 14);
		contentPane.add(lblTaille);
		
		txtNbBouledeFeu = new JTextField();
		txtNbBouledeFeu.setEnabled(false);
		txtNbBouledeFeu.setHorizontalAlignment(SwingConstants.LEFT);
		txtNbBouledeFeu.setBounds(294, 114, 100, 20);
		contentPane.add(txtNbBouledeFeu);
		txtNbBouledeFeu.setColumns(10);
		
		JLabel lblNbBoulesDeFeu = new JLabel("Nb Boule de Feu :");
		lblNbBoulesDeFeu.setBounds(294, 89, 100, 14);
		contentPane.add(lblNbBoulesDeFeu);
		
		txtNbAiles = new JTextField();
		txtNbAiles.setEnabled(false);
		txtNbAiles.setBounds(10, 170, 100, 20);
		contentPane.add(txtNbAiles);
		txtNbAiles.setColumns(10);
		
		JLabel lblNbAiles = new JLabel("Nb Ailes :");
		lblNbAiles.setBounds(10, 145, 100, 14);
		contentPane.add(lblNbAiles);
		
		txtPuissanceFeu = new JTextField();
		txtPuissanceFeu.setEnabled(false);
		txtPuissanceFeu.setBounds(294, 170, 100, 20);
		contentPane.add(txtPuissanceFeu);
		txtPuissanceFeu.setColumns(10);
		
		JLabel lblPuissanceFeu = new JLabel("Puissance Feu :");
		lblPuissanceFeu.setBounds(294, 145, 100, 14);
		contentPane.add(lblPuissanceFeu);
		
		JLabel lblNbPattes = new JLabel("Nb Pattes :");
		lblNbPattes.setBounds(427, 89, 100, 14);
		contentPane.add(lblNbPattes);
		
		txtNbPattes = new JTextField();
		txtNbPattes.setEnabled(false);
		txtNbPattes.setBounds(427, 114, 100, 20);
		contentPane.add(txtNbPattes);
		txtNbPattes.setColumns(10);
		
		JLabel lblVitesseVol = new JLabel("Vitesse Vol :");
		lblVitesseVol.setBounds(427, 145, 100, 14);
		contentPane.add(lblVitesseVol);
		
		txtVitesseVol = new JTextField();
		txtVitesseVol.setEnabled(false);
		txtVitesseVol.setBounds(427, 170, 100, 20);
		contentPane.add(txtVitesseVol);
		txtVitesseVol.setColumns(10);
		
		JLabel lblVitesseSol = new JLabel("Vitesse Sol :");
		lblVitesseSol.setBounds(554, 89, 100, 14);
		contentPane.add(lblVitesseSol);
		
		txtVitesseSol = new JTextField();
		txtVitesseSol.setEnabled(false);
		txtVitesseSol.setBounds(554, 114, 100, 20);
		contentPane.add(txtVitesseSol);
		txtVitesseSol.setColumns(10);
		
		List<List> listGroupGeneral = new ArrayList<List>();
		
		List<JComponent> listGroupEau = new ArrayList<JComponent>();
		List<JComponent> listGroupFeu = new ArrayList<JComponent>();
		List<JComponent> listGroupInsecte = new ArrayList<JComponent>();
		
		listGroupEau.add(txtnbNageoire);
		listGroupEau.add(txtVitesseEau);
		listGroupEau.add(lblNombresNageoires);
		listGroupEau.add(lblVitesseEau);
		
		listGroupFeu.add(txtTaille);
		listGroupFeu.add(lblTaille);
		listGroupFeu.add(lblNbAiles);
		listGroupFeu.add(txtNbAiles);
		listGroupFeu.add(lblNbBoulesDeFeu);
		listGroupFeu.add(txtNbBouledeFeu);
		listGroupFeu.add(txtPuissanceFeu);
		listGroupFeu.add(lblPuissanceFeu);
		
		listGroupInsecte.add(txtTaille);
		listGroupInsecte.add(txtNbAiles);
		listGroupInsecte.add(txtNbPattes);
		listGroupInsecte.add(txtVitesseVol);
		listGroupInsecte.add(txtVitesseSol);
		listGroupInsecte.add(lblTaille);
		listGroupInsecte.add(lblNbAiles);
		listGroupInsecte.add(lblNbPattes);
		listGroupInsecte.add(lblVitesseVol);
		listGroupInsecte.add(lblVitesseSol);
		
		listGroupGeneral.add(listGroupEau);
		listGroupGeneral.add(listGroupFeu);
		listGroupGeneral.add(listGroupInsecte);
		
		for(List<JComponent> pListe : listGroupGeneral){
			for(JComponent pGroup : pListe){
				pGroup.setVisible(false);
				pGroup.setEnabled(false);
			}
		}
		
		
		JButton btnLister = new JButton("Lister (autre fenetre)");
		btnLister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FListePokemon frameListePokemon = new FListePokemon(model);
				frameListePokemon.setVisible(true);
			}
		});
		btnLister.setBounds(520, 403, 134, 23);
		contentPane.add(btnLister);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setBounds(520, 477, 134, 23);
		contentPane.add(btnQuitter);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBounds(21, 424, 89, 23);
		contentPane.add(btnSupprimer);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setBounds(21, 359, 89, 23);
		contentPane.add(btnModifier);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtPoids.setText("");
				txtEnergie.setText("");
				txtNom.setText("");
				txtTaille.setText("");
				txtVitesseVol.setText("");
				txtVitesseSol.setText("");
				txtVitesseEau.setText("");
				txtPuissanceFeu.setText("");
				txtNbAiles.setText("");
				txtNbPattes.setText("");
				txtnbNageoire.setText("");
				txtNbBouledeFeu.setText("");
				
				comboBoxTypePoke.setSelectedIndex(0);
			}
		});
		btnAnnuler.setBounds(270, 228, 89, 23);
		contentPane.add(btnAnnuler);
		
		
		JList list = new JList(model);
		list.setBounds(146, 262, 350, 238);
		contentPane.add(list);
		
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String pNom = txtNom.getText();
				String pPokemonType = (String)comboBoxTypePoke.getSelectedItem();	
				
				double pPoids = ParseDouble(txtPoids.getText());
				double pEnergie = ParseDouble(txtEnergie.getText());
				double pTaille = ParseDouble(txtTaille.getText());
				double pVitesseVol = ParseDouble(txtVitesseVol.getText());
				double pVitesseSol = ParseDouble(txtVitesseSol.getText());
				double pVitesseEau = ParseDouble(txtVitesseEau.getText());
				double pPuissanceFeu = ParseDouble(txtPuissanceFeu.getText());
				
				int pNbAiles = ParseInt(txtNbAiles.getText());
				int pNbPattes = ParseInt(txtNbPattes.getText());
				int pNbNageoire = ParseInt(txtnbNageoire.getText());
				int pNbBouledeFeu = ParseInt(txtNbBouledeFeu.getText());
				

				Pokemon pPokemon = null;
				if (pNom != "" & pPokemonType != "" & pPoids != -2.0 & pEnergie != -2.0) {
					if (pPokemonType == "Pokemon") {
						 pPokemon = new Pokemon(pNom, pEnergie, pPoids);
						 System.out.println(pPokemonType);
					} else if (pPokemonType.equals("Eau")) {
						 pPokemon = new PokemonMer(pNom, pEnergie, pPoids, pNbNageoire, pVitesseEau);
					} else if (pPokemonType.equals("Feu")) {
						 pPokemon = new PokemonFeu(pNom, pEnergie, pPoids, pNbAiles, pTaille, pNbBouledeFeu, pPuissanceFeu);
					} else if (pPokemonType.equals("Insecte")) {
						 pPokemon = new PokemonInsecte(pNom, pEnergie, pPoids, pNbAiles, pNbPattes, pTaille, pVitesseVol, pVitesseSol);
					} 
					//arrayListePokemon.add(pPokemon);
					model.addElement(pPokemon);
				}
				
			
			}
			
		});
		
		comboBoxTypePoke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pPokemon = (String) comboBoxTypePoke.getSelectedItem();
				
				if (pPokemon.equals("Pokemon")) {
					for(List<JComponent> pListe : listGroupGeneral){
						for(JComponent pGroup : pListe){
							pGroup.setVisible(false);
							pGroup.setEnabled(false);
						}
					}
					
				} else if (pPokemon.equals("Eau")) {
					
					for(JComponent c : listGroupFeu){
					    c.setVisible(false);
					    c.setEnabled(false);
					}
					for(JComponent c : listGroupInsecte){
					    c.setVisible(false);
					    c.setEnabled(false);
					}
					for(JComponent c : listGroupEau){
					    c.setVisible(true);
					    c.setEnabled(true);
					}
					
				} else if (pPokemon.equals("Feu")) {
					for(JComponent c : listGroupEau){
					    c.setVisible(false);
					    c.setEnabled(false);
					}
					for(JComponent c : listGroupInsecte){
					    c.setVisible(false);
					    c.setEnabled(false);
					}
					for(JComponent c : listGroupFeu){
					    c.setVisible(true);
					    c.setEnabled(true);
					}
					
				} else if (pPokemon.equals("Insecte")) {
					for(JComponent c : listGroupFeu){
					    c.setVisible(false);
					    c.setEnabled(false);
					}
					for(JComponent c : listGroupEau){
					    c.setVisible(false);
					    c.setEnabled(false);
					}
					for(JComponent c : listGroupInsecte){
					    c.setVisible(true);
					    c.setEnabled(true);
					}
				}
			}
		});
		
	
	}
	
	double ParseDouble(String strNumber) {
		   if (strNumber != null && strNumber.length() > 0) {
		       try {
		          return Double.parseDouble(strNumber);
		       } catch(Exception e) {
		          return -1.0;   
		       }
		   }
		   else {
			   return -2.0;
		   }
	}
	
	int ParseInt(String strNumber) {
		   if (strNumber != null && strNumber.length() > 0) {
		       try {
		          return Integer.parseInt(strNumber);
		       } catch(Exception e) {
		          return -1;  
		       }
		   }
		   else {
			   return -2;
		   }
	}
}
