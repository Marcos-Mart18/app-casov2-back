package upeu.edu.pe.Ventas.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.edu.pe.Ventas.Dao.ProductoDao;
import upeu.edu.pe.Ventas.Entity.Producto;
import upeu.edu.pe.Ventas.Repository.ProductoRepository;
@Component
public class ProductoDaoImpl implements ProductoDao{
	@Autowired
	private ProductoRepository productoRepository;
	@Override
	public Producto create(Producto pr) {
		// TODO Auto-generated method stub
		return productoRepository.save(pr);
	}

	@Override
	public Producto update(Producto pr) {
		// TODO Auto-generated method stub
		return productoRepository.save(pr);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		productoRepository.deleteById(id);
	}

	@Override
	public Producto read(Long id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(id).get();
	}

	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return productoRepository.findAll();
	}

}
