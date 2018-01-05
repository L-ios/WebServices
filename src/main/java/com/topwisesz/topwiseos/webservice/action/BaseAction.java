package com.topwisesz.topwiseos.webservice.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BaseAction extends ActionSupport implements ServletRequestAware, ServletResponseAware {

    private HttpServletRequest httpServletRequest;
    private HttpServletResponse httpServletResponse;

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.httpServletRequest = request;
    }

    @Override
    public void setServletResponse(HttpServletResponse response) {
        this.httpServletResponse = response;
    }

    public PrintWriter getWriter() throws IOException {
        return httpServletResponse.getWriter();
    }
}
