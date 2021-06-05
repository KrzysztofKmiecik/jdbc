package pl.kmiecik.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Start {
    private final VideoDao videoDao;

    @Autowired
    public Start(VideoDao videoDao) {
        this.videoDao = videoDao;

       /* videoDao.saveVideo(2L,"java","kmk.pl/java");
        videoDao.saveVideo(3L,"docker","kmk.pl/docker");
        videoDao.saveVideo(4L,"CI","kmk.pl/CI");*/

      /*  videoDao.updateVideo(new Video(4L, "CI/CD", "kmk.pl/CI-CD"));
        videoDao.deleteVideo(3L);

        List<Video> videoList = videoDao.findAll();
        videoList.forEach(System.out::println);*/

        System.out.println(videoDao.findById(4L));
    }

}
