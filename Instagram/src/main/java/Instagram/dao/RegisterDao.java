package Instagram.dao;



import org.springframework.orm.hibernate5.HibernateTemplate;

import Instagram.models.User;

public class RegisterDao {
private HibernateTemplate hibernateTemplate;

public HibernateTemplate getHibernateTemplate() {
	return hibernateTemplate;
}

public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	this.hibernateTemplate = hibernateTemplate;
}

public void register(User user)
{
	hibernateTemplate.save(user);	
}
}
