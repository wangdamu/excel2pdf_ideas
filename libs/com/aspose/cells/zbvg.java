package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Iterator;

class zbvg
  extends zcd
{
  zbvg()
  {
    c(438);
    b(18);
    this.b = new byte[18];
    this.b[1] = 2;
  }
  
  ArrayList a(Shape paramShape, FontSettingCollection paramFontSettingCollection, int paramInt1, int paramInt2)
    throws Exception
  {
    ShapeTextAlignment localShapeTextAlignment = paramFontSettingCollection.getTextAlignment();
    int i = 0;
    if (paramShape.af() != null) {
      switch (paramShape.getMsoDrawingType())
      {
      case 1: 
      case 2: 
      case 3: 
      case 4: 
      case 6: 
      case 9: 
      case 30: 
        i = 1;
      }
    }
    if (i != 0)
    {
      int j = 6 + paramShape.af().length;
      int k = j % 2 != 0 ? 1 : 0;
      if (k != 0) {
        j++;
      }
      b(d() + (short)j);
      this.b = new byte[d()];
      System.arraycopy(zc.a(j), 0, this.b, 16, 2);
      System.arraycopy(zc.a(paramShape.af().length), 0, this.b, 18, 2);
      System.arraycopy(zc.a(174200844), 0, this.b, 20, 4);
      System.arraycopy(paramShape.af(), 0, this.b, 24, paramShape.af().length);
      if (k != 0) {
        this.b[(this.b.length - 1)] = paramShape.af()[3];
      }
    }
    switch (paramShape.getTextBody().m())
    {
    case 7: 
      int tmp301_300 = 0;
      byte[] tmp301_297 = this.b;
      tmp301_297[tmp301_300] = ((byte)(tmp301_297[tmp301_300] | 0x2));
      break;
    case 1: 
      int tmp315_314 = 0;
      byte[] tmp315_311 = this.b;
      tmp315_311[tmp315_314] = ((byte)(tmp315_311[tmp315_314] | 0x4));
      break;
    case 8: 
      int tmp329_328 = 0;
      byte[] tmp329_325 = this.b;
      tmp329_325[tmp329_328] = ((byte)(tmp329_325[tmp329_328] | 0x6));
      break;
    case 6: 
      int tmp344_343 = 0;
      byte[] tmp344_340 = this.b;
      tmp344_340[tmp344_343] = ((byte)(tmp344_340[tmp344_343] | 0x8));
      break;
    case 3: 
      int tmp359_358 = 0;
      byte[] tmp359_355 = this.b;
      tmp359_355[tmp359_358] = ((byte)(tmp359_355[tmp359_358] | 0xE));
      break;
    case 2: 
    case 4: 
    case 5: 
    default: 
      int tmp374_373 = 0;
      byte[] tmp374_370 = this.b;
      tmp374_370[tmp374_373] = ((byte)(tmp374_370[tmp374_373] | 0x2));
    }
    switch (localShapeTextAlignment.n())
    {
    case 9: 
      int tmp445_444 = 0;
      byte[] tmp445_441 = this.b;
      tmp445_441[tmp445_444] = ((byte)(tmp445_441[tmp445_444] | 0x10));
      break;
    case 1: 
      int tmp460_459 = 0;
      byte[] tmp460_456 = this.b;
      tmp460_456[tmp460_459] = ((byte)(tmp460_456[tmp460_459] | 0x20));
      break;
    case 0: 
      int tmp475_474 = 0;
      byte[] tmp475_471 = this.b;
      tmp475_471[tmp475_474] = ((byte)(tmp475_471[tmp475_474] | 0x30));
      break;
    case 6: 
      int tmp490_489 = 0;
      byte[] tmp490_486 = this.b;
      tmp490_486[tmp490_489] = ((byte)(tmp490_486[tmp490_489] | 0x40));
      break;
    case 3: 
      int tmp505_504 = 0;
      byte[] tmp505_501 = this.b;
      tmp505_501[tmp505_504] = ((byte)(tmp505_501[tmp505_504] | 0x70));
      break;
    case 2: 
    case 4: 
    case 5: 
    case 7: 
    case 8: 
    default: 
      int tmp520_519 = 0;
      byte[] tmp520_516 = this.b;
      tmp520_516[tmp520_519] = ((byte)(tmp520_516[tmp520_519] | 0x10));
    }
    switch (localShapeTextAlignment.o())
    {
    case 0: 
      this.b[2] = 3;
      break;
    case 1: 
      this.b[2] = 2;
      break;
    case 3: 
      this.b[2] = 1;
    }
    if (!localShapeTextAlignment.c()) {
      this.b[1] = 0;
    }
    if ((paramInt2 & 0xFFFF) == 0)
    {
      System.arraycopy(zc.a(paramInt2), 0, this.b, 10, 2);
      System.arraycopy(zc.a(0), 0, this.b, 12, 2);
      System.arraycopy(zc.a(paramInt1), 0, this.b, 14, 2);
      return null;
    }
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = paramFontSettingCollection.a(paramShape);
    zbwh localzbwh;
    if ((localArrayList2 != null) && (localArrayList2.size() != 0))
    {
      int m = 0;
      Iterator localIterator = localArrayList2.iterator();
      while (localIterator.hasNext())
      {
        FontSetting localFontSetting = (FontSetting)localIterator.next();
        if (localFontSetting.getStartIndex() < m)
        {
          if (localFontSetting.getStartIndex() + localFontSetting.getLength() <= m) {
            continue;
          }
          localzbwh = new zbwh();
          localzbwh.a = m;
          localzbwh.b = paramInt1;
          zf.a(localArrayList1, localzbwh);
        }
        else
        {
          if (localFontSetting.getStartIndex() > m)
          {
            localzbwh = new zbwh();
            localzbwh.a = m;
            localzbwh.b = paramInt1;
            zf.a(localArrayList1, localzbwh);
          }
          localzbwh = new zbwh();
          localzbwh.a = localFontSetting.getStartIndex();
          if (localFontSetting.h() == null) {
            localzbwh.b = paramInt1;
          } else {
            localzbwh.b = localFontSetting.getFont().m();
          }
          zf.a(localArrayList1, localzbwh);
        }
        m = localFontSetting.getStartIndex() + localFontSetting.getLength();
      }
      if (m < (paramInt2 & 0xFFFF))
      {
        localzbwh = new zbwh();
        localzbwh.a = m;
        localzbwh.b = paramInt1;
        zf.a(localArrayList1, localzbwh);
      }
      localzbwh = new zbwh();
      localzbwh.a = (paramInt2 & 0xFFFF);
      localzbwh.b = paramInt1;
      zf.a(localArrayList1, localzbwh);
    }
    else
    {
      localzbwh = new zbwh();
      localzbwh.a = 0;
      localzbwh.b = paramInt1;
      zf.a(localArrayList1, localzbwh);
      localzbwh = new zbwh();
      localzbwh.a = (paramInt2 & 0xFFFF);
      localzbwh.b = paramInt1;
      zf.a(localArrayList1, localzbwh);
    }
    System.arraycopy(zc.a(paramInt2), 0, this.b, 10, 2);
    System.arraycopy(zc.a(localArrayList1.size() * 8), 0, this.b, 12, 2);
    return localArrayList1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbvg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */