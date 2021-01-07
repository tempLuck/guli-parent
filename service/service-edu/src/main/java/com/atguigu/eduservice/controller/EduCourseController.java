package com.atguigu.eduservice.controller;


import com.atguigu.commonutils.R;
import com.atguigu.eduservice.entity.vo.CourseInfoVo;
import com.atguigu.eduservice.service.EduCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 课程 前端控制器
 * </p>
 *
 * @author liugj
 * @since 2021-01-07
 */
@CrossOrigin
@RestController
@RequestMapping("/eduservice/course")
public class EduCourseController {

    @Autowired
    private EduCourseService courseService;

    @PostMapping("addCourseInfo")
    public R addCourseInfo(@RequestBody CourseInfoVo courseInfoVo){
        courseService.saveCourseInfo(courseInfoVo);

        return R.ok();
    }
}

