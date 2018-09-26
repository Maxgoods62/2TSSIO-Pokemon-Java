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
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Pokemon;

import javax.swing.ListSelectionModel;

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
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBounds(127, 377, 89, 23);
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
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtPoids.setText("");
				txtEnergie.setText("");
				txtNom.setText("");
				
				comboBoxTypePoke.setSelectedIndex(-1);
			}
		});
		btnAnnuler.setBounds(21, 377, 89, 23);
		contentPane.add(btnAnnuler);
		
		txtnbNageoire = new JTextField();
		txtnbNageoire.setEnabled(false);
		txtnbNageoire.setBounds(146, 170, 100, 20);
		contentPane.add(txtnbNageoire);
		txtnbNageoire.setColumns(10);
		
		JLabel lblNombresNageoires = new JLabel("Nombres Nageoires :");
		lblNombresNageoires.setBounds(146, 145, 116, 14);
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
		txtTaille.setBounds(146, 226, 100, 20);
		contentPane.add(txtTaille);
		txtTaille.setColumns(10);
		
		JLabel lblTaille = new JLabel("Taille :");
		lblTaille.setVerticalAlignment(SwingConstants.TOP);
		lblTaille.setHorizontalAlignment(SwingConstants.LEFT);
		lblTaille.setBounds(146, 201, 100, 14);
		contentPane.add(lblTaille);
		
		txtNbBouledeFeu = new JTextField();
		txtNbBouledeFeu.setEnabled(false);
		txtNbBouledeFeu.setHorizontalAlignment(SwingConstants.LEFT);
		txtNbBouledeFeu.setBounds(294, 114, 100, 20);
		contentPane.add(txtNbBouledeFeu);
		txtNbBouledeFeu.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nb Boule de Feu :");
		lblNewLabel.setBounds(294, 89, 100, 14);
		contentPane.add(lblNewLabel);
		
		txtNbAiles = new JTextField();
		txtNbAiles.setEnabled(false);
		txtNbAiles.setBounds(294, 226, 100, 20);
		contentPane.add(txtNbAiles);
		txtNbAiles.setColumns(10);
		
		JLabel lblNbAiles = new JLabel("Nb Ailes :");
		lblNbAiles.setBounds(294, 201, 46, 14);
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
		lblVitesseSol.setBounds(427, 201, 100, 14);
		contentPane.add(lblVitesseSol);
		
		txtVitesseSol = new JTextField();
		txtVitesseSol.setEnabled(false);
		txtVitesseSol.setBounds(427, 226, 100, 20);
		contentPane.add(txtVitesseSol);
		txtVitesseSol.setColumns(10);
		
		JButton btnLister = new JButton("Lister");
		btnLister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FListePokemon frameListePokemon = new FListePokemon();
				frameListePokemon.setVisible(true);
			}
		});
		btnLister.setBounds(427, 377, 89, 23);
		contentPane.add(btnLister);
		
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float pPoids = Float.parseFloat(txtPoids.getText());
				float pEnergie = Float.parseFloat(txtEnergie.getText());
				String pNom = txtNom.getText();
				String pPokemonType = (String) comboBoxTypePoke.getSelectedItem();
				
				Pokemon pPokemon = null;
				
				if (pPokemonType.equals("Pokemon")) {
					 pPokemon = new Pokemon(pNom, pEnergie, pPoids);
					System.out.println(pPokemon.toString());
				} else if (pPokemonType.equals("Eau")) {
					System.out.println(pPokemonType);
				} else if (pPokemonType.equals("Feu")) {
					
				} else if (pPokemonType.equals("Insecte")) {
					
				}
				arrayListePokemon.add(pPokemon);
				
			}
			
		});
		
		comboBoxTypePoke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pPokemon = (String) comboBoxTypePoke.getSelectedItem();
				
				if (pPokemon.equals("Pokemon")) {
					txtnbNageoire.setEnabled(false);
					txtVitesseEau.setEnabled(false);
					txtTaille.setEnabled(false);
					txtNbAiles.setEnabled(false);
					txtNbBouledeFeu.setEnabled(false);
					txtPuissanceFeu.setEnabled(false);
					txtNbPattes.setEnabled(false);
					txtVitesseVol.setEnabled(false);
					txtVitesseSol.setEnabled(false);
				} else if (pPokemon.equals("Eau")) {
					txtnbNageoire.setEnabled(true);
					txtVitesseEau.setEnabled(true);
					txtTaille.setEnabled(false);
					txtNbAiles.setEnabled(false);
					txtNbBouledeFeu.setEnabled(false);
					txtPuissanceFeu.setEnabled(false);
					txtNbPattes.setEnabled(false);
					txtVitesseVol.setEnabled(false);
					txtVitesseSol.setEnabled(false);
				} else if (pPokemon.equals("Feu")) {
					txtnbNageoire.setEnabled(false);
					txtVitesseEau.setEnabled(false);
					txtTaille.setEnabled(true);
					txtNbAiles.setEnabled(true);
					txtNbBouledeFeu.setEnabled(true);
					txtPuissanceFeu.setEnabled(true);
					txtNbPattes.setEnabled(false);
					txtVitesseVol.setEnabled(false);
					txtVitesseSol.setEnabled(false);
				} else if (pPokemon.equals("Insecte")) {
					txtnbNageoire.setEnabled(false);
					txtVitesseEau.setEnabled(false);
					txtTaille.setEnabled(true);
					txtNbAiles.setEnabled(true);
					txtNbBouledeFeu.setEnabled(false);
					txtPuissanceFeu.setEnabled(false);
					txtNbPattes.setEnabled(true);
					txtVitesseVol.setEnabled(true);
					txtVitesseSol.setEnabled(true);
				}
			}
		});
		
	}
}
