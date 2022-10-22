package com.arian.libreria.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arian.libreria.model.Libreria;
import com.arian.libreria.repository.LibreriaRepository;

@Service
public class LibreriaService implements ILibreriaService{

	@Autowired
	private LibreriaRepository repo;
	@Override
	public Iterable<Libreria> getAllLibro() {
		return repo.findAll();
	}

	@Override
	public Libreria getLibroById(Integer id) {
		Optional<Libreria> libro = repo.findById(id);
		if(libro.isEmpty() == false) {
			return libro.get();
		}
		return null;
	}

	@Override
	public Libreria saveLibro(Libreria libro) {
		return repo.save(libro);
	}

	@Override
	public Libreria updateLibro(Integer id, Libreria libro) {
		Optional<Libreria> lb = repo.findById(id);
		if(lb.isEmpty() == false) {
			lb.get().setTitolo(libro.getTitolo());
			lb.get().setGenere(libro.getGenere());
			lb.get().setAnnoPubblicazione(libro.getAnnoPubblicazione());
			lb.get().setImmagini(libro.getImmagini());
			lb.get().setIsbn(libro.getIsbn());
			lb.get().setPrezzo(libro.getPrezzo());
			repo.save(lb.get());
			return lb.get();
		}
		return null;
	}

	@Override
	public Libreria updateLibroPrezzo(Integer id, Libreria libro) {
		Optional<Libreria> lb = repo.findById(id);
		if(lb.isEmpty() == false) {
			lb.get().setPrezzo(libro.getPrezzo());
			repo.save(lb.get());
			return lb.get();
		}
		return null;
	}

	@Override
	public Libreria deleteLibroById(Integer id) {
		Optional<Libreria> lb = repo.findById(id);
		if(lb.isEmpty() == false) {
			return lb.get();
		}
		return null;
	}

}
