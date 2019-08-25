package com.cy.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @Auther: Administrator
 * @Date: 2019/8/9 20:16
 * @Description:
 */
@Controller
@RequestMapping("user")
public class ControllerUploads {
    @RequestMapping("test")
    public String uploads1(){
        System.out.println("执行了test........");
        return "success" ;
    }

    @RequestMapping("upload1")
    public String uploads2(HttpServletRequest request) throws Exception{
        System.out.println("执行了upload1........");
        //使用fileUpload完成文件上传
        //上传的位置
      //  String path = request.getSession().getServletContext().getRealPath("/upload/") ;

        String path = request.getSession().getServletContext().getRealPath("/upqeloads") ;
        File file = new File(path) ;
        //判断该路径是否存在
        if(!file.exists()){
            //创建该文件夹
            file.mkdirs() ;
        }
        //解析Request获取上传文件项
        DiskFileItemFactory factory = new DiskFileItemFactory() ;
        ServletFileUpload upload = new ServletFileUpload(factory) ;

        //解析Request
        List<FileItem>items =  upload.parseRequest(request) ;
        //遍历
        for (FileItem item : items){
            //进行判断  判断ite是否是一个上传文件项
            if(item.isFormField()){

            }else {
                //上传文件项
                String fileName =  item.getName() ;

                String uuid = UUID.randomUUID().toString().replace("-","") ;
                fileName = uuid+"-"+fileName ;
                item.write(new File(path,fileName));
                //删除临时文件
                item.delete();
            }
        }

        return "success" ;
    }
    @RequestMapping("upload2")
    public String upload2(HttpServletRequest request, MultipartFile upload) throws IOException {
        System.out.println("执行了SpringMVC上传.....");

        String path = request.getSession().getServletContext().getRealPath("/uploads/") ;
        File file = new File(path) ;
        if(!file.exists()){
            file.mkdirs() ;
        }

        String fileName = upload.getOriginalFilename() ;
        String uuid = UUID.randomUUID().toString().replace("-", " ");
        fileName = uuid+"_"+fileName ;
        //upload.transferTo(new File(path,fileName));

        upload.transferTo(new File(path,fileName));

        return "success" ;
    }
}