package com.home_vedio_pro.service.vedio_type;

import com.home_vedio_pro.model.vedio_type.VedioTypeModel;

/**
 * 视频类型接口
 * @author wangB
 */
public interface VedioTypeService {

	/**
	 * 批量添加用户类型
	 * @param vedioTypeModel : 视频类型模型
	 * @return -1 : 参数异常 0 : 添加失败  1 : 添加成功  2 : 运行异常  
	 */
	public int addVedioType(VedioTypeModel vedioTypeModel);
}