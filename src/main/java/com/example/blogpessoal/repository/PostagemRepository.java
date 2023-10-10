package com.example.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{ /*Pede a model e a tipagem da PK*/

	public List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
	/* Select * from postagem where titulo = "" */
}
