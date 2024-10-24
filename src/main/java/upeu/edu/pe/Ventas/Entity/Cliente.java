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
@Table(name = "CLIENTE")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	@Column(name = "nombre",columnDefinition = "varchar(50)")
	private String nombre;
	@Column(name = "apellido",columnDefinition = "varchar(50)")
	private String apellido;
	@Column(name = "dni",columnDefinition = "char(8)")
	private String dni;
}
