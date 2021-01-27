package cn.atlwc.source.controller;

import cn.atlwc.source.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LWC
 * @date 2021/1/27 1:51 下午
 */
@RestController
public class UserController {
	@Resource
	UserService userService;

	@RequestMapping("/index")
	public String index(){
		return userService.getName();
	}
}
