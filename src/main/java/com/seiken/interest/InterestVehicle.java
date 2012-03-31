package com.seiken.interest;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleMoveEvent;

public class InterestVehicle implements Listener {

    private final Interest plugin;

    public InterestVehicle( final Interest plugin )
    {
        this.plugin = plugin;
    }
    
    @EventHandler
    public void onVehicleMove( VehicleMoveEvent event )
    {
    	if ( event.getVehicle().getPassenger() instanceof Player )
    		plugin.updateCurrent( ( Player )event.getVehicle().getPassenger() );
    }
    
}