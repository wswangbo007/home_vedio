package com.home_vedio_pro.util.constant;

/**
 * 常量接口
 * @author wangB
 */
public interface ConstantUtil {
	
	/**
	 * 用户相关的常量
	 * 
	 * @author wangB
	 *
	 */
	public interface UserUtil {
		
		/**
		 * session_user 常量
		 */
		static final String USER = "user";
		
		/**
		 * 超级用户
		 */
		static final int ADMIN = 1;
		
		/**
		 * 普通用户
		 */
		static final int NORMAL = 2;
		
	}
	
	/**
	 * 用户页面状态吗
	 * @author Administrator
	 *
	 */
	public interface UserJspUtil {
		
		/**
		 * 异常
		 */
		static final int EXCEPTION = 2;
		
		/**
		 * 验证成功
		 */
		static final int SUCCESS = 1;
		
		/**
		 * 验证失败
		 */
		static final int ERROR = 0;
	}
	
	/**
	 * 视频类型
	 * @author wangB
	 */
	public interface VedioTypeUtil {
		
		/**
		 * 视频类型标记
		 */
		static final int VEDIO_TYPE_FLAG = 2;
	}
}
