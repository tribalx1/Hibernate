package com.example.entities;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "salles")
public class Salle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    
    @OneToMany(mappedBy = "salle", fetch = FetchType.EAGER)
    private List<Machine> machines;
    
    // Constructeurs
    public Salle() {
    }
    
    public Salle(String code) {
        this.code = code;
    }
    
    public Salle(String code, List<Machine> machines) {
        this.code = code;
        this.machines = machines;
    }
    
    // Getters et setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public List<Machine> getMachines() {
        return machines;
    }
    
    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }
    
    @Override
    public String toString() {
        return "Salle{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", machines=" + (machines != null ? machines.size() : 0) + " machines" +
                '}';
    }
}
