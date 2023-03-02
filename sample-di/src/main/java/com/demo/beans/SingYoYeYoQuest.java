package com.demo.beans;

import org.springframework.stereotype.Component;

@Component //@QuestType(type = QuestType.Type.YoYeYo)
public class SingYoYeYoQuest implements  Quest{
    public String goQuest(){
        return "Knight sings 'YoYeYo' and comeback home.";
    }
}
