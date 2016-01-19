package com.home_vedio_pro.web.vediotype;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;
import com.home_vedio_pro.model.vedio_type.VedioTypeModel;
import com.home_vedio_pro.service.vedio_type.VedioTypeService;

/**
 * 视频类型
 * @author wangB
 */
@Controller
@RequestMapping(value="vedioType")
public class VedioTypeController {
	
	@Autowired
	private VedioTypeService vedioTypeService;
	
	/**
	 * 跳转至视频类型添加页面
	 * @return vedio_type/addVedioType
	 */
	@RequestMapping(value="addVedioTypeJsp")
	public String addVedioTypeJsp() {
		return "vedio_type/vedioType";
	}
	
	/**
	 * 添加用户类型
	 * @return JSON
	 */
	@RequestMapping(value="addVedioType")
	@ResponseBody
	public Object addVedioType(VedioTypeModel vedioTypeModel) {
		Map<String,Object> resultMap = Maps.newHashMap();
		int result = vedioTypeService.addVedioType(vedioTypeModel);
		resultMap.put("result", result);
		return resultMap;
	}
}