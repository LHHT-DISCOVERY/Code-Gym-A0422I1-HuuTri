package com.example.exam_m4.controller;

import com.example.exam_m4.dto.DichVuValidate;
import com.example.exam_m4.model.DichVu;
import com.example.exam_m4.service.IDichVuService;
import com.example.exam_m4.service.IKhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("dichvu")
public class DichVuController {
    @Autowired
    IDichVuService iDichVuService;

    @Autowired
    DichVuValidate dichVuValidate;

    @Autowired
    IKhachHangService iKhachHangService;

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("dichvus", iDichVuService.findAll());
        return "dichvu/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("dichvu", new DichVu());
        model.addAttribute("khachhangs", iKhachHangService.findAll());
        return "dichvu/create";
    }

    @PostMapping("/save")
    public String doCreate(@Valid @ModelAttribute("dichvu") DichVu dichVu, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        dichVuValidate.validate(dichVu, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("khachhangs", iKhachHangService.findAll());
            return "dichvu/create";
        }
        iDichVuService.createOrrUpdate(dichVu);
        redirectAttributes.addFlashAttribute("message", "them moi Thanh Cong ");
        return "redirect:/dichvu/list";
    }

    @GetMapping("/edit/{id}")
    public String showFormUpdate(@PathVariable("id") int id, Model model) {
        model.addAttribute("dichvu", iDichVuService.findById(id));
        model.addAttribute("dichvus", iKhachHangService.findAll());
        return "dichvu/update";
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("dichvu") DichVu dichvu, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "dichvu/update";
        }
        iDichVuService.createOrrUpdate(dichvu);
        redirectAttributes.addAttribute("message", "Update thanh cong ");
        return "redirect:/dichvu/list";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("idStudent") int id) {
        iDichVuService.deleteById(id);
        return "redirect:/dichvu/list";
    }

    @GetMapping("/search")
    public String search(@RequestParam(value = "name", defaultValue = "") String name, Model model) {
        if (name == null || name.trim().isEmpty()) {
            return "dichvu/list";
        }
        model.addAttribute("dichvus", iDichVuService.findName(name));
        return "dichvu/list";
    }
}
