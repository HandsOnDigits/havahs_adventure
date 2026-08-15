package net.mcreator.havahsadventure.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.havahsadventure.procedures.NeedleCottonSeedRightclickedOnBlockProcedure;

public class NeedleCottonSeedItem extends Item {
	public NeedleCottonSeedItem() {
		super(new Item.Properties());
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		NeedleCottonSeedRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getLevel().getBlockState(context.getClickedPos()),
				context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}