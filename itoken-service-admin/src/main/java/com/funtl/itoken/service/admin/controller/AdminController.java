package com.funtl.itoken.service.admin.controller;

import com.funtl.itoken.common.domain.TbSysUser;
import com.funtl.itoken.common.dto.BaseResult;
import com.funtl.itoken.service.admin.service.AdminService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Administrator
 */
@RestController
@RequestMapping(value = "v1/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "page/{pageNum}/{pageSize}",method = RequestMethod.GET)
    public BaseResult page(
            @PathVariable(required = true) int pageNum,
            @PathVariable(required = true) int pageSize,
            @RequestParam(required = false)TbSysUser tbSysUser
            ){
        PageInfo pageInfo= adminService.page(pageNum,pageSize,tbSysUser);
        List<TbSysUser> list = pageInfo.getList();
        BaseResult.Cursor cursor=new BaseResult.Cursor();
        cursor.setTotal((int) pageInfo.getTotal());
        cursor.setOffset(pageInfo.getPageNum());
        cursor.setLimit(pageInfo.getPageSize());
        return BaseResult.ok(list,cursor);
    }
}
