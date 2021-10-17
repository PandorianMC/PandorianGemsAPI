/*
 * Copyright (c) Refrac
 * If you have any questions please join my discord https://discord.gg/jVnmm7QnQU
 */
package me.refrac.simplegems.plugin.api.manager;

import me.refrac.simplegems.plugin.SimpleGems;
import me.refrac.simplegems.plugin.manager.Profile;
import me.refrac.simplegems.plugin.utilities.Files;
import me.refrac.simplegems.plugin.utilities.ItemBuilder;
import me.refrac.simplegems.plugin.utilities.chat.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.ArrayList;
import java.util.List;
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
    public double getGems(Player player) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * This will pay gems to the specified player
     * @param player player profile
     * @param target target profile
     * @param amount paid gems
     */
    public void payGems(Player player, Player target, double amount) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * This will give gems in item form
     * to the player who withdraw them or
     * received them by doing events etc
     *
     * @param player player profile
     * @param amount withdrawal gems
     */
    public void withdrawGems(Player player, int amount) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * This will give gems in item form
     * to the player who withdraw them or
     * received them by doing events etc
     *
     * @param player player profile
     * @param amount gems to remove and turn into an item
     */
    public void giveGemsItem(Player player, int amount) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * This will give gems in item form
     * to the player who withdraw them or
     * received them by doing events etc
     *
     * @return an item stack to redeem gems
     */
    public ItemStack getGemsItem() {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used tp check if the player has enough gems
     *
     * @param player player
     * @param amount gems
     * @return If the player has enough gems
     */
    public boolean hasGems(Player player, double amount) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to give Player gems.
     *
     * @param player player
     * @param amount gems
     */
    public void giveGems(Player player, double amount) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to take player gems.
     *
     * @param player data
     * @param amount gems
     */
    public void takeGems(Player player, double amount) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to set player gems.
     *
     * @param player data
     * @param amount gems
     */
    public void setGems(Player player, double amount) {
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