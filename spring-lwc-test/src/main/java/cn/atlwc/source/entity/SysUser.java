package cn.atlwc.source.entity;

/**
 * @author LWC
 * @date 2021/1/7 10:49 上午
 */
public class SysUser {
	private String username;
	private String password;

	public SysUser(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
