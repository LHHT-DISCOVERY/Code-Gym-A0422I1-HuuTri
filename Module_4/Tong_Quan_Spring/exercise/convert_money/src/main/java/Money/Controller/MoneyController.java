package Money.Controller;

import Money.Service.IConvertMoney;
import Money.Service.MoneyConvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("money")
public class MoneyController {
    @Autowired
    IConvertMoney moneyConvert;

    @GetMapping("/home")
    public String displayHome() {
        return "money/home";
    }

    @PostMapping("/result")
    public String result(Model model , double usd){
        model.addAttribute("usd" , usd);
        double rs = moneyConvert.convert(usd );
        model.addAttribute("vnd" , rs);
        return "money/result";
    }
}
