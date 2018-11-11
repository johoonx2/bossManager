package com.bot.discord.controller;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] Args){

//        System.out.println("HelloWorld " + Args[0]);
        JDABuilder builder = new JDABuilder(AccountType.BOT);
//        builder.setToken(Args[0]);
//        builder.setAutoReconnect(true);
//        builder.setStatus(OnlineStatus.ONLINE);
//        JDA jda =  builder.buildBlocking();

    }
}
