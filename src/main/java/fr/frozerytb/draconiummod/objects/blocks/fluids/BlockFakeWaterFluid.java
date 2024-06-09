package fr.frozerytb.draconiummod.objects.blocks.fluids;

import fr.frozerytb.draconiummod.init.BlockInit;
import fr.frozerytb.draconiummod.init.ItemInit;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockFakeWaterFluid extends BlockFluidClassic {
    public BlockFakeWaterFluid(String name, Fluid fluid, Material material) {
        super(fluid, material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
        if ((worldIn.isRemote || entityIn instanceof EntityItem || entityIn instanceof EntityBoat) ||
                (entityIn instanceof EntityPlayer && (((EntityPlayer) entityIn).capabilities.isCreativeMode || (entityIn.getRidingEntity() instanceof EntityBoat)))) {
            return;
        }
        entityIn.attackEntityFrom(DamageSource.DROWN, 3F);
    }
}

