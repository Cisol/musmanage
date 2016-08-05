package cn.cisol.controller;

import cn.cisol.entity.MusicEntity;
import cn.cisol.service.MusicService;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Cisol on 2016/7/30 0030.
 */
@Controller
@RequestMapping("/music")
public class MusicController {

    private MusicService musicService;
    private static Logger logger = LoggerFactory.getLogger(MusicController.class);

    @Autowired
    public void setMusicService(MusicService musicService) {
        this.musicService = musicService;
    }

    public MusicController() {

    }

    @RequestMapping("/edit")
    public String edit() {
        logger.info("edit function");
        return "add";
    }

    @RequestMapping(value="/add", method=RequestMethod.POST)
    public String addMusic(@ModelAttribute MusicEntity musicEntity) {
        logger.info("mid", musicEntity.getMid());
        logger.info("info of music");
        logger.info(ReflectionToStringBuilder.toString(musicEntity));
        musicService.addMusic(musicEntity);
        return "redirect:get";
    }

    @RequestMapping("/get")
    public String getMusicList(Map<String, Object> model) {
        List<MusicEntity> musicList = musicService.getMusicList();
        System.out.println("get function");
        logger.info("musicList:");
        logger.info(ReflectionToStringBuilder.toString(musicList));
        model.put("result", "seccess");
        model.put("data", musicList);
        return "get";
    }

}
