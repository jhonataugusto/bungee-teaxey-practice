package me.kinox.commands;

import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class Practice_01 extends Command {
    public Practice_01(){
        super("practice01");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {

        ProxiedPlayer player = (ProxiedPlayer) sender;
        if(sender instanceof ProxiedPlayer){

            player.sendMessage(new TextComponent(ChatColor.GREEN+"Conectando voce ao practice."));
            player.connect(ProxyServer.getInstance().getServerInfo("practice-01"));
        } else {

            BungeeCord.getInstance().getConsole().sendMessage(new TextComponent(ChatColor.RED+"Voce nao e um jogador para utilizar este comando"));
        }
    }
}
