package Controller;

import Entities.Medikamente;
import Entities.Patienten;
import Repository.IRepository;

import java.util.List;
import java.util.stream.Collectors;

public class Controller {
    public IRepository<Medikamente> medikamenteRepo;
    public IRepository<Patienten> patientenRepo;

    public Controller(IRepository<Medikamente> medikamenteRepo, IRepository<Patienten> patientenRepo) {
        this.medikamenteRepo = medikamenteRepo;
        this.patientenRepo = patientenRepo;
    }

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

    public List<Patienten> filterDiagnose(String diagnose) {
        return patientenRepo.getAll().stream().filter(x -> x.getDiagnose().equals(diagnose)).collect(Collectors.toList());
    }

    public List<Patienten> getPatientenByMedikamentKrankheit(String krankheit) {
        return patientenRepo.getAll().stream()
                .filter(patient -> patient.getMedikamenteList().stream()
                        .anyMatch(medikament -> medikament.getKrankheit().equals(krankheit)))
                .collect(Collectors.toList());
    }

    public List<Medikamente> getSortedMedikamenteByPatient(int patientId, boolean ascending) {
        Patienten patient = patientenRepo.get(patientId);
        if (patient == null) {
            return List.of();
        }
        return patient.getMedikamenteList().stream()
                .sorted((m1, m2) -> ascending ? Integer.compare(m1.getPrice(), m2.getPrice()) : Integer.compare(m2.getPrice(), m1.getPrice()))
                .collect(Collectors.toList());
    }
}


