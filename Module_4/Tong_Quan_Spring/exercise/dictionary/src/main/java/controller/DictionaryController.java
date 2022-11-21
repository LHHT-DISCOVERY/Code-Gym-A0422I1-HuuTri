package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.IDictionaryService;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
    @Autowired
    IDictionaryService iDictionaryService;

    @GetMapping("/home")
    public String showForm() {
        return "redirect:/dictionary/home";
    }

    @GetMapping("/home")
    public String result(Model model, @RequestParam("english") String english) {
        model.addAttribute("english", english);
        String s = iDictionaryService.findVocabulary(english);
        model.addAttribute("rs", s);
        return "dictionary/home";
    }
}