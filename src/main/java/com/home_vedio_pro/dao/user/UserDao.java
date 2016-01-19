package com.home_vedio_pro.dao.user;

import org.springframework.stereotype.Repository;

import com.home_vedio_pro.model.user.UserModel;

/**
 * 用户DAO层
 * @author wangB
 */
@Repository
public interface UserDao {

	/**
	 * 根据用户名和密码查询当前用户
	 * @param userModel
	 * @return 用户对象
	 */
	UserModel getUserModelByUser(UserModel userModel);
	
}