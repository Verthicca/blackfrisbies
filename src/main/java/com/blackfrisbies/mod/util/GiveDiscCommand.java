package com.blackfrisbies.mod.util;

import com.blackfrisbies.mod.item.ItemLibrary;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class GiveDiscCommand {
    private GiveDiscCommand(){}

    public static void register(CommandDispatcher<CommandSource> dispatcher)
    {
        dispatcher.register(Commands.literal("givedisc").requires(commandSource -> commandSource.hasPermissionLevel(0)).executes((context -> giveDisc(context.getSource())))

        );
    }
    private static int giveDisc(CommandSource source) throws CommandSyntaxException
    {
        Random r = new Random(System.nanoTime());
        ServerPlayerEntity player = source.asPlayer();
        ServerWorld world = source.getWorld();
        int chosen = r.nextInt(15);
        switch (chosen) {
        case 0:
            player.addItemStackToInventory(new ItemStack(ItemLibrary.DISC_SOLD));
            break;
        case 1:
            player.addItemStackToInventory(new ItemStack(ItemLibrary.DISC_RING_OF_FIRE));
            break;
        case 2:
            player.addItemStackToInventory(new ItemStack(ItemLibrary.DISC_ELVIRA));
            break;
        case 3:
            player.addItemStackToInventory(new ItemStack(ItemLibrary.DISC_MAN_OF_SORROW));
            break;
        case 4:
            player.addItemStackToInventory(new ItemStack(ItemLibrary.DISC_HILLBILLY_BONE));
            break;
        case 5:
            player.addItemStackToInventory(new ItemStack(ItemLibrary.DISC_COUNTRY_HARMONY));
            break;
        case 6:
            player.addItemStackToInventory(new ItemStack(ItemLibrary.DISC_AFRICA));
            break;
        case 7:
            player.addItemStackToInventory(new ItemStack(ItemLibrary.DISC_STARLIGHTBRIGADE));
            break;
        case 8:
            player.addItemStackToInventory(new ItemStack(ItemLibrary.DISC_MISTYMOUNTAINS));
            break;
        case 9:
            player.addItemStackToInventory(new ItemStack(ItemLibrary.DISC_DIGGYDIGGY));
            break;
        case 10:
            player.addItemStackToInventory(new ItemStack(ItemLibrary.DISC_GLORY));
            break;
        case 11:
            player.addItemStackToInventory(new ItemStack(ItemLibrary.DISC_ROCKAFELLER));
            break;
        case 12:
            player.addItemStackToInventory(new ItemStack(ItemLibrary.DISC_ROCKTORWHO));
            break;
        case 13:
            player.addItemStackToInventory(new ItemStack(ItemLibrary.DISC_SURVIVOR));
            break;
        case 14:
            player.addItemStackToInventory(new ItemStack(ItemLibrary.DISC_TRYEVERYTHING));
            break;
        default:
            player.addItemStackToInventory(new ItemStack(Items.MELON));
            break;
        }
        return Command.SINGLE_SUCCESS;
    }
}
