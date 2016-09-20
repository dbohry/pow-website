package br.com.prisonersofwar.service

import br.com.prisonersofwar.Entity.Rank
import br.com.prisonersofwar.repository.RankRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class RankService {

    @Autowired
    RankRepository repository

    List<Rank> buscarRank(Integer numero) {
        repository.getRankWithNumber(numero)
    }

}
