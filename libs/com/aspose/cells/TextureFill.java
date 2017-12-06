package com.aspose.cells;

import com.aspose.cells.b.a.zr;

public class TextureFill
  extends Fill
{
  private Workbook e;
  private int f = 24;
  private Object g;
  String a = "";
  int b = 0;
  int c = -1;
  byte[] d;
  private int h = 100000;
  
  TextureFill(Workbook workbook)
  {
    this.e = workbook;
    this.g = new PicFormatOption();
  }
  
  void a(int paramInt)
  {
    this.c = paramInt;
    if (paramInt != -1) {
      this.f = a(b());
    }
  }
  
  zcf b()
  {
    if ((this.c == -1) && (this.f != 24))
    {
      zcf localzcf = new zcf();
      localzcf.a(zxh.a(this.f), zbxp.a());
      this.c = this.e.getWorksheets().L().b().b(localzcf);
    }
    if (this.c == -1) {
      return null;
    }
    return this.e.getWorksheets().L().b().a(this.c);
  }
  
  static int a(zcf paramzcf)
  {
    int i = 24;
    if (paramzcf.f() != null) {
      i = a(paramzcf.f().d);
    }
    if (i != 24) {
      return i;
    }
    byte[] arrayOfByte = paramzcf.h();
    if (arrayOfByte != null) {
      return MsoFillFormatHelper.b(arrayOfByte);
    }
    return i;
  }
  
  static int a(byte paramByte)
  {
    switch (paramByte)
    {
    case 0: 
      return 13;
    case 1: 
      return 3;
    case 2: 
      return 5;
    case 3: 
      return 23;
    case 4: 
      return 21;
    case 5: 
      return 12;
    case 6: 
      return 6;
    case 7: 
      return 18;
    case 8: 
      return 8;
    case 9: 
      return 22;
    case 10: 
      return 2;
    case 11: 
      return 7;
    case 12: 
      return 10;
    case 13: 
      return 17;
    case 14: 
      return 14;
    case 15: 
      return 19;
    case 16: 
      return 0;
    case 17: 
      return 15;
    case 18: 
      return 16;
    case 19: 
      return 1;
    case 20: 
      return 4;
    case 21: 
      return 20;
    case 22: 
      return 11;
    case 23: 
      return 9;
    }
    return 24;
  }
  
  byte[] c()
  {
    if ((this.c == -1) && (this.f != 24)) {
      return zxh.a(this.f);
    }
    if (this.c == -1) {
      return null;
    }
    return this.e.getWorksheets().L().b().a(this.c).e();
  }
  
  void a(byte[] paramArrayOfByte)
  {
    zcf localzcf = new zcf();
    localzcf.a(paramArrayOfByte, zbxp.a());
    this.c = this.e.getWorksheets().L().b().b(localzcf);
    this.f = a(localzcf);
  }
  
  public int getType()
  {
    return this.f;
  }
  
  public void setType(int value)
  {
    this.f = value;
    this.c = -1;
  }
  
  public byte[] getImageData()
  {
    if (this.d != null) {
      return this.d;
    }
    zcf localzcf = null;
    if (this.c == -1)
    {
      if (this.f != 24)
      {
        localzcf = new zcf();
        localzcf.a(zxh.a(this.f), zbxp.a());
        return localzcf.b();
      }
      return null;
    }
    localzcf = this.e.getWorksheets().L().b().a(this.c);
    return localzcf.b();
  }
  
  public void setImageData(byte[] value)
  {
    this.c = (this.e.getWorksheets().L().a(value) - 1);
    zcf localzcf = this.e.getWorksheets().L().b().a(this.c);
    byte[] arrayOfByte = localzcf.h();
    if (arrayOfByte != null) {
      this.f = MsoFillFormatHelper.b(arrayOfByte);
    } else {
      this.f = 24;
    }
  }
  
  public boolean isTiling()
  {
    return this.g instanceof TilePicOption;
  }
  
  public void setTiling(boolean value)
  {
    if (value)
    {
      if ((this.g instanceof PicFormatOption)) {
        this.g = new TilePicOption();
      }
    }
    else if ((this.g instanceof TilePicOption)) {
      this.g = new PicFormatOption();
    }
  }
  
  public PicFormatOption getPicFormatOption()
  {
    if (isTiling()) {
      return null;
    }
    return (PicFormatOption)this.g;
  }
  
  public void setPicFormatOption(PicFormatOption value)
  {
    this.g = value;
  }
  
  PicFormatOption d()
  {
    if (isTiling()) {
      return null;
    }
    return (PicFormatOption)this.g;
  }
  
  public TilePicOption getTilePicOption()
  {
    if (isTiling()) {
      return (TilePicOption)this.g;
    }
    return null;
  }
  
  public void setTilePicOption(TilePicOption value)
  {
    this.g = value;
  }
  
  public int getPictureFormatType()
  {
    if (getPicFormatOption() == null) {
      return 0;
    }
    return getPicFormatOption().getType();
  }
  
  public void setPictureFormatType(int value)
  {
    if (getPicFormatOption() == null) {
      this.g = new PicFormatOption();
    }
    getPicFormatOption().setType(value);
  }
  
  public double getScale()
  {
    if (getPicFormatOption() == null) {
      return 100.0D;
    }
    return getPicFormatOption().getScale();
  }
  
  public void setScale(double value)
  {
    if (getPicFormatOption() == null) {
      this.g = new PicFormatOption();
    }
    getPicFormatOption().setScale(value);
  }
  
  int e()
  {
    return this.h;
  }
  
  void b(int paramInt)
  {
    this.h = paramInt;
  }
  
  int f()
  {
    return this.h / 1000;
  }
  
  void c(int paramInt)
  {
    this.h = (paramInt * 1000);
  }
  
  public double getTransparency()
  {
    return zr.b((100 - f()) / 100.0D, 2);
  }
  
  public void setTransparency(double value)
  {
    if ((value < 0.0D) || (value > 1.0D)) {
      throw new CellsException(6, "Transparency must between 0.0 (opaque) and 1.0 (clear)");
    }
    int i = 100 - (int)(value * 100.0D);
    c(i);
  }
  
  int a()
  {
    return 4;
  }
  
  void a(Fill paramFill, CopyOptions paramCopyOptions)
  {
    a((TextureFill)paramFill, paramCopyOptions);
  }
  
  void a(TextureFill paramTextureFill, CopyOptions paramCopyOptions)
  {
    if (paramTextureFill.c != -1) {
      if (paramTextureFill.e == this.e)
      {
        this.c = paramTextureFill.c;
        b().i();
      }
      else
      {
        setImageData(paramTextureFill.getImageData());
      }
    }
    this.f = paramTextureFill.f;
    this.h = paramTextureFill.h;
    if ((paramTextureFill.g instanceof TilePicOption))
    {
      this.g = new TilePicOption();
      ((TilePicOption)this.g).a(paramTextureFill.getTilePicOption());
    }
    else
    {
      this.g = new PicFormatOption();
      ((PicFormatOption)this.g).a(paramTextureFill.getPicFormatOption());
    }
  }
  
  boolean a(TextureFill paramTextureFill)
  {
    if ((this.c != -1) && (paramTextureFill.c != -1) && (getImageData() != paramTextureFill.getImageData())) {
      return false;
    }
    if (this.f != paramTextureFill.f) {
      return false;
    }
    if (this.h != paramTextureFill.h) {
      return false;
    }
    if ((paramTextureFill.g != null) || (this.g != null)) {
      if ((paramTextureFill.g != null) && (this.g != null))
      {
        if ((paramTextureFill.g instanceof TilePicOption))
        {
          if (!((TilePicOption)this.g).b(paramTextureFill.getTilePicOption())) {
            return false;
          }
        }
        else if (!((PicFormatOption)this.g).b(paramTextureFill.getPicFormatOption())) {
          return false;
        }
      }
      else {
        return false;
      }
    }
    return true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/TextureFill.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */