package pl.kmiecik.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Start {
    private final VideoDao videoDao;

    @Autowired
    public Start(VideoDao videoDao) {
        this.videoDao = videoDao;

        videoDao.saveVideo(2L,"java","kmk.pl/java");
        videoDao.saveVideo(3L,"docker","kmk.pl/docker");
        videoDao.saveVideo(4L,"CI","kmk.pl/CI");
    }

}
