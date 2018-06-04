package cn.edu.cqupt.erp.erpaccount.manager;

import cn.edu.cqupt.erp.erpaccount.dao.AdminUserDao;
import cn.edu.cqupt.erp.erpaccount.entity.AdminUser;
import cn.edu.cqupt.erp.erpaccount.manager.impl.ApprovedUserManagerImpl;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AdminUserManagerImplTest {
    @Mock
    private AdminUserDao adminUserDao;

    @InjectMocks
    ApprovedUserManager approvedUserManager = new ApprovedUserManagerImpl();

    private AdminUser adminUser;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);

        adminUser = new AdminUser();
        adminUser.setAdminId("111");
        adminUser.setAdminName("hello");
        adminUser.setPassword("123");
    }
}
