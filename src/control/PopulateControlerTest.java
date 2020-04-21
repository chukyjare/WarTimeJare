package control;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import model.Battalion;
import model.Speciality;
import model.Type;
import view.info.SpecificationSoldiersInfo;

class PopulateControlerTest {

	@Test
	void testPopulateBattalion() {
		Battalion battalion=new Battalion(2, Type.archery);
		PopulateControler controler= new PopulateControler(battalion);
		controler.setBattalion(battalion);
		Speciality specialitiesArray[]= {Speciality.arc, Speciality.crossbow};
		int halfMax=battalion.getMaxSoldiers()/2;
		LinkedList<SpecificationSoldiersInfo> list= new LinkedList<SpecificationSoldiersInfo>();
		for (int i = 0; i < specialitiesArray.length; i++) {
			list.add(new SpecificationSoldiersInfo(String.valueOf(specialitiesArray[i]), halfMax));
		}
		controler.populateBattalion(list);
		assertEquals(battalion.getMaxSoldiers(), controler.getBattalion().getSoldiersQuantity());
	}
	//Este test debe fallarme, y me falla usando programación defensiva
//	@Test
//	void testPopulateBattalionBad() {
//		Battalion battalion=new Battalion(2, Type.archery);
//		PopulateControler controler= new PopulateControler();
//		controler.setBattalion(battalion);
//		Speciality specialitiesArray[]= {Speciality.arc, Speciality.crossbow};
//		int halfMax=4;
//		ArrayList<SpecificationSoldiersInfo> list= new ArrayList<SpecificationSoldiersInfo>();
//		for (int i = 0; i < specialitiesArray.length; i++) {
//			list.add(new SpecificationSoldiersInfo(String.valueOf(specialitiesArray[i]), halfMax));
//		}
//		list.add(new SpecificationSoldiersInfo(String.valueOf(Speciality.lightArmor), 2));
//		controler.populateBattalion(list);
//		assertEquals(battalion.getMaxSoldiers(), controler.getBattalion().getSoldiersQuantity());
//	}
}
