package petcare.entities;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the cuentas database table.
 * 
 */
@Entity
@Table(name="cuentas")
@NamedQuery(name="Cuenta.findAll", query="SELECT c FROM Cuenta c")
public class Cuenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCuenta;

	private String apellidoDos;

	private String apellidoUno;

	private String email;

	private String nombre;

	private int numMovil;

	private int numTelefono;

	private String passwd;

	private byte tipoPerfil;

	private String urlFotoPerfil;

	private String username = "prueba2";

	public Cuenta() {
	}

	public int getIdCuenta() {
		return this.idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getApellidoDos() {
		return this.apellidoDos;
	}

	public void setApellidoDos(String apellidoDos) {
		this.apellidoDos = apellidoDos;
	}

	public String getApellidoUno() {
		return this.apellidoUno;
	}

	public void setApellidoUno(String apellidoUno) {
		this.apellidoUno = apellidoUno;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumMovil() {
		return this.numMovil;
	}

	public void setNumMovil(int numMovil) {
		this.numMovil = numMovil;
	}

	public int getNumTelefono() {
		return this.numTelefono;
	}

	public void setNumTelefono(int numTelefono) {
		this.numTelefono = numTelefono;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public byte getTipoPerfil() {
		return this.tipoPerfil;
	}

	public void setTipoPerfil(byte tipoPerfil) {
		this.tipoPerfil = tipoPerfil;
	}

	public String getUrlFotoPerfil() {
		return this.urlFotoPerfil;
	}

	public void setUrlFotoPerfil(String urlFotoPerfil) {
		this.urlFotoPerfil = urlFotoPerfil;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}