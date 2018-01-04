package com.topwisesz.topwiseos.webservices.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BaseAction extends ActionSupport implements ServletResponseAware, ServletRequestAware {
    private HttpServletRequest httpServletRequest;
    private HttpServletResponse httpServletResponse;

    public PrintWriter getWriter() throws IOException {
        return httpServletResponse.getWriter();
    }

    @Override
    public void setServletResponse(HttpServletResponse response) {
        httpServletResponse = response;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        httpServletRequest = request;
    }
}
