package cn.edu.zju.gislab.QDServices.service;


import cn.edu.zju.gislab.QDServices.po.ScsUsers;

import java.util.List;

public interface UserService {
	//登录验证
	int checkLogin(String username, String password);
	List<ScsUsers> getAllUsers();
	int updateUser(String username,String password,int groupId);
	int addUser(String username,String password,int groupId);
	int deleteUser(String username);
}
