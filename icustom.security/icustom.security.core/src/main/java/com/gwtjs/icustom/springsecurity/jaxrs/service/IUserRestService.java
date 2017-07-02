package com.gwtjs.icustom.springsecurity.jaxrs.service;

import java.util.List;

import com.gwtjs.icustom.springsecurity.entity.SysUserVO;





import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * http://localhost:8080/api/application.wadl
 * 
 * http://localhost:8080/api/user/findAllUserList
 * 
 * @author aGuang
 *
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/user") 
@Component
@Service  
public interface IUserRestService {
	
	/**
	 * 用户登陆会用到
	 */
	public SysUserVO findByUsername(String username);
	
	/**
	 * 用户登陆会用到
	 */
	public SysUserVO findByAccount(String account);
	
	/**
	 * 查询所有用户-第一个-测试型
	 * 
	 * @return
	 */
	@GET
	@Path("/findAllUserList")
	List<SysUserVO> findAllUserList();
	
	/**
	 * 批量插入用户数据
	 * 
	 * @param userList
	 * @return
	 */
	@POST
	@Path("/insert")
	int insert(List<SysUserVO> userList);
	
}
