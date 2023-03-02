package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Knight {

    @Autowired @Qualifier("dragon")
    //@QuestType(type=QuestType.Type.YoYeYo)
    private Quest quest;

    public String goQuest(){
        return quest.goQuest();
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }


    public void setSpringBean(List<MyInterface> list){


    }
}
