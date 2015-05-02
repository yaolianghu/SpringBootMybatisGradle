package example.dao;

import java.util.List;

import example.entity.Village;

public interface IVillageDAO {
	public void insertVillage(Village v);
	public List<Village> getVillages();
	public boolean updateVillage(Village v);
	public Village getVillageById(int id);
}
