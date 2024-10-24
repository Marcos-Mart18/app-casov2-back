package upeu.edu.pe.Ventas.Service;

import java.util.List;

import upeu.edu.pe.Ventas.Entity.Cliente;

public interface ClienteService {
	Cliente create(Cliente cl);
	Cliente update(Cliente cl);
	void delete(Long id);
	Cliente read(Long id);
	List<Cliente>readAll();
}
