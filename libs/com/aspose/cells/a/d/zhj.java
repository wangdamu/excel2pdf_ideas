package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.b.a.zi;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.zs;

public class zhj
{
  public static double a(double paramDouble)
  {
    return zao.d(paramDouble * 96.0D);
  }
  
  public static String b(double paramDouble)
  {
    return zp.c(a(paramDouble));
  }
  
  public static String a(Color paramColor)
  {
    return "#" + zp.d(paramColor.toArgb());
  }
  
  public static String a(zi paramzi)
  {
    float[] arrayOfFloat = paramzi.d();
    StringBuilder localStringBuilder = new StringBuilder(64);
    localStringBuilder.append(zp.b(arrayOfFloat[0]));
    localStringBuilder.append(',');
    localStringBuilder.append(zp.b(arrayOfFloat[1]));
    localStringBuilder.append(',');
    localStringBuilder.append(zp.b(arrayOfFloat[2]));
    localStringBuilder.append(',');
    localStringBuilder.append(zp.b(arrayOfFloat[3]));
    localStringBuilder.append(',');
    localStringBuilder.append(zp.b(arrayOfFloat[4]));
    localStringBuilder.append(',');
    localStringBuilder.append(zp.b(arrayOfFloat[5]));
    return zs.a(localStringBuilder);
  }
  
  public static String a(zo paramzo)
  {
    return zp.b(paramzo.d()) + "," + zp.b(paramzo.e());
  }
  
  public static String a(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    case 1: 
      str = "Bevel";
      break;
    case 0: 
    case 3: 
      str = "Miter";
      break;
    case 2: 
      str = "Round";
      break;
    default: 
      str = "Bevel";
    }
    return str;
  }
  
  public static String b(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    case 0: 
    case 16: 
    case 19: 
    case 20: 
    case 240: 
    case 255: 
      str = "Flat";
      break;
    case 2: 
    case 18: 
      str = "Round";
      break;
    case 1: 
    case 17: 
      str = "Square";
      break;
    case 3: 
      str = "Triangle";
      break;
    default: 
      str = "Square";
    }
    return str;
  }
  
  public static String c(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    case 0: 
      str = "Flat";
      break;
    case 2: 
      str = "Round";
      break;
    case 3: 
      str = "Triangle";
      break;
    case 1: 
    default: 
      str = "Square";
    }
    return str;
  }
  
  public static String a(float[] paramArrayOfFloat)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramArrayOfFloat.length; i++)
    {
      localStringBuilder.append(zp.b(paramArrayOfFloat[i]));
      if (i < paramArrayOfFloat.length - 1) {
        localStringBuilder.append(" ");
      }
    }
    return zs.a(localStringBuilder);
  }
  
  public static String d(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    case 4: 
      str = "None";
      break;
    case 0: 
      str = "Tile";
      break;
    case 1: 
      str = "FlipX";
      break;
    case 2: 
      str = "FlipY";
      break;
    case 3: 
      str = "FlipXY";
      break;
    default: 
      str = "None";
    }
    return str;
  }
  
  public static float[] a(zx paramzx)
    throws Exception
  {
    int i = (paramzx.c == 2) || (paramzx.c == 1) || (paramzx.d == 2) || (paramzx.d == 1) ? 1 : 0;
    int j = paramzx.e == 2 ? 1 : 0;
    float[] arrayOfFloat = zeu.a(paramzx, (i != 0) || (j != 0));
    for (int k = 0; k < arrayOfFloat.length; k++) {
      if (arrayOfFloat[k] == 0.0F) {
        arrayOfFloat[k] = 0.01F;
      }
    }
    return arrayOfFloat;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zhj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */