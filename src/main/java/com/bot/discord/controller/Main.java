package com.bot.discord.controller;

import com.bot.discord.commands.cmdPing;
import com.bot.discord.listener.commandListener;
import com.bot.discord.listener.readyListener;
import com.bot.discord.listener.voiceListener;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;

public class Main {

    public static JDABuilder builder;

    public static void main(String[] Args){

//        System.out.println("HelloWorld " + Args[0]);
        builder = new JDABuilder(AccountType.BOT);
        builder.setToken(Args[0]);
        builder.setAutoReconnect(true);
        builder.setStatus(OnlineStatus.ONLINE);

        addListners();
        addCommands();

        try {
            JDA jda = builder.buildBlocking();
        }catch (LoginException e){
            e.printStackTrace();
        }catch (InterruptedException e){
            e.printStackTrace();
//        }catch (RateLimitedException e){
//            e.printStackTrace();
        }
    }

    public static void addCommands(){
        commandHandler.commands.put("ping", new cmdPing());
    }

    public static void addListners(){

        builder.addEventListener(new commandListener());
        builder.addEventListener(new readyListener());
        builder.addEventListener(new voiceListener());

    }
}
