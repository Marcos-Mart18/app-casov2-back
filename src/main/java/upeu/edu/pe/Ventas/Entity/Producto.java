package upeu.edu.pe.Ventas.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "PRODUCTO")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProducto;
	@Column(name = "nombre",columnDefinition = "varchar(50)")
	private String nombre;
	@Column(name = "precio",columnDefinition = "decimal(5,2)")
	private double precio;
	@Column(name = "cantidad",columnDefinition = "int")
	private Long cantidad;
}
