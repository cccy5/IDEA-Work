package com.cy.controller;

import com.cy.entity.Student;
import com.cy.service.IStudentService;
import com.sun.deploy.nativesandbox.comm.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/8/18 18:55
 * @Description:控制器
 */
@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    private IStudentService studentService ;

    @RequestMapping("list")
    public  String findAll(Model model){
        List<Student> list = studentService.findAll();
        model.addAttribute("list",list) ;
        return "list" ;
    }

    @RequestMapping("test")
    public String test(){
        return "login" ;
    }

    @RequestMapping("login" )
    public ModelAndView login(Student student,HttpServletResponse response) {
        ModelAndView mv = new ModelAndView() ;
        if(studentService.login(student)!=null){

            mv.setViewName("redirect:/student/list");
        }else
            mv.setViewName("/login");
        return mv ;
    }

    @RequestMapping("add")
    public String add(HttpServletResponse response,HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
      //  request.setCharacterEncoding("");
        response.setContentType("text/html;charset = utf-8");
        return "save" ;
    }

    @RequestMapping("save")
    public String save(Student student,HttpServletResponse response,HttpServletRequest request) throws UnsupportedEncodingException {
        response.setContentType("text/html;charset = utf-8");
        request.setCharacterEncoding("UTF-8");
        studentService.saveStudent(student);
        return "redirect:/student/list" ;
    }
    @RequestMapping(value = "delete")
    public String delete(int id){
        studentService.deleteStudent(id);
        return "redirect:/student/list" ;
    }
    @RequestMapping("get")
    public String get( int id,Model model){
        System.out.println("get....");
        Student student = new Student() ;

        student = studentService.getById(id);
        model.addAttribute("student",student);
        return "edit" ;
    }
    @RequestMapping("editto")
    public String edit(int id,Model model){
       // System.out.println("get....");
        Student student = new Student() ;

        student = studentService.getById(id);
        model.addAttribute("student",student);
        return "edit" ;
    }
    @RequestMapping("edit")
    public String editTo(Student student){
        System.out.println("update....");
        // System.out.println(student+":"+student.getId()+student.getName());
        studentService.updateStudent(student) ;
        return "redirect:/student/list" ;
    }

}