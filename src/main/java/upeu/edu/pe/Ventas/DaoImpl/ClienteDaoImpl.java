package upeu.edu.pe.Ventas.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.edu.pe.Ventas.Dao.ClienteDao;
import upeu.edu.pe.Ventas.Entity.Cliente;
import upeu.edu.pe.Ventas.Repository.ClienteRepository;
@Component
public class ClienteDaoImpl implements ClienteDao{
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public Cliente create(Cliente cl) {
		// TODO Auto-generated method stub
		return clienteRepository.save(cl);
	}

	@Override
	public Cliente update(Cliente cl) {
		// TODO Auto-generated method stub
		return clienteRepository.save(cl);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteRepository.deleteById(id);
	}

	@Override
	public Cliente read(Long id) {
		// TODO Auto-generated method stub
		return clienteRepository.findById(id).get();
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

}
