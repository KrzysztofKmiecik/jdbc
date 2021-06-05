package pl.kmiecik.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VideoDaoImpl implements VideoDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public VideoDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void saveVideo(Long id, String title, String url) {
        Video video = new Video(id, title, url);
        String sql="INSERT INTO videos VALUES (?,?,?)";
        jdbcTemplate.update(sql,video.getVideoId(),video.getTitle(),video.getUrl());
    }

    @Override
    public List<Video> findAll() {
        return null;
    }

    @Override
    public void updateVideo() {

    }

    @Override
    public void deleteVideo() {

    }
}
