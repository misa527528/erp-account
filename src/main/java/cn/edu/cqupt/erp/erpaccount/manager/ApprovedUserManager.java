package cn.edu.cqupt.erp.erpaccount.manager;

import cn.edu.cqupt.erp.erpaccount.entity.ApprovedUser;
import cn.edu.cqupt.erp.erpaccount.entity.Register;

public interface ApprovedUserManager {
    boolean updateApproveduser(Register register);

    ApprovedUser findApproveduserById(String approveduserId);
}
