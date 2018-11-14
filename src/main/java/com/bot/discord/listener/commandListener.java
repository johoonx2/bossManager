package com.bot.discord.listener;

import com.bot.discord.controller.commandHandler;
import com.bot.discord.util.STATIC;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class commandListener extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event) {

        System.out.println(event.getMessage().getContentDisplay());

        if(event.getMessage().getContentRaw().contains(STATIC.PREFIX) && event.getMessage().getId() != event.getJDA().getSelfUser().getId()){
            commandHandler.handlerCommand(commandHandler.parser.parser(event.getMessage().getContentRaw(), event));
        }
    }

}
