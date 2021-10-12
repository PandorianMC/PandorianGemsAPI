/*
 * Copyright (c) Refrac
 * If you have any questions please join my discord https://discord.gg/jVnmm7QnQU
 */
package me.refrac.simplegems.plugin.api.manager;

import me.refrac.simplegems.plugin.manager.Profile;
import org.bukkit.entity.Player;
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
     * Used to get player gems.
     *
     * @param player player
     * @return Player's gems
     */
    public int getGems(Player player) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used tp check if the player has enough gems
     *
     * @param player player
     * @param amount gems
     * @return If the player has enough gems
     */
    public boolean hasGems(Player player, long amount) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to give Player gems.
     *
     * @param player player
     * @param amount gems
     */
    public void giveGems(Player player, long amount) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to take player gems.
     *
     * @param player data
     * @param amount gems
     */
    public void takeGems(Player player, long amount) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to set player gems.
     *
     * @param player data
     * @param amount gems
     */
    public void setGems(Player player, long amount) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to reset player's profile data.
     *
     * @param player player
     */
    public void resetPlayer(Player player) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to reset all player data
     */
    public void resetAllData() {
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