package com.aspose.cells;

import com.aspose.cells.a.c.zh;

class zbc
  extends zcd
{
  private zava a;
  private boolean c = false;
  private Area d;
  
  zbc(zava paramzava)
  {
    this.a = paramzava;
    c(4106);
    b(16);
    this.b = new byte[16];
    this.b[0] = -1;
    this.b[1] = -1;
    this.b[2] = -1;
    this.b[8] = 1;
    this.b[10] = 1;
    this.b[12] = 78;
    this.b[14] = 77;
  }
  
  Area a()
  {
    return this.d;
  }
  
  void a(Area paramArea)
  {
    this.d = paramArea;
    g();
  }
  
  boolean b()
  {
    return this.c;
  }
  
  private void g()
  {
    int i = this.d.getFormatting() == 1 ? 1 : 0;
    Color localColor1 = this.d.getForegroundColor();
    Color localColor2 = this.d.getBackgroundColor();
    double d1 = this.d.getTransparency();
    if ((zh.a(localColor1)) && (!zh.a(localColor2))) {
      localColor1 = Color.getWhite();
    }
    if ((d1 > 0.0D) && (d1 < 1.0D)) {
      this.c = true;
    }
    int j;
    if ((i == 0) && (!zh.a(localColor1)))
    {
      j = this.a.a(localColor1);
      if (j != -1)
      {
        this.b[0] = localColor1.getR();
        this.b[1] = localColor1.getG();
        this.b[2] = localColor1.getB();
        this.b[12] = ((byte)j);
        byte[] tmp155_150 = this.b;
        tmp155_150[10] = ((byte)(tmp155_150[10] & 0xFE));
        if (tmp155_150 < 9) {
          this.c = true;
        }
      }
      else
      {
        this.c = true;
        tmp155_150 = this.a.a(localColor1.getR() & 0xFF, localColor1.getG() & 0xFF, localColor1.getB() & 0xFF);
        if (tmp155_150 != -1)
        {
          this.b[0] = localColor1.getR();
          this.b[1] = localColor1.getG();
          this.b[2] = localColor1.getB();
          this.b[12] = ((byte)tmp155_150);
          byte[] tmp268_263 = this.b;
          tmp268_263[10] = ((byte)(tmp268_263[10] & 0xFE));
        }
        else
        {
          this.b[0] = -1;
          this.b[1] = -1;
          this.b[2] = -1;
          this.b[12] = 78;
        }
      }
    }
    else
    {
      this.b[0] = -1;
      this.b[1] = -1;
      this.b[2] = -1;
      this.b[12] = 78;
    }
    if ((i == 0) && (!zh.a(localColor2)))
    {
      tmp155_150 = this.a.a(localColor2);
      if (tmp155_150 != -1)
      {
        this.b[4] = localColor2.getR();
        this.b[5] = localColor2.getG();
        this.b[6] = localColor2.getB();
        this.b[14] = ((byte)tmp155_150);
        byte[] tmp416_411 = this.b;
        tmp416_411[10] = ((byte)(tmp416_411[10] & 0xFE));
      }
      else
      {
        this.c = true;
        this.b[4] = 0;
        this.b[5] = 0;
        this.b[6] = 0;
        this.b[14] = 77;
      }
    }
    else
    {
      this.b[4] = 0;
      this.b[5] = 0;
      this.b[6] = 0;
      this.b[14] = 77;
    }
    switch (this.d.getFormatting())
    {
    case 1: 
      this.b[8] = 0;
      this.b[10] = 0;
      break;
    case 2: 
      byte[] tmp557_552 = this.b;
      tmp557_552[8] = ((byte)(tmp557_552[8] | 0x1));
      this.b[10] = 0;
      break;
    case 0: 
      this.b[10] = 1;
    }
    if ((this.d.i() != null) && (this.d.getFillFormat().getFillType() == 5)) {
      c();
    }
    if (this.d.getInvertIfNegative())
    {
      byte[] tmp626_621 = this.b;
      tmp626_621[10] = ((byte)(tmp626_621[10] | 0x2));
    }
  }
  
  void c()
  {
    if ((this.d.i() != null) && (this.d.getFillFormat().getFillType() == 5)) {
      switch (this.d.getFillFormat().getPattern())
      {
      case 2: 
      case 3: 
        this.b[8] = 18;
        break;
      case 4: 
      case 30: 
      case 40: 
        this.b[8] = 17;
        break;
      case 13: 
        this.b[8] = 4;
        break;
      case 5: 
      case 6: 
      case 31: 
        this.b[8] = 16;
        break;
      case 7: 
        this.b[8] = 2;
        break;
      case 8: 
      case 9: 
      case 10: 
      case 11: 
      case 12: 
        this.b[8] = 3;
        break;
      case 14: 
      case 26: 
      case 32: 
      case 33: 
      case 34: 
      case 39: 
      case 41: 
      case 48: 
        this.b[8] = 13;
        break;
      case 15: 
      case 27: 
      case 36: 
      case 38: 
        this.b[8] = 14;
        break;
      case 16: 
      case 18: 
        this.b[8] = 7;
        break;
      case 17: 
      case 19: 
        this.b[8] = 8;
        break;
      case 20: 
      case 22: 
      case 28: 
        this.b[8] = 12;
        break;
      case 21: 
      case 23: 
      case 29: 
        this.b[8] = 11;
        break;
      case 24: 
        this.b[8] = 6;
        break;
      case 25: 
        this.b[8] = 5;
        break;
      case 35: 
      case 44: 
      case 45: 
        this.b[8] = 15;
        break;
      case 37: 
      case 43: 
      case 46: 
      case 47: 
      case 49: 
        this.b[8] = 9;
        break;
      case 42: 
        this.b[8] = 10;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */