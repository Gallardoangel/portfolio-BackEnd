package com.portfoliobackend.mgb.Service;

import com.portfoliobackend.mgb.Entity.Work;
import com.portfoliobackend.mgb.Repository.RWork;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SWork {
     @Autowired
     RWork rWork;
     
     public List<Work> list(){
         return rWork.findAll();
     }
     
     public Optional<Work> getOne(int id){
         return rWork.findById(id);
     }
     
     public Optional<Work> getByNombreE(String nombreE){
         return rWork.findByNombreE(nombreE);
     }
     
     public void save(Work expe){
         rWork.save(expe);
     }
     
     public void delete(int id){
         rWork.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rWork.existsById(id);
     }
     
     public boolean existsByNombreE(String nombreE){
         return rWork.existsByNombreE(nombreE);
     }
}
