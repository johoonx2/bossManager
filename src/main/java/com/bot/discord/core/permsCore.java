package com.bot.discord.core;

import com.bot.discord.util.STATIC;
import net.dv8tion.jda.core.entities.Role;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.Arrays;

public class permsCore {

    public static boolean check(MessageReceivedEvent event) {

        for( Role r : event.getGuild().getMember(event.getAuthor()).getRoles()){
            if(Arrays.stream(STATIC.PERMS).parallel().anyMatch(r.getName() :: contains)){
                return false;
            }else{
                event.getTextChannel().sendMessage(":warning: sorry, " + event.getAuthor().getAsMention() + ", you dont't have the permissions to use this command!").queue();
            }
        }

        return true;
    }

}
