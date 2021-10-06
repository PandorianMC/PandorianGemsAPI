/*
 * Copyright (c) Refrac
 * If you have any questions please join my discord https://discord.gg/jVnmm7QnQU
 */
package me.refrac.simplegems.api.manager;

import me.refrac.simplegems.manager.Profile;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.Map;
import java.util.UUID;

public class ProfileManager {

    /**
     * Used to create a player's profile.
     * This is done on the first join of the player.
     *
     * @param uuid Player's UUID
     * @param name Player's name
     */
    public void handleProfileCreation(UUID uuid, String name) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to get a player's profile.
     *
     * @param object Player's UUID or Name
     * @return Player's profile
     */
    public Profile getProfile(Object object) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to get the list of profiles.
     *
     * @return List of profiles
     */
    public Map<UUID, Profile> getProfiles() {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to set the list of profiles.
     *
     * @param profiles List of profiles
     */
    public void setProfiles(Map<UUID, Profile> profiles) {
        throw new IllegalPluginAccessException("API is not registered!");
    }
}
