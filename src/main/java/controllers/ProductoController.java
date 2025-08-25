package controllers;

import models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repositories.ProductoRepository;
import services.ProductoService;

import java.util.List;

@RestController
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @PostMapping("/Productos")
    public Producto addProducto(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @GetMapping("/Productos")
    public List<Producto> findAll(){
        return productoService.findAll();
    }

    @GetMapping("/Producto/{id}")
    public Producto findById(@PathVariable Long id) {
        return productoService.findById(id);
    }

    @DeleteMapping("/Producto/{id}")
    public void deleteById(@PathVariable Long id) {
        productoService.deleteById(id);
    }
}
