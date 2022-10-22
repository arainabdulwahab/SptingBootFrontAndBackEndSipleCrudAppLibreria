package com.arian.libreria.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.arian.libreria.model.Libreria;
import com.arian.libreria.repository.LibreriaRepository;

public class LibreriaService implements ILibreriaService{

	@Autowired
	private LibreriaRepository repo;
	@Override
	public Iterable<Libreria> getAllLibro() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libreria getLibroById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libreria saveLibro(Libreria libro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libreria updateLibro(Integer id, Libreria libro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libreria updateLibroPrezzo(Integer id, Libreria libro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libreria deleteLibroById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
