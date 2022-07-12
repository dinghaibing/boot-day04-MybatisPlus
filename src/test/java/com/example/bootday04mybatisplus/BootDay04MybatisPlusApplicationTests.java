package com.example.bootday04mybatisplus;

import com.example.bootday04mybatisplus.bean.Student;
import com.example.bootday04mybatisplus.mapper.StudentMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class BootDay04MybatisPlusApplicationTests {

    @Autowired
    StudentMapper studentMapper;
    @Test
    void testStudentMapper() {
        Student student = new Student("zhangsan","男",19);
        int insert = studentMapper.insert(student);
        log.info("执行行数===="+insert);
    }

}
