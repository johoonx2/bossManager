package com.bot.discord.core;

import com.bot.discord.util.STATIC;
import net.dv8tion.jda.core.entities.Role;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.Arrays;

public class permsCore {

    public static boolean check(MessageReceivedEvent event) {

        System.out.println("[INFO] check func Called.");
        for( Role r : event.getGuild().getMember(event.getAuthor()).getRoles()){
            if(Arrays.stream(STATIC.PERMS).parallel().anyMatch(r.getName() :: contains)){
                System.out.println("[INFO] Permission Allowed. (check)");
                return false;
            }else{
                System.out.println("[INFO] Permission Not Allowed. (check)");
                event.getTextChannel().sendMessage(":warning: sorry, " + event.getAuthor().getAsMention() + ", you dont't have the permissions to use this command!").queue();
            }
        }

        return true;
    }

}
