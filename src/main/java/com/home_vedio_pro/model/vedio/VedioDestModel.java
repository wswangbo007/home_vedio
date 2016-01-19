package com.home_vedio_pro.model.vedio;

import java.io.Serializable;

/**
 * 视频详细类
 * @author wangB
 */
public class VedioDestModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**视频*/
	private String vedioDestId;
	
	/**视频名称*/
	private String vedioDestName;
	
	/**视频url*/
	private String vedioDestUrl;
	
	/**视频图片url*/
	private String vedioDestImageUrl;
	
	/**视频大小*/
	private int vedioDestSize;
	
	/**创建人ID*/
	private String createUserId;
	
	/**创建时间*/
	private String createDate;

	public String getVedioDestId() {
		return vedioDestId;
	}

	public void setVedioDestId(String vedioDestId) {
		this.vedioDestId = vedioDestId;
	}

	public String getVedioDestName() {
		return vedioDestName;
	}

	public void setVedioDestName(String vedioDestName) {
		this.vedioDestName = vedioDestName;
	}

	public String getVedioDestUrl() {
		return vedioDestUrl;
	}

	public void setVedioDestUrl(String vedioDestUrl) {
		this.vedioDestUrl = vedioDestUrl;
	}

	public String getVedioDestImageUrl() {
		return vedioDestImageUrl;
	}

	public void setVedioDestImageUrl(String vedioDestImageUrl) {
		this.vedioDestImageUrl = vedioDestImageUrl;
	}

	public int getVedioDestSize() {
		return vedioDestSize;
	}

	public void setVedioDestSize(int vedioDestSize) {
		this.vedioDestSize = vedioDestSize;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
}