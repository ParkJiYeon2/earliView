package evp.earliView.controller;

import evp.earliView.domain.Media;
import evp.earliView.domain.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MediaController {
    @Autowired
    private MediaRepository repository;
    @RequestMapping("/medias")
    public Iterable<Media> getMedia(){
        return repository.findAll();

    }
}
