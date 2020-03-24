/**
 * andresilva created on 24/03/2020 inside the package - com.avarias.springsolid.model
 */
package com.avarias.springsolid.model;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "photos")
public class Photo {
    @Id
    private String id;

    private String title;

    private Binary image;

    public Photo(final String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public Binary getImage() {
        return image;
    }

    public void setImage(final Binary image) {
        this.image = image;
    }
}
