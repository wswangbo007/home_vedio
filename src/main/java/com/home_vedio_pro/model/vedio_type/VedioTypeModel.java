package com.home_vedio_pro.model.vedio_type;

import java.io.Serializable;

/**
 * 视频类型模型
 * @author wangB
 */
public class VedioTypeModel implements Serializable {

	private static final long serialVersionUID = 1L;

	/**视频类型id*/
	private String vedioTypeId;
	
	/**视频类型名称*/
	private int vedioTypeName;
	
	/**视频类型值*/
	private String vedioTypeValue;

	public String getVedioTypeId() {
		return vedioTypeId;
	}

	public void setVedioTypeId(String vedioTypeId) {
		this.vedioTypeId = vedioTypeId;
	}

	public int getVedioTypeName() {
		return vedioTypeName;
	}

	public void setVedioTypeName(int vedioTypeName) {
		this.vedioTypeName = vedioTypeName;
	}

	public String getVedioTypeValue() {
		return vedioTypeValue;
	}

	public void setVedioTypeValue(String vedioTypeValue) {
		this.vedioTypeValue = vedioTypeValue;
	}
}