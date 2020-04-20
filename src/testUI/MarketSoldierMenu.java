package testUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import assay.MarketSoldiersAssay;
import view.info.MarketSoldierInfo;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MarketSoldierMenu extends JDialog {

	private JPanel contentPanel = new JPanel();
	private MarketSoldiersAssay marketFrame;
	
	public MarketSoldierMenu(MarketSoldierInfo info) {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		marketFrame = new MarketSoldiersAssay(info);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(marketFrame, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (isCorrectMaxSoldier()) {
							marketFrame.getListArmy();
							dispose();
						}
					}

				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	private boolean isCorrectMaxSoldier() {
		// TODO Auto-generated method stub
		return false;
	}
}
