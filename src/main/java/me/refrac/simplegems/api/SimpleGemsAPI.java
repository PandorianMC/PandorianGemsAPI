/*
 * Copyright (c) Refrac
 * If you have any questions please join my discord https://discord.gg/jVnmm7QnQU
 */
package me.refrac.simplegems.api;

import me.refrac.simplegems.manager.ProfileManager;
import org.bukkit.plugin.IllegalPluginAccessException;

/**
 * The SimpleGemsAPI allows you to hook into SimpleGems to either modify and grab data
 * or to add new features and events. Questions? https://discord.gg/jVnmm7QnQU
 */
public class SimpleGemsAPI {
    public static SimpleGemsAPI INSTANCE;

    /**
     * @return Is the SimpleGemsAPI enabled and registered?
     */
    public static boolean isRegistered() {
        throw new IllegalPluginAccessException("API is not registered!");
    }

    /**
     * The #getProfileManager method allows you to use settings inside the
     * profile management class. This gives you info on gems amount, player name, and more.
     *
     * @return player's profile.
     */
    public ProfileManager getProfileManager() {
        throw new IllegalPluginAccessException("API is not registered!");
    }
}
