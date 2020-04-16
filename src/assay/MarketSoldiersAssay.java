package assay;

import javax.swing.JPanel;

import model.Battalion;
import view.SpecialityGenerator;

import java.util.ArrayList;

import javax.swing.JLabel;

public class MarketSoldiersAssay extends JPanel {
	private ArrayList <SoldiersSpecialityAssay> specialitys = new ArrayList<SoldiersSpecialityAssay>();
	private final byte specialityNumber=2;
	private JLabel lblTotalNumber;
	private JLabel lblSoldiersType;
	private JLabel lblBattalionId;
	private JLabel lblMaxSoldiers;


	/**
	 * Create the panel.
	 */
	public MarketSoldiersAssay(Battalion battalion) {
		setLayout(null);
		specialitys=SpecialityGenerator.getSpeciality(battalion.getType());
		//Especialidades y numero de especialidades
//		for (int i = 0; i < specialityNumber; i++) {
//			specialitys.add(new SoldiersSpecialityAssay());
//		}
//		
		JLabel lblBattalionNumber = new JLabel("Battalion number:");
		lblBattalionNumber.setBounds(24, 57, 106, 14);
		add(lblBattalionNumber);
		
		lblBattalionId = new JLabel(String.valueOf(battalion.getIdBattalion()));
		lblBattalionId.setBounds(155, 57, 106, 14);
		add(lblBattalionId);
		
		JLabel lblMaxsoldados = new JLabel("Max: ");
		lblMaxsoldados.setBounds(325, 57, 55, 14);
		add(lblMaxsoldados);
		
		lblMaxSoldiers = new JLabel(String.valueOf(battalion.getMaxSoldiers()));
		lblMaxSoldiers.setBounds(377, 57, 48, 14);
		add(lblMaxSoldiers);
		
		JLabel lblType = new JLabel("Type: ");
		lblType.setBounds(24, 122, 36, 14);
		add(lblType);
		
		lblSoldiersType = new JLabel(String.valueOf(battalion.getType()));
		lblSoldiersType.setBounds(64, 122, 48, 14);
		add(lblSoldiersType);
		int y = 194, margin=30; 
		for (SoldiersSpecialityAssay soldiersSpecialityAssay : specialitys) {
			soldiersSpecialityAssay.setBounds(24, y, 348, 14);
			add(soldiersSpecialityAssay);
			y+=margin;
		}
		
		JLabel lblTotal = new JLabel("Total: ");
		lblTotal.setBounds(24, 321, 48, 14);
		add(lblTotal);
		
		lblTotalNumber = new JLabel("0");
		lblTotalNumber.setBounds(113, 321, 48, 14);
		add(lblTotalNumber);
		

	}
	public byte getSpecialityNumber() {
		return specialityNumber;
	}
	
	public JLabel getLblSoldiersType() {
		return lblSoldiersType;
	}
	
	public JLabel getLblBattalionId() {
		return lblBattalionId;
	}
	
	public JLabel getLblMaxSoldiers() {
		return lblMaxSoldiers;
	}
}
