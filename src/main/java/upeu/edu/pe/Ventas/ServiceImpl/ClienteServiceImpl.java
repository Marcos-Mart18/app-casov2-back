package upeu.edu.pe.Ventas.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.Ventas.Dao.ClienteDao;
import upeu.edu.pe.Ventas.Entity.Cliente;
import upeu.edu.pe.Ventas.Service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	@Autowired
	private ClienteDao clienteDao;
	@Override
	public Cliente create(Cliente cl) {
		return clienteDao.create(cl);
	}

	@Override
	public Cliente update(Cliente cl) {
		return clienteDao.update(cl);
	}

	@Override
	public void delete(Long id) {
		clienteDao.delete(id);
	}

	@Override
	public Cliente read(Long id) {
		return clienteDao.read(id);
	}

	@Override
	public List<Cliente> readAll() {
		return clienteDao.readAll();
	}

}
