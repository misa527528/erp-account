package cn.edu.cqupt.erp.erpaccount.service;

import cn.edu.cqupt.erp.erpaccount.constant.UserOperateConstant;
import cn.edu.cqupt.erp.erpaccount.entity.Register;
import cn.edu.cqupt.erp.erpaccount.manager.RegisterManager;
import cn.edu.cqupt.erp.erpaccount.service.Impl.UserManagerSeviceImpl;
import cn.edu.cqupt.erp.erpaccount.util.MapUtil;
import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class UserManagerServiceImplTest {
    @Mock
    private RegisterManager registerManager;


    @InjectMocks
    private UserManagerService userManagerService = new UserManagerSeviceImpl();

    private Register register;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        register = new Register();
        register.setUserID("123");
        register.setClassName("123");
        register.setName("lalala");
        register.setStudentID("123");
        register.setPassword("123");
    }

    @Test
    public void findAllRegister(){
        List<Register> list = new LinkedList<>();
        list.add(register);
        doReturn(list).when(registerManager).findAllRegister();
        String result = userManagerService.findAllRegister();
        Map map = MapUtil.toMap(true, UserOperateConstant.SUCCESS_FLAG,list);
        String mapStr = JSON.toJSONString(map);
        Assert.assertEquals(mapStr,result);
    }
}
