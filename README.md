# SimpleGemsAPI
Welcome to the official SimpleGemsAPI!

# API Usage

Make sure you add SimpleGems to your depends or softdepends
### Maven
You can either import the jar or use maven.
```XAML
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>

<dependency>
    <groupId>com.github.Refrac</groupId>
    <artifactId>SimpleGemsAPI</artifactId>
    <version>1.2-SNAPSHOT</version>
</dependency>
```

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
