package com.example.__TranThanhNguyen.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "PHONGBAN")
public class PHONGBAN {

    @Id
    @Column(name = "id", length = 2)
    private String id;

    @Column(name = "tenphong")
    private String tenphong;

    @OneToMany(mappedBy = "phongban", cascade = CascadeType.ALL)
    private List<NHANVIEN> nhanviens;
}
