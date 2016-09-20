package br.com.prisonersofwar.Entity

import groovy.transform.Canonical

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Canonical
@Entity
class Rank {

    @Id
    @Column(name = "id")
    Integer id

    @Column(name = "name")
    String name

    @Column(name = "Score")
    String score

    @Column(name = "Kills")
    Integer kills

    @Column(name = "KDR")
    String kdr

    @Column(name = "HSR")
    String headshots

}
