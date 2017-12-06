package com.aspose.cells;

import com.aspose.cells.a.c.zu;
import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zalo
{
  private zqh a = null;
  private zqi b;
  private zi c;
  private zcjy d = null;
  private HashMap e = null;
  private int f;
  private ArrayList g = new ArrayList();
  private com.aspose.cells.b.a.d.zh h = null;
  private zcjz i = null;
  private zqg j = null;
  private zqe k = null;
  private String l = null;
  private String m = null;
  private boolean n = true;
  private boolean o = true;
  private boolean p = false;
  private boolean q = true;
  private String r = null;
  private String s = null;
  private String t = null;
  private String u = null;
  private String v = null;
  private String w = null;
  private boolean x = false;
  private String y = null;
  private String z = null;
  private String A = null;
  private ArrayList B = null;
  private String C = null;
  private String D = null;
  private String[] E = null;
  private static final com.aspose.cells.b.c.a.za F = new com.aspose.cells.b.c.a.za(new String[] { "shape", "roundrect", "rect", "line", "group", "id", "spid", "alt", "style", "href", "filled", "fillcolor", "stroked", "strokecolor", "strokeweight", "insetmode", "coordorigin", "coordsize", "from", "to", "Note", "Pict", "Checkbox", "Label", "Button", "Drop", "Spin", "List", "Radio", "GBox", "Scroll", "Shape", "margin-left", "left", "margin-top", "top", "width", "height", "z-index", "visibility", "rotation", "v-text-anchor", "bottom", "addlxml", "allowcomments", "ext", "issignatureline", "provid", "signinginstructionsset", "showsigndate", "suggestedsigner", "suggestedsigner2", "suggestedsigneremail", "signinginstructions", "sigprovurl", "br", "b", "Anchor", "MoveWithCells", "SizeWithCells", "Locked", "PrintObject", "FmlaMacro", "FmlaPict", "AutoPict", "FmlaRange", "fmlaRange", "fmlaGroup", "FmlaTxbx", "fmlaTxbx", "FmlaLink", "fmlaLink", "NoThreeD", "NoThreeD2", "noThreeD", "noThreeD2", "Checked", "checked", "Min", "min", "Max", "max", "Inc", "inc", "Page", "page", "Horiz", "horiz", "Value", "value", "Sel", "sel", "SelType", "seltype", "DropLines", "dropLines", "ListItem", "MultiSel", "multiSel", "Dx", "dx", "dropStyle", "colored", "firstButton", "justLastX", "lockText", "textHAlign", "textVAlign", "widthMin", "editVal", "multiLine", "verticalBar", "passwordEdit", "Mixed", "Unchecked", "1", "2", "dashstyle", "linestyle", "endarrow", "startarrow", "black", "silver", "gray", "white", "maroon", "red", "purple", "fuchsia", "green", "lime", "olive", "yellow", "navy", "blue", "teal", "aqua" });
  
  zalo(zqi paramzqi, HashMap paramHashMap, zi paramzi, String paramString)
    throws Exception
  {
    this.b = paramzqi;
    this.a = paramzqi.m;
    this.e = paramHashMap;
    this.c = paramzi;
    this.f = zbxp.a();
    this.d = zauy.a(paramzi, paramString);
  }
  
  private void b()
    throws Exception
  {
    if (this.h != null)
    {
      this.i.b();
      this.i.e();
      this.b.d.getShapes().a = this.h.o();
    }
    for (int i1 = 0; i1 < this.g.size(); i1 += 2)
    {
      Object localObject = this.g.get(i1);
      String str = (String)this.g.get(i1 + 1);
      if ((localObject instanceof Shape)) {
        ((Picture)localObject).setData(b(str));
      } else if ((localObject instanceof zqf)) {
        a((zqf)localObject, str);
      } else if ((localObject instanceof FillFormat)) {
        ((FillFormat)localObject).setImageData(b(str));
      }
    }
  }
  
  void a()
    throws Exception
  {
    if (null == this.d) {
      return;
    }
    this.d.k();
    if (!this.d.d()) {
      return;
    }
    zbys localzbys = new zbys();
    while (this.d.s() != 4) {
      if (this.d.s() != 1)
      {
        this.d.a();
      }
      else
      {
        zcjs localzcjs = this.d.a(localzbys, false);
        zcjn localzcjn = (zcjn)localzcjs;
        switch (F.a(localzcjn.g))
        {
        case 0: 
          a(null, localzcjn, 29);
          break;
        case 1: 
        case 2: 
          a(null, localzcjn, 2);
          break;
        case 3: 
          a(null, localzcjn, 1);
          break;
        case 4: 
          a(localzcjn);
          break;
        default: 
          b(localzcjn);
        }
        localzcjs.h();
      }
    }
    this.d.c();
    b();
  }
  
  void a(zcjn paramzcjn)
    throws Exception
  {
    ShapeCollection localShapeCollection = this.b.d.getShapes();
    Shape localShape = localShapeCollection.a(0, 4095);
    localShape.h = new zqu();
    a(paramzcjn, localShape);
    zcju localzcju = paramzcjn.l();
    ArrayList localArrayList = new ArrayList();
    for (int i1 = 0; i1 < localzcju.a(); i1++) {
      if ((localzcju.a(i1) instanceof zcjn))
      {
        zcjn localzcjn = (zcjn)localzcju.a(i1);
        String str = localzcjn.g;
        switch (F.a(str))
        {
        case 0: 
          a(localArrayList, localzcjn, 29);
          break;
        case 1: 
        case 2: 
          a(localArrayList, localzcjn, 2);
          break;
        case 3: 
          a(localArrayList, localzcjn, 1);
          break;
        case 4: 
          a(localzcjn);
        }
      }
    }
    GroupShape localGroupShape = (GroupShape)localShape;
    if (localArrayList.size() > 0)
    {
      int i2 = localGroupShape.a().a;
      int i3 = localGroupShape.a().c;
      int i4 = localGroupShape.a().b;
      int i5 = localGroupShape.a().d;
      for (int i6 = 0; i6 < localArrayList.size(); i6++)
      {
        localShape = (Shape)localArrayList.get(i6);
        int[] arrayOfInt = localShape.K();
        localShape.a(0, false, (int)((arrayOfInt[0] - i2) * 4000.0F / i4 + 0.5D), (int)((arrayOfInt[1] - i3) * 4000.0F / i5 + 0.5D), (int)(arrayOfInt[2] * 4000.0F / i4 + 0.5D), (int)(arrayOfInt[3] * 4000.0F / i5 + 0.5D));
        localGroupShape.a(localShape);
      }
    }
  }
  
  private void a(ArrayList paramArrayList, zcjn paramzcjn, int paramInt)
    throws Exception
  {
    this.j = null;
    this.m = null;
    this.l = null;
    this.k = null;
    Shape localShape = a(paramzcjn, paramInt);
    if ((paramArrayList != null) && (localShape != null)) {
      zf.a(paramArrayList, localShape);
    }
    if (localShape == null) {
      return;
    }
    a(paramzcjn, localShape);
    c(paramzcjn, localShape);
  }
  
  private void b(zcjn paramzcjn)
    throws Exception
  {
    if (this.h == null)
    {
      this.h = new com.aspose.cells.b.a.d.zh();
      this.i = new zcjz(this.h, Encoding.getUTF8());
      this.i.b = true;
      zvu.b(this.i);
    }
    paramzcjn.a(this.i);
  }
  
  private void a(zcjn paramzcjn, Shape paramShape)
    throws Exception
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    Object localObject7 = null;
    Object localObject8 = null;
    Iterator localIterator = paramzcjn.e().iterator();
    String[] arrayOfString;
    while (localIterator.hasNext())
    {
      zcjg localzcjg = (zcjg)localIterator.next();
      String str1 = localzcjg.g;
      String str2 = localzcjg.h;
      GroupShape localGroupShape;
      switch (F.a(str1))
      {
      case 5: 
        paramShape.h.b = str2;
        break;
      case 6: 
        paramShape.h.c = this.m;
        break;
      case 7: 
        paramShape.setAlternativeText(str2);
        break;
      case 8: 
        a(str2, paramShape);
        break;
      case 9: 
        paramShape.addHyperlink(str2);
        break;
      case 10: 
        localObject4 = str2;
        break;
      case 11: 
        localObject1 = str2;
        break;
      case 12: 
        localObject5 = str2;
        break;
      case 13: 
        localObject2 = str2;
        break;
      case 14: 
        localObject3 = str2;
        break;
      case 15: 
        if ("auto".equals(str2)) {
          paramShape.s = true;
        }
        localObject8 = str2;
        break;
      case 16: 
        if ((paramShape instanceof GroupShape))
        {
          arrayOfString = zw.d(str2, ',');
          localGroupShape = (GroupShape)paramShape;
          if (!zw.b(arrayOfString[0])) {
            localGroupShape.a().a = zauj.F(arrayOfString[0]);
          }
          if (!zw.b(arrayOfString[1])) {
            localGroupShape.a().c = zauj.F(arrayOfString[1]);
          }
        }
        break;
      case 17: 
        if ((paramShape instanceof GroupShape))
        {
          arrayOfString = zw.d(str2, ',');
          localGroupShape = (GroupShape)paramShape;
          localGroupShape.a().b = zauj.F(arrayOfString[0]);
          localGroupShape.a().d = zauj.F(arrayOfString[1]);
        }
        break;
      case 18: 
        localObject6 = str2;
        break;
      case 19: 
        localObject7 = str2;
      }
    }
    switch (paramShape.getMsoDrawingType())
    {
    case 8: 
    case 25: 
      break;
    case 1: 
    case 2: 
    case 6: 
      if (localObject8 == null)
      {
        if (paramShape.h.b != null) {
          paramShape.setName(paramShape.h.b);
        }
        paramShape.h.b = null;
        paramShape.h.c = null;
      }
      break;
    }
    int i3;
    if ((localObject6 != null) && (localObject7 != null))
    {
      int i1 = 0;
      int i2 = 0;
      i3 = 0;
      int i4 = 0;
      arrayOfString = zw.d((String)localObject6, ',');
      i1 = (int)zbxp.a(arrayOfString[0], "px", this.f);
      i2 = (int)zbxp.a(arrayOfString[1], "px", this.f);
      arrayOfString = zw.d((String)localObject7, ',');
      i3 = (int)zbxp.a(arrayOfString[0], "px", this.f);
      i4 = (int)zbxp.a(arrayOfString[1], "px", this.f);
      int i5 = paramShape.getPlacement();
      paramShape.a(0, false, i1, i2, i3 - i1, i4 - i2);
    }
    if ((paramShape.h.b != null) && (paramShape.z())) {
      if (paramShape.getMsoDrawingType() == 25)
      {
        if ((paramShape.h.c != null) || (!paramShape.h.b.startsWith("\000"))) {
          paramShape.setName(paramShape.h.b);
        }
      }
      else if (paramShape.getMsoDrawingType() != 24) {
        paramShape.setName(paramShape.h.b);
      }
    }
    boolean bool1 = zauj.b((String)localObject4, true);
    boolean bool2 = zauj.b((String)localObject5, true);
    switch (paramShape.getMsoDrawingType())
    {
    case 11: 
    case 12: 
      if (localObject4 == null) {
        bool1 = true;
      }
      break;
    case 8: 
    case 24: 
      if (localObject4 == null) {
        bool1 = false;
      }
      if (localObject5 == null) {
        bool2 = false;
      }
      break;
    }
    Color localColor;
    if (!bool1)
    {
      paramShape.setFilled(false);
    }
    else
    {
      i3 = 0;
      if ((localObject1 != null) && (((String)localObject1).indexOf("window") == -1))
      {
        localColor = a((String)localObject1, this.a.a.getWorksheets());
        if (!localColor.isEmpty())
        {
          paramShape.getFill().setFillType(2);
          paramShape.getFill().getSolidFill().setColor(localColor);
          i3 = 1;
        }
      }
      if ((i3 == 0) && (paramShape.getFill().getFillType() == 1)) {
        paramShape.getFill().setFillType(0);
      }
    }
    if (!bool2)
    {
      paramShape.B().getLine().setFillType(1);
    }
    else
    {
      i3 = 0;
      if ((localObject2 != null) && (((String)localObject2).indexOf("window") == -1))
      {
        localColor = a((String)localObject2, this.a.a.getWorksheets());
        if (!localColor.isEmpty())
        {
          paramShape.B().getLine().setFillType(2);
          paramShape.B().getLine().getSolidFill().setColor(localColor);
          i3 = 1;
        }
      }
      if ((i3 == 0) && (paramShape.B().getLine().getFillType() == 1)) {
        paramShape.B().getLine().setFillType(2);
      }
      if ((localObject3 != null) && (((String)localObject3).indexOf(',') == -1)) {
        paramShape.B().getLine().setWeight(zbxp.a((String)localObject3, "pt", this.f));
      }
    }
  }
  
  private Shape a(zcjn paramzcjn, int paramInt)
    throws Exception
  {
    int i1 = paramInt != 29 ? 1 : 0;
    this.l = paramzcjn.a("id", null);
    this.m = paramzcjn.a("spid", null);
    this.j = this.b.a(this.l, this.m, true);
    if (this.j != null) {
      this.k = this.j.p;
    }
    if (this.k == null) {
      this.k = this.b.a(this.l, this.m);
    }
    Object localObject = null;
    ShapeCollection localShapeCollection = this.b.d.getShapes();
    zcjn localzcjn1 = zauj.b(paramzcjn, "ClientData");
    if (localzcjn1 != null)
    {
      String str1 = zauj.a(localzcjn1, "ObjectType");
      switch (F.a(str1))
      {
      case 20: 
        zcjn localzcjn2 = zauj.b(localzcjn1, "Row");
        zcjn localzcjn3 = zauj.b(localzcjn1, "Column");
        if ((localzcjn2 != null) && (localzcjn3 != null))
        {
          String str2 = zauj.b(zauz.a(localzcjn2));
          String str3 = zauj.b(zauz.a(localzcjn3));
          if ((str2 != null) && (str3 != null))
          {
            int i2 = zauj.F(str2);
            int i3 = zauj.F(str3);
            CommentCollection localCommentCollection = this.b.d.getComments();
            int i4 = localCommentCollection.getCount();
            for (int i5 = 0; i5 < i4; i5++)
            {
              Comment localComment = localCommentCollection.get(i5);
              if ((localComment.getRow() == i2) && (localComment.getColumn() == i3))
              {
                localObject = localComment.getCommentShape();
                break;
              }
            }
          }
        }
        break;
      case 21: 
        localObject = c(paramzcjn);
        break;
      case 22: 
        paramInt = 11;
        break;
      case 23: 
        paramInt = 14;
        break;
      case 24: 
        paramInt = 7;
        break;
      case 25: 
        paramInt = 20;
        break;
      case 26: 
        paramInt = 16;
        break;
      case 27: 
        paramInt = 18;
        break;
      case 28: 
        paramInt = 12;
        break;
      case 29: 
        paramInt = 19;
        break;
      case 30: 
        paramInt = 17;
        break;
      case 31: 
        localzcjn1 = zauj.b(paramzcjn, "textbox");
        if (localzcjn1 != null) {
          paramInt = 6;
        }
        break;
      }
    }
    else if (paramInt == 29)
    {
      localzcjn1 = zauj.b(paramzcjn, "textbox");
      if (localzcjn1 != null)
      {
        paramInt = 6;
      }
      else
      {
        if (zauj.b(paramzcjn, "imagedata") != null) {
          return c(paramzcjn);
        }
        paramInt = 2;
      }
    }
    if (localObject != null)
    {
      ((Shape)localObject).h = new zqu();
    }
    else if (paramInt != 29)
    {
      localObject = a(paramInt, 4095);
      if (i1 != 0) {
        ((Shape)localObject).getFill().setFillType(1);
      }
    }
    return (Shape)localObject;
  }
  
  private Shape a(int paramInt1, int paramInt2)
  {
    ShapeCollection localShapeCollection = this.b.d.getShapes();
    int i1 = localShapeCollection.getCount();
    Shape localShape1 = localShapeCollection.a(paramInt1, 4095);
    localShape1.h = new zqu();
    if (this.j != null)
    {
      localShapeCollection.d(i1);
      Shape localShape2 = this.j.Q;
      if (!localShape2.z()) {
        localShape1.setName(localShape2.getName());
      }
      localShapeCollection.b(this.j.Q);
      localShapeCollection.a(this.j.b, localShape1);
      if ((localShape2.n instanceof GroupShape)) {
        ((GroupShape)localShape2.n).a(localShape1);
      }
      CopyOptions localCopyOptions = new CopyOptions(0);
      if (localShape2.x != null) {
        localShape1.getTextBody().a(localShape2.getTextBody(), localCopyOptions);
      }
      localShape1.k.i().a(localShape2.k.i());
      localShape1.setPrintable(localShape2.isPrintable());
      localShape1.setLocked(localShape2.isLocked());
      if (localShapeCollection.f() == localShape1.O()) {
        localShapeCollection.b(localShapeCollection.f() - 1);
      }
      localShape1.g(localShape2.O());
    }
    if ((this.k != null) && ((this.k instanceof zqn)))
    {
      localShape1.z = ((zqn)this.k);
      if (!localShape1.z.j) {
        localShape1.setLocked(false);
      }
    }
    return localShape1;
  }
  
  private String a(String paramString)
  {
    if (paramString != null)
    {
      zrl localzrl = zalb.a(this.e, paramString);
      if (localzrl != null) {
        return localzrl.d;
      }
    }
    return null;
  }
  
  private byte[] b(String paramString)
    throws Exception
  {
    byte[] arrayOfByte = null;
    String str = "xl" + paramString.substring(2);
    com.aspose.cells.a.f.zh localzh = this.c.a(str);
    if (localzh == null) {
      return null;
    }
    zm localzm = this.c.a(localzh);
    arrayOfByte = new byte[(int)localzh.a()];
    localzm.a(arrayOfByte, 0, (int)localzh.a());
    localzm.a();
    return arrayOfByte;
  }
  
  private void a(zqf paramzqf, String paramString)
    throws Exception
  {
    OleObject localOleObject = paramzqf.n;
    byte[] arrayOfByte1 = null;
    String str = null;
    Object localObject1;
    Object localObject2;
    if (paramString != null)
    {
      str = "xl" + paramString.substring(2);
      localObject1 = this.c.a(str);
      localObject2 = this.c.a((com.aspose.cells.a.f.zh)localObject1);
      arrayOfByte1 = new byte[(int)((com.aspose.cells.a.f.zh)localObject1).a()];
      ((zm)localObject2).a(arrayOfByte1, 0, (int)((com.aspose.cells.a.f.zh)localObject1).a());
      ((zm)localObject2).a();
      int i1 = this.a.a.getWorksheets().L().a(arrayOfByte1);
      localOleObject.a(i1);
    }
    if (paramzqf.c != null)
    {
      localObject1 = paramzqf.c;
      localObject1 = "xl" + ((String)localObject1).substring(2);
      localObject2 = this.c.a((String)localObject1);
      zm localzm = this.c.a((com.aspose.cells.a.f.zh)localObject2);
      byte[] arrayOfByte2 = new byte[(int)((com.aspose.cells.a.f.zh)localObject2).a()];
      localzm.a(arrayOfByte2, 0, (int)((com.aspose.cells.a.f.zh)localObject2).a());
      localzm.a();
      localOleObject.a(arrayOfByte2);
      if (!localOleObject.k()) {
        localOleObject.b(zk.b((String)localObject1));
      }
    }
    if (paramzqf.h != null)
    {
      localOleObject.c(paramzqf.h);
      localOleObject.setAutoUpdate(paramzqf.i);
    }
    else
    {
      localOleObject.setLink(paramzqf.l);
      if (paramzqf.m != null) {
        localOleObject.b(paramzqf.m);
      }
    }
    if (paramzqf.g != null) {
      localOleObject.setProgID(paramzqf.g);
    }
    localOleObject.setDisplayAsIcon(paramzqf.j);
    localOleObject.setAutoLoad(paramzqf.k);
    if (str != null) {
      zf.a(this.a.a.a.f, zk.b(str));
    }
  }
  
  private Shape c(zcjn paramzcjn)
    throws Exception
  {
    if ((this.j != null) && (this.j.e != null))
    {
      this.j.Q.h.b = this.l;
      this.j.Q.h.c = this.m;
      return null;
    }
    String str1 = null;
    if (this.k != null) {
      str1 = this.k.d;
    }
    Object localObject1;
    Object localObject2;
    if (str1 == null)
    {
      localObject1 = null;
      localObject2 = zauj.b(paramzcjn, "imagedata");
      if (localObject2 != null) {
        localObject1 = zauj.a((zcjs)localObject2, "relid");
      }
      str1 = a((String)localObject1);
    }
    if (str1 != null) {
      zf.a(this.a.a.a.f, zu.b(str1));
    }
    Object localObject3;
    if ((this.k instanceof zqf))
    {
      localObject1 = (zqf)this.k;
      localObject2 = ((zqf)localObject1).n;
      if ((localObject2 == null) || (!this.a.p))
      {
        if ((localObject2 == null) || (this.a.p)) {
          localObject2 = a(24, 4095);
        }
        ((Shape)localObject2).setHidden(false);
        localObject3 = (OleObject)localObject2;
        if (((zqf)localObject1).c != null)
        {
          String str2 = ((zqf)localObject1).c;
          str2 = "xl" + str2.substring(2);
          com.aspose.cells.a.f.zh localzh = this.c.a(str2);
          if (localzh == null) {
            return null;
          }
        }
        ((zqf)localObject1).n = ((OleObject)localObject3);
        zf.a(this.g, localObject1);
        zf.a(this.g, str1);
      }
      else
      {
        ((Shape)localObject2).setHidden(false);
      }
      return (Shape)localObject2;
    }
    int i1 = -1;
    int i2 = -1;
    if (this.l != null) {
      i1 = zauj.af(this.l);
    }
    if (this.m != null) {
      i2 = zauj.af(this.m);
    }
    if ((i1 == -1) && (i2 == -1)) {
      return null;
    }
    if (str1 != null)
    {
      localObject3 = a(8, 4095);
      if (this.j == null) {
        ((Shape)localObject3).h(0);
      }
      zf.a(this.g, localObject3);
      zf.a(this.g, str1);
      return (Shape)localObject3;
    }
    return null;
  }
  
  private void a(String paramString, Shape paramShape)
    throws Exception
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = -1;
    int i4 = 0;
    String[] arrayOfString1 = zw.d(paramString, ';');
    for (int i5 = 0; i5 < arrayOfString1.length; i5++)
    {
      String[] arrayOfString2 = zw.d(arrayOfString1[i5], ':');
      if (arrayOfString2.length == 2)
      {
        String str = arrayOfString2[0].trim();
        switch (F.a(str))
        {
        case 32: 
        case 33: 
          i1 = (int)zbxp.a(arrayOfString2[1], "px", this.f);
          break;
        case 34: 
        case 35: 
          i2 = (int)zbxp.a(arrayOfString2[1], "px", this.f);
          break;
        case 36: 
          i3 = (int)zbxp.a(arrayOfString2[1], "px", this.f);
          break;
        case 37: 
          i4 = (int)zbxp.a(arrayOfString2[1], "px", this.f);
          break;
        case 38: 
          try
          {
            paramShape.h.e = zauj.F(arrayOfString2[1]);
          }
          catch (Exception localException) {}
        case 39: 
          if (paramShape.getMsoDrawingType() == 25)
          {
            if (arrayOfString2[1].trim().equals("visible")) {
              ((CommentShape)paramShape).a().setVisible(true);
            }
          }
          else if (arrayOfString2[1].trim().equals("hidden")) {
            paramShape.setHidden(true);
          }
          break;
        case 40: 
          if (arrayOfString2[1].endsWith("f")) {
            arrayOfString2[1] = arrayOfString2[1].substring(0, 0 + (arrayOfString2[1].length() - 1));
          }
          paramShape.setRotationAngle(zauj.C(arrayOfString2[1]));
          break;
        case 41: 
          switch (F.a(arrayOfString2[1]))
          {
          case 35: 
            paramShape.ai().g(9);
            break;
          case 42: 
            paramShape.ai().g(0);
            break;
          }
          break;
        }
      }
    }
    if ((this.j == null) && (i3 != -1)) {
      paramShape.a(0, false, i1, i2, i3, i4);
    }
  }
  
  private void b(zcjn paramzcjn, Shape paramShape)
  {
    Iterator localIterator = paramzcjn.e().iterator();
    while (localIterator.hasNext())
    {
      zcjg localzcjg = (zcjg)localIterator.next();
      String str1 = localzcjg.g;
      String str2 = zauj.b(localzcjg.h);
      if (str1.equals("opacity"))
      {
        if (paramShape.isFilled())
        {
          double d1 = c(str2);
          if (d1 > -1.0D)
          {
            if (paramShape.getFill().getFillType() == 0) {
              paramShape.getFill().setFillType(2);
            }
            paramShape.getFill().a(d1);
          }
        }
      }
      else if (str1.equals("relid"))
      {
        String str3 = a(str2);
        if (str3 != null)
        {
          zf.a(this.g, paramShape.getFill());
          zf.a(this.g, str3);
        }
      }
    }
  }
  
  private static double c(String paramString)
  {
    try
    {
      if (paramString.endsWith("f"))
      {
        paramString = paramString.substring(0, 0 + (paramString.length() - 1));
        int i1 = zauj.F(paramString);
        double d2 = i1 / 65536.0D;
        return d2;
      }
      double d1 = zauj.C(paramString);
      return d1;
    }
    catch (Exception localException) {}
    return -1.0D;
  }
  
  private void c(zcjn paramzcjn, Shape paramShape)
    throws Exception
  {
    zcju localzcju = paramzcjn.l();
    for (int i1 = 0; i1 < localzcju.a(); i1++) {
      if ((localzcju.a(i1) instanceof zcjn))
      {
        zcjn localzcjn1 = (zcjn)localzcju.a(i1);
        String str = localzcjn1.g;
        if (str.equals("fill"))
        {
          b(localzcjn1, paramShape);
        }
        else if (str.equals("stroke"))
        {
          g(localzcjn1, paramShape);
        }
        else if (str.equals("imagedata"))
        {
          e(localzcjn1, paramShape);
        }
        else if (str.equals("ClientData"))
        {
          f(localzcjn1, paramShape);
        }
        else if (str.equals("textbox"))
        {
          zcjn localzcjn2 = zauj.b(paramzcjn, "ClientData");
          a(localzcjn1, localzcjn2, paramShape);
        }
        else if (str.equals("signatureline"))
        {
          d(localzcjn1, paramShape);
        }
        else if (str.equals("shadow"))
        {
          paramShape.B = zauj.b(paramzcjn.a("on"), true);
        }
      }
    }
  }
  
  private void d(zcjn paramzcjn, Shape paramShape)
  {
    if (paramShape.getMsoDrawingType() != 8) {
      return;
    }
    SignatureLine localSignatureLine = new SignatureLine();
    boolean bool = false;
    String str = null;
    Iterator localIterator = paramzcjn.e().iterator();
    while (localIterator.hasNext())
    {
      zcjg localzcjg = (zcjg)localIterator.next();
      switch (F.a(localzcjg.g))
      {
      case 43: 
        localSignatureLine.d = localzcjg.h;
        break;
      case 44: 
        localSignatureLine.setAllowComments(zauj.aB(localzcjg.h));
        break;
      case 45: 
        localSignatureLine.a = localzcjg.h;
        break;
      case 5: 
        localSignatureLine.b = zauj.aX(localzcjg.h);
        break;
      case 46: 
        localSignatureLine.setLine(zauj.aB(localzcjg.h));
        break;
      case 47: 
        localSignatureLine.a(zauj.aX(localzcjg.h));
        break;
      case 48: 
        bool = zauj.aB(localzcjg.h);
        break;
      case 49: 
        localSignatureLine.setShowSignedDate(zauj.aB(localzcjg.h));
        break;
      case 50: 
        localSignatureLine.setSigner(localzcjg.h);
        break;
      case 51: 
        localSignatureLine.setTitle(localzcjg.h);
        break;
      case 52: 
        localSignatureLine.setEmail(localzcjg.h);
        break;
      case 53: 
        str = localzcjg.h;
        break;
      case 54: 
        localSignatureLine.c = localzcjg.h;
      }
    }
    if (bool) {
      localSignatureLine.setInstructions(str);
    }
    ((Picture)paramShape).f = localSignatureLine;
  }
  
  private void e(zcjn paramzcjn, Shape paramShape)
  {
    Iterator localIterator = paramzcjn.e().iterator();
    while (localIterator.hasNext())
    {
      zcjg localzcjg = (zcjg)localIterator.next();
      String str1 = localzcjg.k();
      String str2 = zauj.b(localzcjg.h);
      if (str1.equals("cropleft")) {
        paramShape.getFormatPicture().setLeftCrop(zakt.b(str2));
      } else if (str1.equals("cropright")) {
        paramShape.getFormatPicture().setRightCrop(zakt.b(str2));
      } else if (str1.equals("croptop")) {
        paramShape.getFormatPicture().setTopCrop(zakt.b(str2));
      } else if (str1.equals("cropbottom")) {
        paramShape.getFormatPicture().setBottomCrop(zakt.b(str2));
      } else if (str1.equals("gain")) {
        paramShape.h.l = str2;
      } else if (str1.equals("blacklevel")) {
        paramShape.h.m = str2;
      }
    }
  }
  
  private void a(zcjn paramzcjn1, zcjn paramzcjn2, Shape paramShape)
    throws Exception
  {
    FontSettingCollection localFontSettingCollection = null;
    switch (paramShape.getMsoDrawingType())
    {
    case 2: 
    case 6: 
    case 7: 
    case 11: 
    case 12: 
    case 14: 
    case 19: 
    case 25: 
      localFontSettingCollection = paramShape.getTextBody();
      break;
    case 3: 
    case 4: 
    case 5: 
    case 8: 
    case 9: 
    case 10: 
    case 13: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
    default: 
      return;
    }
    if (!zw.b(paramShape.getText())) {
      return;
    }
    localFontSettingCollection.getTextAlignment().b(true);
    localFontSettingCollection.getTextAlignment().setTextVerticalOverflow(0);
    if (paramzcjn2 != null)
    {
      localzcjn = zauj.b(paramzcjn2, "TextVAlign");
      if (localzcjn != null)
      {
        localObject1 = zauj.b(zauz.a(localzcjn));
        localFontSettingCollection.getTextAlignment().g(zauj.ak((String)localObject1));
      }
      Object localObject1 = zauj.b(paramzcjn2, "TextHAlign");
      if (localObject1 != null)
      {
        localObject2 = zauj.b(zauz.a((zcjs)localObject1));
        localFontSettingCollection.getTextAlignment().f(zauj.ak((String)localObject2));
      }
    }
    zcjn localzcjn = zauj.b(paramzcjn1, "div");
    if ((localzcjn != null) && ((paramShape.getMsoDrawingType() != 25) || (localFontSettingCollection.getText() == null) || (localFontSettingCollection.getText().equals(""))))
    {
      int i1 = 0;
      localObject2 = new StringBuilder();
      a(localzcjn, localFontSettingCollection, (StringBuilder)localObject2, i1);
      if ((((StringBuilder)localObject2).length() > 0) && (((StringBuilder)localObject2).charAt(((StringBuilder)localObject2).length() - 1) == ' '))
      {
        localFontSettingCollection.c = ((StringBuilder)localObject2).substring(0, 0 + (((StringBuilder)localObject2).length() - 1));
        FontSetting localFontSetting = localFontSettingCollection.get(localFontSettingCollection.getCount() - 1);
        localFontSetting.p -= 1;
        if (localFontSetting.p == 0) {
          localFontSettingCollection.removeAt(localFontSettingCollection.getCount() - 1);
        }
      }
      else
      {
        localFontSettingCollection.c = zs.a(localObject2);
      }
    }
    String str = zauj.a(paramzcjn1, "inset");
    if (str != null)
    {
      localObject2 = zw.d(str, ',');
      if (localObject2.length == 4)
      {
        if (!"".equals(localObject2[0])) {
          paramShape.getTextBody().getTextAlignment().setLeftMarginPt(zbxp.a(localObject2[0], "pt", zbxp.a()));
        }
        if (!"".equals(localObject2[1])) {
          paramShape.getTextBody().getTextAlignment().setTopMarginPt(zbxp.a(localObject2[1], "pt", zbxp.a()));
        }
        if (!"".equals(localObject2[2])) {
          paramShape.getTextBody().getTextAlignment().setRightMarginPt(zbxp.a(localObject2[2], "pt", zbxp.a()));
        }
        if (!"".equals(localObject2[3])) {
          paramShape.getTextBody().getTextAlignment().setBottomMarginPt(zbxp.a(localObject2[3], "pt", zbxp.a()));
        }
        paramShape.getTextBody().getTextAlignment().e(false);
      }
    }
    Object localObject2 = zauj.a(paramzcjn1, "style");
    if (localObject2 != null)
    {
      if (((String)localObject2).indexOf("mso-fit-shape-to-text:t") != -1) {
        paramShape.getTextBody().getTextAlignment().setAutoSize(true);
      }
      int i2 = ((String)localObject2).indexOf("mso-direction-alt:");
      if (i2 >= 0)
      {
        i2 += "mso-direction-alt:".length();
        if (((String)localObject2).charAt(i2) == 'R') {
          paramShape.setTextDirection(2);
        } else if (((String)localObject2).charAt(i2) == 'L') {
          paramShape.setTextDirection(1);
        }
      }
    }
  }
  
  private int a(StringBuilder paramStringBuilder, String paramString)
  {
    String str = zw.c(paramString);
    int i1 = 0;
    if (str.length() < paramString.length()) {
      if (paramStringBuilder.length() > 0)
      {
        int i2 = paramStringBuilder.charAt(paramStringBuilder.length() - 1);
        if (i2 != 32)
        {
          paramStringBuilder.append(' ');
          i1++;
        }
      }
      else if ((paramStringBuilder.length() == 0) && (paramString.charAt(0) == ' '))
      {
        paramStringBuilder.append(' ');
        i1++;
      }
    }
    if (str.length() != 0)
    {
      paramString = str;
      str = zw.a(paramString);
      paramStringBuilder.append(str);
      i1 += str.length();
      if (str.length() < paramString.length())
      {
        paramStringBuilder.append(" ");
        i1++;
      }
    }
    return i1;
  }
  
  private int a(zcjn paramzcjn, FontSettingCollection paramFontSettingCollection, StringBuilder paramStringBuilder, int paramInt)
    throws Exception
  {
    String str = paramzcjn.a("style");
    for (zcjs localzcjs = paramzcjn.m(); localzcjs != null; localzcjs = localzcjs.n())
    {
      Object localObject;
      if (localzcjs.e == 3)
      {
        int i1 = a(paramStringBuilder, localzcjs.d());
        if (i1 != 0)
        {
          localObject = paramFontSettingCollection.b(paramInt, i1);
          paramInt += i1;
        }
      }
      else if ((localzcjs instanceof zcjn))
      {
        zcjn localzcjn = (zcjn)localzcjs;
        localObject = localzcjn.g;
        if (((String)localObject).equals("font"))
        {
          zrn localzrn = d(localzcjn);
          int i2 = a(paramStringBuilder, localzrn.b);
          if (i2 != 0)
          {
            FontSetting localFontSetting = paramFontSettingCollection.b(paramInt, i2);
            if (localzrn.a != null) {
              localzrn.a.a(localFontSetting.getFont());
            }
            paramInt += i2;
          }
        }
        else if (((String)localObject).equals("p"))
        {
          paramInt = a(localzcjn, paramFontSettingCollection, paramStringBuilder, paramInt);
        }
      }
    }
    return paramInt;
  }
  
  private zrn d(zcjn paramzcjn)
    throws Exception
  {
    zrn localzrn = new zrn();
    localzrn.a = new zpw();
    String str1 = zauj.a(paramzcjn, "face");
    if (str1 != null) {
      localzrn.a.d(str1);
    }
    String str2 = zauj.a(paramzcjn, "size");
    if (str2 != null) {
      localzrn.a.a((int)(zauj.C(str2) / 20.0D));
    }
    String str3 = zauj.a(paramzcjn, "color");
    if ((str3 != null) && (!"auto".equals(str3))) {
      try
      {
        int i1;
        zaml localzaml;
        if (str3.startsWith("#"))
        {
          i1 = zp.a(str3.substring(1), 515);
          localzaml = new zaml(false);
          localzaml.a(2, i1);
          localzrn.a.a(localzaml);
        }
        else
        {
          i1 = zauj.F(str3);
          localzaml = new zaml(false);
          localzaml.a(2, this.a.a.getWorksheets().o().e(i1).toArgb());
          localzrn.a.a(localzaml);
        }
      }
      catch (Exception localException) {}
    }
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, paramzcjn, localzrn);
    localzrn.b = zs.a(localStringBuilder);
    return localzrn;
  }
  
  private static void a(StringBuilder paramStringBuilder, zcjn paramzcjn, zrn paramzrn)
  {
    Iterator localIterator = paramzcjn.iterator();
    while (localIterator.hasNext())
    {
      zcjs localzcjs = (zcjs)localIterator.next();
      switch (localzcjs.e)
      {
      case 3: 
        String str = localzcjs.h;
        if (str != null)
        {
          char[] arrayOfChar = str.toCharArray();
          for (int i1 = 0; i1 < arrayOfChar.length; i1++)
          {
            int i2;
            switch (arrayOfChar[i1])
            {
            case ' ': 
            case ' ': 
              if (arrayOfChar[i1] == ' ') {
                paramStringBuilder.append(paramStringBuilder.length() == 0 ? arrayOfChar[i1] : ' ');
              } else if ((paramStringBuilder.length() > 0) && (paramStringBuilder.charAt(paramStringBuilder.length() - 1) != ' ')) {
                paramStringBuilder.append(' ');
              }
              i2 = 1;
              i1++;
            }
            while ((i1 < arrayOfChar.length) && (i2 != 0)) {
              switch (arrayOfChar[i1])
              {
              case '\n': 
              case '\r': 
              case ' ': 
              case ' ': 
                i1++;
                break;
              default: 
                paramStringBuilder.append(arrayOfChar[i1]);
                i2 = 0;
                continue;
                break label299;
                paramStringBuilder.append(arrayOfChar[i1]);
              }
            }
          }
        }
        break;
      case 1: 
        label299:
        switch (F.a(localzcjs.g))
        {
        case 55: 
          paramStringBuilder.append("\r\n");
          break;
        case 56: 
          paramzrn.a.b(true);
          a(paramStringBuilder, (zcjn)localzcjs, paramzrn);
          break;
        default: 
          a(paramStringBuilder, (zcjn)localzcjs, paramzrn);
        }
        break;
      }
    }
  }
  
  private void a(Shape paramShape, String paramString1, String paramString2)
  {
    switch (F.a(paramString1))
    {
    case 57: 
      this.E = zw.d(paramString2, ',');
      break;
    case 58: 
      if ((paramString2 == null) || ("".equals(paramString2))) {
        this.n = false;
      } else {
        this.n = (!zauj.aB(paramString2));
      }
      break;
    case 59: 
      if ((paramString2 == null) || ("".equals(paramString2))) {
        this.o = false;
      } else {
        this.o = (!zauj.aB(paramString2));
      }
      break;
    case 60: 
      if ("False".equals(paramString2)) {
        paramShape.setLocked(false);
      }
      break;
    case 61: 
      if ("False".equals(paramString2)) {
        paramShape.setPrintable(false);
      }
      break;
    case 62: 
      paramShape.setMacroName(paramString2);
      break;
    case 63: 
      paramShape.e(paramString2);
      break;
    case 64: 
      this.p = zauj.b(paramString2, true);
      break;
    case 65: 
    case 66: 
      paramShape.setInputRange(paramString2);
      break;
    case 67: 
    case 68: 
    case 69: 
    case 70: 
    case 71: 
      paramShape.setLinkedCell(paramString2);
      break;
    case 72: 
    case 73: 
    case 74: 
    case 75: 
      this.q = false;
      break;
    case 76: 
    case 77: 
      this.r = paramString2;
      break;
    case 78: 
    case 79: 
      this.s = paramString2;
      break;
    case 80: 
    case 81: 
      this.t = paramString2;
      break;
    case 82: 
    case 83: 
      this.u = paramString2;
      break;
    case 84: 
    case 85: 
      this.v = paramString2;
      break;
    case 86: 
    case 87: 
      this.x = true;
      break;
    case 88: 
    case 89: 
      this.y = paramString2;
      break;
    case 90: 
    case 91: 
      this.z = paramString2;
      break;
    case 92: 
    case 93: 
      this.D = paramString2;
      break;
    case 94: 
    case 95: 
      this.A = paramString2;
      break;
    case 96: 
      if (this.B == null) {
        this.B = new ArrayList();
      }
      zf.a(this.B, paramString2);
      break;
    case 97: 
    case 98: 
      if (!zw.b(paramString2)) {
        this.C = paramString2;
      }
      break;
    case 99: 
    case 100: 
      this.w = paramString2;
      break;
    }
  }
  
  private void a(Shape paramShape)
    throws Exception
  {
    if ((paramShape.z != null) && (paramShape.z.a()) && (paramShape.z.k != null))
    {
      zcjy localzcjy = zauy.a(new com.aspose.cells.b.a.d.zh(paramShape.z.k));
      localzcjy.k();
      if (("formControlPr".equals(localzcjy.q())) && (localzcjy.n()))
      {
        while (localzcjy.m()) {
          a(paramShape, localzcjy.q(), localzcjy.t());
        }
        localzcjy.l();
      }
      if (localzcjy.o()) {
        return;
      }
      localzcjy.d();
      if (localzcjy.o()) {
        return;
      }
      if ("itemLst".equals(localzcjy.q()))
      {
        localzcjy.d();
        while (zauz.a(localzcjy))
        {
          if ("item".equals(localzcjy.q()))
          {
            String str = localzcjy.a("val");
            if (str != null)
            {
              if (this.B == null) {
                this.B = new ArrayList();
              }
              zf.a(this.B, str);
            }
          }
          localzcjy.a();
        }
      }
    }
  }
  
  private void f(zcjn paramzcjn, Shape paramShape)
    throws Exception
  {
    this.n = true;
    this.o = true;
    this.p = false;
    this.q = true;
    this.r = null;
    this.s = null;
    this.t = null;
    this.u = null;
    this.v = null;
    this.x = false;
    this.y = null;
    this.z = null;
    this.A = null;
    this.B = null;
    this.C = null;
    this.D = null;
    this.E = null;
    zcju localzcju = paramzcjn.l();
    Object localObject2;
    for (int i1 = 0; i1 < localzcju.a(); i1++) {
      if ((localzcju.a(i1) instanceof zcjn))
      {
        zcjn localzcjn = (zcjn)localzcju.a(i1);
        String str = localzcjn.g;
        localObject2 = zauz.a(localzcjn).trim();
        a(paramShape, str, (String)localObject2);
      }
    }
    a(paramShape);
    paramShape.B = this.q;
    Object localObject1;
    int i3;
    switch (paramShape.getMsoDrawingType())
    {
    case 24: 
      ((OleObject)paramShape).setAutoSize(this.p);
      break;
    case 19: 
      break;
    case 12: 
      localObject1 = (RadioButton)paramShape;
      switch (F.a(this.r))
      {
      case 76: 
        ((RadioButton)localObject1).a(true);
        break;
      case 113: 
        break;
      case 114: 
        ((RadioButton)localObject1).a(false);
        break;
      default: 
        ((RadioButton)localObject1).a(zauj.b(this.r, false));
      }
      break;
    case 11: 
      localObject1 = (CheckBox)paramShape;
      if (this.r != null)
      {
        i3 = 0;
        switch (F.a(this.r))
        {
        case 76: 
        case 115: 
          i3 = 1;
          break;
        case 113: 
        case 116: 
          i3 = 2;
          break;
        }
        ((CheckBox)localObject1).a(i3);
      }
      break;
    case 17: 
      localObject1 = (ScrollBar)paramShape;
      if (this.u != null) {
        ((ScrollBar)localObject1).setIncrementalChange(zauj.F(this.u));
      }
      if (this.v != null) {
        ((ScrollBar)localObject1).setPageChange(zauj.F(this.v));
      }
      ((ScrollBar)localObject1).setHorizontal(this.x);
      if (this.t != null) {
        ((ScrollBar)localObject1).setMax(zauj.F(this.t));
      }
      if (this.s != null) {
        ((ScrollBar)localObject1).setMin(zauj.F(this.s));
      }
      if (this.y != null) {
        ((ScrollBar)localObject1).setCurrentValue(zauj.F(this.y));
      }
      if (this.w != null) {
        ((ScrollBar)localObject1).f = zauj.F(this.w);
      }
      break;
    case 16: 
      localObject1 = (Spinner)paramShape;
      if (this.y != null) {
        ((Spinner)localObject1).a(zauj.F(this.y));
      }
      if (this.s != null) {
        ((Spinner)localObject1).setMin(zauj.F(this.s));
      }
      if (this.t != null) {
        ((Spinner)localObject1).setMax(zauj.F(this.t));
      }
      if (this.u != null) {
        ((Spinner)localObject1).setIncrementalChange(zauj.F(this.u));
      }
      if (this.v != null) {
        ((Spinner)localObject1).b(zauj.F(this.v));
      }
      if (this.w != null) {
        ((Spinner)localObject1).f = zauj.F(this.w);
      }
      break;
    case 20: 
      localObject1 = (ComboBox)paramShape;
      if (this.z != null)
      {
        i3 = zauj.F(this.z);
        if (i3 > 0) {
          ((ComboBox)localObject1).a(i3 - 1);
        }
      }
      if (this.A != null) {
        ((ComboBox)localObject1).setDropDownLines(zauj.F(this.A));
      }
      if (this.B != null)
      {
        i3 = this.B.size();
        if (i3 > 0)
        {
          ((ComboBox)localObject1).a = new String[i3];
          for (int i4 = 0; i4 < i3; i4++)
          {
            localObject2 = (String)this.B.get(i4);
            ((ComboBox)localObject1).a[i4] = localObject2;
          }
        }
      }
      break;
    case 18: 
      localObject1 = (ListBox)paramShape;
      i3 = -1;
      if (this.y != null) {
        ((ListBox)localObject1).b(zauj.F(this.y));
      }
      if (this.s != null) {
        ((ListBox)localObject1).c(zauj.F(this.s));
      }
      if (this.t != null) {
        ((ListBox)localObject1).d(zauj.F(this.t));
      }
      if (this.u != null) {
        ((ListBox)localObject1).e(zauj.F(this.u));
      }
      if (this.v != null) {
        ((ListBox)localObject1).setPageChange(zauj.F(this.v));
      }
      if (this.z != null) {
        i3 = zauj.F(this.z);
      }
      if (this.D != null) {
        ((ListBox)localObject1).setSelectionType(zauj.az(this.D));
      }
      if (this.w != null) {
        ((ListBox)localObject1).a = zauj.F(this.w);
      }
      if (((ListBox)localObject1).w != null)
      {
        String[] arrayOfString;
        int i5;
        switch (((ListBox)localObject1).getSelectionType())
        {
        case 0: 
          if (i3 > 0) {
            ((ListBox)localObject1).setSelectedIndex(i3 - 1);
          }
          break;
        case 1: 
          if (this.C != null)
          {
            arrayOfString = zw.d(this.C, ',');
            localObject2 = new ArrayList(arrayOfString.length);
            for (i5 = 0; i5 < arrayOfString.length; i5++) {
              zf.a((ArrayList)localObject2, Integer.valueOf((zp.a(arrayOfString[i5].trim(), com.aspose.cells.b.a.c.za.b()) & 0xFFFF) - 1));
            }
            ((ListBox)localObject1).a((ArrayList)localObject2);
          }
          break;
        case 2: 
          if (i3 > 0) {
            ((ListBox)localObject1).setSelectedIndex(i3 - 1);
          }
          if (this.C != null)
          {
            arrayOfString = zw.d(this.C, ',');
            localObject2 = new ArrayList(arrayOfString.length);
            for (i5 = 0; i5 < arrayOfString.length; i5++) {
              zf.a((ArrayList)localObject2, Integer.valueOf((zp.a(arrayOfString[i5].trim(), com.aspose.cells.b.a.c.za.b()) & 0xFFFF) - 1));
            }
            ((ListBox)localObject1).a((ArrayList)localObject2);
          }
          break;
        }
      }
      break;
    }
    int i2 = 2;
    if (this.n)
    {
      if (this.o) {
        i2 = 2;
      } else {
        i2 = 1;
      }
    }
    else if (this.o) {
      i2 = 2;
    } else {
      i2 = 0;
    }
    if ((paramShape.getMsoDrawingType() == 25) || (this.j != null))
    {
      paramShape.setPlacement(i2);
      return;
    }
    if (this.E == null) {
      return;
    }
    paramShape.a(i2, zauj.F(this.E[2]), zauj.F(this.E[3]), zauj.F(this.E[0]), zauj.F(this.E[1]), zauj.F(this.E[6]), zauj.F(this.E[7]), zauj.F(this.E[4]), zauj.F(this.E[5]));
  }
  
  private void g(zcjn paramzcjn, Shape paramShape)
  {
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    Object localObject = paramzcjn.e().iterator();
    while (((Iterator)localObject).hasNext())
    {
      zcjg localzcjg = (zcjg)((Iterator)localObject).next();
      switch (F.a(localzcjg.g))
      {
      case 117: 
        str1 = localzcjg.h;
        break;
      case 118: 
        str2 = localzcjg.h;
        break;
      case 119: 
        str3 = localzcjg.h;
        break;
      case 120: 
        str4 = localzcjg.h;
      }
    }
    localObject = paramShape.B().getLine();
    if (!((LineFormat)localObject).g()) {
      return;
    }
    if (str2 != null) {
      ((LineFormat)localObject).setCompoundType(zauj.p(str2));
    }
    if (str1 != null) {
      if (str1.indexOf(' ') == -1) {
        ((LineFormat)localObject).setDashStyle(zauj.q(str1));
      } else if ("1 1".equals(str1)) {
        ((LineFormat)localObject).setDashStyle(7);
      } else if ("0 2".equals(str1)) {
        ((LineFormat)localObject).setDashStyle(5);
      }
    }
    if (str3 != null) {
      ((LineFormat)localObject).setEndArrowheadStyle(zaui.e(str3));
    }
    if (str4 != null) {
      ((LineFormat)localObject).setBeginArrowheadStyle(zaui.e(str4));
    }
  }
  
  private Color a(String paramString, WorksheetCollection paramWorksheetCollection)
  {
    Color localColor = Color.getEmpty();
    try
    {
      int i1 = paramString.indexOf('[');
      int i2 = paramString.indexOf(']');
      if ((i1 != -1) && (i2 != -1) && (paramWorksheetCollection != null))
      {
        int i3 = zauj.F(paramString.substring(i1 + 1, i1 + 1 + (i2 - i1 - 1)));
        localColor = paramWorksheetCollection.o().e(i3);
      }
      else if (paramString.charAt(0) == '#')
      {
        if (paramString.length() == 4) {
          paramString = "#" + paramString.charAt(1) + paramString.charAt(1) + paramString.charAt(2) + paramString.charAt(2) + paramString.charAt(3) + paramString.charAt(3);
        }
        localColor = zauj.s(paramString.substring(1));
      }
      else
      {
        switch (F.a(paramString.toLowerCase()))
        {
        case 121: 
          return Color.getBlack();
        case 122: 
          return Color.getSilver();
        case 123: 
          return Color.getGray();
        case 124: 
          return Color.getWhite();
        case 125: 
          return Color.getMaroon();
        case 126: 
          return Color.getRed();
        case 127: 
          return Color.getPurple();
        case 128: 
          return Color.getFuchsia();
        case 129: 
          return Color.getGreen();
        case 130: 
          return Color.getLime();
        case 131: 
          return Color.getOlive();
        case 132: 
          return Color.getYellow();
        case 133: 
          return Color.getNavy();
        case 134: 
          return Color.getBlue();
        case 135: 
          return Color.getTeal();
        case 136: 
          return Color.getAqua();
        }
        return Color.getEmpty();
      }
    }
    catch (Exception localException) {}
    return localColor;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zalo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */