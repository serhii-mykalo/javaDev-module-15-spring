package com.example.service.service;

import com.example.service.dto.NoteDto;
import com.example.service.exception.NoteNotFoundException;

import java.util.List;

public interface NoteService {

    NoteDto save(NoteDto note);

    void update(NoteDto note) throws NoteNotFoundException;

    NoteDto findById(Long id)  throws NoteNotFoundException;

    List<NoteDto> findAll()  throws NoteNotFoundException;

    void deleteById(Long id)  throws NoteNotFoundException;
}
