package com.bot.discord.listener;

import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class readyListener extends ListenerAdapter{
    public void onReady(ReadyEvent event){
        String out = "\nThis bot is running on following servers: \n";

        for(Guild guild :event.getJDA().getGuilds()){
            out+= guild.getName() + " (" + guild.getId() + ") \n";
        }

        System.out.print(out);
    }
}
