package br.com.prisonersofwar.repository

import br.com.prisonersofwar.Entity.Rank
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface RankRepository extends JpaRepository<Rank, Integer> {

    @Query(value = "SELECT tpd.SoldierName as 'name', tpd.PlayerID as 'id', SUM(tps.Score) AS 'Score', SUM(tps.Kills) AS 'Kills', (SUM(tps.Kills)/SUM(tps.Deaths)) AS 'KDR', (SUM(tps.Headshots)/SUM(tps.Kills)) AS 'HSR' FROM tbl_playerdata tpd INNER JOIN tbl_server_player tsp ON tsp.PlayerID = tpd.PlayerID INNER JOIN tbl_playerstats tps ON tps.StatsID = tsp.StatsID GROUP BY tpd.PlayerID ORDER BY Score DESC, tpd.SoldierName ASC LIMIT :numero", nativeQuery = true)
    List<Rank> getRankWithNumber(@Param("numero") Integer numero)

}
