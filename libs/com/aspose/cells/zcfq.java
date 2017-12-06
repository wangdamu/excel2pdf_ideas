package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import java.util.Iterator;

class zcfq
  extends zcfo
{
  private Workbook c = null;
  
  zcfq(zpt paramzpt)
  {
    this.c = paramzpt.a;
  }
  
  void d()
    throws Exception
  {
    ExternalConnectionCollection localExternalConnectionCollection = this.c.getDataConnections();
    zche.a(429, this.b);
    Iterator localIterator = localExternalConnectionCollection.iterator();
    while (localIterator.hasNext())
    {
      ExternalConnection localExternalConnection = (ExternalConnection)localIterator.next();
      a(localExternalConnection);
    }
    zche.a(430, this.b);
  }
  
  private void a(ExternalConnection paramExternalConnection)
    throws Exception
  {
    zdz localzdz = new zdz(paramExternalConnection);
    localzdz.a(this.b);
    if ((paramExternalConnection instanceof WebQueryConnection)) {
      a((WebQueryConnection)paramExternalConnection);
    } else if ((paramExternalConnection instanceof DBConnection)) {
      a((DBConnection)paramExternalConnection);
    } else if ((paramExternalConnection instanceof zbvu)) {
      a((zbvu)paramExternalConnection);
    }
    b(paramExternalConnection);
    zche.a(202, this.b);
  }
  
  private void b(ExternalConnection paramExternalConnection)
    throws Exception
  {
    if ((paramExternalConnection.e == null) && (paramExternalConnection.f == null)) {
      return;
    }
    int i = 3586;
    if (paramExternalConnection.f != null) {
      i = 3843;
    }
    zche.a(35, i, 4, this.b);
    Object localObject;
    if (paramExternalConnection.e != null)
    {
      localObject = new zdx(paramExternalConnection.e);
      ((zdx)localObject).a(this.b);
      zche.a(1069, this.b);
    }
    if (paramExternalConnection.f != null)
    {
      localObject = new zdy(paramExternalConnection.f);
      ((zdy)localObject).a(this.b);
      if (paramExternalConnection.f.c != null)
      {
        zwe localzwe = paramExternalConnection.f.c;
        if (localzwe.a() == 3)
        {
          zer localzer = new zer((zbao)localzwe);
          localzer.a(this.b);
        }
      }
      zche.a(2110, this.b);
    }
    zche.a(36, this.b);
  }
  
  private void a(DBConnection paramDBConnection)
    throws Exception
  {
    zdr localzdr = new zdr(paramDBConnection);
    localzdr.a(this.b);
    zche.a(204, this.b);
    if (paramDBConnection.h != null)
    {
      zds localzds = new zds(paramDBConnection.h);
      localzds.a(this.b);
      zche.a(206, this.b);
    }
    if (paramDBConnection.g != null) {
      a(paramDBConnection.g);
    }
  }
  
  private void a(ConnectionParameterCollection paramConnectionParameterCollection)
    throws Exception
  {
    zche.a(265, paramConnectionParameterCollection.getCount(), 4, this.b);
    Iterator localIterator = paramConnectionParameterCollection.iterator();
    while (localIterator.hasNext())
    {
      ConnectionParameter localConnectionParameter = (ConnectionParameter)localIterator.next();
      zdt localzdt = new zdt(localConnectionParameter);
      localzdt.a(this.b);
      zche.a(268, this.b);
    }
    zche.a(266, this.b);
  }
  
  private void a(zbvu paramzbvu)
    throws Exception
  {
    zdv localzdv = new zdv(paramzbvu);
    localzdv.a(this.b);
    if ((paramzbvu.C != null) && (paramzbvu.C.getCount() > 0))
    {
      zche.a(540, paramzbvu.C.getCount(), 4, this.b);
      Iterator localIterator = paramzbvu.C.iterator();
      while (localIterator.hasNext())
      {
        znl localznl = (znl)localIterator.next();
        zdu localzdu = new zdu(localznl);
        localzdu.a(this.b);
      }
      zche.a(541, this.b);
    }
    zche.a(539, this.b);
  }
  
  private void a(WebQueryConnection paramWebQueryConnection)
    throws Exception
  {
    zdw localzdw = new zdw(paramWebQueryConnection);
    localzdw.a(this.b);
    if ((paramWebQueryConnection.z != null) && (paramWebQueryConnection.z.getCount() > 0))
    {
      zche.a(263, paramWebQueryConnection.z.getCount(), 4, this.b);
      Iterator localIterator = paramWebQueryConnection.z.iterator();
      while (localIterator.hasNext())
      {
        zbvs localzbvs = (zbvs)localIterator.next();
        if (localzbvs.b) {
          zche.a(20, this.b);
        } else if ((localzbvs.a instanceof Integer)) {
          zche.a(26, ((Integer)localzbvs.a).intValue(), 4, this.b);
        } else {
          zche.a(24, zs.a(localzbvs.a), this.b);
        }
      }
      zche.a(264, this.b);
    }
    zche.a(262, this.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcfq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */