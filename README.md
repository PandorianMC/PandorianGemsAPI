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
```
