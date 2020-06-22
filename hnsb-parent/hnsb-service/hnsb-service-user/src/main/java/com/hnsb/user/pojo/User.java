package com.hnsb.user.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 用户
 * @author: 喻卫
 * @time: 2020-06-22 23:29:15
 * @version: 1.0.0
 **/
@ApiModel
@TableName("user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	@ApiModelProperty(value = "主键")
	private Long id;
	/**
	 * 姓名
	 */
	@ApiModelProperty(value = "姓名")
	private String name;
	/**
	 * 头像
	 */
	@ApiModelProperty(value = "头像")
	private String images;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}
}
