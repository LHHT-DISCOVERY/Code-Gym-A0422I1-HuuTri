package com.example.exam_module.controller;

import com.example.exam_module.model.KhuyenMai;
import com.example.exam_module.service.IKhuyenhMaiService;
import com.example.exam_module.validate.KhuyenMaiValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("khuyenmai")
public class KhuyenMaiController {
    @Autowired
    IKhuyenhMaiService iKhuyenhMaiService;

    @Autowired
    KhuyenMaiValidate khuyenMaiValidate;

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("khuyenmais", iKhuyenhMaiService.findAll());
        return "khuyenmai/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("khuyenmai", new KhuyenMai());
        return "khuyenmai/create";
    }

    @PostMapping("/save")
    public String create(@Valid @ModelAttribute("khuyenmai") KhuyenMai khuyenmai, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        khuyenMaiValidate.validate(khuyenmai, bindingResult);
        if (bindingResult.hasErrors()) {
            return "khuyenmai/create";
        }
        iKhuyenhMaiService.createOrUpdate(khuyenmai);
        redirectAttributes.addFlashAttribute("mess", "Them moi thanh cong");
        return "redirect:/khuyenmai/list";
    }


    @PostMapping("/update")
    public String doUpdate(@Valid @ModelAttribute("khuyenmai") KhuyenMai khuyenmai, BindingResult
            bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "khuyenmai/update";
        }
        iKhuyenhMaiService.createOrUpdate(khuyenmai);
        redirectAttributes.addFlashAttribute("mess", "updade thanh cong");
        return "redirect:/khuyenmai/list";

    }

    @GetMapping("/edit/{id}")
    public String showFormUpdate(@PathVariable("id") int id, Model model) {
        model.addAttribute("khuyenmai", iKhuyenhMaiService.findById(id));
        return "khuyenmai/update";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam int idStudent, Model model) {
        iKhuyenhMaiService.deleteById(idStudent);
        return "redirect:/khuyenmai/list";
    }

    @GetMapping("/search")
    public ModelAndView search(@RequestParam(value = "name", defaultValue = "0") double name, @RequestParam(value = "page", defaultValue = "0") int page, Model model) {
        ModelAndView modelAndView = new ModelAndView("khuyenmai/list");
        modelAndView.addObject("khuyenmais", iKhuyenhMaiService.findMKM(name));
        return modelAndView;
    }
}
