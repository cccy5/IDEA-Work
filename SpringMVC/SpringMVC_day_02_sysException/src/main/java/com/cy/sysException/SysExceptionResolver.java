package com.cy.sysException;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: Administrator
 * @Date: 2019/8/11 15:25
 * @Description:异常处理器对象
 */
public class SysExceptionResolver implements HandlerExceptionResolver {

    /**处理异常业务逻辑
     * @param:
     * @return:
     * @date: 2019/8/11
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        SysException enss = null ;
        //instanceof是Java中的二元运算符，左边是对象，右边是类；
        // 当对象是右边类或子类所创建对象时，返回true；否则，返回false。
        //

        if(enss instanceof Exception){
            enss = (SysException) e;
        }else {
            enss = new SysException("系统维护");

        }
        ModelAndView mv = new ModelAndView() ;
        //拿到提示信息
        mv.addObject("mess",enss.getMessage()) ;
        //设置跳转页面
        mv.setViewName("error");
        return mv ;
    }
}