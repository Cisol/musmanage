package cn.cisol.service;

import cn.cisol.entity.MusicEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/8/3 0003.
 */

@Service
public interface MusicService {

    public List<MusicEntity> getMusicList();
    public void addMusic(MusicEntity music);

}
