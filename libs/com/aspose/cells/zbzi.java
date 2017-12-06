package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

class zbzi
  extends CollectionBase
{
  public void a(zbzi paramzbzi)
  {
    zf.a(this.InnerList, paramzbzi.InnerList);
  }
  
  public int a(zbzg paramzbzg)
  {
    zf.a(this.InnerList, paramzbzg);
    return getCount() - 1;
  }
  
  public int a(int paramInt, Object paramObject)
  {
    zbzg localzbzg = new zbzg();
    localzbzg.a = paramInt;
    localzbzg.b = paramObject;
    zf.a(this.InnerList, localzbzg);
    return getCount() - 1;
  }
  
  public zbzg a(int paramInt)
  {
    return (zbzg)this.InnerList.get(paramInt);
  }
  
  boolean a(WorksheetCollection paramWorksheetCollection, zaml paramzaml)
  {
    switch (paramzaml.c())
    {
    case 2: 
      return !paramWorksheetCollection.o().b(paramzaml.b(paramWorksheetCollection.p()));
    case 4: 
      return true;
    }
    return false;
  }
  
  void a(Style paramStyle)
  {
    WorksheetCollection localWorksheetCollection = paramStyle.e();
    if ((paramStyle.isModified(27)) && (paramStyle.getIndentLevel() > 15)) {
      a(15, Integer.valueOf(paramStyle.getIndentLevel()));
    }
    if ((paramStyle.isModified(16)) && (a(localWorksheetCollection, paramStyle.getFont().b()))) {
      a(13, paramStyle.getFont().b());
    }
    if (paramStyle.isGradient())
    {
      GradientFill localGradientFill = new GradientFill(null, null);
      localGradientFill.a(3, paramStyle.b, 0.0D, paramStyle.a, paramStyle.y(), paramStyle.z());
      a(6, localGradientFill);
    }
    else if (paramStyle.isModified(32))
    {
      if ((paramStyle.isModified(34)) && (a(localWorksheetCollection, paramStyle.b))) {
        a(4, paramStyle.b);
      }
      if ((paramStyle.isModified(35)) && (a(localWorksheetCollection, paramStyle.a))) {
        a(5, paramStyle.a);
      }
    }
    if (paramStyle.isModified(1))
    {
      if ((paramStyle.isModified(2)) && (a(localWorksheetCollection, paramStyle.getBorders().getByBorderType(1).a))) {
        a(9, paramStyle.getBorders().getByBorderType(1).a);
      }
      if ((paramStyle.isModified(3)) && (a(localWorksheetCollection, paramStyle.getBorders().getByBorderType(2).a))) {
        a(10, paramStyle.getBorders().getByBorderType(2).a);
      }
      if ((paramStyle.isModified(4)) && (a(localWorksheetCollection, paramStyle.getBorders().getByBorderType(4).a))) {
        a(7, paramStyle.getBorders().getByBorderType(4).a);
      }
      if ((paramStyle.isModified(5)) && (a(localWorksheetCollection, paramStyle.getBorders().getByBorderType(8).a))) {
        a(8, paramStyle.getBorders().getByBorderType(8).a);
      }
      if ((paramStyle.isModified(8)) && (a(localWorksheetCollection, paramStyle.getBorders().e()))) {
        a(11, paramStyle.getBorders().e());
      }
    }
  }
  
  boolean b(Style paramStyle)
  {
    boolean bool = false;
    for (int i = 0; i < getCount(); i++)
    {
      zbzg localzbzg = a(i);
      switch (localzbzg.a)
      {
      case 14: 
        bool = true;
        switch (((Integer)localzbzg.b).intValue())
        {
        case 1: 
          paramStyle.getFont().e(1);
          break;
        case 2: 
          paramStyle.getFont().e(2);
        }
        break;
      case 15: 
        paramStyle.setIndentLevel(((Short)localzbzg.b).shortValue());
        break;
      case 13: 
        bool = true;
        paramStyle.getFont().a((zaml)localzbzg.b);
        break;
      case 4: 
        paramStyle.b = ((zaml)localzbzg.b);
        break;
      case 5: 
        paramStyle.a = ((zaml)localzbzg.b);
        break;
      case 7: 
        paramStyle.getBorders().getByBorderType(4).a = ((zaml)localzbzg.b);
        break;
      case 9: 
        paramStyle.getBorders().getByBorderType(1).a = ((zaml)localzbzg.b);
        break;
      case 10: 
        paramStyle.getBorders().getByBorderType(2).a = ((zaml)localzbzg.b);
        break;
      case 8: 
        paramStyle.getBorders().getByBorderType(8).a = ((zaml)localzbzg.b);
        break;
      case 11: 
        paramStyle.getBorders().getByBorderType(16).a = ((zaml)localzbzg.b);
        paramStyle.getBorders().getByBorderType(32).a = ((zaml)localzbzg.b);
        break;
      case 6: 
        GradientFill localGradientFill = (GradientFill)localzbzg.b;
        localGradientFill.a(paramStyle, paramStyle.e().p());
      }
    }
    return bool;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */