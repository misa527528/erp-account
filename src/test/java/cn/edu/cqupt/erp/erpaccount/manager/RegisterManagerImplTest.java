package cn.edu.cqupt.erp.erpaccount.manager;

import cn.edu.cqupt.erp.erpaccount.dao.RegisterDao;
import cn.edu.cqupt.erp.erpaccount.entity.Register;
import cn.edu.cqupt.erp.erpaccount.manager.impl.RegisterManagerImpl;
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

import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class RegisterManagerImplTest {
    @Mock
    private RegisterDao registerDao;

    @InjectMocks
    private RegisterManager registerManager = new RegisterManagerImpl();

    private Register register;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);

        register = new Register();
        register.setUserID("2016211036");
        register.setClassName("123456");
        register.setName("chenmeiling");
        register.setStudentID("2016211036");
        register.setPassword("123456");
    }

    @Test
    public void addRegister(){
        doReturn(1).when(registerDao).addRegister(register);
        Boolean res = registerManager.addRegister(register);
        Assert.assertTrue(res);
    }

    @Test
    public void findRegisterByUserId(){
        doReturn(register).when(registerDao).findByUserId("2016211036");
        Register register = registerManager.findRegisterByUserId("2016211036");
        Assert.assertEquals("chenmeiling",register.getName());
    }

    @Test
    public void findAllRegister(){
        List<Register> list = new LinkedList<>();
        doReturn(list).when(registerDao).findAllRegister();
        List<Register> register = registerManager.findAllRegister();
        Assert.assertEquals(list, register);
    }

}
