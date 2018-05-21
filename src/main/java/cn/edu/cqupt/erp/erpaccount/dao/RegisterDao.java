package cn.edu.cqupt.erp.erpaccount.dao;

import cn.edu.cqupt.erp.erpaccount.entity.Register;

import java.util.List;

public interface RegisterDao {
    int addRegister(Register register);

    int  updateRegister(Register register);

    Register findByUserId(String registerId);

    List<Register> findAllRegister();

    int deleteRegisterById(String registerId);

}
