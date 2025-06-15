package com.form.controller;

import com.form.model.FormData;
import com.form.service.FormDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    @Autowired
    private FormDataService formDataService;

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("formData", new FormData());
        return "multistep-form";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute FormData formData) {
        formDataService.saveFormData(formData);
        return "result";
    }
}
