package org.ahea.build.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.UUID;

@Entity
public class FieldCategory {
    @Id @GeneratedValue(strategy = GenerationType.AUTO,generator = )
    UUID id;

}
