package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.c.a.za;

class zaly
{
  private zqh a = null;
  private static final za b = new za(new String[] { "xmlns", "SelectionNamespaces" });
  
  zaly(zqh paramzqh)
  {
    this.a = paramzqh;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    c(paramzcjy);
    if (paramzcjy.o()) {
      return;
    }
    if (paramzcjy.n()) {
      while (paramzcjy.m()) {
        switch (b.a(paramzcjy.q()))
        {
        case 0: 
          this.a.a.getWorksheets().getXmlMaps().b(paramzcjy.t());
          break;
        case 1: 
          this.a.a.getWorksheets().getXmlMaps().a(paramzcjy.t());
        }
      }
    }
    paramzcjy.d();
    try
    {
      while (paramzcjy.s() != 4)
      {
        paramzcjy.k();
        if (paramzcjy.s() != 1) {
          paramzcjy.a();
        } else if ("Schema".equals(paramzcjy.q())) {
          zf.a(this.a.a.getWorksheets().getXmlMaps().a(), paramzcjy.v());
        } else if ("Map".equals(paramzcjy.q())) {
          b(paramzcjy);
        } else {
          paramzcjy.a();
        }
      }
    }
    catch (Exception localException) {}
  }
  
  void b(zcjy paramzcjy)
    throws Exception
  {
    XmlMap localXmlMap = new XmlMap(this.a.a.getWorksheets());
    this.a.a.getWorksheets().getXmlMaps().a(localXmlMap);
    if (!paramzcjy.n()) {
      return;
    }
    while (paramzcjy.m()) {
      if ("ID".equals(paramzcjy.q())) {
        localXmlMap.a(zauj.F(paramzcjy.t()));
      } else if ("Name".equals(paramzcjy.q())) {
        localXmlMap.setName(paramzcjy.t());
      } else if ("RootElement".equals(paramzcjy.q())) {
        localXmlMap.a(paramzcjy.t());
      } else if ("SchemaID".equals(paramzcjy.q())) {
        localXmlMap.b(paramzcjy.t());
      } else if ("ShowImportExportValidationErrors".equals(paramzcjy.q())) {
        localXmlMap.e(zauj.aB(paramzcjy.t()));
      } else if ("AutoFit".equals(paramzcjy.q())) {
        localXmlMap.b(zauj.aB(paramzcjy.t()));
      } else if ("Append".equals(paramzcjy.q())) {
        localXmlMap.a(zauj.aB(paramzcjy.t()));
      } else if ("PreserveSortAFLayout".equals(paramzcjy.q())) {
        localXmlMap.d(zauj.aB(paramzcjy.t()));
      } else if ("PreserveFormat".equals(paramzcjy.q())) {
        localXmlMap.c(zauj.aB(paramzcjy.t()));
      }
    }
    paramzcjy.l();
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("DataBinding".equals(paramzcjy.q()))
      {
        zcjk localzcjk = new zcjk();
        localXmlMap.a(localzcjk);
        a(paramzcjy, localzcjk);
        paramzcjy.a();
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, zcjk paramzcjk)
  {
    if (!paramzcjy.n()) {
      return;
    }
    while (paramzcjy.m()) {
      if ("FileBinding".equals(paramzcjy.q())) {
        paramzcjk.a(zauj.aB(paramzcjy.t()));
      } else if ("FileBindingName".equals(paramzcjy.q())) {
        paramzcjk.b(paramzcjy.t());
      } else if ("ConnectionID".equals(paramzcjy.q())) {
        paramzcjk.a(zauj.F(paramzcjy.t()));
      } else if ("DataBindingLoadMode".equals(paramzcjy.q())) {
        paramzcjk.b(zauj.aW(paramzcjy.t()));
      } else if ("DataBindingName".equals(paramzcjy.q())) {
        paramzcjk.a(paramzcjy.t());
      } else {
        paramzcjk.b(zauj.aW(paramzcjy.t()));
      }
    }
    paramzcjy.l();
  }
  
  private void c(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"MapInfo".equals(paramzcjy.q()))) {
      throw new CellsException(6, "Xml map root element eror");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */