package com.example.demo.controllers;

import com.example.demo.model.QuestionContent;
import com.example.demo.service.IQuestionService;
import com.example.demo.service.IQuestionTypeService;
import com.example.demo.validate.QuestionValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class ControllerQuestion {
    @Autowired
    private IQuestionService iQuestionService;
    @Autowired
    private IQuestionTypeService iQuestionTypeService;
    @Autowired
    private QuestionValidate validate ;
    @Autowired
    HttpSession httpSession;
    @GetMapping(value = "/list5"
    //        consumes = {MediaType.APPLICATION_JSON_VALUE}
    //            ,headers = {"Content-Type=text/html","Accept=application/xml"}
    )
    public String showList(Model model, @CookieValue(name = "count",defaultValue = "0")Long count,
                           HttpServletResponse response,@RequestParam(value = "page",defaultValue = "0")int page){
        Cookie cookie = new Cookie("count",++count+"");
        cookie.setPath("/");
    //     cookie.setMaxAge(0); xet thoi gian song ve bang 0
        cookie.setMaxAge(24*60*60);
        response.addCookie(cookie);
        String userName = (String)httpSession.getAttribute("username");
        model.addAttribute("user",userName);
        model.addAttribute("count",count);
        model.addAttribute("listQuestion",iQuestionService.findByAll(PageRequest.of(page,1)));
        return "list";
    }
    @GetMapping(value = "/delete")
    public String deleteQuestion(@RequestParam(value = "deleteId")String deleteId,Model model, @RequestParam(value = "page",defaultValue = "0")int page){
        iQuestionService.delete(deleteId);
        model.addAttribute("listQuestion",iQuestionService.findByAll(PageRequest.of(page,1)));
        return "list";
    }
    @GetMapping(value = "/list/search")
    public String search(Model model, @RequestParam(value = "tenKhachHang", defaultValue = "")String tenKhachHang,
                        @RequestParam(value = "page",defaultValue = "0")int page){

        model.addAttribute("listQuestion",iQuestionService.search(tenKhachHang,PageRequest.of(page,1)));
        return "list";
//        page chạy từ 0 lên ko phải 1 lên
    }
    @GetMapping(value = "/create")
    public String showCreatePage(Model model){
        String username = (String) httpSession.getAttribute("username");
//        if (username == null || "".equals(username.trim())) {
//            return "redirect:/login";
//        }
        model.addAttribute("question",new QuestionContent());
        model.addAttribute("listType",iQuestionTypeService.findByAll());
        return "create";
    }
    @PostMapping(value = "/create")
    public String createStudent(@Valid @ModelAttribute("question") QuestionContent questionContent, BindingResult bindingResult,
                                Model model) {

        validate.validate(questionContent,bindingResult);
        if(bindingResult.hasErrors()){
//            model.addAttribute("question",new QuestionContent());
            model.addAttribute("listType",iQuestionTypeService.findByAll());
            return "create";
        }
        iQuestionService.create(questionContent);
//        List<Student> list = iStudentService.getAll();
//        model.addAttribute("listStudent", list);
        return "redirect:/list5";
    }
    @GetMapping(value = "/list4")
    public String returnList(Model model, @RequestParam(value = "page",defaultValue = "0")int page){
        model.addAttribute("listQuestion",iQuestionService.findByAll(PageRequest.of(page,1)));
        return "list";
    }
//    @GetMapping(value = "/detail/{tenKhachHang}")
//    public String detail(Model model, @PathVariable(value = "tenKhachHang")String tenKhachHang, @RequestParam(value = "page",defaultValue = "0")int page){
//        model.addAttribute("listQuestion",iQuestionService.detail(tenKhachHang,PageRequest.of(page,1)));
//        return "detail";
//    }
@GetMapping(value = "/detail/{tenKhachHang}")
public String detail(Model model, @PathVariable(value = "tenKhachHang")String tenKhachHang,HttpServletResponse response
,HttpServletRequest request){
        String user = (String) httpSession.getAttribute("username");
//        if(user==null ||"".equals(user.trim())){
//            return "redirect:/login";
//        }
    Cookie[] cookies = request.getCookies();
    for (Cookie c:cookies){
        if(c.getName().equals("count")){
            int count =Integer.parseInt(c.getValue());
            count++;
            c.setValue(count+"");
            c.setPath("/");
            response.addCookie(c);
            model.addAttribute("count",count);
            break;
        }
    }
    model.addAttribute("user", user);
    model.addAttribute("listQuestion",iQuestionService.detail(tenKhachHang));
    return "detail";
}
// Nếu có Exception nào xảy ra thì sẽ bị bắt lại ở phương thức dưới
    // Nếu Phương thức dưới không bắt được(trường hợp chỉ bắt 1 Exception) thì sẽ chuyển sang cho class HandleErrorController bắt
//    @ExceptionHandler(Exception.class)
//    public String errorHandler(Exception e, Model model) {
//        model.addAttribute("message", e.getMessage());
//        System.out.println("=============Book controller============");
//        return "error";
//    }
}
