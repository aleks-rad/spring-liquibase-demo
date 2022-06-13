package ru.axl.springliquibasedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "databasechangelog")
public class DataBaseChangeLog {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "filename")
    private String filename;

    @Column(name = "orderexecuted")
    private String orderexecuted;

    @Column(name = "exectype")
    private String exectype;

    @Column(name = "description")
    private String description;

}
