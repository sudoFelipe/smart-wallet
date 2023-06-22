package com.ribbtec.smartwallet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ribbtec.smartwallet.entity.TipoAtivo;

@Repository
public interface TipoAtivoRepository extends MongoRepository<TipoAtivo, String> {

}
