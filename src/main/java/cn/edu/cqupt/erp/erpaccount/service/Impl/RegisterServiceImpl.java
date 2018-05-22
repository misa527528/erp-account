package cn.edu.cqupt.erp.erpaccount.service.Impl;

import cn.edu.cqupt.erp.erpaccount.entity.Register;
import cn.edu.cqupt.erp.erpaccount.manager.RegisterManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/register")
public class RegisterServiceImpl {

    @Resource
    private RegisterManager registerManager;

    @RequestMapping("/addRegister")
    public String addRegister(Register register){
        if (registerManager.addRegister(register)){
            return "add_success";
        }else {
            return "add_fail";
        }
    }

}
