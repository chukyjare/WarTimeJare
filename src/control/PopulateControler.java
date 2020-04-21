package control;

import java.util.ArrayList;
import java.util.LinkedList;

import model.Battalion;
import model.Soldier;
import view.info.SpecificationSoldiersInfo;

public class PopulateControler {
	private Battalion battalion;

	public PopulateControler(Battalion battalion) {
		super();
		this.battalion = battalion;
	}

	public void populateBattalion(LinkedList<SpecificationSoldiersInfo> linkedList) {
		assert (linkedList != null) : "This specification is null";
		for (SpecificationSoldiersInfo specificationSoldiersInf : linkedList) {
			int quantity = specificationSoldiersInf.getQuantity();
			for (int i = 0; i < quantity; i++) {
				Soldier soldier = new Soldier(specificationSoldiersInf.getSpeciality());
				this.battalion.insertSoldier(soldier);

			}
		}
	}

	public Battalion getBattalion() {
		return battalion;
	}

	public void setBattalion(Battalion battalion) {
		this.battalion = battalion;
	}

}
