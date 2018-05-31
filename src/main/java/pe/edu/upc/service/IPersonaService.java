package pe.edu.upc.service;

import java.util.Date;
import java.util.List;

import pe.edu.upc.entity.Persona;

public interface IPersonaService {

	public void Insertar(Persona persona);

	public void Modificar(Persona persona);

	public void Eliminar(int idPersona);

	public Persona ListarId(int idPersona);

	public List<Persona> Listar();

	List<Persona> findByDniPersona(String dni);

	List<Persona> buscarNombre(String namePersona);

	List<Persona> buscarEmail(String emailPersona);

	List<Persona> findByBirthDatePersona(Date birthDatePersona);

}
