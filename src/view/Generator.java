package view;

import java.awt.event.FocusAdapter;
import java.util.ArrayList;
import java.util.Arrays;

import assay.SoldiersSpecialityAssay;
import model.Battalion;
import model.Speciality;
import model.Type;
import view.info.MarketSoldierInfo;

public class Generator {

	

	public static ArrayList<SoldiersSpecialityAssay> getSpeciality(Type type, FocusAdapter focusAdapter) {
		ArrayList<SoldiersSpecialityAssay> panel= new ArrayList<SoldiersSpecialityAssay>();
		for (Speciality speciality : Arrays.asList(Speciality.values())) {
			if (speciality.getType()==type) {
				panel.add(new SoldiersSpecialityAssay(speciality, focusAdapter));
			}
		}
		return panel;
	}
	public static MarketSoldierInfo getMarketSoldierInfo(Battalion battalion) {
		return new MarketSoldierInfo(battalion);
	}
}
