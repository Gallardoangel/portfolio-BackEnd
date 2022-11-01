package com.portfoliobackend.mgb.Interface;

import com.portfoliobackend.mgb.Entity.Persona;
import java.util.List;
    
public interface IPersonaService {
    //Traer una lista de persona
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona ID
    public Persona findPersona(Long id);
    
}
