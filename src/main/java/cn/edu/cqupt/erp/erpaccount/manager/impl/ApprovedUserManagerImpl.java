package cn.edu.cqupt.erp.erpaccount.manager.impl;

import cn.edu.cqupt.erp.erpaccount.dao.ApproveduserDao;
import cn.edu.cqupt.erp.erpaccount.entity.ApprovedUser;
import cn.edu.cqupt.erp.erpaccount.entity.Register;
import cn.edu.cqupt.erp.erpaccount.manager.ApprovedUserManager;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ApprovedUserManagerImpl implements ApprovedUserManager {
    @Resource
    ApproveduserDao approveduserDao;

    @Override
    public boolean updateApproveduser(Register register) {
        int result = approveduserDao.updateApproveduser(register);
        return result == 1;
    }

    @Override
    public ApprovedUser findApproveduserById(String approveduserId) {
        return approveduserDao.findApproveduserById(approveduserId);
    }
}
