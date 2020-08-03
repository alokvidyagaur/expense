package com.example.alokcode.expense.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@Data
@Table(name="catagoery")
public class Catagoery
{
    @Id
    private Long id;
    private String name;




}


