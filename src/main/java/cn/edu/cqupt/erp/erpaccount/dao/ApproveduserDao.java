package cn.edu.cqupt.erp.erpaccount.dao;

import cn.edu.cqupt.erp.erpaccount.entity.ApprovedUser;
import cn.edu.cqupt.erp.erpaccount.entity.Register;

public interface ApproveduserDao {
	ApprovedUser findApproveduserById(String userId);

	int updateApproveduser(Register register);
}
