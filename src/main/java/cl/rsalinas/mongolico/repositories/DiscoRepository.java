package cl.rsalinas.mongolico.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import cl.rsalinas.mongolico.models.Disco;

public interface DiscoRepository extends MongoRepository<Disco, String> {
	Disco findBy_id(ObjectId _id);
}