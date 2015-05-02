package example.service;

import java.util.List;

import example.entity.Village;

public interface IVillageService {
	public void insertVillage(Village v);
	public List<Village> getVillages();
	public boolean updateVillage(Village v);
	public Village getVillageById(int id);
}
