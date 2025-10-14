package com.api.productos.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.api.productos.entity.Producto;
import com.api.productos.repository.ProductoRepository;



@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }
}
