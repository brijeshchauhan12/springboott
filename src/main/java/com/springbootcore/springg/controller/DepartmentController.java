package com.springbootcore.springg.controller;

import com.springbootcore.springg.entity.Department;
import com.springbootcore.springg.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department  )   {

          return departmentService.saveDepartment(department);
    }
    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){

        return departmentService.getDepartmentById(departmentId);
    }
    @GetMapping("/departments")
    public List<Department> getAllDepartments(){

        return departmentService.getAllDepartments();
    }
    @DeleteMapping("/departments/{id}")
    public String deleteDepartment(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartment(departmentId);
        return "department deleted";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
        return departmentService.updateDepartment(departmentId,department);
    }

//    @GetMapping("/departments/name/{name}")
//    public Department getDepartmentByName(@PathVariable("name") String name){
//        return departmentService.getDepartmentByName(name);
//    }
    @GetMapping("/departments/name/{name}")
    public List<Department> getAllDepartmentByName(@PathVariable("name") String name){
        return departmentService.getAllDepartmentByName(name);
    }
}
