# SimpleGemsAPI
Welcome to the official SimpleGemsAPI!

# API Usage

### Maven
Import the SimpleGemsAPI.jar into your project.
Make sure you add SimpleGems to your depends or softdepends
```YAML
depend:
  - SimpleGems

softdepend:
  - SimpleGems
```

```JAVA
public int getGems(Player player) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    return profile.getGems(player);
}

public boolean hasGems(Player player, int amount) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    return profile.hasGems(player);
}

public void giveGems(Player player, int amount) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    profile.giveGems(player, amount);
}

public void takeGems(Player player, int amount) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    profile.takeGems(player, amount);
}

public void setGems(Player player, int amount) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    profile.setGems(player, amount);
}
```
