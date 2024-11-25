package com.achartech.dslist.service;

import com.achartech.dslist.dto.GameDTO;
import com.achartech.dslist.dto.GameListDTO;
import com.achartech.dslist.dto.GameMinDTO;
import com.achartech.dslist.entities.GameList;
import com.achartech.dslist.entities.Games;
import com.achartech.dslist.repositories.GameListRepository;
import com.achartech.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }

}
