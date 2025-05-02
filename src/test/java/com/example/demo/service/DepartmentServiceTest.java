package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

//    @Autowired
//    private DepartmentService departmentService;
//
//    @MockitoBean
//    private DepartmentRepository departmentRepository;
//
//    @BeforeEach
//    void setUp() {
//        Department department = Department.builder()
//                .departmentName("CSE")
//                .departmentAddress("CTG")
//                .departmentCode("IT")
//                .depaartmentId(1L)
//                .build();
//
//        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("CSE")).thenReturn(department);
//    }
//
//    @Test
//    @DisplayName("Get data based on valid department name")
//    public void whenValidDepartmentName_thenDepartmentShouldFound(){
//        String departmentName = "CSE";
//
//        Department found = departmentService.fetchDepartmentByName(departmentName);
//
//        assertEquals(departmentName, found.getDepartmentName());
//    }
}