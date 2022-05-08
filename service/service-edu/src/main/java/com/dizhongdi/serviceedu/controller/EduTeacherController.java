package com.dizhongdi.serviceedu.controller;


import com.dizhongdi.serviceedu.entity.EduTeacher;
import com.dizhongdi.serviceedu.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author dizhongdi
 * @since 2022-05-08
 */
@RestController
@RequestMapping("/serviceedu/teacher")
public class EduTeacherController {
    @Autowired
    EduTeacherService eduTeacherService;

    @GetMapping("/alllist")
    public List<EduTeacher> list(){
        return eduTeacherService.list(null);

    }

}

