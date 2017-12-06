package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;

class zro
{
  zrp a = null;
  ArrayList b = new ArrayList();
  private static final za c = new za(new String[] { "bottomLeft", "bottomRight", "topLeft", "topRight", "frozen", "frozensplit" });
  
  static byte a(String paramString)
  {
    switch (c.a(paramString))
    {
    case 0: 
      return 2;
    case 1: 
      return 0;
    case 2: 
      return 3;
    case 3: 
      return 1;
    }
    return 3;
  }
  
  static String a(byte paramByte)
  {
    switch (paramByte)
    {
    case 0: 
      return "bottomRight";
    case 1: 
      return "topRight";
    case 2: 
      return "bottomLeft";
    case 3: 
      return "topLeft";
    }
    return "topLeft";
  }
  
  void a(Worksheet paramWorksheet)
  {
    int i = 0;
    int j = 0;
    PaneCollection localPaneCollection = null;
    int k;
    Object localObject1;
    Object localObject2;
    if (this.a != null)
    {
      k = 0;
      switch (c.a(this.a.a.toLowerCase()))
      {
      case 4: 
      case 5: 
        k = 1;
        break;
      }
      if (this.a.d != null)
      {
        localPaneCollection = paramWorksheet.b();
        paramWorksheet.a(k);
        localObject1 = new int[] { i };
        localObject2 = new int[] { j };
        CellsHelper.a(this.a.d, (int[])localObject1, (int[])localObject2);
        i = localObject1[0];
        j = localObject2[0];
        localPaneCollection.a(i);
        localPaneCollection.b(j);
        if (this.a.b == 0.0D) {
          localPaneCollection.b(0);
        }
        if (this.a.c == 0.0D) {
          localPaneCollection.a(0);
        }
      }
      else if ((k == 0) && ((this.a.b > 0.0D) || (this.a.c > 0.0D)))
      {
        localPaneCollection = paramWorksheet.b();
        if (this.a.b > 0.0D) {
          localPaneCollection.b(8);
        }
        if (this.a.c > 0.0D) {
          localPaneCollection.a(15);
        }
        localPaneCollection.a = true;
      }
    }
    if (localPaneCollection != null)
    {
      localPaneCollection.d((int)this.a.b);
      localPaneCollection.c((int)this.a.c);
      localPaneCollection.f();
      localPaneCollection.a(a(this.a.e));
      if (this.b != null) {
        for (k = 0; k < this.b.size(); k++)
        {
          localObject1 = (zrq)this.b.get(k);
          localObject2 = paramWorksheet.t().a(a(((zrq)localObject1).a) & 0xFF);
          if (localObject2 != null)
          {
            if ((k == 0) && (localPaneCollection != null) && (this.a != null) && (this.a.e == null)) {
              localPaneCollection.a(((zbev)localObject2).a());
            }
            a((zrq)localObject1, (zbev)localObject2);
          }
        }
      }
    }
    else if (this.b != null)
    {
      zbew localzbew = new zbew(paramWorksheet);
      paramWorksheet.a(localzbew);
      int m = 0;
      for (int n = 0; n < this.b.size(); n++)
      {
        zrq localzrq = (zrq)this.b.get(n);
        if (("topLeft".equals(localzrq.a)) || ((localzrq.a == null) && (this.b.size() == 1)))
        {
          zbev localzbev2 = new zbev(a("topLeft") & 0xFF);
          m = 1;
          zf.a(localzbew, localzbev2);
          a(localzrq, localzbev2);
        }
      }
      if (m == 0)
      {
        zbev localzbev1 = new zbev(a("topLeft") & 0xFF);
        localzbev1.a(0, 0);
        zf.a(localzbew, localzbev1);
      }
    }
  }
  
  private void a(zrq paramzrq, zbev paramzbev)
  {
    paramzbev.b().clear();
    int i = 0;
    int j = 0;
    String str1 = paramzrq.d;
    Object localObject;
    if ((str1 != null) && (str1.length() > 0))
    {
      i = j = 0;
      if (paramzrq.b != null)
      {
        localObject = new int[] { i };
        int[] arrayOfInt = { j };
        CellsHelper.a(paramzrq.b, (int[])localObject, arrayOfInt);
        i = localObject[0];
        j = arrayOfInt[0];
      }
      paramzbev.a(i);
      paramzbev.b(j);
      paramzbev.c(paramzrq.c);
      localObject = zw.d(str1, ' ');
      for (int k = 0; k < localObject.length; k++)
      {
        String str2 = localObject[k].trim();
        if (str2.length() > 0)
        {
          CellArea localCellArea = (CellArea)CellArea.a(str2, true);
          zf.a(paramzbev.b(), localCellArea);
        }
      }
    }
    else
    {
      paramzbev.a(0);
      paramzbev.b(0);
      paramzbev.c(0);
      localObject = new CellArea();
      zf.a(paramzbev.b(), localObject);
    }
  }
  
