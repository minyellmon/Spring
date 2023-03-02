package com.demo.beans;

import org.springframework.stereotype.Component;

@Component //@QuestType(type = QuestType.Type.Dimsel)
public class RescuingDimselQuest implements Quest{

    public String goQuest(){
        return "The Knight is going to save Dimsel...";

    }
}
