package Data.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    @OneToMany
    private Set<Entries> users = new HashSet<>();
}
