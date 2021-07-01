package ratattataaa.marble.block;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MarbleBlock implements ModInitializer {

	public static final Item MARBLE = new Item(new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {

	Registry.register(Registry.ITEM, new Identifier("marbleblock","marble"),MARBLE);


	}
}
