package net.xanthian.variantcomposters.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

import net.minecraft.block.ComposterBlock;
import net.minecraft.entity.ai.brain.task.FarmerWorkTask;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(FarmerWorkTask.class)
public class FarmerWorkTaskMixin {

    @WrapOperation(method = "performAdditionalWork", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"))
    boolean variantlecterns$customComposter(BlockState state, Block block, Operation<Boolean> original) {
        return original.call(state, block) || state.getBlock() instanceof ComposterBlock;
    }
}