package com.archico.ecommerce.controller;

import java.util.List;

import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.archico.ecommerce.entity.Produk;
import com.archico.ecommerce.service.ProdukService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
@PreAuthorize("isAuthenticated()")
public class ProdukController {

    @Autowired
    private ProdukService produkService;

    @GetMapping("/produks")
    public List<Produk> findAll() {
        return produkService.findAll();
    }

    @GetMapping("/produks/{id}")
    public Produk findById(@PathVariable("id") String id) {
        return produkService.findById(id);
    }

    @PostMapping("/produks")
    public Produk create(@RequestBody Produk produk) throws BadRequestException {
        return produkService.create(produk);
    }

    @PutMapping("/produks")
    public Produk edit(@RequestBody Produk produk) throws BadRequestException {
        return produkService.edit(produk);
    }

    @DeleteMapping("/produks/{id}")
    public void deleteById(@PathVariable("id") String id) {
        produkService.deleteById(id);
    }
}
