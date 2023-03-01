package br.com.devto.clube.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devto.clube.entity.Clube;

public interface ClubeRepository extends JpaRepository<Clube, Long>  {

}
