package br.com.prisonersofwar.controller

import br.com.prisonersofwar.Entity.Rank
import br.com.prisonersofwar.service.RankService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rank")
class RankController {

    @Autowired
    RankService service

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    List<Rank> buscarRank(@RequestParam("numero") Integer numero) {
        service.buscarRank(numero)
    }

}
