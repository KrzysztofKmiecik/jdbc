package pl.kmiecik.jdbc;

import java.util.List;

//DAO
public interface VideoDao {
    void saveVideo(Long id,String title,String url);
    List<Video> findAll();

    void updateVideo(Video newVideo);

    void deleteVideo(long id);
}
