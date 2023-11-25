package ru.dbp.queryexecutorservice.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "song_sequence")
    @SequenceGenerator(name = "song_sequence", sequenceName = "song_sequence", allocationSize = 1)
    private Long id;

    private String title;
    private String artist;
    private String album;
    private String genre;
    private Integer releaseYear;
    private Integer durationInSeconds;

    @Lob
    private String lyrics;

    @ManyToOne
    @JoinColumn(name = "band_id")
    private Band band;
}
