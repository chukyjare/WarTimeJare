package assay;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Speciality;

public class SoldiersSpecialityAssay extends JPanel {
	private JTextField txtQuantity;
	private JLabel lblSpeciality;


	/**
	 * Create the panel.
	 */
	public SoldiersSpecialityAssay(Speciality speciality) {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JLabel lblSpecialityL = new JLabel("Speciality: ");
		add(lblSpecialityL);
		
		lblSpeciality = new JLabel(String.valueOf(speciality));
		add(lblSpeciality);
		
		JLabel lblQuantityL = new JLabel("     Quantity: ");
		add(lblQuantityL);
		
		txtQuantity = new JTextField();
		add(txtQuantity);
		txtQuantity.setColumns(10);

	}

	public JTextField getTxtQuantity() {
		return txtQuantity;
	}
	
	public JLabel getLblSpeciality() {
		return lblSpeciality;
	}
}
