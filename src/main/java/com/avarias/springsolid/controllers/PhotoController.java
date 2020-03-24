/**
 * andresilva created on 24/03/2020 inside the package - com.avarias.springsolid.controllers
 */
package com.avarias.springsolid.controllers;

import com.avarias.springsolid.services.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping(value = "/upload")
public class PhotoController {


    @Autowired
    PhotoService photoService;

    @PostMapping("/photos/add")
    public String addPhoto(@RequestParam("title") final String title,
                           @RequestParam("image") final MultipartFile image, final Model model)
            throws IOException {
        final String id = photoService.addPhoto(title, image);
        return "redirect:/photos/" + id;
    }
}
