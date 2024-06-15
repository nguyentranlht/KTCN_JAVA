package com.example.__TranThanhNguyen.services;

import com.example.__TranThanhNguyen.entity.NHANVIEN;
import com.example.__TranThanhNguyen.repository.INhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhanVienService {

    @Autowired
    private INhanVienRepository nhanVienRepository;

    public List<NHANVIEN> getAllNHANVIEN() {
        return nhanVienRepository.findAll();
    }

    public Optional<NHANVIEN> getNHANVIENById(String id) {
        return nhanVienRepository.findById(id);
    }

    public void addNHANVIEN(NHANVIEN nhanvien) {
        nhanVienRepository.save(nhanvien);
    }

    public void deleteNHANVIEN(String id) {
        nhanVienRepository.deleteById(id);
    }

    public void updateNHANVIEN(NHANVIEN nhanvien) {
        nhanVienRepository.save(nhanvien);
    }
}

