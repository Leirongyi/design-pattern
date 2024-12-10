package com.github.leirongyi.facade;

import com.github.leirongyi.facade.subsystem.AirConditioner;
import com.github.leirongyi.facade.subsystem.LightSystem;
import com.github.leirongyi.facade.subsystem.MusicSystem;
import lombok.Data;

/**
 * @author 雷荣易
 * @date 2024/11/9
 * @description 智能家居外观
 */
@Data
public class SmartHomeFacade {
    private LightSystem lightSystem;
    private AirConditioner airConditioner;
    private MusicSystem musicSystem;

    public SmartHomeFacade() {
        this.lightSystem = new LightSystem();
        this.airConditioner = new AirConditioner();
        this.musicSystem = new MusicSystem();
    }

    // 提供简单的接口方法，简化外部调用
    public void startEveningRoutine() {
        System.out.println("Starting evening routine...");
        lightSystem.turnOn();
        airConditioner.turnOn();
        musicSystem.playMusic();
    }

    public void endEveningRoutine() {
        System.out.println("Ending evening routine...");
        lightSystem.turnOff();
        airConditioner.turnOff();
        musicSystem.stopMusic();
    }
}
