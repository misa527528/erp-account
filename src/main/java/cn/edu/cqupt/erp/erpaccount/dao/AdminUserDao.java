package cn.edu.cqupt.erp.erpaccount.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

import cn.edu.cqupt.erp.erpaccount.entity.AdminUser;
public interface AdminUserDao {
	List<AdminUser> getAll();
}
