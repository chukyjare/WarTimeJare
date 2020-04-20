package assay;

import javax.swing.JPanel;


import model.Battalion;
import view.SpecialityGenerator;
import view.info.MarketSoldierInfo;
import view.info.SpecificationSoldiersInfo;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JLabel;

public class MarketSoldiersAssay extends JPanel {
	private ArrayList <SoldiersSpecialityAssay> specialitys = new ArrayList<SoldiersSpecialityAssay>();
	private final byte specialityNumber=2;
	private JLabel lblTotalNumber;
	private JLabel lblSoldiersType;
	private JLabel lblBattalionId;
	private JLabel lblMaxSoldiers;
	int value=0;
	private FocusAdapter myFocus= new FocusAdapter() {
		@Override
		public void focusLost(FocusEvent e) {
			super.focusLost(e);
			lblTotalNumber.setText(String.valueOf(sumOfSpecialitiesTroops(value)));
		}
	};


	
	/**
	 * Create the panel.
	 */
	public MarketSoldiersAssay(MarketSoldierInfo info) {
		setLayout(null);
		specialitys=SpecialityGenerator.getSpeciality(info.getType(), myFocus);
		//Especialidades y numero de especialidades
//		for (int i = 0; i < specialityNumber; i++) {
//			specialitys.add(new SoldiersSpecialityAssay());
//		}
//		
		JLabel lblBattalionNumber = new JLabel("Battalion number:");
		lblBattalionNumber.setBounds(24, 57, 106, 14);
		add(lblBattalionNumber);
		
		lblBattalionId = new JLabel(String.valueOf(info.getId()));
		lblBattalionId.setBounds(155, 57, 106, 14);
		add(lblBattalionId);
		
		JLabel lblMaxsoldados = new JLabel("Max: ");
		lblMaxsoldados.setBounds(325, 57, 55, 14);
		add(lblMaxsoldados);
		
		lblMaxSoldiers = new JLabel(String.valueOf(info.getMaxSoldiers()));
		lblMaxSoldiers.setBounds(377, 57, 48, 14);
		add(lblMaxSoldiers);
		
		JLabel lblType = new JLabel("Type: ");
		lblType.setBounds(24, 122, 36, 14);
		add(lblType);
		
		lblSoldiersType = new JLabel(String.valueOf(info.getType()));
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
		int value=0;
		lblTotalNumber = new JLabel(String.valueOf(sumOfSpecialitiesTroops(value)));
		lblTotalNumber.setBounds(113, 321, 48, 14);
		add(lblTotalNumber);
		

	}
	private int sumOfSpecialitiesTroops(int value) {
		//acumulo el número de tropas en cada especialidad
		if (value>=0) {
			for (SoldiersSpecialityAssay soldiersSpecialityAssay : specialitys) {
				int quantitySpecility = Integer.parseInt(soldiersSpecialityAssay.getTxtQuantity().getText());
				value+=quantitySpecility;
			}	
		}
		return value;
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
	public LinkedList<SpecificationSoldiersInfo> getListBattalions() {
		LinkedList<SpecificationSoldiersInfo> response=new LinkedList<SpecificationSoldiersInfo>();
		for (SoldiersSpecialityAssay specialities : specialitys) {
			response.add(new SpecificationSoldiersInfo(String.valueOf(specialities.getLblSpeciality()), Integer.valueOf(specialities.Quantity())));
		}
		return response;
	}
}
