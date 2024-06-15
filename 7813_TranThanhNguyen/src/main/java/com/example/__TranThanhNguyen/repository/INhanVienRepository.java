package com.example.__TranThanhNguyen.repository;

import com.example.__TranThanhNguyen.entity.NHANVIEN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INhanVienRepository extends JpaRepository<NHANVIEN, String> {
}

