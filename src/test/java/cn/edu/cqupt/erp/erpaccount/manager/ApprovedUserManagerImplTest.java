package cn.edu.cqupt.erp.erpaccount.manager;

import cn.edu.cqupt.erp.erpaccount.dao.ApproveduserDao;
import cn.edu.cqupt.erp.erpaccount.entity.ApprovedUser;
import cn.edu.cqupt.erp.erpaccount.manager.impl.ApprovedUserManagerImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class ApprovedUserManagerImplTest {
    @Mock
    private ApproveduserDao approveduserDao;

    @InjectMocks
    ApprovedUserManager approvedUserManager = new ApprovedUserManagerImpl();

    private ApprovedUser approvedUser;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);

        approvedUser = new ApprovedUser();
        approvedUser.setUserID("111");
        approvedUser.setName("hello");
        approvedUser.setStudentID("111");
        approvedUser.setPassword("1234");
    }

    @Test
    public void updateApproveduser(){
        doReturn(1).when(approveduserDao).updateApproveduser(anyObject());
        approvedUser.setPassword("123");
        approvedUser.setMajor("aaa");
        Boolean result = approvedUserManager.updateApproveduser(approvedUser);
        Assert.assertTrue(result);
    }

}
