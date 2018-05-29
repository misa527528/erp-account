package cn.edu.cqupt.erp.erpaccount.manager.impl;

import cn.edu.cqupt.erp.erpaccount.dao.ApproveduserDao;
import cn.edu.cqupt.erp.erpaccount.entity.ApprovedUser;
import cn.edu.cqupt.erp.erpaccount.manager.ApprovedUserManager;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ApprovedUserManagerImpl implements ApprovedUserManager {
    @Resource
    ApproveduserDao approveduserDao;

    @Override
    public boolean updateApproveduser(ApprovedUser approvedUser) {
        int result = approveduserDao.updateApproveduser(approvedUser);
        return result == 1;
    }
}
