package assay;

import javax.swing.JPanel;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeListenerProxy;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Speciality;

public class SoldiersSpecialityAssay extends JPanel {
	private JTextField txtQuantity;
	private JLabel lblSpeciality;
	private FocusAdapter focusAdapter;

	/**
	 * Create the panel.
	 */
	public SoldiersSpecialityAssay(Speciality speciality, FocusAdapter focusAdapter) {
		this.focusAdapter=focusAdapter;
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JLabel lblSpecialityL = new JLabel("Speciality: ");
		add(lblSpecialityL);
		
		lblSpeciality = new JLabel(String.valueOf(speciality));
		add(lblSpeciality);
		
		JLabel lblQuantityL = new JLabel("     Quantity: ");
		add(lblQuantityL);
		
		txtQuantity = new JTextField("0");
		txtQuantity.addFocusListener(this.focusAdapter);
		txtQuantity.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked (MouseEvent e) {
				txtQuantity.setText("");
			}
		});
		add(txtQuantity);
		txtQuantity.setColumns(10);
		

	}

	public JTextField getTxtQuantity() {
		return txtQuantity;
	}
	
	public String Quantity() {
		return txtQuantity.getText().toString();
	}
	
	public JLabel getLblSpeciality() {
		return lblSpeciality;
	}
	

}
