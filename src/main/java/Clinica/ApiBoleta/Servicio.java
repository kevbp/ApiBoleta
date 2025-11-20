/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiBoleta;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {
    
    @Autowired
    private Repositorio repo;

    public Boleta grabar(Boleta bol) {
        return repo.save(bol);
    }

    public Boleta buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    public List<Boleta> listar() {
        return repo.findAll();
    }

    public Boleta actualizar(Long id, Boleta bol) {
        return repo.findById(id).map(existing -> {
            existing.setIdCit(bol.getIdCit());
            existing.setIdPac(bol.getIdPac());
            existing.setFec(bol.getFec());
            existing.setHor(bol.getHor());
            existing.setPreTot(bol.getPreTot());
            existing.setIdEmp(bol.getIdEmp());
            return repo.save(existing);
        }).orElse(null);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
