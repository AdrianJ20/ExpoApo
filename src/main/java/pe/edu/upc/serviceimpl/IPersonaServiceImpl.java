package pe.edu.upc.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.dao.IPersonaDAO;
import pe.edu.upc.entity.Persona;
import pe.edu.upc.service.IPersonaService;

@Service
public class IPersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaDAO pDAO;

	@Override
	public void Insertar(Persona persona) {
		pDAO.save(persona);
	}

	@Override
	public void Modificar(Persona persona) {
		pDAO.save(persona);
	}

	@Override
	public void Eliminar(int idPersona) {
		pDAO.delete(idPersona);
	}

	@Override
	public List<Persona> Listar() {
		return pDAO.findAll();
	}

	@Override
	public Persona ListarId(int idPersona) {
		return pDAO.findOne(idPersona);
	}

	@Override
	public List<Persona> findByDniPersona(String dni) {
		return pDAO.findByDniPersona(dni);
	}

	@Override
	public List<Persona> buscarNombre(String namePersona) {
		return pDAO.buscarNombre(namePersona);
	}

	@Override
	public List<Persona> buscarEmail(String emailPersona) {
		return pDAO.buscarEmail(emailPersona);
	}

	@Override
	public List<Persona> findByBirthDatePersona(Date birthDatePersona) {
		return pDAO.findByBirthDatePersona(birthDatePersona);
	}

}
