package org.ahea.build.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class FieldData {
    @Id  @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String data;
    String fieldCategoryId;

    long rowNum;

}
