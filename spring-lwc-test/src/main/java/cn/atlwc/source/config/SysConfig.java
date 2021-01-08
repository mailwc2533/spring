package cn.atlwc.source.config;

import cn.atlwc.source.entity.SysUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LWC
 * @date 2021/1/7 10:50 上午
 */
@Configuration
public class SysConfig {

	@Bean
	public SysUser sysUser(){
		return new SysUser("leo", "123456");
	}
}
