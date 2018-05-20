package cn.edu.cqupt.erp.erpaccount.dao;

import cn.edu.cqupt.erp.erpaccount.entity.Register;

import java.util.List;

public interface RegisterDao {
    void addRegister(Register register);

    void updateRegister(Register register);

    Register findByUserId(String registerId);

    List<Register> findAllRegister();

    boolean deleteRegisterById(String registerId);

    void updateApprovedUser(Register register);
}
