package upeu.edu.pe.Ventas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import upeu.edu.pe.Ventas.Entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
