package org.etniqa.sql.injection.retrieve.creds.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String price;
}