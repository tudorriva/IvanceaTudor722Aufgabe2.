package Controller;

import Entities.Medikamente;
import Entities.Patienten;
import Repository.IRepository;

import java.util.List;

public class Controller {
    public IRepository<Medikamente> medikamenteRepo;
    public IRepository<Patienten> patientenRepo;

    public Medikamente getMedikament(int id) { return medikamenteRepo.get(id); }
    public Patienten getPatienten(int id) {return patientenRepo.get(id); }
    public void createMedikamente(Medikamente medikamente) {medikamenteRepo.create(medikamente);}
    public void createPatienten(Patienten patienten) {patientenRepo.create(patienten);}
    public void updateMedikamente(int id, Medikamente medikamente) {medikamenteRepo.update(id, medikamente);}
    public void updatePatienten(int id, Patienten patienten) {patientenRepo.update(id, patienten);}
    public void deleteMedikamente(int id) {medikamenteRepo.delete(id);}
    public void deletePatienten(int id) {patientenRepo.delete(id);}
    public List<Medikamente> getAllMedikamente() {return medikamenteRepo.getAll();}
    public List<Patienten> getAllPatienten() {return patientenRepo.getAll(); }
}
