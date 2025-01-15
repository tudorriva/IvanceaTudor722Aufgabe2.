package Entities;

import java.util.List;

public class Patienten {
    int id;
    String name;
    int alter;
    String Diagnose;
    List<Medikamente> medikamenteList;

    public Patienten(int id, String name, int alter, String diagnose, List<Medikamente> medikamenteList) {
        this.id = id;
        this.name = name;
        this.alter = alter;
        Diagnose = diagnose;
        this.medikamenteList = medikamenteList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getDiagnose() {
        return Diagnose;
    }

    public void setDiagnose(String diagnose) {
        Diagnose = diagnose;
    }

    public List<Medikamente> getMedikamenteList() {
        return medikamenteList;
    }

    public void setMedikamenteList(List<Medikamente> medikamenteList) {
        this.medikamenteList = medikamenteList;
    }
}
