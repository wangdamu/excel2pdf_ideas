package com.aspose.cells;

import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.d.zh;

class zbvz
{
  private zbni a;
  private Workbook b;
  private zxl c;
  private zanu d;
  
  zbni a()
  {
    return this.a;
  }
  
  zxl b()
  {
    return this.c;
  }
  
  zanu c()
  {
    return this.d;
  }
  
  static zbvz a(TextOptions paramTextOptions, Workbook paramWorkbook, zbni paramzbni)
    throws Exception
  {
    if (paramTextOptions == null) {
      return null;
    }
    zbvz localzbvz = new zbvz(paramzbni, paramWorkbook);
    localzbvz.a(paramTextOptions.getFill());
    localzbvz.a(paramTextOptions.getOutline());
    return localzbvz;
  }
  
  private zbvz(zbni paramzbni, Workbook paramWorkbook)
  {
    this.a = paramzbni;
    this.b = paramWorkbook;
    this.c = new zxl(null);
    this.c.a = paramzbni.b().getPageSetup().getBlackAndWhite();
    this.c.b = true;
    this.d = new zanu(null);
    this.d.a = paramzbni.b().getPageSetup().getBlackAndWhite();
  }
  
  private void a(FillFormat paramFillFormat)
    throws Exception
  {
    this.c.c = paramFillFormat.getFillType();
    zxj localzxj = this.c.c();
    this.c.a(localzxj);
    switch (paramFillFormat.getFillType())
    {
    case 2: 
      this.c.a(false);
      this.c.a(zbor.a(paramFillFormat.getSolidFill().getTransparency(), paramFillFormat.getSolidFill().getColor()));
      this.c.a(null);
      break;
    case 0: 
      this.c.a(true);
      this.c.a(null);
      break;
    case 3: 
      this.c.a(false);
      localzxj.a(0);
      a(paramFillFormat, localzxj.b());
      break;
    case 5: 
      this.c.a(false);
      localzxj.a(2);
      PatternFill localPatternFill = paramFillFormat.getPatternFill();
      localzxj.a(zbor.a(localPatternFill.getForegroundColor()), zbor.a(localPatternFill.getBackgroundColor()), zbor.e(paramFillFormat.getPattern()));
      break;
    case 4: 
      if (paramFillFormat.getTextureFill().getImageData() == null) {
        this.c.a(true);
      } else {
        try
        {
          this.c.a(false);
          localzxj.a(1);
          zbor.a(paramFillFormat, localzxj.a());
          if (paramFillFormat.getTextureFill().getImageData() != null)
          {
            byte[] arrayOfByte = paramFillFormat.getTextureFill().getImageData();
            zh localzh = new zh(arrayOfByte);
            zj localzj = zj.a(localzh);
            localzxj.a().a(arrayOfByte);
          }
        }
        catch (Exception localException)
        {
          this.c.a(true);
        }
      }
      break;
    case 1: 
    default: 
      this.c.a(true);
    }
  }
  
  private void a(LineFormat paramLineFormat)
  {
    boolean bool = (!paramLineFormat.g()) || (paramLineFormat.getFillType() == 1) || (paramLineFormat.getFillType() == 0);
    this.d.a(bool);
    if (!bool)
    {
      this.d.k(paramLineFormat.getFillType());
      this.d.a(zbor.d(paramLineFormat.getDashStyle()));
      this.d.b(paramLineFormat.getCompoundType());
      this.d.c(paramLineFormat.getCapType());
      this.d.d(paramLineFormat.getJoinType());
      this.d.a((int)(paramLineFormat.getWeight() * zbxp.a() / 72.0D + 0.5D));
      if (this.d.h() < 1.0F) {
        this.d.a(1.0F);
      }
      this.d.a(zbor.a(paramLineFormat.getTransparency(), paramLineFormat.b()));
      if (paramLineFormat.getGradientFill() != null) {
        a(paramLineFormat, this.d.o());
      }
    }
  }
  
  private void a(FillFormat paramFillFormat, zads paramzads)
  {
    if (paramFillFormat.getGradientFill() == null) {
      return;
    }
    GradientFill localGradientFill = paramFillFormat.getGradientFill();
    paramzads.a(localGradientFill.c);
    paramzads.a(localGradientFill.getAngle());
    paramzads.a(zbor.a(localGradientFill.getFillType()));
    paramzads.b(zbor.b(localGradientFill.getDirectionType()));
    Chart localChart = null;
    for (int i = 0; i < localGradientFill.getGradientStops().getCount(); i++)
    {
      GradientStop localGradientStop = localGradientFill.getGradientStops().get(i);
      Color localColor = localGradientStop.a.a(this.b, localChart);
      localColor = Color.a(localGradientStop.a() * 255 / 100, localColor);
      paramzads.d().a(localColor, (float)localGradientStop.getPosition());
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */