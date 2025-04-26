/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cqcias.productoapp.repository;

import com.cqcias.productoapp.model.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Gaby_Contreras
 */
public interface ProductoRepository extends JpaRepository <Producto, Long> {
     List<Producto> findByEstatus(String estatus);
    
}
