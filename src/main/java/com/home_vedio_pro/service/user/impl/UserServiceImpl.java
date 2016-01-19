package com.home_vedio_pro.service.user.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.home_vedio_pro.dao.user.UserDao;
import com.home_vedio_pro.model.user.UserModel;
import com.home_vedio_pro.service.user.UserService;
import com.home_vedio_pro.util.constant.ConstantUtil;

/**
 * 用户登录模块实现
 * @author wangB
 */
@Service
public class UserServiceImpl implements UserService {
	
	/**用户DAO*/
	@Autowired
	private UserDao userDao;

	/**
	 * 根据用户对象获取是否存在
	 */
	@Override
	public int getUserByUserModel(UserModel userModel,HttpSession session) {
		int result = 0;
		if (null != userModel) {
			if (!StringUtils.isEmpty(userModel.getUser_name()) && !StringUtils.isEmpty(userModel.getUser_password())) {
				UserModel newUserModel = userDao.getUserModelByUser(userModel);
				if (null != newUserModel) {
					session.setAttribute(ConstantUtil.UserUtil.USER, newUserModel);
					if (newUserModel.getHome_vedio_dict_id() == ConstantUtil.UserUtil.ADMIN) {
						result = ConstantUtil.UserUtil.ADMIN;
					} else if (newUserModel.getHome_vedio_dict_id() == ConstantUtil.UserUtil.NORMAL){
						result = ConstantUtil.UserUtil.NORMAL;
					}
				} else {
					result = ConstantUtil.UserJspUtil.ERROR;
				}
			} else {
				result = ConstantUtil.UserJspUtil.EXCEPTION;
			}
		}
		return result;
	}

}