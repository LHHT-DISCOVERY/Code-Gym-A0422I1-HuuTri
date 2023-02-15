package com.example.exam_m4.controller;

import com.example.exam_m4.model.KhachHang;
import com.example.exam_m4.service.IKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("khachhang")
public class KhachHangController {
    @Autowired
    IKhachHangService  iKhachHangService ;

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("students", iKhachHangService.findAll());
        return "khachhang/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("student", new KhachHang());
        return "khachhang/create";
    }

    @PostMapping("/save")
    public String create(@Valid @ModelAttribute("khachhang") KhachHang khachHang, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "khachhang/create";
        }
        iKhachHangService.createOrrUpdate(khachHang);
        redirectAttributes.addFlashAttribute("message", "them moi Thanh Cong ");
        return "redirect:/khachhang/list";
    }

    @GetMapping("/edit/{id}")
    public String showFormUpdate(@PathVariable("id") int id, Model model) {
        model.addAttribute("khachhang", iKhachHangService.findById(id));
        return "khachhang/update";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("khachhang") KhachHang khachHang, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "student/create";
        }
        iKhachHangService.createOrrUpdate(khachHang);
        redirectAttributes.addAttribute("message", "Update thanh cong ");
        return "redirect:/student/list";
    }

//    @PostMapping("/delete")
//    public String delete(@RequestParam("idStudent") int id) {
//        iKhachHangService.deleteById(id);
//        return "redirect:/student/list";
//    }

//    @GetMapping("/search")
//    public ModelAndView search(@RequestParam(value = "name", defaultValue = "") String name, @RequestParam(value = "page", defaultValue = "0") int page, Model model) {
//        ModelAndView modelAndView = new ModelAndView("student/list");
//        if (name == null || name.trim().isEmpty()) {
//            modelAndView.addObject("students", iKhachHangService.findAll(PageRequest.of(page, 2)));
//            return modelAndView;
//        }
//        modelAndView.addObject("students", iKhachHangService.findByName(name, PageRequest.of(page, 10)));
//        return modelAndView;
//    }
}
