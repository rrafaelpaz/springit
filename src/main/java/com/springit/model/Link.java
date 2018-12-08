package com.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor//public constructor
@Data//getter/setters/etc..
public class Link {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;




}
