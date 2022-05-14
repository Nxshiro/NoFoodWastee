package com.nofoodwaste.app.User;

import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@With
@ToString
@EqualsAndHashCode
@Table(name = "shop", schema = "public")
public class Shop {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "city")
    private String city;

    @Column(name = "panier")
    private String panier;
    //je pars du principe que les commerçant propose un seul panier

    @Column(name = "description")
    private String description;
    //description du panier


}