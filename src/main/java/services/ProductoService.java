package services;

import models.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductoService {
    public Producto save(Producto producto);
    public List<Producto> findAll();
    public Producto findById(Long id);
    public Producto updateById(Producto producto);
    public void deleteById(Long id);
}
