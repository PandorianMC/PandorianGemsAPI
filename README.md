# SimpleGemsAPI
Welcome to the official SimpleGemsAPI!

# API Usage

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
Make sure you add SimpleGems to your depends or softdepends
```YAML
depend:
  - SimpleGems

softdepend:
  - SimpleGems
```

```JAVA
public long getGems(Player player) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    return profile.getGems(player);
}

public void giveGems(Player player, long amount) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    profile.giveGems(player, amount);
}

public void takeGems(Player player, long amount) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    profile.takeGems(player, amount);
}

public void setGems(Player player, long amount) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    profile.setGems(player, amount);
}

public Boolean getSetting(Player player, String setting) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    return profile.getSetting(player, setting);
}

public void setSetting(Player player, String setting, boolean value) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    profile.setSetting(player, setting, value);
}
```
