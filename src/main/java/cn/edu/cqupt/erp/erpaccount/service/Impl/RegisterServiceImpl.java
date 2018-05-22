package cn.edu.cqupt.erp.erpaccount.service.Impl;

import cn.edu.cqupt.erp.erpaccount.constant.UserOperateConstant;
import cn.edu.cqupt.erp.erpaccount.entity.Register;
import cn.edu.cqupt.erp.erpaccount.manager.RegisterManager;
import cn.edu.cqupt.erp.erpaccount.service.RegisterService;
import cn.edu.cqupt.erp.erpaccount.util.MapUtil;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/register")
public class RegisterServiceImpl implements RegisterService{

    @Resource
    private RegisterManager registerManager;

    @Override
    @RequestMapping("/addRegister")
    public String addRegister(Register register){
        Map map;
        boolean bool = registerManager.addRegister(register);
        if (bool){
            map = MapUtil.toMap(true,UserOperateConstant.SUCCESS_FLAG,null);
        }else {
            map = MapUtil.toMap(false,UserOperateConstant.REGISTER_FAIL_FLAG,null);
        }
        String result = JSON.toJSONString(map);
        return result;
    }

}