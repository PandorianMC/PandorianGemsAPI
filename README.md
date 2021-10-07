# SimpleGemsAPI
Welcome to the official SimpleGemsAPI!

# API Usage
```JAVA
public long getGems(Player player) {
    ProfileManager profile = SimpleGemsAPI.getProfileManager();
    return profile.getGems(player);
}

public void giveGems(Player player, long amount) {
    ProfileManager profile = SimpleGemsAPI.getProfileManager();
    profile.giveGems(player, amount);
}

public void takeGems(Player player, long amount) {
    ProfileManager profile = SimpleGemsAPI.getProfileManager();
    profile.takeGems(player, amount);
}
```
