/**
 * andresilva created on 24/03/2020 inside the package - com.avarias.springsolid.repository
 */
package com.avarias.springsolid.repository;

import com.avarias.springsolid.model.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> {
}
