# SimpleGemsAPI
Welcome to the official SimpleGemsAPI!

# API Usage

Make sure you add SimpleGems to your depends or softdepends
```YAML
depend:
  - SimpleGems

softdepend:
  - SimpleGems
```

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

public void setGems(Player player, long amount) {
    ProfileManager profile = SimpleGemsAPI.getProfileManager();
    profile.setGems(player, amount);
}

public Boolean getSetting(Player player, String setting) {
    ProfileManager profile = SimpleGemsAPI.getProfileManager();
    return profile.getSetting(player, setting);
}

public void setSetting(Player player, String setting, boolean value) {
    ProfileManager profile = SimpleGemsAPI.getProfileManager();
    profile.setSetting(player, setting, value);
}
```
