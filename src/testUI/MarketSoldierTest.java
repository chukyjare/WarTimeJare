package testUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import assay.MarketSoldiersAssay;
import model.Battalion;
import view.info.MarketSoldierInfo;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MarketSoldierTest extends JFrame {

	private JPanel contentPane = new JPanel();
	private MarketSoldierMenu marketMenu;

	

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
		
		JButton btnBuyBattalion = new JButton("Buy Battalion");
		btnBuyBattalion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marketMenu = new MarketSoldierMenu(new MarketSoldierInfo(new Battalion(23, model.Type.archery)));
				marketMenu.setVisible(true);
			}
		});
		getContentPane().add(btnBuyBattalion, BorderLayout.CENTER);
		
		JButton btnPlaceBattalion = new JButton("Place Battalion");
		btnPlaceBattalion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		getContentPane().add(btnPlaceBattalion, BorderLayout.EAST);
	}

}