  void a(zoh paramzoh)
  {
    int i = 0;
    int j = 0;
    Object localObject1;
    Object localObject2;
    if (this.a != null)
    {
      localObject1 = paramzoh.c();
      switch (c.a(this.a.a.toLowerCase()))
      {
      case 4: 
      case 5: 
        paramzoh.o(true);
      }
      ((PaneCollection)localObject1).a(a(this.a.e));
      if (this.a.d != null)
      {
        int[] arrayOfInt1 = { i };
        localObject2 = new int[] { j };
        CellsHelper.a(this.a.d, arrayOfInt1, (int[])localObject2);
        i = arrayOfInt1[0];
        j = localObject2[0];
        ((PaneCollection)localObject1).a(i);
        ((PaneCollection)localObject1).b(j);
      }
      ((PaneCollection)localObject1).d((int)this.a.b);
      ((PaneCollection)localObject1).c((int)this.a.c);
    }
    if (this.b != null)
    {
      localObject1 = new zbew(paramzoh.a);
      paramzoh.i = ((zbew)localObject1);
      for (int k = 0; k < this.b.size(); k++)
      {
        localObject2 = (zrq)this.b.get(k);
        zbev localzbev = new zbev(a(((zrq)localObject2).a) & 0xFF);
        zf.a((ArrayList)localObject1, localzbev);
        String str1 = ((zrq)localObject2).d;
        Object localObject3;
        if ((str1 != null) && (str1.length() > 0))
        {
          i = j = 0;
          if (((zrq)localObject2).b != null)
          {
            localObject3 = new int[] { i };
            int[] arrayOfInt2 = { j };
            CellsHelper.a(((zrq)localObject2).b, (int[])localObject3, arrayOfInt2);
            i = localObject3[0];
            j = arrayOfInt2[0];
          }
          localzbev.a(i);
          localzbev.b(j);
          localzbev.c(((zrq)localObject2).c);
          localObject3 = zw.d(str1, ' ');
          for (int m = 0; m < localObject3.length; m++)
          {
            String str2 = localObject3[m].trim();
            if (str2.length() > 0)
            {
              CellArea localCellArea = (CellArea)CellArea.a(str2, true);
              zf.a(localzbev.b(), localCellArea);
            }
          }
        }
        else
        {
          localzbev.a(0);
          localzbev.b(0);
          localzbev.c(0);
          localObject3 = new CellArea();
          zf.a(localzbev.b(), localObject3);
        }
        if (localzbev.a() == 3) {
          paramzoh.p = ((CellArea)localzbev.b().get(0));
        }
      }
    }
  }
  
  static zro b(Worksheet paramWorksheet)
  {
    zro localzro = new zro();
    Object localObject;
    if (paramWorksheet.getPanes() != null)
    {
      PaneCollection localPaneCollection = paramWorksheet.b();
      localObject = new zrp();
      localzro.a = ((zrp)localObject);
      ((zrp)localObject).e = a(localPaneCollection.a());
      ((zrp)localObject).a = (paramWorksheet.i() ? "frozen" : "split");
      if (!localPaneCollection.a) {
        ((zrp)localObject).d = CellsHelper.cellIndexToName(localPaneCollection.b(), localPaneCollection.c());
      }
      ((zrp)localObject).b = localPaneCollection.e();
      ((zrp)localObject).c = localPaneCollection.d();
    }
    if ((paramWorksheet.t() != null) && (paramWorksheet.t().size() != 0))
    {
      localzro.b = new ArrayList();
      for (int i = 0; i < paramWorksheet.t().size(); i++)
      {
        localObject = (zbev)paramWorksheet.t().get(i);
        zrq localzrq = new zrq();
        zf.a(localzro.b, localzrq);
        localzrq.b = CellsHelper.cellIndexToName(((zbev)localObject).c(), ((zbev)localObject).d());
        localzrq.c = ((zbev)localObject).e();
        localzrq.d = zauj.b(((zbev)localObject).b(), 0, ((zbev)localObject).b().size());
        localzrq.a = a(((zbev)localObject).a());
      }
    }
    return localzro;
  }
  
  static zro b(zoh paramzoh)
  {
    zro localzro = new zro();
    Object localObject;
    if (paramzoh.h != null)
    {
      PaneCollection localPaneCollection = paramzoh.h;
      if ((localPaneCollection.d() != 0) || (localPaneCollection.e() != 0))
      {
        localObject = new zrp();
        localzro.a = ((zrp)localObject);
        ((zrp)localObject).e = a(localPaneCollection.a());
        ((zrp)localObject).a = (paramzoh.y() ? "frozen" : "split");
        ((zrp)localObject).d = CellsHelper.cellIndexToName(localPaneCollection.b(), localPaneCollection.c());
        ((zrp)localObject).b = localPaneCollection.e();
        ((zrp)localObject).c = localPaneCollection.d();
      }
    }
    if ((paramzoh.i != null) && (paramzoh.i.size() != 0))
    {
      localzro.b = new ArrayList();
      for (int i = 0; i < paramzoh.i.size(); i++)
      {
        localObject = (zbev)paramzoh.i.get(i);
        zrq localzrq = new zrq();
        zf.a(localzro.b, localzrq);
        localzrq.b = CellsHelper.cellIndexToName(((zbev)localObject).c(), ((zbev)localObject).d());
        localzrq.c = ((zbev)localObject).e();
        localzrq.d = zauj.b(((zbev)localObject).b(), 0, ((zbev)localObject).b().size());
        localzrq.a = a(((zbev)localObject).a());
      }
    }
    return localzro;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zro.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */