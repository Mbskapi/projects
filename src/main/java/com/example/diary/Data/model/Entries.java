package Data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity

public class Entries {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private  int id;
    private String body;
    private LocalDateTime localDateTime;
}
