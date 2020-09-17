package io.github.sbcloudrace.sbpersona.persona;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="SBPERSONA")
public class SbPersona {

    @Id
    private long id;
    private double boost;
    private double cash;
    private int iconIndex;
    private int level;
    private String motto;
    private String name;
    private float percentToLevel;
    private double rating;
    private double rep;
    private int repAtCurrentLevel;
    private int score;
    private long userId;

    public long getPersonaId(){
        return id;
    }
}
