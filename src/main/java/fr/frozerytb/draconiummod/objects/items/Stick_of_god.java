package fr.frozerytb.draconiummod.objects.items;

import fr.frozerytb.draconiummod.Main;
import fr.frozerytb.draconiummod.init.ItemInit;
import fr.frozerytb.draconiummod.util.interfaces.IHasmodel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class  Stick_of_god extends Item implements IHasmodel
{
	public Stick_of_god(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxDamage(15);
		setMaxStackSize(1);
		setCreativeTab(Main.DraconiummodTab);
		ItemInit.ITEMS.add(this);
	}
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		if(!worldIn.isRemote)
		{
			playerIn.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 4440, 1));
			playerIn.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 4440, 1));
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
		}
		else
		{
			return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
		}
	}
}
