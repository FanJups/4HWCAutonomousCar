package com.autonomouscar.view;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import com.autonomouscar.model.AutonomousCar;

public class DialogApresParcours extends JDialog {

	private DialogApresParcoursPanneauAxivIt container = new DialogApresParcoursPanneauAxivIt();

	private Font policeCalibriLight = new Font("Calibri Light", Font.BOLD, 30);

	private Font policeCalibri = new Font("Calibri", Font.BOLD, 30);

	private Font policeAgencyFB = new Font("Agency FB", Font.BOLD, 30);

	private Border whiteBorder = new LineBorder(Color.WHITE, 3);

	private Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

	public DialogApresParcours(JFrame parent, String title, boolean modal, AutonomousCar tondeuse)

	{
		super(parent, title, modal);

		this.setSize(1000, 600);

		this.setLocationRelativeTo(null);

		this.setResizable(false);

		//////////////////////////////////////////////////////////////////

		container.add(affichageFinale(tondeuse));

		this.setContentPane(container);

		this.setVisible(true);

		/////////////////////////////////////////////////////////////////
	}

	private JPanel affichageFinale(AutonomousCar tondeuse)

	{

		// Découpage de content en 9 cellules , 4 lignes et 3 colonnes :
		// GridBagLayout

		// Conteneur principal (au dessus de l'image de fond)

		// Création des 12 cellules

		JPanel cell1_1 = new JPanel();
		cell1_1.setPreferredSize(new Dimension(330, 50));
		cell1_1.setOpaque(false);

		JPanel cell1_2 = new JPanel();
		cell1_2.setPreferredSize(new Dimension(330, 50));
		cell1_2.setOpaque(false);

		JPanel cell1_3 = new JPanel();
		cell1_3.setPreferredSize(new Dimension(330, 50));
		cell1_3.setOpaque(false);

		JPanel cell1 = new JPanel();
		cell1.setPreferredSize(new Dimension(330, 150));
		cell1.setOpaque(false);

		cell1.setLayout(new GridBagLayout());

		GridBagConstraints gbc1 = new GridBagConstraints();

		gbc1.gridx = 0;

		gbc1.gridy = 0;

		gbc1.gridheight = 1;

		gbc1.gridwidth = 1;

		cell1.add(cell1_1, gbc1);

		gbc1.gridy = 1;

		cell1.add(cell1_2, gbc1);

		gbc1.gridy = 2;

		cell1.add(cell1_3, gbc1);

		// X TF

		JLabel jlXTF = new JLabel("X finale : " + tondeuse.getXTondeuseFinale());

		jlXTF.setPreferredSize(new Dimension(330, 40));

		jlXTF.setFont(policeCalibriLight);

		jlXTF.setForeground(Color.WHITE);

		jlXTF.setBorder(whiteBorder);

		cell1_2.setLayout(new FlowLayout());

		cell1_2.add(jlXTF);

		JPanel cell2 = new JPanel();
		cell2.setPreferredSize(new Dimension(330, 150));
		// cell2.setBackground(Color.WHITE);

		cell2.setOpaque(false);

		cell2.setLayout(new GridBagLayout());

		JPanel cell3_1 = new JPanel();
		cell3_1.setPreferredSize(new Dimension(330, 50));
		cell3_1.setOpaque(false);

		JPanel cell3_2 = new JPanel();
		cell3_2.setPreferredSize(new Dimension(330, 50));
		cell3_2.setOpaque(false);

		JPanel cell3_3 = new JPanel();
		cell3_3.setPreferredSize(new Dimension(330, 50));
		cell3_3.setOpaque(false);

		JPanel cell3 = new JPanel();
		cell3.setPreferredSize(new Dimension(330, 150));
		cell3.setOpaque(false);

		cell3.setLayout(new GridBagLayout());

		GridBagConstraints gbc3 = new GridBagConstraints();

		gbc3.gridx = 0;

		gbc3.gridy = 0;

		gbc3.gridheight = 1;

		gbc3.gridwidth = 1;

		cell3.add(cell3_1, gbc3);

		gbc3.gridy = 1;

		cell3.add(cell3_2, gbc3);

		gbc3.gridy = 2;

		cell3.add(cell3_3, gbc3);

		// Y TF

		JLabel jlYTF = new JLabel("Y Finale : " + tondeuse.getYTondeuseFinale());

		jlYTF.setPreferredSize(new Dimension(330, 40));

		jlYTF.setFont(policeCalibriLight);

		jlYTF.setForeground(Color.WHITE);

		jlYTF.setBorder(whiteBorder);

		cell3_2.setLayout(new FlowLayout());

		cell3_2.add(jlYTF);

		JPanel cell4_1 = new JPanel();
		cell4_1.setPreferredSize(new Dimension(330, 50));
		cell4_1.setOpaque(false);

		JPanel cell4_2 = new JPanel();
		cell4_2.setPreferredSize(new Dimension(330, 50));
		cell4_2.setOpaque(false);

		JPanel cell4_3 = new JPanel();
		cell4_3.setPreferredSize(new Dimension(330, 50));
		cell4_3.setOpaque(false);

		JPanel cell4 = new JPanel();
		cell4.setPreferredSize(new Dimension(330, 150));
		cell4.setOpaque(false);

		cell4.setLayout(new GridBagLayout());

		GridBagConstraints gbc4 = new GridBagConstraints();

		gbc4.gridx = 0;

		gbc4.gridy = 0;

		gbc4.gridheight = 1;

		gbc4.gridwidth = 1;

		cell4.add(cell4_1, gbc4);

		gbc4.gridy = 1;

		cell4.add(cell4_2, gbc4);

		gbc4.gridy = 2;

		cell4.add(cell4_3, gbc4);

		// Orientation finale

		JLabel jlOF = new JLabel("Orientation finale : " + tondeuse.getOrientationTondeuseFinale());

		jlOF.setPreferredSize(new Dimension(330, 40));

		jlOF.setFont(policeCalibriLight);

		jlOF.setForeground(Color.WHITE);

		jlOF.setBorder(whiteBorder);

		cell4_2.setLayout(new FlowLayout());

		cell4_2.add(jlOF);

		JPanel cell5 = new JPanel();
		cell5.setPreferredSize(new Dimension(330, 150));

		cell5.setOpaque(false);

		cell5.setLayout(new FlowLayout());

		JPanel cell6_1 = new JPanel();
		cell6_1.setPreferredSize(new Dimension(330, 50));
		cell6_1.setOpaque(false);

		JPanel cell6_2 = new JPanel();
		cell6_2.setPreferredSize(new Dimension(330, 50));
		cell6_2.setOpaque(false);

		JPanel cell6_3 = new JPanel();
		cell6_3.setPreferredSize(new Dimension(330, 50));
		cell6_3.setOpaque(false);

		JPanel cell6 = new JPanel();
		cell6.setPreferredSize(new Dimension(330, 150));
		cell6.setOpaque(false);

		cell6.setLayout(new GridBagLayout());

		GridBagConstraints gbc6 = new GridBagConstraints();

		gbc6.gridx = 0;

		gbc6.gridy = 0;

		gbc6.gridheight = 1;

		gbc6.gridwidth = 1;

		cell6.add(cell6_1, gbc6);

		gbc6.gridy = 1;

		cell6.add(cell6_2, gbc6);

		gbc6.gridy = 2;

		cell6.add(cell6_3, gbc6);

		// CHRONO

		JLabel jlChrono = new JLabel(tondeuse.getChronoFinale() + " ns");

		jlChrono.setPreferredSize(new Dimension(330, 40));

		jlChrono.setFont(policeCalibriLight);

		jlChrono.setForeground(Color.WHITE);

		jlChrono.setBorder(whiteBorder);

		cell6_2.setLayout(new FlowLayout());

		cell6_2.add(jlChrono);

		JPanel cell7 = new JPanel();
		cell7.setPreferredSize(new Dimension(990, 150));
		cell7.setOpaque(false);

		cell7.setLayout(new GridBagLayout());

		JPanel cell8 = new JPanel();
		cell8.setPreferredSize(new Dimension(330, 150));

		cell8.setOpaque(false);

		JPanel cell9 = new JPanel();
		cell9.setPreferredSize(new Dimension(330, 150));
		cell9.setOpaque(false);

		cell9.setLayout(new GridBagLayout());

		JPanel cell10 = new JPanel();
		cell10.setPreferredSize(new Dimension(330, 150));

		cell10.setOpaque(false);

		////////////////////////////////////////

		JPanel content = new JPanel();

		content.setPreferredSize(new Dimension(990, 600));

		content.setOpaque(false);

		content.setLayout(new GridBagLayout());

		////////////////////////////////////////

		// Objet servant à positionner les composants

		GridBagConstraints gbc = new GridBagConstraints();

		// Position de la case de départ du composant

		gbc.gridx = 0;
		gbc.gridy = 0;

		// Taille en hauteur et largeur

		gbc.gridheight = 1;
		gbc.gridwidth = 1;

		content.add(cell1, gbc);

		gbc.gridx = 1;
		content.add(cell2, gbc);

		// Fin de ligne

		gbc.gridwidth = GridBagConstraints.REMAINDER;

		gbc.gridx = 2;
		content.add(cell3, gbc);

		// -----------------------

		// ligne suivante 2e ligne

		gbc.gridx = 0;
		gbc.gridy = 1;

		// Taille en hauteur et largeur

		gbc.gridheight = 1;
		gbc.gridwidth = 1;

		content.add(cell4, gbc);

		gbc.gridx = 1;
		content.add(cell5, gbc);

		// Fin de ligne

		gbc.gridwidth = GridBagConstraints.REMAINDER;

		gbc.gridx = 2;
		content.add(cell6, gbc);

		// -----------------------

		// ligne suivante 3e ligne

		gbc.gridx = 0;
		gbc.gridy = 2;

		gbc.gridheight = 1;

		gbc.fill = GridBagConstraints.HORIZONTAL;

		gbc.gridwidth = GridBagConstraints.REMAINDER;
		content.add(cell7, gbc);

		// -----------------------

		// ligne suivante 4e ligne

		gbc.gridx = 0;
		gbc.gridy = 3;

		gbc.gridheight = 1;
		gbc.gridwidth = 1;

		content.add(cell8, gbc);

		gbc.gridx = 1;
		content.add(cell9, gbc);

		// Fin de ligne

		gbc.gridwidth = GridBagConstraints.REMAINDER;

		gbc.gridx = 2;
		content.add(cell10, gbc);

		// -----------------------

		// FIN

		return content;
	}

}
