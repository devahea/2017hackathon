package org.ahea.build.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class FieldCategory {
    @Id
    String id;

    String fieldName;
    String description;
    String regularExpression;
    String categoryType;
    String dataType;

    @Transient
    List<String> conditions;

    public FieldCategory() {

    }

    public FieldCategory(String fieldName, String description, String regularExpression, String categoryType, String dataType, List<String> conditions) {
        this.fieldName = fieldName;
        this.description = description;
        this.regularExpression = regularExpression;
        this.categoryType = categoryType;
        this.dataType = dataType;
        this.conditions = conditions;
    }
}
