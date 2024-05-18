package com.co.jhonan.examenes.services;

import org.springframework.stereotype.Service;

import com.co.jhonan.commons.service.CommonService;
import com.co.jhonan.commons.service.CommonServiceImpl;
import com.co.jhonan.commonsService.examen.models.entity.Examen;
import com.co.jhonan.examenes.repository.ExamenRepository;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen,ExamenRepository> implements CommonService<Examen>{

}
