package view;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JPanel;

import assay.SoldiersSpecialityAssay;
import model.Army;
import model.Battalion;
import model.Board;
import model.Coordinate;
import model.Speciality;
import model.Square;
import model.Type;
import view.info.ArmyInfo;
import view.info.FileInfo;
import view.info.MarketSoldierInfo;

public class Generator {

	public static ArrayList<SoldiersSpecialityAssay> getSpeciality(Type type, FocusAdapter focusAdapter) {
		ArrayList<SoldiersSpecialityAssay> panel = new ArrayList<SoldiersSpecialityAssay>();
		for (Speciality speciality : Arrays.asList(Speciality.values())) {
			if (speciality.getType() == type) {
				panel.add(new SoldiersSpecialityAssay(speciality, focusAdapter));
			}
		}
		return panel;
	}

	public static MarketSoldierInfo getMarketSoldierInfo(Battalion battalion) {
		return new MarketSoldierInfo(battalion);
	}

	public static ArmyInfo getArmyInfo(Army army) {
		return new ArmyInfo(army.getIdArmy(), army.getIdCurrentBattalion(), army.getInfantry(), army.getChivalry(),
				army.getArchery(), army.getTypeBattalion());
	}
	public static JPanel getFile(Board board, Coordinate coordinate) {
		FileInfo fileInfo= getFileInfo(board, coordinate);
		if (fileInfo==null) {
			return new WhiteFile();
		}else {
			return new File(fileInfo);
		}
		
	}

	private static FileInfo getFileInfo(Board board, Coordinate coordinate) {
		FileInfo fileInfo= null;
		Square square = board.getFile(coordinate);
		if (square!=null) {
			Battalion battalion = (Battalion) square;
			fileInfo= new FileInfo("/images/ligera.png", -1, battalion.getIdBattalion(), -1,
					-1, -1, -1, battalion.getMaxSoldiers(), false, Color.BLACK, Color.BLUE);
		}
		return fileInfo;
	}
}
