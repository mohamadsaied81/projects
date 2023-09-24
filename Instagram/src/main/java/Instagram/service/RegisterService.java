package Instagram.service;

import Instagram.Dto.RegisterDto;
import Instagram.dao.RegisterDao;
import Instagram.models.User;

public class RegisterService {

	User user=new User();
private RegisterDto registerDto;

private RegisterDao registerDao;

public RegisterDao getRegisterDao() {
	return registerDao;
}

public void setRegisterDao(RegisterDao registerDao) {
	this.registerDao = registerDao;
}

public RegisterService(RegisterDto registerDto) {
	
	this.registerDto = registerDto;
	if(registerDto.getPassword().equals(registerDto.getConfirmPassword()))
	{
		
		convertEntity();
		registerDao.register(user);}
}
private void convertEntity() {
user.setFirstName(registerDto.getFirstName());
user.setLastname(registerDto.getLastName());
user.setEmail(registerDto.getEmail());
user.setPassword(registerDto.getPassword());
}

}
