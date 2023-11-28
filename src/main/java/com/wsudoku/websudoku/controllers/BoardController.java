package com.wsudoku.websudoku.controllers;

import com.wsudoku.websudoku.models.BoardDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @PostMapping ("/board")
    public BoardDTO internBoard(@RequestBody BoardDTO boardDTO){
        System.out.println(boardDTO);
        return boardDTO;

    }

    @GetMapping ("/board")
    public BoardDTO outBoard(){
        return new BoardDTO();
    }


}

