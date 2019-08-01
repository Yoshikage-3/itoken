package com.funtl.itoken.service.sso.service;

import com.funtl.itoken.common.domain.TbSysUser;

/**
 * 登录业务
 * @author Administrator
 */
public interface LoginService {
    /**
     * 登录
     * @param loginCode
     * @param plantPassword
     * @return
     */
    TbSysUser login(String loginCode, String plantPassword);
}
