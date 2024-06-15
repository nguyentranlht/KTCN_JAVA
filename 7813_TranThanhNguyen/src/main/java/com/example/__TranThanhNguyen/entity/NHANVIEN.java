package com.example.__TranThanhNguyen.entity;

import com.example.__TranThanhNguyen.validator.annotation.ValidUserId;
import com.example.__TranThanhNguyen.validator.annotation.ValidatorPhongBanId;
import jakarta.persistence.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name = "NHANVIEN")
public class NHANVIEN {
    @Id
    @Column(name = "id", length = 3)
    @NotEmpty(message = "Mã nhân viên không được để tróng")
    private String id;

    @Column(name = "ten_nv", length = 100)
    @NotEmpty(message = "Tên nhân viên không được để tróng")
    @Size(max = 100, message = "Tên nhân viên phải ít hơn 100 ký tự")
    private String ten_nv;

    @Column(name = "phai", length = 3)
    @Size(max = 3, message = "Phái phải ít hơn 3 ký tự")
    private String phai;

    @Column(name = "noi_sinh", length = 200)
    @Size(max = 200, message = "Nơi sinh phải ít hơn 200 ký tự")
    private String noi_sinh;

    @Column(name = "luong")
    private int luong;

    @ManyToOne
    @JoinColumn(name = "phong_id", referencedColumnName = "id")
    @ValidatorPhongBanId
    private PHONGBAN phongban;

    @ManyToOne
    @JoinColumn(name = "user", referencedColumnName = "id")
    @ValidUserId
    private User user;
}
