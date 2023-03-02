package com.demo.beans;

import org.springframework.stereotype.Component;

@Component //@QuestType(type = QuestType.Type.Matrimony)
public class GreatMatrimonyQuest implements Quest{

    @Override
    public String goQuest() {
        return "The Knight and princess's wedding...";
    }
}
