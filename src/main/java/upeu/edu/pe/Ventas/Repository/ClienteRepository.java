package upeu.edu.pe.Ventas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import upeu.edu.pe.Ventas.Entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
