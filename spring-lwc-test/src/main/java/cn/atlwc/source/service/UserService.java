package cn.atlwc.source.service;

import cn.atlwc.source.entity.SysUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LWC
 * @date 2021/1/27 1:50 下午
 */
@Service
public class UserService {

	private SysUser sysUser;

	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}

	public String getName(){
		return sysUser.getUsername();
	}
}
