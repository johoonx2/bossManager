package com.bot.discord.listener;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class commandListener extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent event) {

        System.out.println(event.getMessage().getContentDisplay());
    }

}
