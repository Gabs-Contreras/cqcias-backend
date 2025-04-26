    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package com.cqcias.productoapp.controller;

    import com.cqcias.productoapp.model.Producto;
    import com.cqcias.productoapp.service.ProductoService;
    import java.util.List;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.CrossOrigin;
    import org.springframework.web.bind.annotation.DeleteMapping;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.PutMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;

    /**
     *
     * @author Gaby_Contreras
     */
    @RestController
    @RequestMapping("/productos")
    @CrossOrigin(origins = "*")
    public class ProductoController {

        @Autowired
        private ProductoService productoService;

        @GetMapping
        public List<Producto> listarActivos() {
            return productoService.listarActivos();
        }

        @GetMapping("/todos")
        public List<Producto> listarTodos() {
            return productoService.listarTodos();
        }

        @GetMapping("/{id}")
        public Producto obtenerPorId(@PathVariable Long id) {
            return productoService.obtenerPorId(id);
        }

        @PostMapping
        public Producto guardar(@RequestBody Producto producto) {
            return productoService.guardar(producto);
        }

        @PutMapping("/{id}")
        public Producto actualizar(@PathVariable Long id, @RequestBody Producto producto) {
            producto.setId(id);
            return productoService.guardar(producto);
        }

        @DeleteMapping("/{id}")
        public void eliminar(@PathVariable Long id) {
            productoService.eliminar(id);
        }

    }
