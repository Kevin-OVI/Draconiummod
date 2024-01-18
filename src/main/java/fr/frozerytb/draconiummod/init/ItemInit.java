package fr.frozerytb.draconiummod.init;

import java.util.ArrayList;
import java.util.List;

import fr.frozerytb.draconiummod.objects.items.ItemBase;
import fr.frozerytb.draconiummod.objects.items.armor.ArmorBase;
import fr.frozerytb.draconiummod.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.ItemArmor.ArmorMaterial;


public class ItemInit
{
    public static List<Item> ITEMS = new ArrayList<Item>();


    //materiaux
    public static final ArmorMaterial ARMOR_MATERIAL_AZURITE = EnumHelper.addArmorMaterial("armor_material_azurite", Reference.MODID + ":azurite", 14,
            new int[] {3, 6, 4, 2}, 14, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.0F);

    public static final Item.ToolMaterial TOOLS_MATERIAL_AZURITE = EnumHelper.addToolMaterial("tools_material_azurite", );



    //LINGOT
    public static final Item AZURITE_INGOT = new ItemBase("azurite_ingot");
    public static final Item DRACONIUM_INGOT = new ItemBase("draconium_ingot");
    public static final Item FINDIUM_CRISTAL = new ItemBase("findium_cristal");

    //OUTILS
    public static final Item AZURITE_AXE = new ItemAxe("azurite_axe");
    public static final Item AZURITE_PICKAXE = new ItemPickaxe("azurite_pickaxe");
    public static final Item AZURITE_SHOVEL = new ItemShovel("azurite_shovel");
    public static final Item AZURITE_SWORD = new ItemSword("azurite_sword");

    //ARMURES

    public static final Item AZURITE_HELMET = new ArmorBase("azurite_hemet", ARMOR_MATERIAL_AZURITE, 1, EntityEquipmentSlot.HEAD);
    public static final Item AZURITE_CHESTPLATE= new ArmorBase("azurite_chestplate", ARMOR_MATERIAL_AZURITE, 1, EntityEquipmentSlot.CHEST);
    public static final Item AZURITE_LEGGINGS = new ArmorBase("azurite_leggingss", ARMOR_MATERIAL_AZURITE, 2, EntityEquipmentSlot.LEGS);
    public static final Item AZURITE_BOOTS = new ArmorBase("azurite_boots", ARMOR_MATERIAL_AZURITE, 1, EntityEquipmentSlot.FEET);



}




