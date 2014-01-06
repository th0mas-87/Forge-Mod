package th0mas87.ForgeMod.common;

import th0mas87.ForgeMod.common.handlers.ForgeModClientPacketHandler;
import th0mas87.ForgeMod.common.handlers.ForgeModServerPacketHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

@NetworkMod(clientSideRequired = true, serverSideRequired = true, clientPacketHandlerSpec = @SidedPacketHandler(channels = { "ForgeMod" }, packetHandler = ForgeModClientPacketHandler.class), serverPacketHandlerSpec = @SidedPacketHandler(channels = { "ForgeMod" }, packetHandler = ForgeModServerPacketHandler.class))
@Mod(modid = "ForgeMod", name = "Forge Mod", version = "Release")
public class ForgeMod {

	@Instance("ForgeMod")
	public static ForgeMod instance = new ForgeMod();

	@SidedProxy(clientSide = "th0mas87.ForgeMod.client.ForgeModClientProxy", serverSide = "th0mas87.ForgeMod.common.ForgeModCommonProxy")
	public static ForgeModCommonProxy proxy;

	@PreInit
	public void PreInit(FMLPreInitializationEvent e) {

	}

	@Init
	public void InitForgeMod(FMLInitializationEvent event) {
		NetworkRegistry.instance().registerGuiHandler(this, proxy);
	}

}