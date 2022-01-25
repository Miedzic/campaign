package com.miedzic.campaign.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany
    private List<Keyword> keywords;
    @ManyToOne
    private Product product;
    private int bidAmount;
    private int campaignFund;
    private boolean status;
    @ManyToOne
    private Town town;
    private int radius;
}
