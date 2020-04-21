package testUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import assay.MarketSoldiersAssay;
import control.PopulateControler;
import model.Battalion;
import view.Generator;
import view.info.MarketSoldierInfo;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MarketSoldierTest extends JFrame {

	private JPanel contentPane = new JPanel();
	private MarketSoldierMenu marketMenu;
	private Battalion battalion;
	private MarketSoldierInfo info;
	private PopulateControler populateControler;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MarketSoldierTest frame = new MarketSoldierTest();
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
	public MarketSoldierTest() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 498, 421);
		
		JButton btnPopulateBattalion = new JButton("Populate Battalion");
		battalion = new Battalion(23, model.Type.archery);
		info = Generator.getMarketSoldierInfo(battalion);
		marketMenu = new MarketSoldierMenu(info);
		btnPopulateBattalion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marketMenu.setVisible(true);
			}
		});
		getContentPane().add(btnPopulateBattalion, BorderLayout.CENTER);
		//Llamo al botón para darle una acción desde la prueba
		populateControler= new PopulateControler(battalion);
		getOkButton().addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				if (marketMenu.isCorrectMaxSoldier()) {
					populateControler.populateBattalion(marketMenu.getListArmy());
				}
				
//				dispose();
				
			}
		});
		
		JButton btnPlaceBattalion = new JButton("Place Battalion");
		btnPlaceBattalion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(btnPlaceBattalion, BorderLayout.EAST);
	}

	public JButton getOkButton() {
		return marketMenu.getOkButton();
	}
}
