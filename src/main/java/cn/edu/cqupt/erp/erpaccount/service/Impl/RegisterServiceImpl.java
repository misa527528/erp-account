package cn.edu.cqupt.erp.erpaccount.service.Impl;

import cn.edu.cqupt.erp.erpaccount.entity.Register;
import cn.edu.cqupt.erp.erpaccount.manager.RegisterManager;
import cn.edu.cqupt.erp.erpaccount.util.MapUtil;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/register")
public class RegisterServiceImpl {

    @Resource
    private RegisterManager registerManager;

    @RequestMapping("/addRegister")
    public String addRegister(Register register){
        Map map;
        if (registerManager.addRegister(register)){
            map = MapUtil.toMap(true,"add_success",null);
        }else {
            map = MapUtil.toMap(false,"add_fail",null);
        }
        String result = JSON.toJSONString(map);
        return result;
    }

}
