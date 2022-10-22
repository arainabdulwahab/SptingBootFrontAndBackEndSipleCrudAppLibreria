package com.arian.libreria.service;

import com.arian.libreria.model.Libreria;

public interface ILibreriaService {

	Iterable<Libreria> getAllLibro();
	Libreria getLibroById(Integer id);
	Libreria saveLibro(Libreria libro);
	Libreria updateLibro(Integer id, Libreria libro);
	Libreria updateLibroPrezzo(Integer id, Libreria libro);
	Libreria deleteLibroById(Integer id);
	
	
}
