package services;

import models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ProductoRepository;

import java.util.List;

@Service
public class ProductoServicesImple implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    public ProductoServicesImple(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto findById(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        productoRepository.deleteById(id);
    }

}