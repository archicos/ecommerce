package com.archico.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.archico.ecommerce.entity.Produk;

public interface ProdukRepository extends JpaRepository<Produk, String> {
    
}
