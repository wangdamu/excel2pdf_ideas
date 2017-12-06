package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

class zawd
  extends ArrayList
{
  static zawc a(zcf paramzcf)
    throws Exception
  {
    zawc localzawc = new zawc();
    localzawc.a(paramzcf.a());
    localzawc.a(paramzcf.b());
    localzawc.a = (paramzcf.n() == 4);
    return localzawc;
  }
  
  void a(zeu paramzeu)
    throws Exception
  {
    Iterator localIterator = paramzeu.iterator();
    while (localIterator.hasNext())
    {
      zcf localzcf = (zcf)localIterator.next();
      zawc localzawc = a(localzcf);
      zf.a(this, localzawc);
    }
  }
  
  void a(WorksheetCollection paramWorksheetCollection)
    throws Exception
  {
    if ((paramWorksheetCollection.M() == null) || (paramWorksheetCollection.M().c() == null) || (paramWorksheetCollection.M().b().getCount() == 0)) {
      return;
    }
    zeu localzeu = paramWorksheetCollection.L().b();
    a(localzeu);
  }
  
  void b(WorksheetCollection paramWorksheetCollection)
    throws Exception
  {
    if ((paramWorksheetCollection.O() == null) || (paramWorksheetCollection.O().c() == null) || (paramWorksheetCollection.O().b().getCount() == 0)) {
      return;
    }
    zeu localzeu = paramWorksheetCollection.N().b();
    a(localzeu);
  }
  
  public zawc a(int paramInt)
  {
    return (zawc)super.get(paramInt);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */