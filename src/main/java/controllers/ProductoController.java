package controllers;


import java.util.List;

import org.springframework.web.bind.annotation.*;

import models.Producto;
import services.ProductoService;


@RestController
@RequestMapping("/productos")
public class ProductoController {

    public ProductoService productoService;


    public ProductoController (ProductoService productoService) {
        this.productoService = productoService;
    }


    @PostMapping("/productos")
    public Producto save(@RequestBody Producto producto) {
        return productoService.save(producto);
    }


    @GetMapping("/productos")
    public List<Producto> findAll() {
        return productoService.findAll();
    }


    @GetMapping("/productos/{id}")
    public Producto findById(@PathVariable Long id){
        return productoService.findById(id);
    }


    @PutMapping("/productos")
    public Producto updateById(@RequestBody Producto producto) {
        return productoService.updateById(producto);
    }

    @DeleteMapping("/productos/{id}")
    public void deleteById(@PathVariable Long id) {
        productoService.deleteById(id);
    }

}
