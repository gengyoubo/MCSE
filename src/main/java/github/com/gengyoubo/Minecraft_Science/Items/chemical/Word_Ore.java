package github.com.gengyoubo.Minecraft_Science.Items.chemical;

import github.com.gengyoubo.Minecraft_Science.ModEventSubcriber.ModEventSubscriber;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;

import java.util.*;

public class Word_Ore extends Block {
    public Word_Ore() {
        super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(0.1f, 10f).lightLevel(s -> 10).requiresCorrectToolForDrops().noCollission());

    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 15;
    }

    @Override
    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
            return tieredItem.getTier().getLevel() >= 2;
        return false;
    }
    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        List<ItemStack> possibleDrops = Arrays.asList(
                new ItemStack(ModEventSubscriber.a.get()), new ItemStack(ModEventSubscriber.b.get())
                , new ItemStack(ModEventSubscriber.c.get()), new ItemStack(ModEventSubscriber.d.get()), new ItemStack(ModEventSubscriber.e.get())
                , new ItemStack(ModEventSubscriber.f.get()), new ItemStack(ModEventSubscriber.g.get()), new ItemStack(ModEventSubscriber.h.get())
                , new ItemStack(ModEventSubscriber.i.get()), new ItemStack(ModEventSubscriber.j.get()), new ItemStack(ModEventSubscriber.k.get())
                , new ItemStack(ModEventSubscriber.l.get()), new ItemStack(ModEventSubscriber.m.get()), new ItemStack(ModEventSubscriber.n.get())
                , new ItemStack(ModEventSubscriber.o.get()), new ItemStack(ModEventSubscriber.p.get()), new ItemStack(ModEventSubscriber.q.get())
                , new ItemStack(ModEventSubscriber.r.get()), new ItemStack(ModEventSubscriber.s.get()), new ItemStack(ModEventSubscriber.t.get())
                , new ItemStack(ModEventSubscriber.u.get()), new ItemStack(ModEventSubscriber.v.get()), new ItemStack(ModEventSubscriber.w.get())
                , new ItemStack(ModEventSubscriber.x.get()), new ItemStack(ModEventSubscriber.y.get()), new ItemStack(ModEventSubscriber.z.get())
                , new ItemStack(ModEventSubscriber.Uppercase_A.get()), new ItemStack(ModEventSubscriber.Uppercase_B.get())
                , new ItemStack(ModEventSubscriber.Uppercase_C.get()), new ItemStack(ModEventSubscriber.Uppercase_D.get())
                , new ItemStack(ModEventSubscriber.Uppercase_E.get()), new ItemStack(ModEventSubscriber.Uppercase_F.get())
                , new ItemStack(ModEventSubscriber.Uppercase_G.get()), new ItemStack(ModEventSubscriber.Uppercase_H.get())
                , new ItemStack(ModEventSubscriber.Uppercase_I.get()), new ItemStack(ModEventSubscriber.Uppercase_J.get())
                , new ItemStack(ModEventSubscriber.Uppercase_K.get()), new ItemStack(ModEventSubscriber.Uppercase_L.get())
                , new ItemStack(ModEventSubscriber.Uppercase_M.get()), new ItemStack(ModEventSubscriber.Uppercase_N.get())
                , new ItemStack(ModEventSubscriber.Uppercase_O.get()), new ItemStack(ModEventSubscriber.Uppercase_P.get())
                , new ItemStack(ModEventSubscriber.Uppercase_Q.get()), new ItemStack(ModEventSubscriber.Uppercase_R.get())
                , new ItemStack(ModEventSubscriber.Uppercase_S.get()), new ItemStack(ModEventSubscriber.Uppercase_T.get())
                , new ItemStack(ModEventSubscriber.Uppercase_U.get()), new ItemStack(ModEventSubscriber.Uppercase_V.get())
                , new ItemStack(ModEventSubscriber.Uppercase_W.get()), new ItemStack(ModEventSubscriber.Uppercase_X.get())
                , new ItemStack(ModEventSubscriber.Uppercase_Y.get()), new ItemStack(ModEventSubscriber.Uppercase_Z.get())
        );

        // 创建一个用于存储最终掉落物的列表
        List<ItemStack> finalDrops = new ArrayList<>();

        // 生成一个 3 到 5 的随机数，用于决定掉落多少种物品
        Random random = new Random(); // 使用标准的 java.util.Random // 使用随机数生成器
        int dropCount = 3 + random.nextInt(3); // 随机生成 3 到 5 之间的数字

        // 从 possibleDrops 中随机选择 dropCount 种物品
        for (int i = 0; i < dropCount; i++) {
            ItemStack randomDrop = possibleDrops.get(random.nextInt(possibleDrops.size()));
            finalDrops.add(randomDrop);
        }
        return finalDrops;
    }
}

