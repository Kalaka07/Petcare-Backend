package petcare.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import petcare.entities.Cuenta;
@Service
public interface CuentasJpaRepository extends JpaRepository<Cuenta, Integer>{
	@Transactional
	@Modifying
	@Query("Delete from Cuenta i where i.idCuenta=?1")
	void removeByName(int id);
	
	@Query("Select i from Cuenta i where i.email = ?1 and i.passwd = ?2")
	Cuenta retrieveCuenta(String correo, String contraseña);
	
	@Query("Select i from Cuenta i where i.email = ?1")
	Cuenta retrieveCuenta(String correo);
	
}
