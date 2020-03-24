/**
 * andresilva created on 24/03/2020 inside the package - com.avarias.springsolid.services
 */
package com.avarias.springsolid.services;

import com.avarias.springsolid.model.Photo;
import com.avarias.springsolid.repository.PhotoRepository;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class PhotoService {

    @Autowired
    private PhotoRepository photoRepo;

    public String addPhoto(final String title, final MultipartFile file) throws IOException {
        Photo photo = new Photo(title);
        photo.setImage(
                new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        photo = photoRepo.insert(photo);
        return photo.getId();
    }

    public Photo getPhoto(final String id) {
        return photoRepo.findById(id).get();
    }
}
