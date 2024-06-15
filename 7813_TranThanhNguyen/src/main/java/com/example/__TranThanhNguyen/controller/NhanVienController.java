package com.example.__TranThanhNguyen.controller;

import com.example.__TranThanhNguyen.entity.NHANVIEN;
import com.example.__TranThanhNguyen.services.NhanVienService;
import com.example.__TranThanhNguyen.services.PhongBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/nhanviens")
public class NhanVienController {

    @Autowired
    private NhanVienService nhanVienService;

    @Autowired
    private PhongBanService phongBanService;

    @GetMapping
    public String showAllBooks(Model model) {
        List<NHANVIEN> nhanviens = nhanVienService.getAllNHANVIEN();
        model.addAttribute("nhanviens", nhanviens);
        return "nhanvien/list";
    }

    @GetMapping("/add")
    public String addBookForm(Model model) {
        model.addAttribute("nhanvien", new NHANVIEN());
        model.addAttribute("phongbans", phongBanService.getAllPhongBans());
        return "nhanvien/add";
    }
    @PostMapping("/add")
    public String addBook(@ModelAttribute("nhanvien") NHANVIEN nhanvien, BindingResult result, Model model) {
        if(result.hasErrors()) {
            model.addAttribute("phongbans", phongBanService.getAllPhongBans());
            return "nhanvien/add";
        }
        nhanVienService.addNHANVIEN(nhanvien);
        return "redirect:/nhanviens";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable String id, Model model) {
        NHANVIEN nhanvien = nhanVienService.getNHANVIENById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product Id:" + id));
        model.addAttribute("nhanvien", nhanvien);
        model.addAttribute("phongbans", phongBanService.getAllPhongBans());
        return "nhanvien/edit";
    }

    // Process the form submission for an updated nhanvien
    @PostMapping("/edit/{id}")
    public String updateBook(@ModelAttribute("nhanvien") NHANVIEN nhanvien, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "nhanvien/edit";
        }
        nhanVienService.updateNHANVIEN(nhanvien);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") String id) {
        nhanVienService.deleteNHANVIEN(id);
        return "redirect:/nhanviens";
    }
}

