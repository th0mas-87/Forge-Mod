package th0mas87.ForgeMod.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ForgeModCommonProxy implements IGuiHandler {

	public void registerRenderInformation() {
		
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		return null;
	}

	public void registerTiles() {
		
	}

	public void registerBlocks() {
		GameRegistry.registerBlock(ForgeMod.smoothStone, "smoothStone");
		LanguageRegistry.addName(ForgeMod.smoothStone, "Smooth Stone");
	}

	public void registerItems() {

	}

}