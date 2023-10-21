package com.springbootcore.springg.service;

import com.springbootcore.springg.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);

   public Department getDepartmentById(Long departmentId);

   public void deleteDepartment(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);

  public  List<Department> getAllDepartments();

//   public Department getDepartmentByName(String name);

    public List<Department> getAllDepartmentByName(String name);
}
