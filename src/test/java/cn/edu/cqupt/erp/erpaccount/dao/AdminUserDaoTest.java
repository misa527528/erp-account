package cn.edu.cqupt.erp.erpaccount.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import cn.edu.cqupt.erp.erpaccount.entity.AdminUser;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminUserDaoTest {
	@Autowired
	private AdminUserDao adminUserDao;

	@Test
	public void getAll() {
		List<AdminUser> result = adminUserDao.getAll();

		assertTrue(!result.isEmpty());
	}
}
