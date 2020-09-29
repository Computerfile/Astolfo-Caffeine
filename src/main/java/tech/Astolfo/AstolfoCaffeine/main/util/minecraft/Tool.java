package tech.Astolfo.AstolfoCaffeine.main.util.minecraft;
import net.dv8tion.jda.api.entities.Emote;

import java.util.HashMap;

import static tech.Astolfo.AstolfoCaffeine.App.jda;

public class Tool {

    private final HashMap<Block.Material, Integer> specs;
    public Emote emote;

    public Tool(int stone_dmg, int wood_dmg, int dirt_dmg, String emote_str) {
        emote = jda.getEmoteById(emote_str);
        specs = new HashMap<>();
        specs.put(Block.Material.STONE, stone_dmg);
        specs.put(Block.Material.WOOD, wood_dmg);
        specs.put(Block.Material.DIRT, dirt_dmg);
    }

    public int damageTo(Block.Material type) {
        return specs.get(type);
    }

}
