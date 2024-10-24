package upeu.edu.pe.Ventas.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.Ventas.Dao.ProductoDao;
import upeu.edu.pe.Ventas.Entity.Producto;
import upeu.edu.pe.Ventas.Service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{
	@Autowired
	private ProductoDao productoDao;
	@Override
	public Producto create(Producto pr) {
		// TODO Auto-generated method stub
		return productoDao.create(pr);
	}

	@Override
	public Producto update(Producto pr) {
		// TODO Auto-generated method stub
		return productoDao.update(pr);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		productoDao.delete(id);
	}

	@Override
	public Producto read(Long id) {
		// TODO Auto-generated method stub
		return productoDao.read(id);
	}

	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return productoDao.readAll();
	}

}
