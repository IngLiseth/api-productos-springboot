package com.api.productos.service;
import java.util.List;


import com.api.productos.entity.Producto;

public interface ProductoService {

     List<Producto> listarProductos();

    Producto guardarProducto(Producto producto);

}
