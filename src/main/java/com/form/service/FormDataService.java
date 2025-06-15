package com.form.service;

import com.form.model.FormData;
import com.form.repository.FormDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormDataService {
    @Autowired
    private FormDataRepository formDataRepository;

    public List<FormData> getAllFormData() {
        return formDataRepository.findAll();
    }

    public FormData saveFormData(FormData formData) {
        return formDataRepository.save(formData);
    }
}