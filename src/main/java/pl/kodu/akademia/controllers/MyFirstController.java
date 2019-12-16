package pl.kodu.akademia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.kodu.akademia.command.BmiResults;
import pl.kodu.akademia.command.FormCommand;
import pl.kodu.akademia.services.BmiService;

import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Random;

@Controller
public class MyFirstController {
    private BmiService service;

    public MyFirstController(BmiService service) {
        this.service = service;
    }

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("command", new FormCommand());
        return "index";
    }

    @PostMapping("/calculate")
    public String formPost(@ModelAttribute("command") FormCommand command, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if (command.getId() > 0 && service.checkIfExists(String.valueOf(command.getId()))) {
            BmiResults result = service.find(String.valueOf(command.getId()));
            model.addAttribute("result", result);
            return "results";
        }
        double heightInMeters = command.getHeight() / 100.0;
        double bmi = command.getWeight() / (heightInMeters * heightInMeters);
        bmi = new BigDecimal(bmi).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        BmiResults results = new BmiResults(command.getWeight(), command.getHeight(), bmi, "");
        String id = service.add(results);
        results.setId(id);
        model.addAttribute("result", results);
        return "results";
    }

}
