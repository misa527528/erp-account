package cn.edu.cqupt.erp.erpaccount.service.Impl;

import cn.edu.cqupt.erp.erpaccount.constant.UserOperateConstant;
import cn.edu.cqupt.erp.erpaccount.entity.Register;
import cn.edu.cqupt.erp.erpaccount.manager.RegisterManager;
import cn.edu.cqupt.erp.erpaccount.service.UserManagerService;
import cn.edu.cqupt.erp.erpaccount.util.MapUtil;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/userManager")
public class UserManagerSeviceImpl implements UserManagerService {
    @Resource
    private RegisterManager registerManager;

    @Override
    @RequestMapping(value = "/findAllRegister",method = RequestMethod.GET)
    public String findAllRegister() {
        List<Register> registers = registerManager.findAllRegister();
        Map map;
        if (!registers.isEmpty()){
            map = MapUtil.toMap(true, UserOperateConstant.SUCCESS_FLAG,registers);
        } else {
            map = MapUtil.toMap(false,UserOperateConstant.FIND_FAIL_FLAG,null);
        }
        String result = JSON.toJSONString(map);
        return result;
    }
}
