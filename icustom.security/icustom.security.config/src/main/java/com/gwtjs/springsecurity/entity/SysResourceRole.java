package com.gwtjs.springsecurity.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.gwtjs.core.entity.BaseResource;

@Entity
@Table(name = "sys_resource_role_t")
public class SysResourceRole extends BaseResource {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4203811499633005155L;

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "resource_role_id", length = 10)
	private int id;

	@Column(name = "role_id", length = 50)
	private String roleId; // 角色ID

	@Column(name = "resource_id", length = 50)
	private String resourceId;// 资源ID

	@Column(name = "update_time")
	private Date updateTime;// 更新时间

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
