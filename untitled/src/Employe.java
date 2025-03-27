import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Employe {
    private final UUID id;
    private String nom;
    private String prenom;
    private Planning planning;
    private final List<Pointage> pointages;

    public Employe(String nom, String prenom, Planning planning) {
        this.id = UUID.randomUUID();
        this.nom = Objects.requireNonNull(nom);
        this.prenom = Objects.requireNonNull(prenom);
        this.planning = Objects.requireNonNull(planning);
        this.pointages = new ArrayList<>();
    }

    // Acceseurs En Lecture
    public UUID getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public Planning getPlanning() { return planning; }
    public List<Pointage> getPointages() { return new ArrayList<>(pointages); }

    // Acceseurs En Ecriture
    public void setNom(String nom) { this.nom = Objects.requireNonNull(nom); }
    public void setPrenom(String prenom) { this.prenom = Objects.requireNonNull(prenom); }
    public void setPlanning(Planning planning) { this.planning = Objects.requireNonNull(planning); }

