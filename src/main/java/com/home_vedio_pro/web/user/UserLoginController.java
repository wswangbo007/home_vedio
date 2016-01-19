package com.home_vedio_pro.web.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.home_vedio_pro.model.user.UserModel;
import com.home_vedio_pro.service.user.UserService;
import com.home_vedio_pro.util.constant.ConstantUtil;

/**
 * UserLoginController.java
 * 1.用户登录处理
 * @author wangB
 */
@Controller
@RequestMapping(value="user")
public class UserLoginController {
	
	/**
	 * 用户Service
	 */
	@Autowired
	private UserService userService;

	/**
	 * 游客登录 不对session验证
	 * @return
	 */
	@RequestMapping(value="touristLogin")
	public String touristLogin(HttpServletRequest request) {
		String result_jsp = "showVedio";
		HttpSession session = request.getSession();
		UserModel userModel = (UserModel) session.getAttribute(ConstantUtil.UserUtil.USER);
		if (null != userModel) {
			session.removeAttribute(ConstantUtil.UserUtil.USER);
		}
		return result_jsp;
	}
	
	/**
	 * 管理员登录
	 * @param request
	 * @param userModel user
	 * @return 跳转页面
	 */
	@RequestMapping(value="adminLogin")
	public String adminLogin(HttpServletRequest request,UserModel userModel) {
		HttpSession session = request.getSession();
		int result = userService.getUserByUserModel(userModel, session);
		String resultJsp = result == 0 ? "user/notUser" : result == 1 ? "user/adminManage" : result == 2 ? "/vedio/showVedio" : result == 3 ? "user/userError" : "index"; 
		return resultJsp;
	}
}
