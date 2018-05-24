package cn.edu.cqupt.erp.erpaccount.dao;

import cn.edu.cqupt.erp.erpaccount.entity.ApprovedUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApproveduserDaoTest {
    @Autowired
    private ApproveduserDao approveduserDao;

    @Test
    public void findApproveduserById(){
        ApprovedUser approvedUser = approveduserDao.findApproveduserById("0101311");
        String name = approvedUser.getName();
        Assert.assertTrue(name.equals("王永"));
    }
}