package upeu.edu.pe.Ventas.Dao;

import java.util.List;


import upeu.edu.pe.Ventas.Entity.Cliente;


public interface ClienteDao {
	Cliente create(Cliente cl);
	Cliente update(Cliente cl);
	void delete(Long id);
	Cliente read(Long id);
	List<Cliente>readAll();
}
