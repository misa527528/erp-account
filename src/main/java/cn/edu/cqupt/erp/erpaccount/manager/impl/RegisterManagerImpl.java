package cn.edu.cqupt.erp.erpaccount.manager.impl;

import cn.edu.cqupt.erp.erpaccount.dao.RegisterDao;
import cn.edu.cqupt.erp.erpaccount.entity.Register;
import cn.edu.cqupt.erp.erpaccount.manager.RegisterManager;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class RegisterManagerImpl implements RegisterManager {
    @Resource
    private RegisterDao registerDao;

    @Override
    public boolean addRegister(Register register) {
        int result = registerDao.addRegister(register);
        return result == 1;
    }

    @Override
    public boolean updateRegister(Register register) {
        return false;
    }

    @Override
    public Register findRegisterByUserId(String registerId) {
        return registerDao.findByUserId(registerId);
    }

    @Override
    public List<Register> findAllRegister() {
        return registerDao.findAllRegister();
    }

    @Override
    public boolean deleteRegisterById(String registerId) {
        return false;
    }
}
