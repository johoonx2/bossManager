package com.bot.discord.commands;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import com.bot.discord.core.permsCore;

public class cmdPing implements Command{

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {

        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        if(permsCore.check(event))
            return;

        event.getTextChannel().sendMessage("Pong").queue();
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {
        System.out.println("[INFO] Command '-ping' executed");
    }

    @Override
    public String help() {
        return null;
    }
}
