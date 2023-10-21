package com.springbootcore.springg.service;

import com.springbootcore.springg.entity.Department;
import com.springbootcore.springg.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.String.*;
import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {

        return departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartment(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {

        Department dpdb=departmentRepository.findById(departmentId).get();

        if(Objects.nonNull(department.getDepartmentName())
         && !"".equalsIgnoreCase(department.getDepartmentName())){
            dpdb.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentCode())
         && !"".equalsIgnoreCase((department.getDepartmentCode()))){
            dpdb.setDepartmentCode(department.getDepartmentCode());
        }

        if(Objects.nonNull(department.getDepartmentAddress())
        && !"".equalsIgnoreCase(department.getDepartmentAddress())){
            dpdb.setDepartmentAddress(department.getDepartmentAddress());
        }
        return departmentRepository.save(dpdb);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

//    @Override
//    public Department getDepartmentByName(String name) {
//
//        return departmentRepository.findByDepartmentName(name);
//    }

    @Override
    public List<Department> getAllDepartmentByName(String name) {
        return departmentRepository.findByDepartmentName(name);
    }
}
