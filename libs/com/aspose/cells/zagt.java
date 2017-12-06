package com.aspose.cells;

import com.aspose.cells.b.a.b.za;
import java.awt.Graphics;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.IndexColorModel;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.ParameterBlock;
import javax.media.jai.ColorCube;
import javax.media.jai.ImageLayout;
import javax.media.jai.JAI;
import javax.media.jai.KernelJAI;
import javax.media.jai.RenderedOp;

class zagt
{
  static RenderedImage a(za paramza)
  {
    BufferedImage localBufferedImage = new BufferedImage(paramza.i(), paramza.h(), 10);
    Graphics localGraphics = localBufferedImage.getGraphics();
    localGraphics.drawImage(paramza.f(), 0, 0, null);
    ParameterBlock localParameterBlock = new ParameterBlock();
    localParameterBlock.addSource(localBufferedImage);
    String str = null;
    str = "ordereddither";
    ColorCube localColorCube = ColorCube.createColorCube(0, 0, new int[] { 2 });
    localParameterBlock.add(localColorCube);
    localParameterBlock.add(KernelJAI.DITHER_MASK_441);
    ImageLayout localImageLayout = new ImageLayout();
    byte[] arrayOfByte = { 0, -1 };
    IndexColorModel localIndexColorModel = new IndexColorModel(1, 2, arrayOfByte, arrayOfByte, arrayOfByte);
    localImageLayout.setColorModel(localIndexColorModel);
    RenderingHints localRenderingHints = new RenderingHints(JAI.KEY_IMAGE_LAYOUT, localImageLayout);
    RenderedOp localRenderedOp = JAI.create(str, localParameterBlock, localRenderingHints);
    localGraphics.dispose();
    return localRenderedOp;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zagt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */