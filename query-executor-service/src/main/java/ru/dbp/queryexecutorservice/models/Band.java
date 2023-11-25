package ru.dbp.queryexecutorservice.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "bands")
public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "band_sequence")
    @SequenceGenerator(name = "band_sequence", sequenceName = "band_sequence", allocationSize = 1)
    private Long id;

    private String name;
    private String genre;
    private Integer formationYear;
    private String country;

    @OneToMany(mappedBy = "band", cascade = CascadeType.ALL)
    private List<Song> songs;
}
