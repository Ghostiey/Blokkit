package com.ryanv97.blokkit.client.renderer.giant;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderGiantGoldBlokkit extends RenderLiving
{
    private static final ResourceLocation texture = new ResourceLocation("blokkit", "textures/models/giant/goldBlokkit.png");

    public RenderGiantGoldBlokkit(ModelBase model)
    {
        super(model, 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1)
    {
        return texture;
    }
}