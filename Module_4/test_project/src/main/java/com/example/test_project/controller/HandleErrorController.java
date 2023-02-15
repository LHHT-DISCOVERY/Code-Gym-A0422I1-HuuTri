package com.example.test_project.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

// class này dùng để bắt Exception nếu có Exception mà class ControllerQuestion không bắt được
// class này dùng để bắt 1 số các ngoại lệ thường gặp
@Controller
public class HandleErrorController implements ErrorController {
    @GetMapping(value = "/error")
    public String renderErrorPage(HttpServletRequest request, Model model){
        String errorCode="";
        String errorMsg="";
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        if (status!=null){
            int statusCode = Integer.valueOf(status.toString());
            switch (statusCode){
                case 400:
                    errorCode="400";
                    errorMsg="Bad Request.";
                    break;
                case 401:
                    errorCode="401";
                    errorMsg="Unauthorized.";
                    break;
                case 403:
                    errorCode="403";
                    errorMsg="Access is denied..";
                    break;
                case 404:
                    errorCode = "404";
                    errorMsg = "Page not found.";
                    break;

                case 500:
                    errorCode = "500";
                    errorMsg = "Internal Server Error.";
                    break;

                default:
                    errorCode = ":(";
                    errorMsg = "Oops! Something went wrong.";
                    break;
            }
            model.addAttribute("errorMsg", errorMsg);
            model.addAttribute("errorCode", errorCode);
        }
        return "error";
    }
}
