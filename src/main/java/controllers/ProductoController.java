package controllers;

import models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repositories.ProductoRepository;
import services.ProductoService;

import java.util.List;

@RestController
public class ProductoController {

    public ProductoService productoService;


    public ProductoController (ProductoService productoService) {
        this.productoService = productoService;
    }


    @PostMapping("/producto")
    public Producto crearProducto(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

    @GetMapping("/producto")
    public List<Producto> findAll() {
        return productoService.findAll();
    }

    @GetMapping("/producto/{id}")
    public Producto findById(@PathVariable Long id) {
        return productoService.findById(id);
    }

    @PutMapping("/producto/{id}")
    public Producto updateById(@RequestBody Producto producto) {
        return productoService.updateById(id, producto);
    }

    @DeleteMapping("/producto/{id}")
    public void deleteById(@PathVariable Long id) {
         productoService.deleteById(id);
    }

}
