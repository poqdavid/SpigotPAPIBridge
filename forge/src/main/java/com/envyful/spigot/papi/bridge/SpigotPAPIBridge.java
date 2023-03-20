package com.envyful.spigot.papi.bridge;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import com.envyful.papi.api.util.UtilPlaceholder;

import java.util.Arrays;

public class SpigotPAPIBridge extends PlaceholderExpansion {

    private static final String IDENTIFIER = "FPAPIBridge";
    private static final String AUTHOR = "Envyful";
    private static final String VERSION = "1.0.1";

    @Override
    public String getIdentifier() {
        return IDENTIFIER;
    }

    @Override
    public String getAuthor() {
        return AUTHOR;
    }

    @Override
    public String getVersion() {
        return VERSION;
    }

    @Override
    public String onRequest(OfflinePlayer player, String params) {
        if(player != null){
            return UtilPlaceholder.replaceIdentifiers(player.getUniqueId(), "%" + params + "%");
        }
        else {
            return UtilPlaceholder.replaceIdentifiers((OfflinePlayer) null, "%" + params + "%");
        }
    }
}
