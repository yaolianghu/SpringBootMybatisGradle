package service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import example.entity.Village;
import example.service.IVillageService;
import example.service.VillageServiceImpl;

public class VillageServiceImplTest {

	IVillageService service = new VillageServiceImpl();
	
	@Test
	public void test() {
		Village v = new Village();
		v.setName("Burlington");
		v.setDistrict("Burlington,MA");
		
		service.insertVillage(v);
	}

	@Test
	public void testGet() {
		Village v = service.getVillageById(1);
		System.out.println("village id: " + v.getId() + " village name: " + v.getName() + " village district: " + v.getDistrict() );
	}
	
	@Test
	public void testGetAll() {
		List<Village> villages = service.getVillages();
		for(Village v : villages) {
			System.out.println("village id: " + v.getId() + " village name: " + v.getName() + " village district: " + v.getDistrict() );
		}
		
	}
}
