package com.aspose.cells;

import com.aspose.cells.a.c.zh;

class zans
  extends zcd
{
  private zava a;
  private Line c;
  
  zans(zava paramzava)
  {
    this.a = paramzava;
    c(4103);
    b(12);
    this.b = new byte[12];
    this.b[6] = -1;
    this.b[7] = -1;
    this.b[8] = 9;
    this.b[10] = 77;
  }
  
  void a()
  {
    this.b[4] = 5;
    this.b[8] = 8;
    this.b[10] = 77;
  }
  
  void a(Line paramLine, int paramInt)
  {
    this.c = paramLine;
    if (!this.c.isVisible())
    {
      this.b[4] = 5;
      this.b[6] = -1;
      this.b[7] = -1;
      this.b[8] = 8;
      this.b[10] = 77;
      return;
    }
    int i;
    if (!zh.a(this.c.getColor()))
    {
      i = this.a.a(this.c.getColor());
      if (i != -1)
      {
        this.b[0] = zh.b(this.c.getColor());
        this.b[1] = zh.c(this.c.getColor());
        this.b[2] = zh.d(this.c.getColor());
        this.b[10] = ((byte)i);
        this.b[8] = 0;
      }
      else
      {
        Color localColor = this.c.getColor();
        i = this.a.a(zh.b(localColor) & 0xFF, zh.c(localColor) & 0xFF, zh.d(localColor) & 0xFF);
        this.b[0] = zh.b(this.c.getColor());
        this.b[1] = zh.c(this.c.getColor());
        this.b[2] = zh.d(this.c.getColor());
        this.b[10] = ((byte)i);
        this.b[8] = 0;
      }
    }
    else if (paramLine.isAuto())
    {
      this.b[0] = 0;
      this.b[1] = 0;
      this.b[2] = 0;
      this.b[10] = 77;
      this.b[8] = 9;
    }
    else
    {
      i = (32 + paramInt) % 56;
      this.b[10] = ((byte)i);
      this.b[8] = 0;
    }
    this.b[4] = ((byte)this.c.getStyle());
    if (this.c.getWeight() == -1)
    {
      this.b[6] = -1;
      this.b[7] = -1;
    }
    else
    {
      this.b[6] = ((byte)this.c.getWeight());
      this.b[7] = 0;
    }
    if (this.c.isAuto())
    {
      byte[] tmp427_422 = this.b;
      tmp427_422[8] = ((byte)(tmp427_422[8] | 0x1));
    }
    else
    {
      byte[] tmp442_437 = this.b;
      tmp442_437[8] = ((byte)(tmp442_437[8] & 0xFE));
    }
  }
  
  void a(Line paramLine, boolean paramBoolean)
  {
    this.c = paramLine;
    if (!zh.a(this.c.getColor()))
    {
      Color localColor = this.c.getColor();
      int i = this.a.a(localColor);
      if (i != -1)
      {
        this.b[0] = zh.b(this.c.getColor());
        this.b[1] = zh.c(this.c.getColor());
        this.b[2] = zh.d(this.c.getColor());
        this.b[10] = ((byte)i);
        byte[] tmp106_101 = this.b;
        tmp106_101[8] = ((byte)(tmp106_101[8] & 0x7));
        if (paramBoolean) {
          this.b[8] = 4;
        }
      }
      else
      {
        i = this.a.a(zh.b(localColor) & 0xFF, zh.c(localColor) & 0xFF, zh.d(localColor) & 0xFF);
        if (i != -1)
        {
          this.b[0] = zh.b(this.c.getColor());
          this.b[1] = zh.c(this.c.getColor());
          this.b[2] = zh.d(this.c.getColor());
          this.b[10] = ((byte)i);
          byte[] tmp231_226 = this.b;
          tmp231_226[8] = ((byte)(tmp231_226[8] & 0x7));
          if (paramBoolean) {
            this.b[8] = 4;
          }
        }
      }
    }
    else
    {
      this.b[0] = 0;
      this.b[1] = 0;
      this.b[2] = 0;
      this.b[10] = 77;
      this.b[8] = 9;
    }
    this.b[4] = ((byte)this.c.getStyle());
    if (!this.c.isVisible())
    {
      this.b[4] = 5;
      if (paramBoolean) {
        this.b[8] = 4;
      }
    }
    if ((this.b[4] != 0) && (paramBoolean)) {
      this.b[8] = 4;
    }
    if (this.c.getWeight() == -1)
    {
      this.b[6] = -1;
      this.b[7] = -1;
    }
    else
    {
      this.b[6] = ((byte)this.c.getWeight());
      this.b[7] = 0;
    }
    if (this.c.isAuto())
    {
      byte[] tmp425_420 = this.b;
      tmp425_420[8] = ((byte)(tmp425_420[8] | 0x1));
    }
    else
    {
      byte[] tmp440_435 = this.b;
      tmp440_435[8] = ((byte)(tmp440_435[8] & 0xFE));
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zans.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */