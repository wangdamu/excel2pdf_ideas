package com.aspose.cells;

import java.util.HashMap;
import java.util.Iterator;

class zake
{
  private zqi a = null;
  private HashMap b = null;
  private zcjm c;
  private Chart d;
  private zkm e;
  
  zake(Chart paramChart, zqi paramzqi, HashMap paramHashMap)
  {
    this.d = paramChart;
    this.e = paramChart.Q();
    this.b = paramHashMap;
    this.a = paramzqi;
  }
  
  void a(zcjm paramzcjm, boolean paramBoolean)
    throws Exception
  {
    this.c = paramzcjm;
    a();
    if (paramBoolean) {}
  }
  
  private void a()
    throws Exception
  {
    if (this.c.f() == null) {
      return;
    }
    zcjn localzcjn1 = this.c.f();
    zcju localzcju = localzcjn1.l();
    Iterator localIterator = localzcju.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if ((localObject instanceof zcjn))
      {
        zcjn localzcjn2 = (zcjn)localObject;
        String str = localzcjn2.g;
        if ("axisTitle".equals(str))
        {
          a(localzcjn2, this.e.b());
        }
        else if ("categoryAxis".equals(str))
        {
          a(localzcjn2, this.e.e());
        }
        else if ("chartArea".equals(str))
        {
          a(localzcjn2, this.e.b());
        }
        else if ("dataLabel".equals(str))
        {
          a(localzcjn2, this.e.f());
        }
        else if ("dataLabelCallout".equals(str))
        {
          a(localzcjn2, this.e.g());
        }
        else if ("dataPoint".equals(str))
        {
          a(localzcjn2, this.e.a());
        }
        else if ("dataPoint3D".equals(str))
        {
          a(localzcjn2, this.e.h());
        }
        else if ("dataPointLine".equals(str))
        {
          a(localzcjn2, this.e.i());
          if ((this.e.i().b() != null) && (this.e.a().b() == null)) {
            this.e.a().a().a(this.e.i().b());
          }
        }
        else if ("dataPointMarker".equals(str))
        {
          a(localzcjn2, this.e.j());
        }
        else if ("dataPointWireframe".equals(str))
        {
          a(localzcjn2, this.e.k());
        }
        else if ("dataTable".equals(str))
        {
          a(localzcjn2, this.e.l());
        }
        else if ("downBar".equals(str))
        {
          a(localzcjn2, this.e.m());
        }
        else if ("dropLine".equals(str))
        {
          a(localzcjn2, this.e.n());
        }
        else if ("errorBar".equals(str))
        {
          a(localzcjn2, this.e.o());
        }
        else if ("floor".equals(str))
        {
          a(localzcjn2, this.e.p());
        }
        else if ("gridlineMajor".equals(str))
        {
          a(localzcjn2, this.e.q());
        }
        else if ("gridlineMinor".equals(str))
        {
          a(localzcjn2, this.e.r());
        }
        else if ("hiLoLine".equals(str))
        {
          a(localzcjn2, this.e.s());
        }
        else if ("leaderLine".equals(str))
        {
          a(localzcjn2, this.e.t());
        }
        else if ("legend".equals(str))
        {
          a(localzcjn2, this.e.c());
        }
        else if ("plotArea".equals(str))
        {
          a(localzcjn2, this.e.u());
        }
        else if ("plotArea3D".equals(str))
        {
          a(localzcjn2, this.e.v());
        }
        else if ("seriesAxis".equals(str))
        {
          a(localzcjn2, this.e.w());
        }
        else if ("seriesLine".equals(str))
        {
          a(localzcjn2, this.e.x());
        }
        else if ("title".equals(str))
        {
          a(localzcjn2, this.e.y());
        }
        else if ("trendline".equals(str))
        {
          a(localzcjn2, this.e.z());
        }
        else if ("trendlineLabel".equals(str))
        {
          a(localzcjn2, this.e.A());
        }
        else if ("upBar".equals(str))
        {
          a(localzcjn2, this.e.B());
        }
        else if ("valueAxis".equals(str))
        {
          a(localzcjn2, this.e.C());
        }
        else if ("wall".equals(str))
        {
          a(localzcjn2, this.e.D());
        }
      }
    }
  }
  
  private void a(zcjn paramzcjn, zju paramzju)
    throws Exception
  {
    zsw localzsw = paramzju.f();
    zcju localzcju = paramzcjn.l();
    Iterator localIterator = localzcju.iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = localIterator.next();
      if ((localObject1 instanceof zcjn))
      {
        zcjn localzcjn = (zcjn)localObject1;
        String str = localzcjn.g;
        Object localObject2;
        Object localObject3;
        if ("lnRef".equals(str))
        {
          localObject2 = a(localzcjn);
          localzsw.a.a = ((zcjy)localObject2).a("idx");
          localObject3 = zakf.a((zcjy)localObject2);
          localzsw.a.b = ((zaml)localObject3);
        }
        else if ("fillRef".equals(str))
        {
          localObject2 = a(localzcjn);
          localzsw.d.a = ((zcjy)localObject2).a("idx");
          if (!((zcjy)localObject2).o())
          {
            localObject3 = zakf.a((zcjy)localObject2);
            localzsw.d.b = ((zaml)localObject3);
          }
        }
        else if ("fontRef".equals(str))
        {
          localObject2 = a(localzcjn);
          localObject3 = ((zcjy)localObject2).a("idx");
          localzsw.b.a = ((String)localObject3);
          if (!((zcjy)localObject2).o())
          {
            zaml localzaml = zakf.a((zcjy)localObject2);
            localzsw.b.b = localzaml;
          }
        }
        else if ("effectRef".equals(str))
        {
          localObject2 = a(localzcjn);
          localzsw.e.a = ((zcjy)localObject2).a("idx");
          if (!((zcjy)localObject2).o()) {
            localzsw.e.b = zakf.a((zcjy)localObject2);
          }
        }
        else if ("spPr".equals(str))
        {
          localObject2 = new zakq(paramzju.e(), this.a, this.d, this.b);
          localObject3 = a(localzcjn);
          ((zakq)localObject2).a((zcjy)localObject3, paramzju);
        }
      }
    }
  }
  
  private zcjy a(zcjn paramzcjn)
    throws Exception
  {
    String str = zauz.a(paramzcjn, true);
    zcjy localzcjy = zauy.a(str, false);
    localzcjy.a(0);
    localzcjy.d();
    return localzcjy;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zake.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */