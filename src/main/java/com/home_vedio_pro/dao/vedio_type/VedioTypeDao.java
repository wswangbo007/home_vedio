package com.home_vedio_pro.dao.vedio_type;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.home_vedio_pro.model.vedio_type.VedioTypeModel;

/**
 * 用户视频DAO
 * @author wangB
 */
@Repository
public interface VedioTypeDao {
	
	/**
	 * 批量插入视频类型数据
	 * @param vedioTypeList
	 * @return 0 : 添加失败  1 : 添加成功
	 */
	public int addVedioTypeByList(List<VedioTypeModel> vedioTypeList);
}