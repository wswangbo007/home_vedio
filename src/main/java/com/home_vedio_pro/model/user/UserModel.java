package com.home_vedio_pro.model.user;

import java.io.Serializable;

/**
 * 用户模型
 * @author wangB
 */
public class UserModel implements Serializable {

	private static final long serialVersionUID = 1L;

	/**用户id*/
	private String user_id;
	
	/**用户名称*/
	private String user_name;
	
	/**用户密码*/
	private String user_password;
	
	/**用户邮箱*/
	private String user_email;
	
	/**用户描述id  1 : 超级管理员  2 : 普通用户*/
	private int home_vedio_dict_id;
	
	/**用户描述*/
	private String home_vedio_dict_value;
	
	/**创建时间*/
	private String create_date;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public int getHome_vedio_dict_id() {
		return home_vedio_dict_id;
	}

	public void setHome_vedio_dict_id(int home_vedio_dict_id) {
		this.home_vedio_dict_id = home_vedio_dict_id;
	}

	public String getHome_vedio_dict_value() {
		return home_vedio_dict_value;
	}

	public void setHome_vedio_dict_value(String home_vedio_dict_value) {
		this.home_vedio_dict_value = home_vedio_dict_value;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
}