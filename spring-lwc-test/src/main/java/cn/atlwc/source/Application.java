package cn.atlwc.source;

import cn.atlwc.source.config.SysConfig;
import cn.atlwc.source.entity.SysUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LWC
 * @date 2021/1/7 10:51 上午
 */
public class Application {

	public static void main(String[] args) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		ApplicationContext ac = new AnnotationConfigApplicationContext("cn.atlwc.source");

		SysUser sysUser = (SysUser) ac.getBean("sysUser");
		System.out.println(sysUser.getUsername());
	}
}
