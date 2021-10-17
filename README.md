# SimpleGemsAPI
Welcome to the official SimpleGemsAPI!

### NOTE: The SimpleGemsAPI only works for the premium version.

# API Usage

Import the SimpleGemsAPI.jar into your project.
Make sure you add SimpleGems to your depends or softdepends
```YAML
depend:
  - SimpleGems

softdepend:
  - SimpleGems
```

```JAVA
public double getGems(Player player) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    return profile.getGems(player);
}

public boolean hasGems(Player player, double amount) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    return profile.hasGems(player);
}

public void giveGems(Player player, double amount) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    profile.giveGems(player, amount);
}

public void takeGems(Player player, double amount) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    profile.takeGems(player, amount);
}

public void setGems(Player player, double amount) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    profile.setGems(player, amount);
}
```
