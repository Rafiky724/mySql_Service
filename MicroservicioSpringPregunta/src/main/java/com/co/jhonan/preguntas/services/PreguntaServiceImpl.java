package com.co.jhonan.preguntas.services;

import org.springframework.stereotype.Service;

import com.co.jhonan.commons.service.CommonService;
import com.co.jhonan.commons.service.CommonServiceImpl;
import com.co.jhonan.commonsService.pregunta.models.entity.Pregunta;
import com.co.jhonan.preguntas.repository.PreguntaRepository;

@Service
public class PreguntaServiceImpl extends CommonServiceImpl<Pregunta, PreguntaRepository> implements CommonService<Pregunta>{

}
