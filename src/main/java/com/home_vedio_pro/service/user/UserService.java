package com.home_vedio_pro.service.user;

import javax.servlet.http.HttpSession;

import com.home_vedio_pro.model.user.UserModel;


/**
 * 用户service
 * @author wangB
 */
public interface UserService {

	/**
	 * 根据用户对象获取是否存在
	 * @param userModel
	 * @param session
	 * @return 0 : 不存在<br>
	 * 1 : 超级用户<br>
	 * 2 : 普通用户<br>
	 * 3 : 用户对象存在异常
	 */
	public int getUserByUserModel(UserModel userModel,HttpSession session);
	
}