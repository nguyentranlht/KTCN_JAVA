package com.example.__TranThanhNguyen.repository;

import com.example.__TranThanhNguyen.entity.PHONGBAN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPhongBanRepository extends JpaRepository<PHONGBAN, Long> {
}

