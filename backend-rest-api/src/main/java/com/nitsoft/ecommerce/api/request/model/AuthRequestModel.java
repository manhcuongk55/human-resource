/*
 * Copyright (c) NIT-Software. All Rights Reserved.
 * This software is the confidential and proprietary information of NIT-Software,
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only in accordance
 * with the terms of the license agreement you entered into with NIT-Software.
 */
package com.nitsoft.ecommerce.api.request.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Quy Duong
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthRequestModel {
    public String username;
    public String password;
    public boolean keepMeLogin;
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
	public boolean isKeepMeLogin() {
		return keepMeLogin;
	}
	public void setKeepMeLogin(boolean keepMeLogin) {
		this.keepMeLogin = keepMeLogin;
	}
    
    
    
}
