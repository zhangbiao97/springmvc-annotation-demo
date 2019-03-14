package com.springmvc;

import com.springmvc.config.AppConfig;
import com.springmvc.config.RootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Web容器启动的时候创建对象；调用方法来初始化容器以及前端控制器
 */
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 获取根容器的配置类；（Spring配置文件）
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /**
     * 获取Web容器的配置类（SpringMVC配置文件）
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }

    /**
     * 获取DispatcherServlet的映射信息
     *      /：拦截所有请求（包括静态资源（xx.js,xx.png）），但是不包括jsp页面；
     *      /*：拦截所有请求，连jsp页面都拦截，jsp页面是tomcat的jsp引擎解析的；
     *
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
