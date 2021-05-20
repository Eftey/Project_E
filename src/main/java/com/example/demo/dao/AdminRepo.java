package com.example.demo.dao;

import com.example.demo.enteties.Admin;
import com.example.demo.enteties.AdminPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, AdminPk> {
}
