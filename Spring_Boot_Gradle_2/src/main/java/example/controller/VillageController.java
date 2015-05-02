package example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.entity.Village;
import example.service.IVillageService;
import example.service.VillageServiceImpl;

@RestController
public class VillageController {
	IVillageService service = new VillageServiceImpl();
	
	@RequestMapping("/getVillages") 
	public List<Village> getVillages() {
		List<Village> villages = service.getVillages();
		return villages;
	}
}
