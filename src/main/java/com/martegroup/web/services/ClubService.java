package com.martegroup.web.services;

import com.martegroup.web.dtos.ClubDto;
import com.martegroup.web.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
