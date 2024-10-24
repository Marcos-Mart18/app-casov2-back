package upeu.edu.pe.Ventas.Service;

import java.util.List;


import upeu.edu.pe.Ventas.Entity.Producto;
public interface ProductoService {
	Producto create(Producto pr);
	Producto update(Producto pr);
	void delete(Long id);
	Producto read(Long id);
	List<Producto>readAll();
}
