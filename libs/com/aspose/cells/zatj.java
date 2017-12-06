package com.aspose.cells;

import com.aspose.cells.a.f.zi;
import com.aspose.cells.a.f.zj;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;

class zatj
{
  private zcjy a;
  private zasg b;
  private static final za c = new za(new String[] { "style-name", "text-style-name", "name", "z-index", "x", "y", "width", "height", "end-cell-address", "end-x", "text-box", "object", "object-ole", "image", "desc", "class-id", "href", "show", "actuate", "notify-on-update-of-ranges", "p", "span", "stretch", "bitmap", "solid", "none" });
  
  zatj(zasg paramzasg)
  {
    this.b = paramzasg;
  }
  
  void a(zash paramzash, String paramString, int paramInt1, int paramInt2, zcjy paramzcjy)
    throws Exception
  {
    HashMap localHashMap = new HashMap();
    this.a = paramzcjy;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        switch (c.a(paramzcjy.q()))
        {
        case 0: 
          localHashMap.put("styleName", paramzcjy.t());
          break;
        case 1: 
          localHashMap.put("textStyleName", paramzcjy.t());
          break;
        case 2: 
          localHashMap.put("name", paramzcjy.t());
          break;
        case 3: 
          localHashMap.put("zIndex", paramzcjy.t());
          break;
        case 4: 
          localHashMap.put("x", Integer.valueOf(zasp.a(this.b.a, paramzcjy.t())));
          break;
        case 5: 
          localHashMap.put("y", Integer.valueOf(zasp.a(this.b.a, paramzcjy.t())));
          break;
        case 6: 
          localHashMap.put("width", Integer.valueOf(zasp.a(this.b.a, paramzcjy.t())));
          break;
        case 7: 
          localHashMap.put("height", Integer.valueOf(zasp.a(this.b.a, paramzcjy.t())));
          break;
        case 8: 
          localHashMap.put("end-cell-address", paramzcjy.t());
          break;
        case 9: 
          localHashMap.put("end-x", paramzcjy.t());
        }
      }
      paramzcjy.l();
    }
    int i = 0;
    int j = 0;
    if (localHashMap.get("y") != null) {
      j = ((Integer)localHashMap.get("y")).intValue();
    }
    if (localHashMap.get("x") != null) {
      i = ((Integer)localHashMap.get("x")).intValue();
    }
    Object localObject2;
    if (paramString != null)
    {
      localObject1 = paramzash.a.getShapes().addAutoShape(zasn.d(paramString), paramInt1, j, paramInt2, i, ((Integer)localHashMap.get("height")).intValue(), ((Integer)localHashMap.get("width")).intValue());
      localObject2 = (String)localHashMap.get("end-cell-address");
      if (localObject2 != null)
      {
        int k = ((String)localObject2).lastIndexOf('.');
        if (k != -1) {
          localObject2 = ((String)localObject2).substring(k + 1);
        }
        int m = 0;
        int n = 0;
        int[] arrayOfInt1 = { m };
        int[] arrayOfInt2 = { n };
        CellsHelper.a((String)localObject2, arrayOfInt1, arrayOfInt2);
        m = arrayOfInt1[0];
        n = arrayOfInt2[0];
        int i1 = ((Shape)localObject1).getPlacement();
        if (((Shape)localObject1).getLowerRightColumn() > n)
        {
          ((Shape)localObject1).setPlacement(2);
          ((Shape)localObject1).R().i().h(n);
          String str = (String)localHashMap.get("end-x");
          if (str != null)
          {
            int i2 = zasp.a(this.b.a, str);
            int i3 = ((Shape)localObject1).a(n, i2);
            ((Shape)localObject1).R().i().i(i3);
          }
        }
        ((Shape)localObject1).setPlacement(i1);
      }
      a((Shape)localObject1, localHashMap, paramzcjy);
      return;
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    Object localObject1 = new zatg(paramInt1, j, paramInt2, i, ((Integer)localHashMap.get("height")).intValue(), ((Integer)localHashMap.get("width")).intValue());
    zf.a(paramzash.g, localObject1);
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (c.a(paramzcjy.q().toLowerCase()))
      {
      case 10: 
        localObject2 = paramzash.a.getShapes().b(paramInt1, ((Integer)localHashMap.get("y")).intValue(), paramInt2, ((Integer)localHashMap.get("x")).intValue(), ((Integer)localHashMap.get("height")).intValue(), ((Integer)localHashMap.get("width")).intValue());
        a((Shape)localObject2, localHashMap, paramzcjy);
        paramzash.g.remove(paramzash.g.size() - 1);
        break;
      case 11: 
        ((zatg)localObject1).h = a();
        break;
      case 12: 
        ((zatg)localObject1).h = a();
        break;
      case 13: 
        ((zatg)localObject1).i = b();
        break;
      case 14: 
      default: 
        paramzcjy.a();
      }
    }
  }
  
  zaue a()
    throws Exception
  {
    zaue localzaue = new zaue();
    if (this.a.n())
    {
      while (this.a.m()) {
        switch (c.a(this.a.q().toLowerCase()))
        {
        case 15: 
          localzaue.b = this.a.t();
          break;
        case 16: 
          localzaue.c = zasp.v(this.a.t());
          break;
        case 17: 
          localzaue.d = zasn.b(this.a.t());
          break;
        case 18: 
          localzaue.e = zasn.c(this.a.t());
          break;
        case 19: 
          localzaue.a = this.a.t();
        }
      }
      this.a.l();
    }
    localzaue.f = this.a.b();
    if ("".equals(localzaue.f)) {
      localzaue.f = null;
    }
    return localzaue;
  }
  
  zasd b()
    throws Exception
  {
    zasd localzasd = new zasd();
    if (this.a.n())
    {
      while (this.a.m()) {
        switch (c.a(this.a.q().toLowerCase()))
        {
        case 15: 
          localzasd.b(this.a.t());
          break;
        case 16: 
          localzasd.c(zasp.v(this.a.t()));
          break;
        case 17: 
          localzasd.a(zasn.b(this.a.t()));
          break;
        case 18: 
          localzasd.b(zasn.c(this.a.t()));
        }
      }
      this.a.l();
    }
    if (this.a.o())
    {
      this.a.a();
      return localzasd;
    }
    this.a.d();
    Font localFont = this.b.b.getWorksheets().i(0);
    ArrayList localArrayList = new ArrayList();
    while (this.a.s() != 4)
    {
      this.a.k();
      if (this.a.s() != 1)
      {
        if (this.a.s() == 3)
        {
          zatc localzatc = new zatc();
          localzatc.a = this.a.t();
          zf.a(localArrayList, localzatc);
        }
        this.a.a();
      }
      else
      {
        switch (c.a(this.a.q().toLowerCase()))
        {
        case 20: 
          a(localArrayList);
          break;
        default: 
          this.a.a();
        }
      }
    }
    this.a.h();
    localzasd.a = localArrayList;
    return localzasd;
  }
  
  void a(Shape paramShape, HashMap paramHashMap, zcjy paramzcjy)
    throws Exception
  {
    if (paramHashMap.get("styleName") != null)
    {
      localObject1 = (zati)this.b.i.get(paramHashMap.get("styleName"));
      if ((paramShape != null) && (localObject1 != null)) {
        a(paramShape, this.b, (zati)localObject1);
      }
    }
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    Object localObject1 = null;
    if (paramHashMap.get("textStyleName") != null)
    {
      localObject2 = (zatb)this.b.h.get(paramHashMap.get("textStyleName"));
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
    if (paramHashMap.get("name") != null) {
      paramShape.setName((String)paramHashMap.get("name"));
    }
    if (paramHashMap.get("zIndex") != null) {
      paramShape.setZOrderPosition(zp.a((String)paramHashMap.get("zIndex")));
    }
    Object localObject2 = new ArrayList();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
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
        case 20: 
          a((ArrayList)localObject2);
          break;
        default: 
          paramzcjy.a();
        }
      }
    }
    paramzcjy.h();
    if (((ArrayList)localObject2).size() != 0) {
      zarv.a((ArrayList)localObject2, paramShape.getTextBody(), (Font)localObject1);
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
        case 0: 
          str = this.a.t();
        }
      }
    }
    this.a.d();
    Object localObject1 = null;
    Object localObject2;
    if (str != null)
    {
      localObject2 = (zatb)this.b.h.get(str);
      if (localObject2 != null) {
        localObject1 = ((zatb)localObject2).b;
      }
    }
    while (this.a.s() != 4)
    {
      this.a.k();
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
        case 21: 
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
        case 0: 
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
      StringBuilder localStringBuilder = new StringBuilder();
      a(localStringBuilder, this.a);
      localzatc.a = zs.a(localStringBuilder);
      zf.a(paramArrayList, localzatc);
    }
  }
  
  private void a(StringBuilder paramStringBuilder, zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() == 3)
      {
        paramStringBuilder.append(paramzcjy.t());
        paramzcjy.a();
      }
      else if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if (paramzcjy.o())
      {
        paramzcjy.a();
      }
      else
      {
        a(paramStringBuilder, paramzcjy);
      }
    }
    paramzcjy.h();
  }
  
  static void a(Shape paramShape, zasg paramzasg, zati paramzati)
    throws Exception
  {
    zath localzath = paramzati.a;
    if (localzath.a != null) {
      paramShape.setTextWrapped(zasp.u(localzath.a));
    }
    if (localzath.k != null) {
      switch (c.a(localzath.k))
      {
      case 22: 
        paramShape.f(false);
        break;
      }
    }
    Object localObject;
    if ((localzath.b != null) || (localzath.c != null) || (localzath.d != null) || (localzath.e != null))
    {
      localObject = paramShape.getTextFrame();
      ((MsoTextFrame)localObject).c(zasp.a(paramzasg.a, localzath.b));
      ((MsoTextFrame)localObject).d(zasp.a(paramzasg.a, localzath.c));
      ((MsoTextFrame)localObject).a(zasp.a(paramzasg.a, localzath.d));
      ((MsoTextFrame)localObject).b(zasp.a(paramzasg.a, localzath.e));
      ((MsoTextFrame)localObject).setAutoMargin(false);
    }
    if ((localzath.f != null) && (localzath.g != null))
    {
      localObject = paramShape.getTextBody();
      ((FontSettingCollection)localObject).getTextAlignment().g(zasp.r(localzath.f));
      ((FontSettingCollection)localObject).getTextAlignment().f(zasp.s(localzath.g));
    }
    if (localzath.h != null) {
      switch (c.a(localzath.h))
      {
      case 23: 
        paramShape.getFill().setFillType(4);
        break;
      case 24: 
        paramShape.getFill().setFillType(2);
        paramShape.getFill().getSolidFill().setColor(localzath.i);
        paramShape.getFill().getSolidFill().setTransparency(1.0D - localzath.o);
        break;
      case 25: 
        paramShape.getFill().setFillType(1);
        break;
      }
    }
    if ((paramzasg.j != null) && (paramzasg.j.size() > 0) && (localzath.j != null))
    {
      localObject = (zasd)paramzasg.j.get(localzath.j);
      if (localObject != null) {
        a(paramShape, paramzasg, (zasd)localObject);
      }
    }
    if (localzath.l != null)
    {
      localObject = paramShape.B().getLine();
      if (!"none".equals(localzath.l))
      {
        ((LineFormat)localObject).setFillType(2);
        ((LineFormat)localObject).setWeight(zasp.a(paramzasg.a, localzath.m));
        ((LineFormat)localObject).getSolidFill().setColor(localzath.n);
        if (localzath.p != null) {
          ((LineFormat)localObject).a(zasp.t(localzath.p));
        }
      }
      else
      {
        ((LineFormat)localObject).setFillType(1);
      }
    }
    else
    {
      switch (paramShape.getMsoDrawingType())
      {
      case 25: 
        break;
      default: 
        paramShape.B().getLine().setFillType(1);
      }
    }
  }
  
  private static void a(Shape paramShape, zasg paramzasg, zasd paramzasd)
    throws Exception
  {
    zi localzi = paramzasg.k;
    com.aspose.cells.a.f.zh localzh = localzi.a(paramzasd.b());
    zm localzm = localzi.a(localzh);
    byte[] arrayOfByte = new byte[(int)localzh.a()];
    localzm.a(arrayOfByte, 0, (int)localzh.a());
    localzm.a();
    paramShape.getFill().setFillType(4);
    TextureFill localTextureFill = paramShape.getFill().getTextureFill();
    localTextureFill.setImageData(arrayOfByte);
    localTextureFill.b = 2;
    localTextureFill.a = paramzasd.b();
  }
  
  private byte[] a(zaue paramzaue)
    throws Exception
  {
    if (paramzaue.f != null) {
      return Encoding.getUTF8().a(paramzaue.f);
    }
    if (paramzaue.c == null) {
      return null;
    }
    return a(paramzaue.c, false);
  }
  
  private byte[] a(String paramString, boolean paramBoolean)
    throws Exception
  {
    zi localzi = this.b.k;
    com.aspose.cells.a.f.zh localzh = localzi.a(paramString);
    byte[] arrayOfByte = null;
    Object localObject1;
    if (localzh == null)
    {
      if (paramBoolean) {
        return null;
      }
      localObject1 = new com.aspose.cells.b.a.d.zh();
      zj localzj = new zj((zm)localObject1);
      localzj.b(2);
      localzj.d(0);
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      for (int j = 0; j < localzi.a(); j++)
      {
        String str = localzi.a(j).b();
        if (str.startsWith(paramString + "/"))
        {
          Object localObject2;
          if (i == 0)
          {
            localObject2 = new zasr("text/xml", "META-INF/manifest.xml");
            zf.a(localArrayList, localObject2);
          }
          if (com.aspose.cells.b.a.zw.b(str, paramString + "/"))
          {
            localObject2 = new zasr("application/vnd.oasis.opendocument.text", "/");
            zf.a(localArrayList, localObject2);
          }
          else
          {
            if (localzi.a(j).c())
            {
              localObject2 = localzj.a(localzi.a(j).b().substring(paramString.length() + 1));
              ((com.aspose.cells.a.f.zh)localObject2).a(DateTime.getNow());
              localzj.a((com.aspose.cells.a.f.zh)localObject2);
              localzj.b();
            }
            else
            {
              a(localzi.a(j), localzi, localzj, paramString.length() + 1);
            }
            localObject2 = new zasr("text/xml", localzi.a(j).b().substring(paramString.length() + 1));
            zf.a(localArrayList, localObject2);
          }
        }
      }
      if (localArrayList.size() > 0) {
        a(localArrayList, localzj);
      }
      localzj.f_();
      localzj.a();
      if (localArrayList.size() > 0) {
        arrayOfByte = ((com.aspose.cells.b.a.d.zh)localObject1).o();
      }
      ((com.aspose.cells.b.a.d.zh)localObject1).a();
    }
    else
    {
      localObject1 = localzi.a(localzh);
      arrayOfByte = new byte[(int)localzh.a()];
      ((zm)localObject1).a(arrayOfByte, 0, (int)localzh.a());
      ((zm)localObject1).a();
    }
    return arrayOfByte;
  }
  
  private boolean a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return true;
    }
    return (paramArrayOfByte.length > 6) && (paramArrayOfByte[0] == 86) && (paramArrayOfByte[1] == 67) && (paramArrayOfByte[2] == 76) && (paramArrayOfByte[3] == 77) && (paramArrayOfByte[4] == 84) && (paramArrayOfByte[5] == 70);
  }
  
  private void a(com.aspose.cells.a.f.zh paramzh, zi paramzi, zj paramzj, int paramInt)
    throws Exception
  {
    zm localzm = paramzi.a(paramzh);
    byte[] arrayOfByte = new byte[(int)paramzh.a()];
    localzm.a(arrayOfByte, 0, (int)paramzh.a());
    localzm.a();
    com.aspose.cells.a.f.zh localzh = paramzj.a(paramzh.b().substring(paramInt));
    localzh.a(DateTime.getNow());
    paramzj.a(localzh);
    paramzj.b(arrayOfByte, 0, arrayOfByte.length);
    paramzj.b();
  }
  
  private void a(ArrayList paramArrayList, zj paramzj)
    throws Exception
  {
    zcjz localzcjz = zatr.a("META-INF/manifest.xml", paramzj);
    localzcjz.c();
    localzcjz.b("manifest:manifest");
    localzcjz.a("xmlns", "manifest", null, "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0");
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      zasr localzasr = (zasr)paramArrayList.get(i);
      localzcjz.b("manifest:file-entry");
      localzcjz.a("manifest", "media-type", null, localzasr.a());
      localzcjz.a("manifest", "full-path", null, localzasr.b());
      localzcjz.b();
    }
    localzcjz.b();
    localzcjz.d();
    localzcjz.a(1);
    localzcjz.e();
  }
  
  void a(zash paramzash)
    throws Exception
  {
    Worksheet localWorksheet = paramzash.a;
    zasg localzasg = paramzash.b;
    Font localFont = localzasg.b.getDefaultStyle().getFont();
    for (int i = 0; i < paramzash.g.size(); i++) {
      try
      {
        zatg localzatg = (zatg)paramzash.g.get(i);
        Object localObject1;
        Object localObject2;
        if ((localzatg.h != null) && (localzatg.h.a()))
        {
          localObject1 = localzatg.h;
          localObject2 = null;
          zm localzm = null;
          if ((((zaue)localObject1).f != null) && (!"".equals(((zaue)localObject1).f)))
          {
            localObject2 = new zcjm(null);
            ((zcjm)localObject2).a(((zaue)localObject1).f, false, false);
          }
          Object localObject3;
          if ((localObject2 == null) || (((zcjm)localObject2).f() == null) || (((zcjm)localObject2).f().l().a() == 0))
          {
            localObject3 = ((zaue)localObject1).c;
            if ((localObject3 != null) && (((String)localObject3).endsWith("/"))) {
              localObject3 = (String)localObject3 + "content.xml";
            } else {
              localObject3 = (String)localObject3 + "/content.xml";
            }
            localzm = this.b.b((String)localObject3);
            if (localzm != null) {
              localObject2 = zauz.a(localzm, null, false);
            }
          }
          if (localObject2 != null)
          {
            if (((zcjm)localObject2).f() != null) {
              try
              {
                localObject3 = new zart(this.b, localWorksheet, localzatg);
                ((zart)localObject3).a((zcjm)localObject2);
              }
              catch (Exception localException2) {}
            }
            if (localzm != null) {
              localzm.a();
            }
          }
          try
          {
            byte[] arrayOfByte1 = a((zaue)localObject1);
            if (arrayOfByte1 != null)
            {
              byte[] arrayOfByte2 = a(localzatg.i.b(), true);
              if (a(arrayOfByte2)) {
                arrayOfByte2 = com.aspose.cells.a.c.zw.j();
              }
              OleObject localOleObject = localWorksheet.getShapes().addOleObject(localzatg.f, (int)localzatg.c, localzatg.g, (int)localzatg.b, (int)localzatg.d, (int)localzatg.e, arrayOfByte2);
              localOleObject.setObjectData(arrayOfByte1);
              localOleObject.setProgID("Word.OpenDocumentText.12");
              if (((zaue)localObject1).b != null) {
                localOleObject.a(new com.aspose.cells.b.a.zh(((zaue)localObject1).b));
              }
              continue;
            }
          }
          catch (Exception localException3) {}
        }
        else if (localzatg.i != null)
        {
          localObject1 = a(localzatg.i.b(), true);
          if (localObject1 != null)
          {
            if (a((byte[])localObject1)) {
              localObject1 = com.aspose.cells.a.c.zw.j();
            }
            localObject2 = paramzash.a.getShapes().a(localzatg.f, localzatg.g, new com.aspose.cells.b.a.d.zh((byte[])localObject1), 100, 100);
            if (localObject2 != null)
            {
              ((Picture)localObject2).a(localzatg.f, (int)localzatg.c, localzatg.g, (int)localzatg.b, (int)localzatg.d, (int)localzatg.e);
              if ((localzatg.i.a != null) && (localzatg.i.a.size() != 0)) {
                zarv.a(localzatg.i.a, ((Picture)localObject2).getTextBody(), localFont);
              }
            }
          }
        }
      }
      catch (Exception localException1) {}
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zatj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */