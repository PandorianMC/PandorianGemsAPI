# SimpleGemsAPI
Welcome to the official SimpleGemsAPI!

### NOTE: The SimpleGemsAPI only works for the premium version.
[Polymart](https://polymart.org/resource/simplegems-1-8-1-16.1611)
[Songoda](https://songoda.com/marketplace/product/simplegems-18-116-add-gems-to-minecraft-a-new-type-of-currency-to-servers.754)

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
    return GemsAPI.INSTANCE.getGems(player);
}

public boolean hasGems(Player player, double amount) {
    return GemsAPI.INSTANCE.hasGems(player);
}

public void payGems(Player player, Player target, double amount, boolean silent) {
    GemsAPI.INSTANCE.payGems(player, target, amount, false);
}

public void withdrawGems(Player player, int amount) {
    GemsAPI.INSTANCE.withdrawGems(player, amount);
}

public void giveGemsItem(Player player, int amount) {
    GemsAPI.INSTANCE.giveGemsItem(player, amount);
}

public ItemStack getGemsItem() {
    return GemsAPI.INSTANCE.getGemsItem();
}

public void payGems(Player player, Player target, double amount) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    profile.payGems(player, target, amount);
}

public void withdrawGems(Player player, int amount) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    profile.withdrawGems(player, amount);
}

public void giveGemsItem(Player player, int amount) {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    profile.giveGemsItem(player, amount);
}

public ItemStack getGemsItem() {
    ProfileManager profile = SimpleGemsAPI.INSTANCE.getProfileManager();
    return profile.getGemsItem();
}

public void giveGems(Player player, double amount) {
    GemsAPI.INSTANCE.giveGems(player, amount);
}

public void takeGems(Player player, double amount) {
    GemsAPI.INSTANCE.takeGems(player, amount);
}

public void setGems(Player player, double amount) {
    GemsAPI.INSTANCE.setGems(player, amount);
}
```