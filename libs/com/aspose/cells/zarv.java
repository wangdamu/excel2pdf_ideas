package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;

class zarv
{
  private zcjy a;
  private zasg b;
  private static final za c = new za(new String[] { "display", "style-name", "text-style-name", "x", "y", "width", "height", "p", "span" });
  
  zarv(zasg paramzasg)
  {
    this.b = paramzasg;
  }
  
  void a(Shape paramShape, zcjy paramzcjy)
    throws Exception
  {
    this.a = paramzcjy;
    String str1 = null;
    String str2 = null;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 0: 
          ((CommentShape)paramShape).a().setVisible(zw.a(paramzcjy.t(), "true", true) == 0);
          break;
        case 1: 
          str1 = paramzcjy.t();
          break;
        case 2: 
          str2 = paramzcjy.t();
          break;
        case 3: 
          i = zasp.a(this.b.a, paramzcjy.t());
          break;
        case 4: 
          j = zasp.a(this.b.a, paramzcjy.t());
          break;
        case 5: 
          k = zasp.a(this.b.a, paramzcjy.t());
          break;
        case 6: 
          m = zasp.a(this.b.a, paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    paramShape.a(0, false, i, j, k, m);
    if (str1 != null)
    {
      localObject1 = (zati)this.b.i.get(str1);
      if ((paramShape != null) && (localObject1 != null)) {
        zatj.a(paramShape, this.b, (zati)localObject1);
      }
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    Object localObject1 = null;
    if (str2 != null)
    {
      localObject2 = (zatb)this.b.h.get(str2);
      if ((localObject2 == null) || (((zatb)localObject2).b == null)) {
        localObject1 = this.b.b.getWorksheets().i(0);
      } else {
        localObject1 = ((zatb)localObject2).b;
      }
    }
    else
    {
      localObject1 = this.b.b.getWorksheets().i(0);
    }
    paramzcjy.a(1);
    Object localObject2 = new ArrayList();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() == 4) {
        break;
      }
      if (paramzcjy.s() != 1)
      {
        if (paramzcjy.s() == 3)
        {
          zatc localzatc = new zatc();
          localzatc.a = paramzcjy.t();
          zf.a((ArrayList)localObject2, localzatc);
        }
        paramzcjy.a();
      }
      else
      {
        switch (c.a(paramzcjy.q().toLowerCase()))
        {
        case 7: 
          a((ArrayList)localObject2);
          break;
        case 8: 
          a((ArrayList)localObject2, (Font)localObject1);
          break;
        default: 
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    paramzcjy.a(0);
    if (((ArrayList)localObject2).size() != 0) {
      switch (paramShape.getMsoDrawingType())
      {
      case 25: 
        a((ArrayList)localObject2, ((CommentShape)paramShape).a().b(), (Font)localObject1);
      }
    }
  }
  
  void a(ArrayList paramArrayList)
    throws Exception
  {
    if (this.a.o())
    {
      this.a.a();
      return;
    }
    String str = null;
    if (paramArrayList.size() != 0)
    {
      localObject1 = (zatc)paramArrayList.get(paramArrayList.size() - 1);
      ((zatc)localObject1).a += "\n";
      paramArrayList.set(paramArrayList.size() - 1, localObject1);
    }
    if (this.a.n()) {
      while (this.a.m()) {
        switch (c.a(this.a.q()))
        {
        case 1: 
          str = this.a.t();
        }
      }
    }
    Object localObject1 = null;
    Object localObject2;
    if ((str != null) && (!"".equals(str)))
    {
      localObject2 = (zatb)this.b.h.get(str);
      localObject1 = ((zatb)localObject2).b;
    }
    this.a.d();
    while (this.a.s() != 4)
    {
      this.a.k();
      if (this.a.s() == 4) {
        break;
      }
      if (this.a.s() != 1)
      {
        if (this.a.s() == 3)
        {
          localObject2 = new zatc();
          ((zatc)localObject2).a = this.a.t();
          ((zatc)localObject2).b = ((Font)localObject1);
          zf.a(paramArrayList, localObject2);
        }
        this.a.a();
      }
      else
      {
        switch (c.a(this.a.q().toLowerCase()))
        {
        case 8: 
          a(paramArrayList, (Font)localObject1);
          break;
        default: 
          this.a.a();
        }
      }
    }
    this.a.h();
  }
  
  void a(ArrayList paramArrayList, Font paramFont)
    throws Exception
  {
    if (this.a.o())
    {
      this.a.a();
      return;
    }
    zatc localzatc = new zatc();
    if (this.a.n())
    {
      while (this.a.m()) {
        switch (c.a(this.a.q()))
        {
        case 1: 
          localzatc.b = ((Font)this.b.g.get(this.a.t()));
        }
      }
      this.a.l();
    }
    if (this.a.o())
    {
      this.a.a();
    }
    else
    {
      this.a.d();
      while (this.a.s() != 4)
      {
        this.a.k();
        if (this.a.s() == 3) {
          if (localzatc.a == null) {
            localzatc.a = this.a.t();
          } else {
            localzatc.a += this.a.t();
          }
        }
        this.a.a();
      }
      this.a.h();
      if (localzatc.a != null) {
        zf.a(paramArrayList, localzatc);
      }
    }
  }
  
  static void a(ArrayList paramArrayList, FontSettingCollection paramFontSettingCollection, Font paramFont)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      zatc localzatc = (zatc)paramArrayList.get(i);
      FontSetting localFontSetting = paramFontSettingCollection.b(localStringBuilder.length(), localzatc.a.length());
      localStringBuilder.append(localzatc.a);
      if (localzatc.b == null) {
        localFontSetting.getFont().a(paramFont, null);
      } else {
        localFontSetting.getFont().a(localzatc.b, null);
      }
    }
    paramFontSettingCollection.c = zs.a(localStringBuilder);
    paramFontSettingCollection.h().q = paramFont;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zarv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */