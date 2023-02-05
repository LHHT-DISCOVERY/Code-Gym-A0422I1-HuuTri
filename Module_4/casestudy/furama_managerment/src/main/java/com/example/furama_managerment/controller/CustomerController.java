package com.example.furama_managerment.controller;

import com.example.furama_managerment.model.customer.Customer;
import com.example.furama_managerment.service.customer_service.ICustomerService;
import com.example.furama_managerment.service.customer_service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;

    @Autowired
    ICustomerTypeService iCustomerTypeService;

    @GetMapping("create")
    public String showFormCreate(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("customerTypes", iCustomerTypeService.findAll());
        return "customer/create";

    }

    @PostMapping("/save")
    public String save(@ModelAttribute("customer") Customer customer, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message", "Them moi thanh cong");
        iCustomerService.createOrUpdate(customer);
        return "redirect:/customer/list";
    }
//
//    @GetMapping("view/{id}")
//    public String detail(@PathVariable("id") int if){
//        return "redirect:/customer/list";
//    }

    @GetMapping("delete")
    public String delete(@RequestParam("idCustomer") int id, RedirectAttributes redirectAttributes) {
        iCustomerService.deleteById(id);
        redirectAttributes.addFlashAttribute("messageDelete", "Xoa Thanh Cong");
        return "redirect:/customer/list";
    }
// lưu ý nếu ko có dấu / trước redirect: thì nó sẽ mapping với @RequestMapping("customer") + customer/list

    @GetMapping("/list")
    public String showList(Model model, @RequestParam(value = "page", defaultValue = "0") int page) {
        model.addAttribute("customers", iCustomerService.findAll(PageRequest.of(page, 2)));
        return "customer/list";
    }
}
