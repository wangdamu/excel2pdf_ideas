package com.aspose.cells.a.c;

import com.aspose.cells.Color;
import java.awt.SystemColor;
import java.util.HashMap;

public class zh
{
  private static HashMap<Integer, Color> a = new HashMap();
  
  public static boolean a(Color paramColor)
  {
    return (paramColor == null) || (paramColor.isEmpty());
  }
  
  public static byte b(Color paramColor)
  {
    return paramColor.getR();
  }
  
  public static byte c(Color paramColor)
  {
    return paramColor.getG();
  }
  
  public static byte d(Color paramColor)
  {
    return paramColor.getB();
  }
  
  public static boolean a(Color paramColor1, Color paramColor2)
  {
    if (paramColor1 == null) {
      return (paramColor2 == null) || (paramColor2.isEmpty());
    }
    if (paramColor2 == null) {
      return paramColor1.isEmpty();
    }
    return paramColor1.equals(paramColor2);
  }
  
  static
  {
    a.put(Integer.valueOf(0), Color.fromArgb(SystemColor.scrollbar.getRGB()));
    a.put(Integer.valueOf(1), Color.fromArgb(SystemColor.desktop.getRGB()));
    a.put(Integer.valueOf(2), Color.fromArgb(SystemColor.activeCaption.getRGB()));
    a.put(Integer.valueOf(3), Color.fromArgb(SystemColor.inactiveCaption.getRGB()));
    a.put(Integer.valueOf(4), Color.fromArgb(SystemColor.menu.getRGB()));
    a.put(Integer.valueOf(5), Color.fromArgb(SystemColor.window.getRGB()));
    a.put(Integer.valueOf(6), Color.fromArgb(SystemColor.windowBorder.getRGB()));
    a.put(Integer.valueOf(7), Color.fromArgb(SystemColor.menuText.getRGB()));
    a.put(Integer.valueOf(8), Color.fromArgb(SystemColor.windowText.getRGB()));
    a.put(Integer.valueOf(9), Color.fromArgb(SystemColor.activeCaptionText.getRGB()));
    a.put(Integer.valueOf(10), Color.fromArgb(SystemColor.activeCaptionBorder.getRGB()));
    a.put(Integer.valueOf(11), Color.fromArgb(SystemColor.inactiveCaptionBorder.getRGB()));
    a.put(Integer.valueOf(12), Color.fromArgb(-5526613));
    a.put(Integer.valueOf(13), Color.fromArgb(SystemColor.textHighlight.getRGB()));
    a.put(Integer.valueOf(14), Color.fromArgb(SystemColor.textHighlightText.getRGB()));
    a.put(Integer.valueOf(15), Color.fromArgb(SystemColor.control.getRGB()));
    a.put(Integer.valueOf(16), Color.fromArgb(SystemColor.controlShadow.getRGB()));
    a.put(Integer.valueOf(17), Color.fromArgb(SystemColor.textInactiveText.getRGB()));
    a.put(Integer.valueOf(18), Color.fromArgb(SystemColor.controlText.getRGB()));
    a.put(Integer.valueOf(19), Color.fromArgb(SystemColor.inactiveCaptionText.getRGB()));
    a.put(Integer.valueOf(20), Color.fromArgb(SystemColor.controlLtHighlight.getRGB()));
    a.put(Integer.valueOf(21), Color.fromArgb(SystemColor.controlDkShadow.getRGB()));
    a.put(Integer.valueOf(22), Color.fromArgb(SystemColor.controlHighlight.getRGB()));
    a.put(Integer.valueOf(23), Color.fromArgb(SystemColor.infoText.getRGB()));
    a.put(Integer.valueOf(24), Color.fromArgb(SystemColor.info.getRGB()));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/c/zh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */