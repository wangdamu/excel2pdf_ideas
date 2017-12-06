package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.zm;

public class zeo
  extends zel
{
  public zeo(zm paramzm)
  {
    super(paramzm);
  }
  
  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    int i = 0;
    byte[] arrayOfByte = new byte[Byte.MIN_VALUE];
    int j = 0;
    byte b1 = 0;
    byte b2 = 0;
    int k = 0;
    for (int m = 0; m < paramInt2; m++)
    {
      i = paramInt1 + m;
      if (k != 0)
      {
        b1 = paramArrayOfByte[i];
        b2 = paramArrayOfByte[(i - 1)];
      }
      switch (k)
      {
      case 0: 
        k = 1;
        break;
      case 1: 
        if (b1 == b2)
        {
          k = 3;
          j = 2;
        }
        else
        {
          k = 2;
          arrayOfByte[0] = b2;
          j = 1;
        }
        break;
      case 2: 
        if (b1 == b2)
        {
          a(arrayOfByte, j & 0xFF);
          k = 3;
          j = 2;
        }
        else
        {
          arrayOfByte[(j & 0xFF)] = b2;
          j = (byte)(j + 1);
          if (j == -128)
          {
            a(arrayOfByte, j & 0xFF);
            k = 1;
          }
        }
        break;
      case 3: 
        if (b1 != b2)
        {
          a(b2, j & 0xFF);
          k = 1;
        }
        else
        {
          j = (byte)(j + 1);
          if (j == -128)
          {
            a(b1, j & 0xFF);
            k = 1;
          }
        }
        break;
      default: 
        throw new IllegalStateException("Unknown RLE state.");
      }
    }
    switch (k)
    {
    case 2: 
      arrayOfByte[(j & 0xFF)] = b1;
      a(arrayOfByte, (j & 0xFF) + 1);
      break;
    case 3: 
      a(b1, (j & 0xFF) + 1);
      break;
    default: 
      throw new IllegalStateException("Unknown RLE state.");
    }
    this.a.a((byte)Byte.MIN_VALUE);
  }
  
  private void a(byte[] paramArrayOfByte, int paramInt)
    throws Exception
  {
    if ((!b) && ((paramInt < 1) || (paramInt > 128))) {
      throw new AssertionError();
    }
    this.a.a((byte)(paramInt - 1));
    this.a.b(paramArrayOfByte, 0, paramInt);
  }
  
  private void a(byte paramByte, int paramInt)
    throws Exception
  {
    if ((!b) && ((paramInt < 2) || (paramInt > 128))) {
      throw new AssertionError();
    }
    this.a.a((byte)(257 - paramInt));
    this.a.a(paramByte);
  }
  
  public void a()
    throws Exception
  {
    super.a();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zeo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */