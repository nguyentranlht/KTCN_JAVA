package com.example.__TranThanhNguyen.services;


import com.example.__TranThanhNguyen.entity.PHONGBAN;
import com.example.__TranThanhNguyen.repository.IPhongBanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhongBanService {
    @Autowired
    private IPhongBanRepository phongBanRepository;

    public List<PHONGBAN> getAllPhongBans() {
        return phongBanRepository.findAll();
    }

    public PHONGBAN getPhongBanById(Long id) {
        return phongBanRepository.findById(id).orElse(null);
    }

    public void deletePhongBan(Long id) {
        phongBanRepository.deleteById(id);
    }

    public void savePhongBan(PHONGBAN category) {
        phongBanRepository.save(category);
    }
}
