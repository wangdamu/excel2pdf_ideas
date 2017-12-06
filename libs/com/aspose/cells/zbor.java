package com.aspose.cells;

import com.aspose.cells.a.d.zb;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zg;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zn;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zo;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class zbor
{
  static zq a(Shape paramShape)
    throws Exception
  {
    if (paramShape.getMsoDrawingType() == 5)
    {
      localObject = ((ChartShape)paramShape).a();
      return new zq(((Chart)localObject).getChartObject().getLeft(), ((Chart)localObject).getChartObject().getTop(), ((Chart)localObject).getChartObject().getWidth(), ((Chart)localObject).getChartObject().getHeight());
    }
    Object localObject = new zbni(c(paramShape.getMsoDrawingType()));
    a(paramShape, (zbni)localObject, false);
    ((zbni)localObject).Z();
    return ((zbni)localObject).X();
  }
  
  static void a(zm paramzm, ImageOrPrintOptions paramImageOrPrintOptions, Shape paramShape)
    throws Exception
  {
    if (paramShape.getMsoDrawingType() == 5)
    {
      localObject = ((ChartShape)paramShape).a();
      ((Chart)localObject).a(paramzm, paramImageOrPrintOptions);
      return;
    }
    if ((paramShape.o != null) && (!"".equals(paramShape.o)))
    {
      localObject = zalq.a(paramShape);
      if (localObject != null) {
        paramShape = (Shape)localObject;
      }
    }
    Object localObject = new zbni(c(paramShape.getMsoDrawingType()));
    a(paramShape, (zbni)localObject, paramImageOrPrintOptions.f);
    if (!((zbni)localObject).f)
    {
      ((zbni)localObject).e(0.0F);
      ((zbni)localObject).f(0.0F);
    }
    if (!((zbni)localObject).ac()) {
      return;
    }
    ImageFormat localImageFormat = paramImageOrPrintOptions.getImageFormat();
    zr localzr = a(paramShape, (zbni)localObject, paramzm, localImageFormat, paramImageOrPrintOptions);
    if (localzr != null) {
      localzr.l();
    }
  }
  
  static zb b(Shape paramShape)
    throws Exception
  {
    if (paramShape.getMsoDrawingType() == 5)
    {
      localObject = ((ChartShape)paramShape).a();
      return ((Chart)localObject).F();
    }
    if ((paramShape.o != null) && (!"".equals(paramShape.o)))
    {
      localObject = zalq.a(paramShape);
      if (localObject != null) {
        paramShape = (Shape)localObject;
      }
    }
    Object localObject = new zbni(c(paramShape.getMsoDrawingType()));
    a(paramShape, (zbni)localObject, false);
    if (!((zbni)localObject).f)
    {
      ((zbni)localObject).e(0.0F);
      ((zbni)localObject).f(0.0F);
    }
    if (!((zbni)localObject).ac()) {
      return new zb();
    }
    zt localzt = ((zbni)localObject).W().e();
    int i = zaed.b;
    zav localzav = (zav)zaed.a(i, (int)Math.ceil(localzt.b()), (int)Math.ceil(localzt.c()), ImageFormat.getBmp(), null, null, (zbic)localObject, new zis());
    return localzav.n();
  }
  
  private static zr a(Shape paramShape, zbni paramzbni, zm paramzm, ImageFormat paramImageFormat, ImageOrPrintOptions paramImageOrPrintOptions)
  {
    int i = zaed.b;
    zt localzt = paramzbni.W().e();
    zr localzr = zaed.a(i, (int)Math.ceil(localzt.b()), (int)Math.ceil(localzt.c()), paramImageFormat, paramImageOrPrintOptions, paramzm, paramzbni, new zis());
    return localzr;
  }
  
  private static float[] c(Shape paramShape)
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    Object localObject1 = paramShape;
    Object localObject2;
    while ((((Shape)localObject1).W()) || (((Shape)localObject1).T()))
    {
      if ((((Shape)localObject1).T()) && (((Shape)localObject1).isGroup()) && ((((Shape)localObject1).J() instanceof ShapeCollection))) {
        localObject2 = ((Chart)((ShapeCollection)((Shape)localObject1).J()).i()).getChartObject();
      } else {
        localObject2 = (Shape)((Shape)localObject1).J();
      }
      if (((Shape)localObject2).I())
      {
        f1 += ((Shape)localObject1).getLeftInShape() * ((Shape)localObject2).getHeight() / 4000.0F;
        f2 += ((Shape)localObject1).getTopInShape() * ((Shape)localObject2).getWidth() / 4000.0F;
      }
      else
      {
        f1 += ((Shape)localObject1).getLeftInShape() * ((Shape)localObject2).getWidth() / 4000.0F;
        f2 += ((Shape)localObject1).getTopInShape() * ((Shape)localObject2).getHeight() / 4000.0F;
      }
      localObject1 = localObject2;
      if ((localObject1 instanceof ChartShape)) {
        break;
      }
    }
    if ((f2 < 0.0F) && (paramShape.W()) && (paramShape.getType() == 32))
    {
      localObject2 = (Shape)paramShape.J();
      float f3 = paramShape.R().i().m() * ((Shape)localObject2).getHeight() / 4000.0F;
      f2 += (f3 - paramShape.getHeight()) / 2.0F;
    }
    return new float[] { f1, f2 };
  }
  
  private static void a(Shape paramShape, zbni paramzbni)
  {
    int i = 0;
    if (!paramShape.W())
    {
      if ((paramShape.getType() == 20) || (paramShape.getType() == 32) || (paramShape.getType() == 2061) || (paramShape.getType() == 2) || (paramShape.getType() == 87) || (paramShape.getType() == 13) || (paramShape.getType() == 67) || (paramShape.getType() == 66) || (paramShape.getType() == 68)) {
        i = 1;
      }
      if ((paramShape.T()) && (paramShape.getType() == 1)) {
        i = 1;
      }
    }
    if (i != 0)
    {
      int j = paramShape.getWidth();
      int k = paramShape.getHeight();
      int m = Math.abs(j - k);
      if (j > k)
      {
        if (paramShape.I())
        {
          paramzbni.e(paramzbni.u() + m / 2);
          paramzbni.f(paramzbni.v() - m / 2);
        }
      }
      else if (paramShape.I())
      {
        paramzbni.e(paramzbni.u() - m / 2);
        paramzbni.f(paramzbni.v() + m / 2);
      }
    }
  }
  
  static void a(Shape paramShape, zbni paramzbni, boolean paramBoolean)
    throws Exception
  {
    ShapeTextAlignment localShapeTextAlignment = paramShape.getTextBody().getTextAlignment();
    zaqd localzaqd = new zaqd();
    paramzbni.k = paramShape;
    if ((localShapeTextAlignment.l()) && (paramShape.C()))
    {
      float f = zbya.a(paramShape.getFont().getSize());
      if ((paramShape.getTextBody().m() == 7) || (paramShape.getTextBody().m() == 9))
      {
        localzaqd.a(f);
        localzaqd.c(f);
      }
      else if (paramShape.getTextBody().m() == 9)
      {
        localzaqd.a(f);
        localzaqd.c(f);
        localzaqd.b(f);
      }
      else if (paramShape.getTextBody().m() == 8)
      {
        localzaqd.c(f);
      }
    }
    else
    {
      localzaqd.a((int)(localShapeTextAlignment.getLeftMarginPt() * zbxp.a() / 72.0D));
      localzaqd.b((int)(localShapeTextAlignment.getTopMarginPt() * zbxp.a() / 72.0D));
      localzaqd.c((int)(localShapeTextAlignment.getRightMarginPt() * zbxp.a() / 72.0D));
      localzaqd.d((int)(localShapeTextAlignment.getBottomMarginPt() * zbxp.a() / 72.0D));
    }
    paramzbni.a(localzaqd);
    if (paramzbni.q() == -1) {
      return;
    }
    if (paramShape.isHidden()) {
      return;
    }
    int[] arrayOfInt = paramShape.b(paramShape.getRotationAngle());
    if (!d(paramShape)) {
      return;
    }
    if (!paramShape.W())
    {
      paramzbni.e(paramShape.getLeft());
      paramzbni.f(paramShape.getTop());
    }
    else
    {
      localObject1 = c(paramShape);
      paramzbni.e(localObject1[0]);
      paramzbni.f(localObject1[1]);
    }
    a(paramShape, paramzbni);
    if (!paramShape.W())
    {
      paramzbni.c(arrayOfInt[2]);
      paramzbni.d(arrayOfInt[3]);
    }
    else
    {
      paramzbni.c(paramShape.getWidth());
      paramzbni.d(paramShape.getHeight());
    }
    paramzbni.i = paramShape.T();
    paramzbni.e(paramShape.getAutoShapeType());
    paramzbni.a(paramShape.P().p());
    paramzbni.a(paramShape.Q());
    paramzbni.a(paramShape.aq());
    Object localObject1 = paramShape.b(2, false);
    Object localObject2;
    Object localObject6;
    Object localObject8;
    Object localObject4;
    Object localObject5;
    Object localObject3;
    Object localObject7;
    Object localObject9;
    Object localObject10;
    Object localObject11;
    switch (paramShape.getMsoDrawingType())
    {
    case 0: 
      localObject2 = (GroupShape)paramShape;
      ArrayList localArrayList = new ArrayList();
      for (localObject6 : ((GroupShape)localObject2).getGroupedShapes()) {
        if (localArrayList.size() == 0)
        {
          zf.a(localArrayList, localObject6);
        }
        else
        {
          int n = 0;
          for (int i2 = 0; i2 < localArrayList.size(); i2++)
          {
            localObject8 = (Shape)localArrayList.get(i2);
            if (((Shape)localObject8).getZOrderPosition() > ((Shape)localObject6).getZOrderPosition())
            {
              localArrayList.add(i2, localObject6);
              n = 1;
              break;
            }
          }
          if (n == 0) {
            zf.a(localArrayList, localObject6);
          }
        }
      }
      g(paramShape, paramzbni);
      for (int j = 0; j < localArrayList.size(); j++)
      {
        localObject4 = (Shape)localArrayList.get(j);
        ((Shape)localObject4).v = paramShape.v;
        localObject5 = new zbni(c(((Shape)localObject4).getMsoDrawingType()));
        ((zbni)localObject5).e = paramzbni;
        ((zbni)localObject5).f = true;
        if (((Shape)localObject4).getMsoDrawingType() == 5)
        {
          ((zbni)localObject5).g = true;
          ((zbni)localObject5).j = ((ChartShape)localArrayList.get(j)).a();
        }
        a((Shape)localObject4, (zbni)localObject5, false);
        zf.a(paramzbni.d, localObject5);
      }
      break;
    case 6: 
      localObject3 = (TextBox)paramShape;
      a(((TextBox)localObject3).getTextBody(), (Shape)localObject3, paramzbni);
      g(paramShape, paramzbni);
      break;
    case 1: 
      localObject4 = (LineShape)paramShape;
      b((LineFormat)localObject1, paramzbni);
      f(paramShape, paramzbni);
      g(paramShape, paramzbni);
      break;
    case 2: 
      localObject5 = (RectangleShape)paramShape;
      a(((RectangleShape)localObject5).getTextBody(), (Shape)localObject5, paramzbni);
      g(paramShape, paramzbni);
      break;
    case 3: 
      localObject6 = (Oval)paramShape;
      a(((Oval)localObject6).getTextBody(), (Shape)localObject6, paramzbni);
      g(paramShape, paramzbni);
      break;
    case 19: 
      GroupBox localGroupBox = (GroupBox)paramShape;
      a(localGroupBox.getTextBody(), localGroupBox, paramzbni);
      break;
    case 7: 
      localObject7 = (Button)paramShape;
      a(((Button)localObject7).getTextBody(), (Shape)localObject7, paramzbni);
      break;
    case 11: 
      localObject8 = (CheckBox)paramShape;
      a(((CheckBox)localObject8).getTextBody(), (Shape)localObject8, paramzbni);
      paramzbni.k(o(((CheckBox)localObject8).getCheckedValue()));
      break;
    case 12: 
      RadioButton localRadioButton = (RadioButton)paramShape;
      a(localRadioButton.getTextBody(), localRadioButton, paramzbni);
      if (localRadioButton.isChecked()) {
        paramzbni.k(1);
      } else {
        paramzbni.k(0);
      }
      break;
    case 18: 
      ListBox localListBox = (ListBox)paramShape;
      if ((localListBox.getInputRange() != null) && (!"".equals(localListBox.getInputRange())))
      {
        localObject9 = localListBox.ag();
        if (localObject9 != null) {
          for (int i3 = ((Range)localObject9).a().StartRow; i3 <= ((Range)localObject9).a().EndRow; i3++)
          {
            Cell localCell = ((Range)localObject9).b.checkCell(i3, ((Range)localObject9).a().StartColumn);
            if (localCell == null) {
              paramzbni.N().add("");
            } else {
              paramzbni.N().add(localCell.k());
            }
          }
        }
        if (localListBox.a() != null) {
          paramzbni.a(localListBox.a());
        }
      }
      break;
    case 20: 
      localObject9 = (ComboBox)paramShape;
      if ((((ComboBox)localObject9).getInputRange() != null) && (!"".equals(((ComboBox)localObject9).getInputRange())))
      {
        localObject10 = ((ComboBox)localObject9).ag();
        if (localObject10 != null) {
          for (int i4 = ((Range)localObject10).a().StartRow; i4 <= ((Range)localObject10).a().EndRow; i4++)
          {
            localObject11 = ((Range)localObject10).b.checkCell(i4, ((Range)localObject10).a().StartColumn);
            if (localObject11 == null) {
              paramzbni.N().add("");
            } else {
              paramzbni.N().add(((Cell)localObject11).k());
            }
          }
        }
        if (((ComboBox)localObject9).getSelectedValue() != null) {
          paramzbni.b(((ComboBox)localObject9).getSelectedValue());
        }
      }
      break;
    case 14: 
      localObject10 = (Label)paramShape;
      a(((Label)localObject10).getTextBody(), (Shape)localObject10, paramzbni);
      break;
    case 25: 
      CommentShape localCommentShape = (CommentShape)paramShape;
      a(localCommentShape, paramzbni);
      a(localCommentShape.a().b(), localCommentShape, paramzbni);
      break;
    case 8: 
    case 24: 
      g(paramShape, paramzbni);
      break;
    case 30: 
      f(paramShape, paramzbni);
      b((LineFormat)localObject1, paramzbni);
      d(paramShape, paramzbni);
      a(paramShape.getTextBody(), paramShape, paramzbni);
      g(paramShape, paramzbni);
      c(paramShape, paramzbni);
      h(paramShape, paramzbni);
      i(paramShape, paramzbni);
      break;
    case 4: 
      f(paramShape, paramzbni);
      b((LineFormat)localObject1, paramzbni);
      a(paramShape.getTextBody(), paramShape, paramzbni);
      d(paramShape, paramzbni);
      g(paramShape, paramzbni);
      break;
    case 29: 
      f(paramShape, paramzbni);
      a(paramShape.getTextBody(), paramShape, paramzbni);
      d(paramShape, paramzbni);
      g(paramShape, paramzbni);
      break;
    case 17: 
      localObject11 = (ScrollBar)paramShape;
      paramzbni.l(((ScrollBar)localObject11).getCurrentValue());
      paramzbni.m(((ScrollBar)localObject11).getMin());
      paramzbni.n(((ScrollBar)localObject11).getMax());
      break;
    case 16: 
      Spinner localSpinner = (Spinner)paramShape;
      paramzbni.l(localSpinner.getCurrentValue());
      paramzbni.m(localSpinner.getMin());
      paramzbni.n(localSpinner.getMax());
      break;
    case 31: 
      zbpw localzbpw = (zbpw)paramShape;
      a(localzbpw.getTextBody(), localzbpw, paramzbni);
      g(paramShape, paramzbni);
    }
    e(paramShape, paramzbni);
    a((LineFormat)localObject1, paramzbni);
    b(paramShape, paramzbni);
    paramzbni.j(paramShape.u);
    paramShape.u = false;
    paramzbni.k(paramShape.v);
    paramShape.v = false;
    if ((paramShape.getActiveXControl() != null) && (paramBoolean))
    {
      paramzbni.b = true;
      switch (paramShape.getActiveXControl().getType())
      {
      case 1: 
        if ((paramShape.getInputRange() != null) && (!"".equals(paramShape.getInputRange())))
        {
          localObject2 = paramShape.ag();
          if (localObject2 != null) {
            for (int i = ((Range)localObject2).a().StartRow; i <= ((Range)localObject2).a().EndRow; i++)
            {
              localObject3 = ((Range)localObject2).b.checkCell(i, ((Range)localObject2).a().StartColumn);
              if (localObject3 == null) {
                paramzbni.N().add("");
              } else {
                paramzbni.N().add(((Cell)localObject3).k());
              }
            }
          }
        }
        localObject2 = (ComboBoxActiveXControl)paramShape.getActiveXControl();
        if (((ComboBoxActiveXControl)localObject2).getValue() != null) {
          paramzbni.b(((ComboBoxActiveXControl)localObject2).getValue());
        }
        break;
      case 2: 
        CheckBoxActiveXControl localCheckBoxActiveXControl = (CheckBoxActiveXControl)paramShape.getActiveXControl();
        paramzbni.a(localCheckBoxActiveXControl.getCaption());
        localObject3 = ColorHelper.fromOleColor(localCheckBoxActiveXControl.getBackOleColor());
        if (!((Color)localObject3).isEmpty())
        {
          paramzbni.z().a(false);
          paramzbni.z().a((Color)localObject3);
          paramzbni.z().a(null);
        }
        if (localCheckBoxActiveXControl.getFont() != null)
        {
          paramzbni.a(zbxz.a("", localCheckBoxActiveXControl.getFont()));
          paramzbni.a(Color.a(255, localCheckBoxActiveXControl.getFont().getColor()));
          a(localCheckBoxActiveXControl.getFont(), paramzbni.D());
        }
        paramzbni.k(o(localCheckBoxActiveXControl.getValue()));
        break;
      case 3: 
        localObject4 = (ListBoxActiveXControl)paramShape.getActiveXControl();
        localObject5 = new ArrayList();
        if ((paramShape.getInputRange() != null) && (!"".equals(paramShape.getInputRange())))
        {
          localObject6 = paramShape.ag();
          if (localObject6 != null) {
            for (int i1 = ((Range)localObject6).a().StartRow; i1 <= ((Range)localObject6).a().EndRow; i1++)
            {
              localObject7 = ((Range)localObject6).b.checkCell(i1, ((Range)localObject6).a().StartColumn);
              if (localObject7 == null)
              {
                paramzbni.N().add("");
              }
              else
              {
                paramzbni.N().add(((Cell)localObject7).k());
                if ((((ListBoxActiveXControl)localObject4).getValue() != null) && (zw.b(((Cell)localObject7).k(), ((ListBoxActiveXControl)localObject4).getValue()))) {
                  zf.a((ArrayList)localObject5, Integer.valueOf(paramzbni.N().size() - 1));
                }
              }
            }
          }
          paramzbni.a((List)localObject5);
        }
        break;
      case 6: 
        localObject6 = (RadioButtonActiveXControl)paramShape.getActiveXControl();
        paramzbni.a(((RadioButtonActiveXControl)localObject6).getCaption());
        Color localColor = ColorHelper.fromOleColor(((RadioButtonActiveXControl)localObject6).getBackOleColor());
        if (!localColor.isEmpty())
        {
          paramzbni.z().a(false);
          paramzbni.z().a(localColor);
          paramzbni.z().a(null);
        }
        if (((RadioButtonActiveXControl)localObject6).getFont() != null)
        {
          paramzbni.a(zbxz.a("", ((RadioButtonActiveXControl)localObject6).getFont()));
          paramzbni.a(Color.a(255, ((RadioButtonActiveXControl)localObject6).getFont().getColor()));
          a(((RadioButtonActiveXControl)localObject6).getFont(), paramzbni.D());
        }
        if (((RadioButtonActiveXControl)localObject6).getValue() == 1) {
          paramzbni.k(1);
        } else {
          paramzbni.k(0);
        }
        break;
      }
    }
  }
  
  private static void b(Shape paramShape, zbni paramzbni)
  {
    paramzbni.d(paramShape.R().j().f());
    paramzbni.c(paramShape.R().j().e());
  }
  
  private static ArrayList a(Shape paramShape, ShapePathPointCollection paramShapePathPointCollection, ShapeGuideCollection paramShapeGuideCollection, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramShapePathPointCollection.getCount();
    for (int j = 0; j < i; j++)
    {
      ShapePathPoint localShapePathPoint = paramShapePathPointCollection.get(j);
      int k = 0;
      if ((localShapePathPoint.a instanceof Integer)) {
        k = localShapePathPoint.getX();
      } else {
        k = paramShapeGuideCollection.a(localShapePathPoint.a);
      }
      int m = 0;
      if ((localShapePathPoint.b instanceof Integer)) {
        m = localShapePathPoint.getY();
      } else {
        m = paramShapeGuideCollection.a(localShapePathPoint.b);
      }
      if ((i == 3) && (j == 2) && (paramInt == 5))
      {
        k /= 60000;
        m /= 60000;
      }
      zn localzn = new zn(k, m);
      zf.a(localArrayList, localzn);
    }
    return localArrayList;
  }
  
  private static void c(Shape paramShape, zbni paramzbni)
  {
    if (!paramShape.ao()) {
      return;
    }
    ShapePathCollection localShapePathCollection = ((CustomGeometry)paramShape.getGeometry()).getPaths();
    zadf localzadf = new zadf();
    ShapeSegmentPathCollection localShapeSegmentPathCollection = null;
    ShapeGuideCollection localShapeGuideCollection = ((CustomGeometry)paramShape.getGeometry()).e();
    ((CustomGeometry)paramShape.getGeometry()).f();
    ArrayList localArrayList1 = new ArrayList();
    if (localShapePathCollection.getCount() == 0) {
      return;
    }
    Iterator localIterator1 = localShapePathCollection.iterator();
    while (localIterator1.hasNext())
    {
      ShapePath localShapePath = (ShapePath)localIterator1.next();
      if (localShapePath.c)
      {
        ArrayList localArrayList2 = new ArrayList();
        if (localArrayList2.size() > 0) {
          localArrayList2.clear();
        }
        zadd localzadd = new zadd();
        zapy localzapy = null;
        localShapeSegmentPathCollection = localShapePath.getPathSegementList();
        Iterator localIterator2 = localShapeSegmentPathCollection.iterator();
        while (localIterator2.hasNext())
        {
          ShapeSegmentPath localShapeSegmentPath = (ShapeSegmentPath)localIterator2.next();
          localzapy = new zapy();
          localzapy.a(i(localShapeSegmentPath.getType()));
          localzapy.a(a(paramShape, localShapeSegmentPath.getPoints(), localShapeGuideCollection, localzapy.a()));
          zf.a(localArrayList2, localzapy);
        }
        localzadd.a(localArrayList2);
        localzadd.b(localShapePath.e);
        localzadd.a(localShapePath.d);
        zf.a(localArrayList1, localzadd);
      }
    }
    localzadf.a(localArrayList1);
    paramzbni.a(localzadf);
  }
  
  private static int i(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
      return 3;
    case 1: 
      return 1;
    case 4: 
      return 4;
    case 0: 
      return 0;
    case 2: 
      return 2;
    case 6: 
      return 5;
    }
    return 6;
  }
  
  private static void d(Shape paramShape, zbni paramzbni)
  {
    Geometry localGeometry = paramShape.an();
    if (localGeometry == null) {
      return;
    }
    ShapeGuideCollection localShapeGuideCollection = localGeometry.g();
    if (localShapeGuideCollection != null)
    {
      Iterator localIterator = localShapeGuideCollection.iterator();
      while (localIterator.hasNext())
      {
        ShapeGuide localShapeGuide = (ShapeGuide)localIterator.next();
        String str1 = localShapeGuide.b().toLowerCase();
        if (str1.startsWith("val"))
        {
          String str2 = str1.substring(4).trim();
          if (zarb.c(str2))
          {
            if (paramzbni.n == null) {
              paramzbni.n = new zadk();
            }
            zf.a(paramzbni.n.a, Double.valueOf(zo.a(str2)));
          }
        }
      }
    }
  }
  
  private static boolean d(Shape paramShape)
  {
    if ((paramShape.getMsoDrawingType() == 12) || (paramShape.getMsoDrawingType() == 11)) {
      return true;
    }
    int i = paramShape.getWidth();
    int j = paramShape.getHeight();
    switch (paramShape.getAutoShapeType())
    {
    case 0: 
    case 20: 
    case 32: 
    case 34: 
      if ((i == 0) && (j == 0)) {
        return false;
      }
      if ((i < 0) || (j < 0)) {
        return false;
      }
      break;
    default: 
      if ((i <= 0) || (j <= 0)) {
        return false;
      }
      break;
    }
    return true;
  }
  
  static Color a(double paramDouble, Color paramColor)
  {
    return Color.a((int)((1.0D - paramDouble) * 255.0D), paramColor);
  }
  
  private static void e(Shape paramShape, zbni paramzbni)
    throws Exception
  {
    paramzbni.z().a = paramShape.Q().getPageSetup().getBlackAndWhite();
    FillFormat localFillFormat = paramShape.a(2, false);
    zxj localzxj = paramzbni.z().c();
    paramzbni.z().a(localzxj);
    Object localObject;
    switch (localFillFormat.getFillType())
    {
    case 2: 
      paramzbni.z().a(false);
      paramzbni.z().a(a(localFillFormat.getSolidFill().getTransparency(), localFillFormat.getSolidFill().getColor()));
      paramzbni.z().a(null);
      break;
    case 0: 
      paramzbni.z().a(false);
      if (paramShape.x() == null)
      {
        paramzbni.z().a(true);
        paramzbni.z().a(null);
      }
      else
      {
        if ((paramShape.x().d != null) && (ze.f(paramShape.x().d.a) != 0))
        {
          localObject = null;
          if (paramShape.T()) {
            localObject = (Chart)paramShape.N().i();
          }
          paramzbni.z().a(a(0.0D, paramShape.x().d.b.a(paramShape.P().p(), (Chart)localObject)));
        }
        paramzbni.z().a(null);
      }
      break;
    case 3: 
      paramzbni.z().a(false);
      localzxj.a(0);
      a(paramShape, localFillFormat, localzxj.b());
      break;
    case 5: 
      paramzbni.z().a(false);
      localzxj.a(2);
      localObject = localFillFormat.getPatternFill();
      localzxj.a(a(((PatternFill)localObject).getForegroundColor()), a(((PatternFill)localObject).getBackgroundColor()), e(localFillFormat.getPattern()));
      break;
    case 4: 
      if (localFillFormat.getTextureFill().getImageData() == null) {
        paramzbni.z().a(true);
      } else {
        try
        {
          paramzbni.z().a(false);
          localzxj.a(1);
          a(localFillFormat, localzxj.a());
          if (localFillFormat.getTextureFill().getImageData() != null)
          {
            byte[] arrayOfByte = localFillFormat.getTextureFill().getImageData();
            zh localzh = new zh(arrayOfByte);
            zj localzj = zj.a(localzh);
            localzxj.a().a(arrayOfByte);
          }
        }
        catch (Exception localException)
        {
          paramzbni.z().a(true);
        }
      }
      break;
    case 6: 
      if (paramShape.getGroup() != null) {
        e(paramShape.getGroup(), paramzbni);
      }
      break;
    case 1: 
    default: 
      paramzbni.z().a(true);
    }
  }
  
  static int a(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 0;
    case 3: 
      return 3;
    case 1: 
      return 2;
    }
    return 1;
  }
  
  static int b(int paramInt)
  {
    switch (paramInt)
    {
    case 4: 
      return 4;
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 0: 
      return 0;
    case 1: 
      return 1;
    }
    return 5;
  }
  
  private static void a(Shape paramShape, FillFormat paramFillFormat, zads paramzads)
  {
    if (paramFillFormat.getGradientFill() == null) {
      return;
    }
    Workbook localWorkbook = paramShape.P().p();
    GradientFill localGradientFill = paramFillFormat.getGradientFill();
    paramzads.a(localGradientFill.c);
    paramzads.a(localGradientFill.getAngle());
    paramzads.a(a(localGradientFill.getFillType()));
    paramzads.b(b(localGradientFill.getDirectionType()));
    for (int i = 0; i < localGradientFill.getGradientStops().getCount(); i++)
    {
      GradientStop localGradientStop = localGradientFill.getGradientStops().get(i);
      Chart localChart = null;
      if (paramShape.T()) {
        localChart = (Chart)paramShape.N().i();
      }
      Color localColor = localGradientStop.a.a(localWorkbook, localChart);
      localColor = Color.a(localGradientStop.a() * 255 / 100, localColor);
      paramzads.d().a(localColor, (float)localGradientStop.getPosition());
    }
  }
  
  static void a(FillFormat paramFillFormat, zbwn paramzbwn)
  {
    TextureFill localTextureFill = paramFillFormat.getTextureFill();
    if (localTextureFill == null) {
      return;
    }
    paramzbwn.a(localTextureFill.isTiling());
    if (localTextureFill.isTiling())
    {
      paramzbwn.a(localTextureFill.getTilePicOption().getOffsetX());
      paramzbwn.b(localTextureFill.getTilePicOption().getOffsetY());
      paramzbwn.c(localTextureFill.getTilePicOption().getScaleX());
      paramzbwn.d(localTextureFill.getTilePicOption().getScaleY());
      paramzbwn.a(p(localTextureFill.getTilePicOption().getAlignmentType()));
      paramzbwn.b(q(localTextureFill.getTilePicOption().getMirrorType()));
    }
    else
    {
      paramzbwn.c(r(localTextureFill.getPicFormatOption().getType()));
      paramzbwn.e(localTextureFill.getPicFormatOption().getLeft());
      paramzbwn.f(localTextureFill.getPicFormatOption().getRight());
      paramzbwn.g(localTextureFill.getPicFormatOption().getTop());
      paramzbwn.h(localTextureFill.getPicFormatOption().getBottom());
      paramzbwn.i(localTextureFill.getPicFormatOption().getScale());
    }
  }
  
  private static void a(LineFormat paramLineFormat, zbni paramzbni)
  {
    boolean bool = !paramLineFormat.g();
    paramzbni.A().a(bool);
    paramzbni.A().a = paramzbni.b().getPageSetup().getBlackAndWhite();
    if (!bool)
    {
      paramzbni.A().a(d(paramLineFormat.getDashStyle()));
      paramzbni.A().b(paramLineFormat.getCompoundType());
      paramzbni.A().c(paramLineFormat.getCapType());
      paramzbni.A().d(paramLineFormat.getJoinType());
      paramzbni.A().a((int)(paramLineFormat.getWeight() * zbxp.a() / 72.0D + 0.5D));
      if (paramzbni.A().h() < 1.0F) {
        paramzbni.A().a(1.0F);
      }
      paramzbni.A().a(a(paramLineFormat.getTransparency(), paramLineFormat.b()));
    }
  }
  
  private static void a(FontSettingCollection paramFontSettingCollection, Shape paramShape, zbni paramzbni)
    throws Exception
  {
    if ((paramFontSettingCollection.getText() == null) || ("".equals(paramFontSettingCollection.getText())))
    {
      a(paramFontSettingCollection.k(), paramzbni);
      return;
    }
    String str1 = paramFontSettingCollection.getText();
    paramzbni.a(str1);
    ShapeTextAlignment localShapeTextAlignment = paramFontSettingCollection.getTextAlignment();
    paramzbni.r = localShapeTextAlignment.f;
    Font localFont1 = paramFontSettingCollection.e();
    zbvz localzbvz1 = null;
    if ((localFont1 != null) && ((localFont1 instanceof TextOptions))) {
      localzbvz1 = zbvz.a(paramFontSettingCollection.d(), paramShape.P().p(), paramzbni);
    }
    paramzbni.q = localzbvz1;
    if (localFont1 != null)
    {
      if (null != paramShape.getLinkedCell()) {
        zbxz.a(paramFontSettingCollection);
      }
      paramzbni.a(zbxz.a("", localFont1));
      paramzbni.a(Color.fromArgb(localFont1.getColor().toArgb()));
      a(localFont1, paramzbni.D());
    }
    localFont1 = paramFontSettingCollection.c();
    paramzbni.p = localShapeTextAlignment.isTextWrapped();
    if (!paramFontSettingCollection.h().g(8192)) {
      paramzbni.o = paramFontSettingCollection.a();
    }
    paramzbni.g(f(paramFontSettingCollection.m()));
    paramzbni.h(f(localShapeTextAlignment.n()));
    paramzbni.j(g(localShapeTextAlignment.o()));
    paramzbni.i(h(localShapeTextAlignment.p()));
    paramzbni.a(localShapeTextAlignment.getRotationAngle());
    paramzbni.b(localShapeTextAlignment.b());
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    int i;
    if (paramFontSettingCollection.j())
    {
      localObject1 = paramFontSettingCollection.a(false, true);
      localObject2 = null;
      if (((ArrayList)localObject1).size() > 0) {
        localObject2 = (FontSetting)((ArrayList)localObject1).get(0);
      }
      localObject3 = ((FontSetting)localObject2).n();
      Object localObject5;
      if ((((ArrayList)localObject1).size() == 1) && ((localObject3 == null) || (!((Bullet)localObject3).e())))
      {
        FontSetting localFontSetting1 = (FontSetting)((ArrayList)localObject1).get(0);
        localObject4 = str1.substring(localFontSetting1.getStartIndex(), localFontSetting1.getStartIndex() + localFontSetting1.getLength());
        localObject5 = localFontSetting1.h() == null ? localFont1 : localFontSetting1.getFont();
        if (((Font)localObject5).getCapsType() == 1) {
          localObject4 = ((String)localObject4).toUpperCase();
        } else if (((Font)localObject5).getCapsType() == 2) {
          localObject4 = ((String)localObject4).toLowerCase();
        }
        paramzbni.a((String)localObject4);
        paramzbni.a(zbxz.a("", (Font)localObject5));
        paramzbni.a(Color.fromArgb(((Font)localObject5).getColor().toArgb()));
        a((Font)localObject5, paramzbni.D());
      }
      else
      {
        i = 1;
        localObject4 = Color.getEmpty();
        localObject5 = null;
        Object localObject6 = null;
        int j = 0;
        int k = 0;
        int m = 0;
        for (int n = 0; n < ((ArrayList)localObject1).size(); n++)
        {
          FontSetting localFontSetting2 = (FontSetting)((ArrayList)localObject1).get(n);
          String str2 = str1.substring(localFontSetting2.getStartIndex(), localFontSetting2.getStartIndex() + localFontSetting2.getLength());
          zbvz localzbvz2 = null;
          if (localzbvz1 != null) {
            localzbvz2 = zbvz.a(localFontSetting2.getTextOptions(), paramShape.P().p(), paramzbni);
          }
          Font localFont2 = localFontSetting2.h() == null ? localFont1 : localFontSetting2.getFont();
          TextOptions localTextOptions = null;
          if ((localFont2 instanceof TextOptions)) {
            localTextOptions = (TextOptions)localFont2;
          }
          if (localFont2.getCapsType() == 1) {
            str2 = str2.toUpperCase();
          } else if (localFont2.getCapsType() == 2) {
            str2 = str2.toLowerCase();
          }
          zg localzg = zbxz.a("", localFont2);
          paramzbni.a(Color.fromArgb(localFont2.getColor().toArgb()));
          zzo localzzo = a(localFont2);
          if (localTextOptions != null)
          {
            localObject7 = localTextOptions.t().iterator();
            while (((Iterator)localObject7).hasNext())
            {
              localObject8 = (zbwj)((Iterator)localObject7).next();
              if (((zbwj)localObject8).a() == 3) {
                localzg = new zg("Symbol", localzg.h(), localzg.k());
              }
            }
          }
          if (n == 0)
          {
            localObject5 = localzg;
            localObject4 = Color.a(255, localFont2.getColor());
            localObject6 = localzzo;
          }
          else if (((i != 0) && ((!a((zg)localObject5, localzg)) || (((Color)localObject4).getR() != localFontSetting2.getFont().getColor().getR()) || (((Color)localObject4).getG() != localFontSetting2.getFont().getColor().getG()) || (((Color)localObject4).getB() != localFontSetting2.getFont().getColor().getB()))) || (b(localFontSetting2.getFont())))
          {
            i = 0;
          }
          localObject3 = localFontSetting2.n();
          if (localObject3 != null)
          {
            if (j == 0) {
              k = ((Bullet)localObject3).getType();
            }
            if (((Bullet)localObject3).getType() != k)
            {
              j = 0;
              k = ((Bullet)localObject3).getType();
            }
            else if (((Bullet)localObject3).getType() == 3)
            {
              localObject7 = (AutoNumberedBulletValue)((Bullet)localObject3).getBulletValue();
              if (j == 0) {
                m = ((AutoNumberedBulletValue)localObject7).getAutonumberScheme();
              }
              if (((AutoNumberedBulletValue)localObject7).getAutonumberScheme() != m)
              {
                j = 0;
                m = ((AutoNumberedBulletValue)localObject7).getAutonumberScheme();
              }
            }
          }
          zbdc localzbdc2;
          if ((localObject3 != null) && (((Bullet)localObject3).e()) && (!"\n".equals(str2)) && (!"".equals(str2)))
          {
            localObject7 = ((Bullet)localObject3).d();
            localObject7 = a((Bullet)localObject3, j);
            j++;
            if ((localObject7 != null) && (!"".equals(localObject7)))
            {
              localObject8 = localzg;
              if (((Bullet)localObject3).b() != null) {
                localObject8 = new zg(((Bullet)localObject3).b(), localzg.h());
              }
              Color localColor = Color.a(255, localFont2.getColor());
              if (!((Bullet)localObject3).c().b()) {
                localColor = Color.a(255, ((Bullet)localObject3).c().b(paramzbni.a()));
              }
              localzbdc2 = new zbdc((String)localObject7, (zg)localObject8, localColor, localzzo, 2, f(localFontSetting2.f()));
              localzbdc2.c = null;
              if (localFontSetting2.n() != null)
              {
                localzbdc2.a(true);
                localzbdc2.k().a(localFontSetting2.n(), null);
              }
              a(localzbdc2, localFontSetting2);
              if (localTextOptions != null) {
                localzbdc2.a(localTextOptions.getSpacing());
              }
              zf.a(paramzbni.L(), localzbdc2);
              if ((str2 != null) && (!"".equals(str2))) {
                str2 = " " + str2;
              }
            }
          }
          Object localObject7 = zbxz.a(str2, paramShape.getTextDirection(), localFontSetting2.getFont(), false);
          Object localObject8 = new zbda();
          zbxz.a((ArrayList)localObject7, (zaiz)localObject8, localzg, Color.a(255, localFont2.getColor()), localzzo);
          if (((ArrayList)localObject7).size() > 0)
          {
            for (int i1 = 0; i1 < ((ArrayList)localObject7).size(); i1++)
            {
              localzbdc2 = new zbdc(((zbda)localObject8).a(i1).a(), ((zbda)localObject8).a(i1).b(), ((zbda)localObject8).a(i1).c(), ((zbda)localObject8).a(i1).d(), 2, f(localFontSetting2.f()));
              localzbdc2.c = localzbvz2;
              a(localzbdc2, localFontSetting2);
              if (localTextOptions != null) {
                localzbdc2.a(localTextOptions.getSpacing());
              }
              zf.a(paramzbni.L(), localzbdc2);
            }
          }
          else
          {
            zbdc localzbdc1 = new zbdc(str2, localzg, Color.a(255, localFont2.getColor()), localzzo, 2, f(localFontSetting2.f()));
            localzbdc1.c = localzbvz2;
            a(localzbdc1, localFontSetting2);
            if (localTextOptions != null) {
              localzbdc1.a(localTextOptions.getSpacing());
            }
            zf.a(paramzbni.L(), localzbdc1);
          }
        }
        if ((i != 0) && (((ArrayList)localObject1).size() > 1))
        {
          paramzbni.a((zg)localObject5);
          paramzbni.a((Color)localObject4);
          paramzbni.a((zzo)localObject6);
        }
      }
    }
    else
    {
      localObject1 = paramzbni.K();
      if (localFont1.getCapsType() == 1) {
        localObject1 = ((String)localObject1).toUpperCase();
      } else if (localFont1.getCapsType() == 2) {
        localObject1 = ((String)localObject1).toLowerCase();
      }
      paramzbni.a((String)localObject1);
      localObject2 = zbxz.a((String)localObject1, paramShape.getTextDirection(), localFont1, false);
      localObject3 = new zbda();
      zbxz.a((ArrayList)localObject2, (zaiz)localObject3, paramzbni.B(), paramzbni.C(), paramzbni.D());
      for (i = 0; i < ((zbda)localObject3).getCount(); i++)
      {
        localObject4 = new zbdc(((zbda)localObject3).a(i).a(), ((zbda)localObject3).a(i).b(), ((zbda)localObject3).a(i).c(), ((zbda)localObject3).a(i).d(), 2, f(paramFontSettingCollection.m()));
        ((zbdc)localObject4).c = localzbvz1;
        zf.a(paramzbni.L(), localObject4);
      }
    }
  }
  
  private static String a(Bullet paramBullet, int paramInt)
  {
    switch (paramBullet.getType())
    {
    case 1: 
      return paramBullet.d();
    case 3: 
      AutoNumberedBulletValue localAutoNumberedBulletValue = (AutoNumberedBulletValue)paramBullet.getBulletValue();
      paramInt += localAutoNumberedBulletValue.getStartAt();
      switch (localAutoNumberedBulletValue.getAutonumberScheme())
      {
      case 1: 
        return "(" + j(paramInt) + ")";
      case 2: 
        return j(paramInt) + ")";
      case 3: 
        return j(paramInt) + ".";
      case 4: 
        return "(" + j(paramInt).toUpperCase() + ")";
      case 5: 
        return j(paramInt).toUpperCase() + ")";
      case 6: 
        return j(paramInt).toUpperCase() + ".";
      case 11: 
        return "(" + zp.a(paramInt) + ")";
      case 12: 
        return zp.a(paramInt) + ")";
      case 13: 
        return zp.a(paramInt) + ".";
      case 14: 
        return zp.a(paramInt) + ",";
      case 30: 
        return "(" + k(paramInt) + ")";
      case 31: 
        return k(paramInt) + ")";
      case 32: 
        return k(paramInt) + ".";
      case 33: 
        return "(" + k(paramInt).toUpperCase() + ")";
      case 34: 
        return k(paramInt).toUpperCase() + ")";
      case 35: 
        return k(paramInt).toUpperCase() + ".";
      }
      return "";
    }
    return "";
  }
  
  private static String j(int paramInt)
  {
    int i = paramInt % 26;
    if (i == 0) {
      i = 26;
    }
    int j = paramInt / 27 + 1;
    String str = "";
    char c = (char)(96 + i);
    for (int k = 0; k < j; k++) {
      str = str + Character.toString(c);
    }
    return str;
  }
  
  private static String k(int paramInt)
  {
    int i = paramInt % 10;
    String str = "";
    switch (i)
    {
    case 1: 
      str = "i";
      break;
    case 2: 
      str = "ii";
      break;
    case 3: 
      str = "iii";
      break;
    case 4: 
      str = "iv";
      break;
    case 5: 
      str = "v";
      break;
    case 6: 
      str = "vi";
      break;
    case 7: 
      str = "vii";
      break;
    case 8: 
      str = "viii";
      break;
    case 9: 
      str = "ix";
      break;
    case 10: 
      str = "x";
      break;
    }
    if (paramInt <= 10) {
      return str;
    }
    if (paramInt <= 20) {
      return "x" + str;
    }
    if (paramInt <= 30) {
      return "xx" + str;
    }
    if (paramInt <= 40) {
      return "xl";
    }
    if (paramInt <= 49) {
      return "xl" + str;
    }
    return "";
  }
  
  private static void a(ArrayList paramArrayList, zbni paramzbni)
    throws Exception
  {
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      ztw localztw = (ztw)paramArrayList.get(i);
      zg localzg = zbxz.a("", localztw.getFont());
      paramzbni.a(Color.a(255, localztw.getFont().getColor()));
      zzo localzzo = a(localztw.getFont());
      int j = 1;
      if (localztw.b == 2) {
        j = 7;
      } else if (localztw.b == 3) {
        j = 8;
      }
      zbdc localzbdc = new zbdc("", localzg, Color.a(255, localztw.getFont().getColor()), localzzo, 2, j);
      localzbdc.a(localztw);
      zf.a(paramzbni.L(), localzbdc);
    }
  }
  
  private static void a(zbdc paramzbdc, FontSetting paramFontSetting)
  {
    paramzbdc.b(paramFontSetting.b(false));
    zbqv localzbqv = paramFontSetting.k();
    if (localzbqv != null) {
      paramzbdc.s().a(localzbqv);
    }
    localzbqv = paramFontSetting.i();
    if (localzbqv != null) {
      paramzbdc.o().a(localzbqv);
    }
    localzbqv = paramFontSetting.j();
    if (localzbqv != null) {
      paramzbdc.q().a(localzbqv);
    }
    paramzbdc.c(paramFontSetting.l());
    paramzbdc.d(paramFontSetting.m());
  }
  
  private static zzo a(Font paramFont)
  {
    zzo localzzo = new zzo();
    localzzo.a(paramFont.isStrikeout());
    localzzo.b(paramFont.getStrikeType() == 1);
    localzzo.c(paramFont.isSuperscript());
    localzzo.d(paramFont.isSubscript());
    localzzo.a(paramFont.getScriptOffset());
    localzzo.e(paramFont.getCapsType() == 2);
    localzzo.f(paramFont.getCapsType() == 1);
    localzzo.g(paramFont.isNormalizeHeights());
    return localzzo;
  }
  
  private static boolean a(zg paramzg1, zg paramzg2)
  {
    if (!zw.b(paramzg1.g(), paramzg2.g())) {
      return false;
    }
    if (paramzg1.h() != paramzg2.h()) {
      return false;
    }
    if (paramzg1.c() != paramzg2.c()) {
      return false;
    }
    if (paramzg1.f() != paramzg2.f()) {
      return false;
    }
    if (paramzg1.j() != paramzg2.j()) {
      return false;
    }
    return paramzg1.l() == paramzg2.l();
  }
  
  private static void a(Font paramFont, zaid paramzaid)
  {
    paramzaid.a(paramFont.isStrikeout());
    paramzaid.b(paramFont.getStrikeType() == 1);
    paramzaid.c(paramFont.isSuperscript());
    paramzaid.d(paramFont.isSubscript());
    paramzaid.a(paramFont.getScriptOffset());
    paramzaid.e(paramFont.getCapsType() == 2);
    paramzaid.f(paramFont.getCapsType() == 1);
    paramzaid.g(paramFont.isNormalizeHeights());
  }
  
  private static boolean b(Font paramFont)
  {
    if (((paramFont.isSubscript()) || (paramFont.isSuperscript())) && (paramFont.getScriptOffset() != 0.0D)) {
      return true;
    }
    if (paramFont.getCapsType() != 0) {
      return true;
    }
    return paramFont.isNormalizeHeights();
  }
  
  private static void a(CommentShape paramCommentShape, zbni paramzbni)
  {
    paramzbni.c(paramCommentShape.getComment().getColumn());
    paramzbni.d(paramCommentShape.getComment().getRow());
    paramzbni.a(paramCommentShape.getUpperLeftColumn());
    paramzbni.b(paramCommentShape.getUpperLeftRow());
  }
  
  private static void f(Shape paramShape, zbni paramzbni)
  {
    switch (paramShape.getAutoShapeType())
    {
    case 20: 
    case 32: 
      if ((!paramShape.R().j().e()) && (!paramShape.R().j().f())) {
        paramzbni.c = 1;
      } else if ((paramShape.R().j().e()) && (paramShape.R().j().f())) {
        paramzbni.c = 3;
      } else if ((paramShape.R().j().e()) && (!paramShape.R().j().f())) {
        paramzbni.c = 2;
      } else {
        paramzbni.c = 4;
      }
      break;
    default: 
      if ((!paramShape.R().j().e()) && (!paramShape.R().j().f())) {
        paramzbni.c = 1;
      } else if ((paramShape.R().j().e()) && (paramShape.R().j().f())) {
        paramzbni.c = 3;
      } else if ((paramShape.R().j().e()) && (!paramShape.R().j().f())) {
        paramzbni.c = 2;
      } else {
        paramzbni.c = 4;
      }
      break;
    }
  }
  
  static Color a(Color paramColor)
  {
    if (paramColor.getA() == 0) {
      return Color.a(255, paramColor);
    }
    return paramColor;
  }
  
  static int c(int paramInt)
  {
    switch (paramInt)
    {
    case 29: 
      return 29;
    case 0: 
      return 0;
    case 6: 
      return 6;
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 19: 
      return 19;
    case 7: 
      return 7;
    case 11: 
      return 11;
    case 12: 
      return 12;
    case 18: 
      return 18;
    case 20: 
      return 20;
    case 14: 
      return 14;
    case 5: 
      return 5;
    case 25: 
      return 25;
    case 8: 
      return 8;
    case 17: 
      return 17;
    case 16: 
      return 16;
    case 24: 
      return 24;
    case 30: 
      return 30;
    }
    return 30;
  }
  
  static int d(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 0;
    case 3: 
      return 2;
    case 1: 
      return 1;
    case 4: 
      return 3;
    case 2: 
      return 4;
    case 5: 
      return 5;
    case 7: 
      return 7;
    case 6: 
      return 6;
    }
    return 6;
  }
  
  private static int l(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 1;
    case 3: 
      return 3;
    case 5: 
      return 5;
    case 4: 
      return 4;
    case 2: 
      return 2;
    }
    return 0;
  }
  
  private static int m(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 1;
    case 0: 
      return 0;
    case 2: 
      return 2;
    }
    return 0;
  }
  
  private static int n(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      return 2;
    case 1: 
      return 1;
    case 0: 
      return 0;
    }
    return 0;
  }
  
  private static int o(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 0: 
      return 0;
    }
    return 0;
  }
  
  static int e(int paramInt)
  {
    switch (paramInt)
    {
    case 16: 
      return 20;
    case 25: 
      return 29;
    case 17: 
      return 21;
    case 24: 
      return 28;
    case 26: 
      return 30;
    case 29: 
      return 32;
    case 27: 
      return 31;
    case 28: 
      return 33;
    case 34: 
      return 38;
    case 38: 
      return 42;
    case 40: 
      return 44;
    case 39: 
      return 43;
    case 35: 
      return 39;
    case 47: 
      return 50;
    case 31: 
      return 35;
    case 45: 
      return 4;
    case 14: 
      return 18;
    case 21: 
      return 25;
    case 15: 
      return 19;
    case 20: 
      return 24;
    case 23: 
      return 27;
    case 22: 
      return 26;
    case 48: 
      return 51;
    case 37: 
      return 41;
    case 41: 
      return 45;
    case 46: 
      return 49;
    case 30: 
      return 34;
    case 44: 
      return 48;
    case 49: 
      return 52;
    case 43: 
      return 47;
    case 42: 
      return 46;
    case 33: 
      return 37;
    case 36: 
      return 40;
    case 18: 
      return 22;
    case 19: 
      return 23;
    case 32: 
      return 36;
    case 2: 
      return 6;
    case 3: 
      return 7;
    case 4: 
      return 8;
    case 13: 
      return 9;
    case 5: 
      return 10;
    case 6: 
      return 11;
    case 7: 
      return 12;
    case 8: 
      return 13;
    case 9: 
      return 14;
    case 10: 
      return 15;
    case 11: 
      return 16;
    case 12: 
      return 17;
    }
    return 4;
  }
  
  private static int p(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 0;
    case 1: 
      return 0;
    case 2: 
      return 0;
    case 3: 
      return 2;
    case 4: 
      return 4;
    case 5: 
      return 5;
    case 6: 
      return 6;
    case 8: 
      return 8;
    }
    return 7;
  }
  
  private static int q(int paramInt)
  {
    switch (paramInt)
    {
    case 3: 
      return 3;
    case 1: 
      return 1;
    case 2: 
      return 2;
    }
    return 0;
  }
  
  private static int r(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 1;
    case 2: 
      return 2;
    }
    return 0;
  }
  
  static int f(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 4: 
      return 4;
    case 5: 
      return 5;
    case 6: 
      return 6;
    case 7: 
      return 7;
    case 8: 
      return 8;
    case 9: 
      return 9;
    }
    return 1;
  }
  
  static int g(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    case 3: 
      return 3;
    }
    return 2;
  }
  
  static int h(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      return 0;
    case 1: 
      return 1;
    case 2: 
      return 2;
    }
    return 0;
  }
  
  private static void g(Shape paramShape, zbni paramzbni)
  {
    if (paramShape.getRotationAngle() >= 0.0D) {
      paramzbni.f((int)(paramShape.getRotationAngle() + 0.5D));
    } else {
      paramzbni.f((int)(paramShape.getRotationAngle() - 0.5D));
    }
  }
  
  private static void b(LineFormat paramLineFormat, zbni paramzbni)
  {
    paramzbni.A().e(l(paramLineFormat.getBeginArrowheadStyle()));
    paramzbni.A().g(m(paramLineFormat.getBeginArrowheadLength()));
    paramzbni.A().f(n(paramLineFormat.getBeginArrowheadWidth()));
    paramzbni.A().h(l(paramLineFormat.getEndArrowheadStyle()));
    paramzbni.A().j(m(paramLineFormat.getEndArrowheadLength()));
    paramzbni.A().i(n(paramLineFormat.getEndArrowheadWidth()));
  }
  
  private static void h(Shape paramShape, zbni paramzbni)
  {
    TextEffectFormat localTextEffectFormat = paramShape.getTextEffect();
    zbvw localzbvw = new zbvw();
    localzbvw.a(localTextEffectFormat.getText());
    localzbvw.b(localTextEffectFormat.getFontName());
    localzbvw.a(localTextEffectFormat.getFontSize());
    localzbvw.b(localTextEffectFormat.getFontItalic());
    localzbvw.a(localTextEffectFormat.getFontBold());
    localzbvw.c(localTextEffectFormat.getRotatedChars());
    localzbvw.b(s(localTextEffectFormat.d()));
    localzbvw.c(t(localTextEffectFormat.getPresetShape()));
    paramzbni.a(localzbvw);
  }
  
  private static int s(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
      return 2;
    case 3: 
      return 3;
    case 1: 
      return 1;
    case 6: 
      return 6;
    case 4: 
      return 4;
    case 0: 
      return 0;
    case 5: 
      return 5;
    }
    return 1;
  }
  
  private static int t(int paramInt)
  {
    switch (paramInt)
    {
    case 145: 
      return 145;
    case 149: 
      return 149;
    case 144: 
      return 144;
    case 148: 
      return 148;
    case 147: 
      return 147;
    case 151: 
      return 151;
    case 175: 
      return 175;
    case 174: 
      return 174;
    case 155: 
      return 155;
    case 154: 
      return 154;
    case 141: 
      return 141;
    case 140: 
      return 140;
    case 146: 
      return 146;
    case 150: 
      return 150;
    case 153: 
      return 153;
    case 152: 
      return 152;
    case 161: 
      return 161;
    case 163: 
      return 163;
    case 166: 
      return 166;
    case 167: 
      return 167;
    case 165: 
      return 165;
    case 158: 
      return 158;
    case 159: 
      return 159;
    case 171: 
      return 171;
    case 169: 
      return 169;
    case 168: 
      return 168;
    case 170: 
      return 170;
    case 160: 
      return 160;
    case 162: 
      return 162;
    case 164: 
      return 164;
    case 255: 
      return 255;
    case 136: 
      return 136;
    case 142: 
      return 142;
    case 143: 
      return 143;
    case 173: 
      return 173;
    case 172: 
      return 172;
    case 137: 
      return 137;
    case 139: 
      return 139;
    case 138: 
      return 138;
    case 156: 
      return 156;
    case 157: 
      return 157;
    }
    return 145;
  }
  
  private static void i(Shape paramShape, zbni paramzbni)
  {
    zaqa localzaqa = paramShape.Z();
    zbfm localzbfm = new zbfm();
    localzbfm.a(u(localzaqa.b()));
    localzbfm.b(localzaqa.d());
    localzbfm.a(localzaqa.c());
    localzbfm.a(localzaqa.s());
    localzbfm.b(localzaqa.t());
    localzbfm.b(localzaqa.f());
    localzbfm.c(localzaqa.g());
    localzbfm.m(localzaqa.q());
    localzbfm.n(localzaqa.r());
    localzbfm.a(localzaqa.e());
    localzbfm.j(localzaqa.n());
    localzbfm.k(localzaqa.o());
    localzbfm.f(localzaqa.j());
    localzbfm.h(localzaqa.l());
    localzbfm.g(localzaqa.k());
    localzbfm.i(localzaqa.m());
    localzbfm.d(localzaqa.h());
    localzbfm.e(localzaqa.i());
    localzbfm.l(localzaqa.p());
    paramzbni.a(localzbfm);
  }
  
  private static int u(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
      return 1;
    case 4: 
      return 4;
    case 5: 
      return 5;
    case 0: 
      return 0;
    case 2: 
      return 2;
    case 3: 
      return 3;
    }
    return 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */