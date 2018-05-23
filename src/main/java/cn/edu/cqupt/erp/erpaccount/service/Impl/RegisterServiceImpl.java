package cn.edu.cqupt.erp.erpaccount.service.Impl;

import cn.edu.cqupt.erp.erpaccount.constant.UserOperateConstant;
import cn.edu.cqupt.erp.erpaccount.entity.Register;
import cn.edu.cqupt.erp.erpaccount.manager.RegisterManager;
import cn.edu.cqupt.erp.erpaccount.service.RegisterService;
import cn.edu.cqupt.erp.erpaccount.util.MapUtil;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
@RequestMapping("/register")
public class RegisterServiceImpl implements RegisterService{

    @Resource
    private RegisterManager registerManager;

    @Override
    @RequestMapping(value = "/addRegister", method = RequestMethod.POST)
    public String addRegister(Register register){
        register.setStatus(UserOperateConstant.REGISTER_STATUS);
        boolean bool = registerManager.addRegister(register);
        Map map;
        if (bool){
            map = MapUtil.toMap(true,UserOperateConstant.SUCCESS_FLAG,null);
        }else {
            map = MapUtil.toMap(false,UserOperateConstant.REGISTER_FAIL_FLAG,null);
        }
        String result = JSON.toJSONString(map);
        return result;
    }

}
