package com.arian.libreria.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.arian.libreria.model.Libreria;
import com.arian.libreria.service.LibreriaService;

@RestController
public class LibreriaController {

		@Autowired 
		LibreriaService serv ;
		
		@GetMapping("/api/libri")
		public Iterable<Libreria> getAllLibro(){
			return serv.getAllLibro();
		}
		
		@GetMapping("/api/libri/{id}")		
		public Libreria getLibroById(@PathVariable Integer id) {
			Libreria libro = serv.getLibroById(id);
			if(libro == null) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Libro non trovato");
			}
			return libro;
		}
		
		@PutMapping("/admin/api/update/{id}")
		public Libreria updateLibro(@PathVariable Integer id, @RequestBody Libreria libro) {
			Libreria lib = serv.updateLibro(id, libro);
			if(lib == null) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Libro non trovato");
			}
			return lib;
		}
		
		@PutMapping("/admin/api/updateprezzo/{id}")
		public 	Libreria updateLibroPrezzo(@PathVariable Integer id, @RequestBody Libreria libro) {
			Libreria lib = serv.updateLibroPrezzo(id, libro);
			if(lib == null) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Libro non trovato");
			}
			return lib;
		}
		
		@DeleteMapping("/admin/api/delete/{id}")
		public Libreria deleteLibroById(@PathVariable Integer id) {
			Libreria libro = serv.getLibroById(id);
			if (libro == null) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Libro non trovato");
			} else {
				serv.deleteLibroById(id);
				return libro;
			}
		}



		
}
