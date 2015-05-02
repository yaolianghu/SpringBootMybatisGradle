package example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import example.Util.MyBatisUtil;
import example.entity.Village;

public class VillageDAOImpl implements IVillageDAO {

	public void insertVillage(Village v) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.insert("insertVillage", v);
		session.commit();
		session.close();
		
	}

	public List<Village> getVillages() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		List<Village> villages = session.selectList("selectAllVillage");
		return villages;
	}

	public boolean updateVillage(Village v) {
		// TODO Auto-generated method stub
		return false;
	}

	public Village getVillageById(int id) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Village v = session.selectOne("selectVillage", id);
		session.close();
		return v;
	}
}
