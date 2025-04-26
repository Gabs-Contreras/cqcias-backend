/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cqcias.productoapp.service;

import com.cqcias.productoapp.model.Producto;
import com.cqcias.productoapp.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 *
 * @author Gaby_Contreras
 */
@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> listarTodos() {
        return productoRepository.findAll();
    }

    public List<Producto> listarActivos() {
        return productoRepository.findByEstatus("A");
    }
    

    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto obtenerPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        productoRepository.deleteById(id);
    }

}
