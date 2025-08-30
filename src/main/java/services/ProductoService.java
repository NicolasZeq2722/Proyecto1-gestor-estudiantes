package services;

import models.Producto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductoService {
    public Producto save(Producto producto);
    public List<Producto> findAll();
    public Producto findById(Long id);
    public void deleteById(Long id);
    public Producto updateById(Producto producto);
}
