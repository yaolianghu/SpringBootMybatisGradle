package example.service;

import java.util.List;

import example.dao.IVillageDAO;
import example.dao.VillageDAOImpl;
import example.entity.Village;

public class VillageServiceImpl implements IVillageService {
	IVillageDAO dao = new VillageDAOImpl();

	public void insertVillage(Village v) {
		dao.insertVillage(v);
	}

	public List<Village> getVillages() {
		return dao.getVillages();
	}

	public boolean updateVillage(Village v) {
		// TODO Auto-generated method stub
		return false;
	}

	public Village getVillageById(int id) {
		return dao.getVillageById(id);
	}
	
	

}
