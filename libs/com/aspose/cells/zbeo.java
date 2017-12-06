package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zbeo
  extends zcd
{
  ArrayList a;
  
  zbeo(Scenario paramScenario)
  {
    c(175);
    int i = 7;
    byte[] arrayOfByte1 = zct.c(paramScenario.b);
    i += arrayOfByte1.length + 1;
    byte[] arrayOfByte2 = null;
    if ((paramScenario.getUser() != null) && (!"".equals(paramScenario.getUser())))
    {
      arrayOfByte2 = zct.c(paramScenario.getUser());
      i += arrayOfByte2.length + 3;
    }
    byte[] arrayOfByte3 = null;
    if ((paramScenario.getComment() != null) && (!"".equals(paramScenario.getComment())))
    {
      arrayOfByte3 = zct.c(paramScenario.getComment());
      i += arrayOfByte3.length + 3;
    }
    int j = paramScenario.getInputCells().getCount();
    i += 6 * j;
    for (int k = 0; k < j; k++)
    {
      ScenarioInputCell localScenarioInputCell1 = paramScenario.getInputCells().get(k);
      i += localScenarioInputCell1.c.length() + 3;
      if (!zct.b(localScenarioInputCell1.c)) {
        i += localScenarioInputCell1.c.length();
      }
    }
    if (i > 8224)
    {
      a((short)8224);
      this.b = new byte['†'];
    }
    else
    {
      a((short)i);
      this.b = new byte[d()];
    }
    System.arraycopy(zc.a(j), 0, this.b, 0, 2);
    this.b[2] = ((byte)(paramScenario.isLocked() ? 1 : 0));
    this.b[3] = ((byte)(paramScenario.isHidden() ? 1 : 0));
    this.b[4] = ((byte)paramScenario.b.length());
    this.b[5] = ((byte)(paramScenario.getComment() != null ? paramScenario.getComment().length() : 0));
    this.b[6] = ((byte)(paramScenario.getUser() != null ? paramScenario.getUser().length() : 0));
    k = 7;
    this.b[k] = ((byte)(arrayOfByte1.length == paramScenario.b.length() ? 0 : 1));
    System.arraycopy(arrayOfByte1, 0, this.b, k + 1, arrayOfByte1.length);
    k += arrayOfByte1.length + 1;
    if (arrayOfByte2 != null)
    {
      zct.a(this.b, k, arrayOfByte2, paramScenario.getUser());
      k += 3 + arrayOfByte2.length;
    }
    if (arrayOfByte3 != null)
    {
      zct.a(this.b, k, arrayOfByte3, paramScenario.getComment());
      k += 3 + arrayOfByte3.length;
    }
    for (int m = 0; m < j; m++)
    {
      ScenarioInputCell localScenarioInputCell2 = paramScenario.getInputCells().get(m);
      System.arraycopy(zc.a(localScenarioInputCell2.a), 0, this.b, k, 2);
      System.arraycopy(zc.a(localScenarioInputCell2.b), 0, this.b, k + 2, 2);
      k += 4;
    }
    byte[] arrayOfByte4 = this.b;
    Object localObject;
    for (int n = 0; n < j; n++)
    {
      localObject = paramScenario.getInputCells().get(n);
      byte[] arrayOfByte5 = zct.c(((ScenarioInputCell)localObject).c);
      int i1 = 3 + (arrayOfByte5 == null ? 0 : arrayOfByte5.length);
      if (k + i1 > arrayOfByte4.length)
      {
        i -= k;
        if (arrayOfByte4 == this.b)
        {
          a((short)k);
          if (i > 8224) {
            arrayOfByte4 = new byte['†'];
          } else {
            arrayOfByte4 = new byte[i];
          }
        }
        else
        {
          znt localznt2 = new znt();
          localznt2.a(arrayOfByte4, 0, k);
          if (this.a == null) {
            this.a = new ArrayList();
          }
          zf.a(this.a, localznt2);
        }
        k = 0;
      }
      zct.a(arrayOfByte4, k, arrayOfByte5, ((ScenarioInputCell)localObject).c);
      k += i1;
    }
    if (k + j * 2 > arrayOfByte4.length)
    {
      n = j * 2 - (arrayOfByte4.length - k);
      if (arrayOfByte4 == this.b)
      {
        a((short)8224);
        arrayOfByte4 = new byte[n];
      }
      else
      {
        localObject = new znt();
        ((znt)localObject).b(arrayOfByte4);
        if (this.a == null) {
          this.a = new ArrayList();
        }
        zf.a(this.a, localObject);
        arrayOfByte4 = new byte[n];
        k = n;
      }
    }
    else
    {
      k += j * 2;
    }
    if (this.b != arrayOfByte4)
    {
      znt localznt1 = new znt();
      localznt1.a(arrayOfByte4, 0, k);
      if (this.a == null) {
        this.a = new ArrayList();
      }
      zf.a(this.a, localznt1);
    }
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    byte[] arrayOfByte = new byte[4];
    System.arraycopy(zc.a(f()), 0, arrayOfByte, 0, 2);
    System.arraycopy(zc.a(d()), 0, arrayOfByte, 2, 2);
    paramzrg.a(arrayOfByte);
    if ((this.b != null) && (this.b.length != 0)) {
      paramzrg.a(this.b);
    }
    if (this.a != null) {
      for (int i = 0; i < this.a.size(); i++)
      {
        znt localznt = (znt)this.a.get(i);
        localznt.a(paramzrg);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbeo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */