package com.co.jhonan.curso.services;

import org.springframework.stereotype.Service;

import com.co.jhonan.commons.service.CommonService;
import com.co.jhonan.commons.service.CommonServiceImpl;
import com.co.jhonan.commonsService.curso.models.entity.Curso;
import com.co.jhonan.curso.repository.CursoRepository;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CommonService<Curso> {

}