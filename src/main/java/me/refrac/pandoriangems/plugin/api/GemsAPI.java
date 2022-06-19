/*
 * Copyright (c) Refrac
 * If you have any questions please join my discord https://discord.gg/jVnmm7QnQU
 */
package me.refrac.pandoriangems.plugin.api;

import me.refrac.pandoriangems.plugin.manager.ProfileData;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * The PandorianGemsAPI allows you to hook into PandorianGems to either modify and grab data
 * or to add new features and events.
 */
public class GemsAPI {
    public static GemsAPI INSTANCE;

    /**
     * @return Is the PandorianGemsAPI enabled and registered?
     */
    public static boolean isRegistered() {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to get a player's profile data.
     *
     * @return Player's profile
     */
    public ProfileData getProfileData(Player player) {
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
     *
     * @param player player profile
     * @param target target profile
     * @param amount paid gems
     * @param silent silent gems
     */
    public void payGems(Player player, Player target, double amount, boolean silent) {
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
     * Used to check if the player has enough gems
     *
     * @param player player
     * @param amount gems
     * @return If the player has enough gems
     */
    public boolean hasGems(Player player, double amount) {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * Used to give player gems.
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
}