package view;

import java.awt.Component;
import java.awt.Font;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


import view.info.ArmyInfo;
import net.miginfocom.swing.MigLayout;


public class ArmyMenu extends JPanel {
	private JLabel lblInfantry;
	private JLabel lblChivalry;
	private JLabel lblArchery;
	private JLabel lblCurrentBattalion;
	private JButton btnPopulate;
	private JButton btnLocate;
	private JLabel lblArmy;
	private JLabel lblCurrentBattalionId;

	/**
	 * Create the panel.
	 */
	public ArmyMenu() {
		setLayout(new MigLayout("", "[]", "[]"));
	}

	public void cargarEjercito(ArmyInfo armyInfo) {
		JLabel lblNewLabel = new JLabel("Ejercito");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblNewLabel, "cell 0 0 2 1,grow");

		lblArmy = new JLabel(String.valueOf(armyInfo.getIdArmy()));
		lblArmy.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblArmy, "cell 0 1 2 1,grow");

		JLabel lblNewLabel_9 = new JLabel("Unidades");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblNewLabel_9, "cell 0 5 2 1,growx,aligny top");

		JLabel lblNewLabel_1 = new JLabel("Infanteria:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblNewLabel_1, "cell 0 6");

		lblInfantry = new JLabel(String.valueOf(armyInfo.getInfantryQuantity()));
		lblInfantry.setHorizontalTextPosition(SwingConstants.CENTER);
		lblInfantry.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfantry.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblInfantry, "cell 1 6,growx");

		JLabel lblNewLabel_3 = new JLabel("Caballeria:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblNewLabel_3, "cell 0 7");

		lblChivalry = new JLabel(String.valueOf(armyInfo.getChivalryQuantity()));
		lblChivalry.setHorizontalAlignment(SwingConstants.CENTER);
		lblChivalry.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		add(lblChivalry, "cell 1 7,growx");
		JLabel lblNewLabel_4 = new JLabel("Arqueria:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblNewLabel_4, "cell 0 8");

		lblArchery = new JLabel(String.valueOf(armyInfo.getArcheryQuantity()));
		lblArchery.setHorizontalAlignment(SwingConstants.CENTER);
		lblArchery.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblArchery, "cell 1 8,growx");

		JLabel lblNewLabel_5 = new JLabel("Batallon actual:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblNewLabel_5, "cell 0 9");

		lblCurrentBattalionId = new JLabel(String.valueOf(armyInfo.getCurrentBattalion()));
		lblCurrentBattalionId.setHorizontalAlignment(SwingConstants.CENTER);
		lblCurrentBattalionId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblCurrentBattalionId, "cell 1 9,growx");

		JLabel lblNewLabel_7 = new JLabel("Tipo Actual");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblNewLabel_7, "cell 0 12 2 1,growx");

		lblCurrentBattalion = new JLabel(armyInfo.getCurrentType().toString());
		lblCurrentBattalion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lblCurrentBattalion, "cell 0 13");

		btnPopulate = new JButton("Poblar");

		btnPopulate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(btnPopulate, "cell 0 17 2 1,growx");

		btnLocate = new JButton("Localizar");

		btnLocate.setFont(new Font("Tahoma", Font.PLAIN, 16));

		add(btnLocate, "cell 0 19 2 1,growx");
		btnPopulate.setEnabled(true);
		btnLocate.setEnabled(false);
	}

	public void update(ArmyInfo armyInfo) {
		lblArmy.setText(String.valueOf(armyInfo.getIdArmy()));
		lblInfantry.setText(String.valueOf(armyInfo.getInfantryQuantity()));
		lblChivalry.setText(String.valueOf(armyInfo.getChivalryQuantity()));
		lblArchery.setText(String.valueOf(armyInfo.getArcheryQuantity()));
		lblCurrentBattalion.setText(armyInfo.getCurrentType().toString());
		lblCurrentBattalionId.setText(String.valueOf(armyInfo.getCurrentBattalion()));
	}

	public void setEnable(boolean enable) {
		for (Component component : Arrays.asList(getComponents())) {
			component.setEnabled(enable);
		}

	}

	public JButton getBtnPoblar() {
		return btnPopulate;
	}

	public JButton getBtnLocate() {
		return btnLocate;
	}

}
