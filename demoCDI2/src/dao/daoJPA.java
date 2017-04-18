package dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import dao.NotificationTypeDao.TypeDao;

@NotificationTypeDao(TypeDao.JPA)
public class daoJPA implements IDao {

	
	@Override
	public String appelDao() {
		// TODO Auto-generated method stub
		return "Bonjour je suis bien dans la DAO JPA";
	}
	
	@PostConstruct
	public void logApresConstruction()
	{
		System.out.println("apres creation dao JPA");
	}

	@PreDestroy
	public void logAvantDestruction()
	{
		System.out.println("avant destruction dao JPA");
	}

}
