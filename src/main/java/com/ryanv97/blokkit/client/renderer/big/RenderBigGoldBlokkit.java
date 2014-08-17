package com.ryanv97.blokkit.client.renderer.big;

import com.ryanv97.blokkit.client.model.ModelBigBlokkit;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderBigGoldBlokkit extends RenderLiving
{
    private static final ResourceLocation texture = new ResourceLocation("blokkit", "textures/models/big/goldBlokkit.png");

    public RenderBigGoldBlokkit()
    {
        super(new ModelBigBlokkit(), 0.75F);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1)
    {
        return texture;
    }
}