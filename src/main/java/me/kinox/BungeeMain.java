package me.kinox;


import me.kinox.commands.LobbyCommand;
import me.kinox.commands.Practice_01;
import net.md_5.bungee.BungeeCord;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Plugin;;

public class BungeeMain extends Plugin {


    @Override
    public void onEnable() {
        BungeeCord.getInstance().getConsole().sendMessage(new TextComponent(ChatColor.GREEN+"BungeeCord iniciado com sucesso!"));
        registerCommands();
    }

    @Override
    public void onDisable() {

    }


    public void registerCommands(){
        //servers teleport
        BungeeCord.getInstance().getPluginManager().registerCommand(this, new LobbyCommand());
        BungeeCord.getInstance().getPluginManager().registerCommand(this,new Practice_01());
    }
}
