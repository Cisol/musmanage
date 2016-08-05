package cn.cisol.service.impl;

import cn.cisol.entity.MusicEntity;
import cn.cisol.service.MusicService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/3 0003.
 */
@Service("musicService")
public class MusicServiceImpl implements MusicService{

    private static List<MusicEntity> musicList = new ArrayList<MusicEntity>();

    public MusicServiceImpl() {
        MusicEntity music1 = new MusicEntity(1, "my", "me", "blabla");
        MusicEntity music2 = new MusicEntity(2, "her", "she", "hhaa");
        musicList.add(music1);
        musicList.add(music2);
    }

    @Override
    public List<MusicEntity> getMusicList() {
        return musicList;
    }

    @Override
    public void addMusic(MusicEntity music) {
        musicList.add(music);
    }
}
