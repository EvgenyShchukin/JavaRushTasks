package com.javarush.task.sql.task09.task0902;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "animal_table", schema="test")
public class Animal {
    @Id
    @Column(name="id")
    Long id;
    @Column(name="name")
    String name;
    @Column(name="age")
    Integer age;
    @Column(name="family")
    String family;
}