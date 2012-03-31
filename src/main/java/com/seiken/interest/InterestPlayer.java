package com.seiken.interest;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;

public class InterestPlayer implements Listener {

    private final Interest plugin;

    public InterestPlayer( final Interest plugin )
    {
        this.plugin = plugin;
    }
    
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        plugin.updateCurrent(event.getPlayer());
    }

    @EventHandler
    public void onPlayerQuit( PlayerQuitEvent event )
    {
    	plugin.removeCurrent( event.getPlayer() );
    }

    
    
    @EventHandler
    public void onPlayerMove( PlayerMoveEvent event )
    {
    	plugin.updateCurrent( event.getPlayer() );
    }

}