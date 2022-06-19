# PandorianGemsAPI
Welcome to the official PandorianGemsAPI!

# API Usage
Import the PandorianGemsAPI.jar into your project.
Make sure you add PandorianGems to your depends or softdepends
```YAML
depend:
  - PandorianGems

softdepend:
  - PandorianGems
```

```JAVA
public double getGems(Player player) {
    return GemsAPI.INSTANCE.getGems(player);
}

public boolean hasGems(Player player, double amount) {
    return GemsAPI.INSTANCE.hasGems(player, amount);
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
