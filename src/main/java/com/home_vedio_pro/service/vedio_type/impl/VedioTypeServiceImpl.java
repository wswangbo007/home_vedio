package com.home_vedio_pro.service.vedio_type.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.google.common.collect.Lists;
import com.home_vedio_pro.dao.vedio_type.VedioTypeDao;
import com.home_vedio_pro.model.vedio_type.VedioTypeModel;
import com.home_vedio_pro.service.vedio_type.VedioTypeService;
import com.home_vedio_pro.util.UUIDUtil;
import com.home_vedio_pro.util.constant.ConstantUtil;

/**
 * 视频类型接口
 * @author wangB
 *
 */
@Service
public class VedioTypeServiceImpl implements VedioTypeService {
	
	@Autowired
	private VedioTypeDao vedioTypeDao;

	/**
	 * 批量添加用户类型
	 */
	@Override
	public int addVedioType(VedioTypeModel vedioTypeModel) {
		List<VedioTypeModel> VedioTypeList = Lists.newArrayList();
		int result = 0;
		if (null != vedioTypeModel) {
			if (!StringUtils.isEmpty(vedioTypeModel.getVedioTypeValue())) {
				String vedioTypeValue = vedioTypeModel.getVedioTypeValue();
				String [] tempVedioTypeArrays = vedioTypeValue.split(",");
				for (int i = 0,count = tempVedioTypeArrays.length; i < count; i++) {
					VedioTypeModel tempVedioTypeModel = new VedioTypeModel();
					tempVedioTypeModel.setVedioTypeId(UUIDUtil.getUUID());
					tempVedioTypeModel.setVedioTypeName(ConstantUtil.VedioTypeUtil.VEDIO_TYPE_FLAG);
					tempVedioTypeModel.setVedioTypeValue(tempVedioTypeArrays[i]);
					VedioTypeList.add(tempVedioTypeModel);
				}
				vedioTypeDao.addVedioTypeByList(VedioTypeList);
			}
		}
		return result;
	}

}
