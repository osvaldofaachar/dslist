package com.achartech.dslist.repositories;

import com.achartech.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long>{
}
