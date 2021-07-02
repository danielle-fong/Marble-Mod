package ratattataaa.marble.stone;

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

public class MarbleStone implements ModInitializer {

	public static final Item MARBLE_STONE = new Item(new Item.Settings().group(ItemGroup.MISC));

	public static final Block MARBLE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(1.5F,6F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES).requiresTool());

	@Override
	public void onInitialize() {

	Registry.register(Registry.ITEM, new Identifier("marblestone","marble_stone"),MARBLE_STONE);
	Registry.register(Registry.BLOCK, new Identifier("marblestone","marble_block"),MARBLE_BLOCK);
	Registry.register(Registry.ITEM, new Identifier("marblestone","marble_block"), new BlockItem(MARBLE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

	}
}
