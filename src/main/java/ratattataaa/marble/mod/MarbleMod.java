package ratattataaa.marble.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MarbleMod implements ModInitializer {

	public static final Item LIMESTONE_LIGHT = new Item(new Item.Settings().group(ItemGroup.MISC));

	public static final Block MARBLE_LIGHT = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F,6F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());

	public static final Item LIMESTONE_DARK = new Item(new Item.Settings().group(ItemGroup.MISC));
	
	public static final Block MARBLE_DARK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F,6F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());

	public static final Block MARBLE_GOLD = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F,6F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());

	@Override
	public void onInitialize() {

	Registry.register(Registry.ITEM, new Identifier("marblemod","limestone_light"),LIMESTONE_LIGHT);

	Registry.register(Registry.BLOCK, new Identifier("marblemod","marble_light"),MARBLE_LIGHT);
	Registry.register(Registry.ITEM, new Identifier("marblemod","marble_light"), new BlockItem(MARBLE_LIGHT, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

	Registry.register(Registry.ITEM, new Identifier("marblemod","limestone_dark"),LIMESTONE_DARK);

	Registry.register(Registry.BLOCK, new Identifier("marblemod","marble_dark"),MARBLE_DARK);
	Registry.register(Registry.ITEM, new Identifier("marblemod","marble_dark"), new BlockItem(MARBLE_DARK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

	Registry.register(Registry.BLOCK, new Identifier("marblemod","marble_gold"),MARBLE_GOLD);
	Registry.register(Registry.ITEM, new Identifier("marblemod","marble_gold"), new BlockItem(MARBLE_GOLD, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
