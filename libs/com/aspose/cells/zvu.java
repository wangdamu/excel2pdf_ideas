package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.Iterator;

class zvu
  extends ztp
{
  private zpu b;
  private zpp c;
  private ArrayList d = null;
  private ArrayList e = null;
  private boolean f = false;
  private boolean g = false;
  private boolean h = false;
  private boolean i = false;
  private boolean j = false;
  private boolean k = false;
  private int l = 0;
  private boolean m = false;
  private ShapeCollection n;
  private zcjz o = null;
  private static final za p = new za(new String[] { "shapetype", "shapelayout" });
  
  zvu(zpu paramzpu)
  {
    this.b = paramzpu;
    this.c = paramzpu.k;
    this.f = this.c.h;
    this.i = this.c.g;
    this.k = this.c.f;
    this.d = new ArrayList();
    this.e = new ArrayList();
    this.n = this.c.i;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    this.o = paramzcjz;
    paramzcjz.b = true;
    f();
    paramzcjz.b();
    paramzcjz.e();
  }
  
  private void d()
    throws Exception
  {
    this.o.c("o:shapelayout", null);
    this.o.a("v:ext", null, "edit");
    this.o.c("o:idmap", null);
    this.o.a("v:ext", null, "edit");
    this.o.a("data", zauj.z(this.b.a.getShapes().d().c().a() & 0xFFFF));
    this.o.b();
    this.o.b();
  }
  
  static void b(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b("xml");
    paramzcjz.a("xmlns", "v", null, "urn:schemas-microsoft-com:vml");
    paramzcjz.a("xmlns", "o", null, "urn:schemas-microsoft-com:office:office");
    paramzcjz.a("xmlns", "x", null, "urn:schemas-microsoft-com:office:excel");
  }
  
  private void e()
    throws Exception
  {
    if (this.n.a == null) {
      return;
    }
    zbyt localzbyt = new zbyt(new com.aspose.cells.b.a.d.zh(this.n.a));
    if (localzbyt != null) {
      localzbyt.b(true);
    }
    if (null != localzbyt)
    {
      localzbyt.k();
      if (localzbyt.d())
      {
        zbys localzbys = new zbys();
        while (zauz.a(localzbyt))
        {
          zcjs localzcjs = localzbyt.a(localzbys, false);
          a(localzcjs);
          localzcjs.h();
        }
        localzbyt.c();
      }
    }
  }
  
  private void f()
    throws Exception
  {
    b(this.o);
    e();
    if (!this.m) {
      d();
    }
    if ((this.f) && (!this.g)) {
      g();
    }
    if ((this.k) && (!this.h)) {
      h();
    }
    if ((this.i) && (!this.j)) {
      i();
    }
    a(this.c.e);
  }
  
  private void a(ArrayList paramArrayList)
    throws Exception
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      zps localzps = (zps)localIterator.next();
      Shape localShape = localzps.d;
      switch (localShape.getMsoDrawingType())
      {
      case 8: 
      case 24: 
        if ((this.e.size() <= 0) || (!this.e.contains(localShape))) {
          a((zpr)localzps);
        }
        break;
      case 25: 
        Comment localComment = ((CommentShape)localShape).a();
        if ((this.d.size() <= 0) || (!this.d.contains(localComment))) {
          a(localComment);
        }
        break;
      case 0: 
        a((zpq)localzps);
        break;
      default: 
        a(localzps);
      }
    }
  }
  
  private void a(zpq paramzpq)
    throws Exception
  {
    Shape localShape = paramzpq.d;
    this.o.b("v:group");
    this.o.a("id", paramzpq.e);
    this.o.a("style", n(localShape));
    this.o.a("coordorigin", zauj.z(localShape.getLeftToCorner()) + "," + zauj.z(localShape.getTopToCorner()));
    this.o.a("coordsize", zauj.z(localShape.getWidth()) + "," + zauj.z(localShape.getHeight()));
    this.o.d("<o:lock v:ext=\"edit\" text=\"t\"/>");
    a(paramzpq.a);
    this.o.b();
  }
  
  private void a(zcjs paramzcjs)
    throws Exception
  {
    if (paramzcjs.e == 1)
    {
      zcjn localzcjn = (zcjn)paramzcjs;
      switch (p.a(paramzcjs.g))
      {
      case 0: 
        String str = zauz.a((zcjn)paramzcjs, "id").h;
        if ("\000t202".equals(str)) {
          this.g = true;
        } else if ("\000t75".equals(str)) {
          this.h = true;
        } else if ("\000t201".equals(str)) {
          this.j = true;
        }
        break;
      case 1: 
        this.m = true;
        break;
      }
    }
    paramzcjs.a(this.o);
  }
  
  private FontSettingCollection b(Shape paramShape)
    throws Exception
  {
    FontSettingCollection localFontSettingCollection = null;
    if (paramShape.getMsoDrawingType() == 11) {
      localFontSettingCollection = ((CheckBox)paramShape).getTextBody();
    } else if (paramShape.getMsoDrawingType() == 14) {
      localFontSettingCollection = ((Label)paramShape).getTextBody();
    } else if (paramShape.getMsoDrawingType() == 7) {
      localFontSettingCollection = ((Button)paramShape).getTextBody();
    } else if (paramShape.getMsoDrawingType() == 12) {
      localFontSettingCollection = ((RadioButton)paramShape).getTextBody();
    } else if (paramShape.getMsoDrawingType() == 19) {
      localFontSettingCollection = ((GroupBox)paramShape).getTextBody();
    } else {
      return null;
    }
    MsoTextFrame localMsoTextFrame = paramShape.getTextFrame();
    String str1 = null;
    if (!localMsoTextFrame.isAutoMargin()) {
      str1 = zauj.b(zbxp.d(localMsoTextFrame.getLeftMarginPt())) + "mm," + zauj.b(zbxp.d(localMsoTextFrame.getTopMarginPt())) + "mm," + zauj.b(zbxp.d(localMsoTextFrame.getRightMarginPt())) + "mm," + zauj.b(zbxp.d(localMsoTextFrame.getBottomMarginPt())) + "mm";
    }
    this.o.b("v:textbox");
    String str2 = "mso-direction-alt:auto";
    if (localMsoTextFrame.getAutoSize()) {
      str2 = str2 + ";mso-fit-shape-to-text:t";
    }
    this.o.a("style", str2);
    if (str1 != null) {
      this.o.a("inset", str1);
    }
    this.o.a("o:singleclick", "f");
    this.o.b("div");
    this.o.a("style", "text-align:left");
    this.o.a("o:singleclick", "f");
    Font localFont1 = localFontSettingCollection.c();
    ArrayList localArrayList = localFontSettingCollection.a(false, false);
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      int i1 = localArrayList.size();
      for (int i2 = 0; i2 < i1; i2++)
      {
        FontSetting localFontSetting = (FontSetting)localArrayList.get(i2);
        Font localFont2 = localFontSetting.h();
        if (localFont2 == null) {
          localFont2 = localFont1;
        }
        if ((i2 == 0) && (localFontSetting.getStartIndex() != 0)) {
          a(localFont1, localFontSettingCollection.getText().substring(0, 0 + localFontSetting.getStartIndex()), i2 == 0);
        }
        a(localFont2, localFontSettingCollection.getText().substring(localFontSetting.getStartIndex(), localFontSetting.getStartIndex() + localFontSetting.getLength()), i2 == 0);
        if (i2 == i1 - 1)
        {
          int i3 = localFontSetting.getStartIndex() + localFontSetting.getLength();
          int i4 = localFontSettingCollection.getText().length() - i3;
          if (i4 > 0) {
            a(localFont1, localFontSettingCollection.getText().substring(i3, i3 + i4), i2 == 0);
          }
        }
      }
    }
    else if (localFontSettingCollection.getText() != null)
    {
      a(localFont1, localFontSettingCollection.getText(), true);
    }
    this.o.b();
    this.o.b();
    return localFontSettingCollection;
  }
  
  private void a(Font paramFont, String paramString, boolean paramBoolean)
    throws Exception
  {
    this.o.b("font");
    this.o.a("face", paramFont.getName());
    this.o.a("size", zauj.z(paramFont.getSize() * 20));
    String str = "auto";
    if (!paramFont.k())
    {
      int i1 = 0;
      boolean[] arrayOfBoolean = { i1 };
      int i2 = paramFont.a(false, arrayOfBoolean);
      i1 = arrayOfBoolean[0];
      str = zauj.z(i2);
    }
    this.o.a("color", str);
    if (paramFont.isBold()) {
      this.o.b("b");
    }
    if ((paramBoolean) && (paramString.length() > 0) && (paramString.charAt(0) == ' '))
    {
      this.o.a(" ");
      this.o.a(paramString.substring(1, 1 + (paramString.length() - 1)), true);
    }
    else
    {
      this.o.a(paramString, true);
    }
    if (paramFont.isBold()) {
      this.o.b();
    }
    this.o.b();
  }
  
  private void a(zps paramzps)
    throws Exception
  {
    Shape localShape = paramzps.d;
    int i1 = localShape.getMsoDrawingType();
    this.o.b("v:shape");
    b(paramzps);
    l(localShape);
    if (localShape.ac())
    {
      localObject = localShape.B().getLine();
      this.o.b("v:stroke");
      this.o.a("dashstyle", zauj.p(((LineFormat)localObject).getDashStyle()));
      this.o.a("linestyle", zauj.o(((LineFormat)localObject).getCompoundType()));
      this.o.b();
    }
    if ((i1 == 11) || (i1 == 12))
    {
      this.o.b("v:path");
      this.o.a("shadowok", "t");
      this.o.a("strokeok", "t");
      this.o.a("fillok", "t");
      this.o.b();
    }
    this.o.b("o:lock");
    this.o.a("v:ext", "edit");
    this.o.a("rotation", "t");
    if ((i1 == 7) || (i1 == 20) || (i1 == 18) || (i1 == 17) || (i1 == 16)) {
      this.o.a("text", "t");
    }
    this.o.b();
    Object localObject = b(localShape);
    a(localShape, (FontSettingCollection)localObject);
    this.o.b();
  }
  
  private void b(zps paramzps)
    throws Exception
  {
    Shape localShape = paramzps.d;
    int i1 = localShape.getMsoDrawingType();
    String str1 = paramzps.e;
    if (str1 != null) {
      this.o.a("id", str1);
    }
    String str2 = paramzps.f;
    if (str2 != null) {
      this.o.a("o:spid", str2);
    }
    this.o.a("type", "#\000t201");
    Hyperlink localHyperlink = localShape.getHyperlink();
    if (localHyperlink != null) {
      this.o.a("href", localHyperlink.getAddress());
    }
    this.o.a("style", n(localShape));
    if (i1 == 7)
    {
      this.o.a("o:button", "t");
    }
    else if ((i1 != 18) && (i1 != 17))
    {
      localObject = localShape.isFilled() ? "t" : "f";
      this.o.a("filled", (String)localObject);
    }
    if ((i1 != 18) && (i1 != 17)) {
      this.o.a("fillcolor", j(localShape));
    }
    Object localObject = localShape.B().getLine();
    String str3 = "t";
    if (((LineFormat)localObject).getFillType() == 1) {
      str3 = "f";
    }
    this.o.a("stroked", str3);
    if (((LineFormat)localObject).getFillType() != 1)
    {
      this.o.a("strokecolor", a((LineFormat)localObject));
      this.o.a("strokeweight", zauj.b(((LineFormat)localObject).getWeight()) + "pt");
    }
    if (localShape.s) {
      this.o.a("o:insetmode", "auto");
    }
  }
  
  private void a(Shape paramShape, FontSettingCollection paramFontSettingCollection)
    throws Exception
  {
    int i1 = paramShape.getMsoDrawingType();
    this.o.b("x:ClientData");
    String str = a(paramShape);
    this.o.a("ObjectType", str);
    if (paramShape.W())
    {
      this.o.d("<x:DefaultSize/>");
    }
    else
    {
      if (paramShape.getPlacement() == 0) {
        this.o.b("x:MoveWithCells", null);
      }
      if ((paramShape.getPlacement() == 0) || (paramShape.getPlacement() == 1)) {
        this.o.b("x:SizeWithCells", null);
      }
      this.o.b("x:Anchor", m(paramShape));
    }
    if (!paramShape.isLocked()) {
      this.o.b("x:Locked", "False");
    }
    if (!paramShape.isPrintable()) {
      this.o.b("x:PrintObject", "False");
    }
    if ((i1 != 16) && (i1 != 17))
    {
      this.o.b("x:AutoFill", "False");
      if ((i1 != 18) && (i1 != 19)) {
        this.o.b("x:AutoLine", "False");
      }
    }
    if (paramShape.getMacroName() != null) {
      this.o.b("x:FmlaMacro", paramShape.getMacroName());
    }
    if (i1 != 19) {
      a(paramFontSettingCollection);
    }
    if (i1 == 11) {
      i(paramShape);
    }
    Object localObject;
    if (paramShape.af() != null)
    {
      localObject = "x:FmlaLink";
      if ((i1 == 7) || (i1 == 19)) {
        localObject = "x:FmlaTxbx";
      }
      this.o.b((String)localObject, paramShape.getLinkedCell());
    }
    f(paramShape);
    switch (i1)
    {
    case 20: 
      h(paramShape);
      break;
    case 16: 
      g(paramShape);
      break;
    case 18: 
      e(paramShape);
      break;
    case 12: 
      c(paramShape);
      break;
    case 17: 
      d(paramShape);
      break;
    case 7: 
      localObject = (Button)paramShape;
      if (!((Button)localObject).a) {
        this.o.b("x:LockText", "False");
      }
      break;
    }
    this.o.b();
  }
  
  private void c(Shape paramShape)
    throws Exception
  {
    RadioButton localRadioButton = (RadioButton)paramShape;
    if (localRadioButton.isChecked()) {
      this.o.b("x:Checked", "1");
    }
  }
  
  private void d(Shape paramShape)
    throws Exception
  {
    ScrollBar localScrollBar = (ScrollBar)paramShape;
    this.o.b("x:Val", zauj.z(localScrollBar.getCurrentValue()));
    this.o.b("x:Min", zauj.z(localScrollBar.getMin()));
    this.o.b("x:Max", zauj.z(localScrollBar.getMax()));
    this.o.b("x:Inc", zauj.z(localScrollBar.getIncrementalChange()));
    this.o.b("x:Page", zauj.z(localScrollBar.getPageChange()));
    if (localScrollBar.isHorizontal()) {
      this.o.b("x:Horiz", null);
    }
    this.o.b("x:Dx", zauj.z(localScrollBar.f));
    if (!localScrollBar.getShadow()) {
      this.o.b("NoThreeD", null);
    }
  }
  
  private void e(Shape paramShape)
    throws Exception
  {
    ListBox localListBox = (ListBox)paramShape;
    this.o.b("x:Val", zauj.z(localListBox.b()));
    this.o.b("x:Min", zauj.z(localListBox.c()));
    this.o.b("x:Max", zauj.z(localListBox.d()));
    this.o.b("x:Inc", zauj.z(localListBox.e()));
    this.o.b("x:Page", zauj.z(localListBox.getPageChange()));
    this.o.b("x:Dx", zauj.z(localListBox.a));
    String str = localListBox.getInputRange();
    if (str != null) {
      this.o.b("x:FmlaRange", str);
    }
    int i1 = localListBox.getSelectedIndex() + 1;
    this.o.b("x:Sel", zauj.z(i1));
    if (!localListBox.getShadow()) {
      this.o.b("x:NoThreeD2", null);
    }
    this.o.b("x:SelType", zauj.ar(localListBox.getSelectionType()));
    if ((localListBox.getSelectionType() == 1) && (localListBox.a() != null) && (localListBox.a().size() > 0))
    {
      StringBuilder localStringBuilder = new StringBuilder(com.aspose.cells.b.a.zp.a((((Integer)localListBox.a().get(0)).intValue() & 0xFFFF) + 1));
      for (int i2 = 1; i2 < localListBox.a().size(); i2++) {
        localStringBuilder.append(", ").append(com.aspose.cells.b.a.zp.a((((Integer)localListBox.a().get(i2)).intValue() & 0xFFFF) + 1));
      }
      this.o.b("x:MultiSel", zs.a(localStringBuilder));
    }
    this.o.b("x:LCT", "Normal");
  }
  
  private void f(Shape paramShape)
    throws Exception
  {
    int i1 = paramShape.getMsoDrawingType();
    Object localObject;
    if (i1 == 11)
    {
      localObject = (CheckBox)paramShape;
      if (!((CheckBox)localObject).getShadow()) {
        this.o.b("x:NoThreeD", null);
      }
    }
    else if (i1 == 16)
    {
      localObject = (Spinner)paramShape;
      if (!((Spinner)localObject).getShadow()) {
        this.o.b("x:NoThreeD", null);
      }
    }
    else if (i1 == 12)
    {
      localObject = (RadioButton)paramShape;
      if (!((RadioButton)localObject).getShadow()) {
        this.o.b("x:NoThreeD", null);
      }
    }
    else if (i1 == 19)
    {
      localObject = (GroupBox)paramShape;
      if (!((GroupBox)localObject).getShadow()) {
        this.o.b("x:NoThreeD", null);
      }
    }
  }
  
  private void g(Shape paramShape)
    throws Exception
  {
    Spinner localSpinner = (Spinner)paramShape;
    this.o.b("x:Val", zauj.z(localSpinner.getCurrentValue()));
    this.o.b("x:Min", zauj.z(localSpinner.getMin()));
    this.o.b("x:Max", zauj.z(localSpinner.getMax()));
    this.o.b("x:Inc", zauj.z(localSpinner.getIncrementalChange()));
    this.o.b("x:Page", zauj.z(localSpinner.a()));
    this.o.b("x:Dx", zauj.z(localSpinner.f));
    if (!localSpinner.getShadow()) {
      this.o.b("NoThreeD", null);
    }
  }
  
  private void h(Shape paramShape)
    throws Exception
  {
    ComboBox localComboBox = (ComboBox)paramShape;
    this.o.b("x:Inc", zauj.z(1));
    this.o.b("x:Dx", zauj.z(15));
    String str1 = localComboBox.getInputRange();
    if (str1 != null) {
      this.o.b("x:FmlaRange", str1);
    }
    int i1 = Math.max(0, localComboBox.getSelectedIndex() + 1);
    this.o.b("x:Sel", zauj.z(i1));
    if (!localComboBox.getShadow()) {
      this.o.b("x:NoThreeD2", null);
    }
    this.o.b("x:LCT", "Normal");
    if (localComboBox.a != null)
    {
      int i2 = localComboBox.a.length;
      for (int i3 = 0; i3 < i2; i3++)
      {
        String str2 = localComboBox.a[i3];
        this.o.b("x:ListItem", str2);
      }
    }
    this.o.b("x:DropStyle", "Combo");
    this.o.b("x:DropLines", zauj.z(localComboBox.getDropDownLines()));
  }
  
  private void i(Shape paramShape)
    throws Exception
  {
    CheckBox localCheckBox = (CheckBox)paramShape;
    if (localCheckBox.a() != 0)
    {
      String str = "1";
      if (localCheckBox.a() == 2) {
        str = "2";
      }
      this.o.b("x:Checked", str);
    }
  }
  
  private void a(FontSettingCollection paramFontSettingCollection)
    throws Exception
  {
    if (paramFontSettingCollection != null)
    {
      ShapeTextAlignment localShapeTextAlignment = paramFontSettingCollection.getTextAlignment();
      String str;
      if (localShapeTextAlignment.n() != 5)
      {
        str = zauj.af(localShapeTextAlignment.n());
        if (str != null) {
          this.o.b("x:TextVAlign", str);
        }
      }
      if (localShapeTextAlignment.m() != 5)
      {
        str = zauj.af(localShapeTextAlignment.m());
        if (str != null) {
          this.o.b("x:TextHAlign", str);
        }
      }
    }
  }
  
  static String a(Shape paramShape)
  {
    switch (paramShape.getMsoDrawingType())
    {
    case 11: 
      return "Checkbox";
    case 14: 
      return "Label";
    case 7: 
      return "Button";
    case 20: 
      return "Drop";
    case 16: 
      return "Spin";
    case 18: 
      return "List";
    case 12: 
      return "Radio";
    case 19: 
      return "GBox";
    case 17: 
      return "Scroll";
    }
    return "Shape";
  }
  
  private void a(Comment paramComment)
    throws Exception
  {
    CommentShape localCommentShape = paramComment.getCommentShape();
    this.o.b("v:shape");
    String str1 = k(localCommentShape);
    if (str1 != null) {
      this.o.a("id", str1);
    }
    String str2 = j(localCommentShape);
    this.o.a("type", "#\000t202");
    Hyperlink localHyperlink = localCommentShape.getHyperlink();
    if (localHyperlink != null)
    {
      localObject = localHyperlink.a;
      if ((localObject != null) && (!"".equals(localObject))) {
        this.o.a("href", (String)localObject);
      }
    }
    this.o.a("style", n(localCommentShape));
    this.o.a("fillcolor", str2);
    Object localObject = localCommentShape.B().getLine();
    if (((LineFormat)localObject).getFillType() != 1)
    {
      str3 = a((LineFormat)localObject);
      this.o.a("strokecolor", str3);
      this.o.a("strokeweight", zauj.b(((LineFormat)localObject).getWeight()) + "pt");
    }
    this.o.a("o:insetmode", "auto");
    l(localCommentShape);
    if (((LineFormat)localObject).getFillType() != 1)
    {
      this.o.b("v:stroke");
      this.o.a("dashstyle", zauj.p(((LineFormat)localObject).getDashStyle()));
      this.o.a("linestyle", zauj.o(((LineFormat)localObject).getCompoundType()));
      this.o.b();
    }
    this.o.b("v:shadow");
    this.o.a("on", "t");
    this.o.a("color", "silver");
    this.o.a("opacity", ".5");
    this.o.a("obscured", "t");
    this.o.b();
    this.o.b("v:path");
    this.o.a("o:connecttype", "none");
    this.o.b();
    this.o.b("v:textbox");
    String str3 = "auto";
    switch (paramComment.getCommentShape().getTextDirection())
    {
    case 1: 
      str3 = "LTR";
      break;
    case 2: 
      str3 = "RTL";
    }
    String str4 = "mso-direction-alt:" + str3;
    if (localCommentShape.getTextFrame().getAutoSize()) {
      str4 = str4 + ";mso-fit-shape-to-text:t";
    }
    this.o.a("style", str4);
    this.o.b("div");
    String str5 = "left";
    if (paramComment.getTextHorizontalAlignment() != 5) {
      str5 = zauj.af(paramComment.getTextHorizontalAlignment());
    }
    this.o.a("style", "text-align:" + str5);
    this.o.b();
    this.o.b();
    this.o.b("x:ClientData");
    this.o.a("ObjectType", "Note");
    switch (localCommentShape.getPlacement())
    {
    case 0: 
      this.o.d("<x:MoveWithCells/>");
      this.o.d("<x:SizeWithCells/>");
      break;
    case 1: 
      this.o.d("<x:SizeWithCells/>");
      break;
    }
    this.o.b("x:Anchor", m(localCommentShape));
    if (paramComment.getTextHorizontalAlignment() != 5) {
      this.o.b("x:TextHAlign", str5);
    }
    if (paramComment.getTextVerticalAlignment() != 5)
    {
      str5 = zauj.af(paramComment.getTextVerticalAlignment());
      this.o.b("x:TextVAlign", str5);
    }
    this.o.b("x:Row", zauj.z(paramComment.getRow()));
    this.o.b("x:Column", zauj.z(paramComment.getColumn()));
    this.o.b();
    this.o.b();
  }
  
  private String a(LineFormat paramLineFormat)
  {
    return "#" + zauj.a(paramLineFormat.b());
  }
  
  private String j(Shape paramShape)
  {
    String str = null;
    int i1 = paramShape.getMsoDrawingType();
    if ((i1 == 18) || (i1 == 17)) {
      return null;
    }
    if (paramShape.getFill().getFillType() == 2)
    {
      Color localColor = paramShape.getFill().getSolidFill().getColor();
      if (localColor.isEmpty()) {
        str = "window [65]";
      } else {
        str = "#" + zauj.a(localColor);
      }
    }
    else if (i1 == 7)
    {
      str = "buttonFace [67]";
    }
    else
    {
      str = "window [65]";
    }
    return str;
  }
  
  private String k(Shape paramShape)
  {
    Object localObject = null;
    if (paramShape.h != null) {
      localObject = paramShape.h.b;
    }
    String str = paramShape.R().d().e(50048);
    if ((str != null) && (!"".equals(str))) {
      localObject = str;
    }
    if (paramShape.getMsoDrawingType() == 24) {
      return zcjj.a((String)localObject);
    }
    if (localObject == null) {
      localObject = paramShape.getName();
    }
    return zcjj.a((String)localObject);
  }
  
  private void l(Shape paramShape)
    throws Exception
  {
    String str = this.b.k.a(paramShape.getFill().getImageData());
    double d1 = paramShape.getFill().d();
    if (paramShape.getMsoDrawingType() == 24)
    {
      this.o.b("v:fill");
      if (str != null) {
        this.o.a("o:relid", str);
      }
      this.o.a("color2", "window [65]");
      if (str != null) {
        this.o.a("type", "frame");
      }
      this.o.b();
    }
    else if (paramShape.getMsoDrawingType() == 25)
    {
      this.o.b("v:fill");
      if (str != null) {
        this.o.a("o:relid", str);
      }
      if (d1 != 1.0D) {
        this.o.a("opacity", zauj.b(d1));
      }
      this.o.a("color2", j(paramShape));
      if (str != null) {
        this.o.a("type", "frame");
      }
      this.o.b();
    }
    else if (paramShape.getMsoDrawingType() == 7)
    {
      this.o.b("v:fill");
      this.o.a("color2", "buttonFace [67]");
      this.o.a("o:detectmouseclick", "t");
      this.o.b();
    }
    else if ((str != null) || (d1 != 1.0D))
    {
      this.o.b("v:fill");
      if (str != null) {
        this.o.a("o:relid", str);
      }
      if (d1 != 1.0D) {
        this.o.a("opacity", zauj.b(d1));
      }
      if (str != null) {
        this.o.a("type", "frame");
      }
      this.o.b();
    }
  }
  
  private void a(zpr paramzpr)
    throws Exception
  {
    Shape localShape = paramzpr.d;
    this.o.b("v:shape");
    this.o.a("id", paramzpr.e);
    if (paramzpr.f != null) {
      this.o.a("o:spid", paramzpr.f);
    }
    this.o.a("type", paramzpr.h);
    String str1 = localShape.getAlternativeText();
    if ((str1 != null) && (!"".equals(str1))) {
      this.o.a("alt", str1);
    }
    Hyperlink localHyperlink = localShape.getHyperlink();
    if (localHyperlink != null) {
      this.o.a("href", localHyperlink.getAddress());
    }
    this.o.a("style", n(localShape));
    this.o.a("filled", localShape.isFilled() ? "t" : "f");
    this.o.a("fillcolor", j(localShape));
    LineFormat localLineFormat = localShape.B().getLine();
    if (localLineFormat.getFillType() != 1)
    {
      this.o.a("stroked", "t");
      this.o.a("strokecolor", a(localLineFormat));
      if (localLineFormat.e(0)) {
        this.o.a("strokeweight", zauj.b(localLineFormat.getWeight()) + "pt");
      }
    }
    this.o.a("o:insetmode", "auto");
    l(localShape);
    if (localLineFormat.getFillType() != 1)
    {
      this.o.b("v:stroke");
      this.o.a("dashstyle", zauj.p(localLineFormat.getDashStyle()));
      this.o.a("linestyle", zauj.o(localLineFormat.getCompoundType()));
      this.o.b();
    }
    if (paramzpr.a != null)
    {
      this.o.b("v:imagedata");
      this.o.a("o:relid", paramzpr.a);
      this.o.a("o:title", "");
      double d1 = localShape.getFormatPicture().getTopCrop();
      if (d1 != 0.0D) {
        this.o.a("o:croptop", (int)(d1 * 65536.0D) + "f");
      }
      d1 = localShape.getFormatPicture().getBottomCrop();
      if (d1 != 0.0D) {
        this.o.a("o:cropbottom", (int)(d1 * 65536.0D) + "f");
      }
      d1 = localShape.getFormatPicture().getLeftCrop();
      if (d1 != 0.0D) {
        this.o.a("o:cropleft", (int)(d1 * 65536.0D) + "f");
      }
      d1 = localShape.getFormatPicture().getRightCrop();
      if (d1 != 0.0D) {
        this.o.a("o:cropright", (int)(d1 * 65536.0D) + "f");
      }
      if (localShape.h != null)
      {
        if (localShape.h.l != null) {
          this.o.a("gain", localShape.h.l);
        }
        if (localShape.h.m != null) {
          this.o.a("blacklevel", localShape.h.m);
        }
      }
      this.o.b();
    }
    if ((localShape.getMsoDrawingType() == 8) && (((Picture)localShape).f != null)) {
      a(this.o, ((Picture)localShape).f);
    }
    this.o.b("x:ClientData");
    this.o.a("ObjectType", "Pict");
    if (!paramzpr.d.W())
    {
      if (localShape.getPlacement() == 0) {
        this.o.b("x:MoveWithCells", null);
      }
      if ((localShape.getPlacement() == 0) || (localShape.getPlacement() == 1)) {
        this.o.b("x:SizeWithCells", null);
      }
      this.o.b("x:Anchor", m(localShape));
    }
    if (localShape.getMacroName() != null) {
      this.o.b("x:FmlaMacro", localShape.getMacroName());
    }
    if (localShape.aj() != null) {
      this.o.b("x:FmlaPict", localShape.aj());
    }
    if (localShape.z != null)
    {
      String str2 = localShape.getLinkedCell();
      if (str2 != null) {
        this.o.b("x:FmlaLink", str2);
      }
      str2 = localShape.getInputRange();
      if (str2 != null) {
        this.o.b("x:FmlaRange", str2);
      }
      if (!localShape.isLocked()) {
        this.o.b("x:Locked", "False");
      }
    }
    if (paramzpr.a != null) {
      this.o.b("x:CF", "Pict");
    } else {
      this.o.b("x:DDE", null);
    }
    if (localShape.aj() != null) {
      this.o.b("x:Camera", null);
    }
    if ((localShape.getMsoDrawingType() == 24) && (((OleObject)localShape).isAutoSize())) {
      this.o.b("x:AutoPict", null);
    }
    this.o.b();
    this.o.b();
  }
  
  private String m(Shape paramShape)
  {
    int i1 = zbxp.a();
    int[] arrayOfInt = paramShape.M();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(zauj.z(arrayOfInt[0]));
    for (int i2 = 1; i2 < arrayOfInt.length; i2++)
    {
      localStringBuilder.append(',');
      if (i2 % 2 == 1) {
        localStringBuilder.append(zauj.z(zauj.a(arrayOfInt[i2], i1)));
      } else {
        localStringBuilder.append(zauj.z(arrayOfInt[i2]));
      }
    }
    return zs.a(localStringBuilder);
  }
  
  private String a(int paramInt)
  {
    double d1 = zbxp.a(paramInt, zbxp.a());
    return com.aspose.cells.a.c.zp.a(d1, 2);
  }
  
  private String n(Shape paramShape)
  {
    String str = null;
    Object localObject;
    if (paramShape.T())
    {
      localObject = (Chart)((ShapeCollection)paramShape.J()).i();
      ChartShape localChartShape = ((Chart)localObject).getChartObject();
      Cells localCells = paramShape.Q().getCells();
      int i1 = (int)(localChartShape.getLeftToCorner() + paramShape.getLeftInShape() * localChartShape.getWidth() / 4000.0D + 0.5D);
      int i2 = (int)(localChartShape.getTopToCorner() + paramShape.getTopInShape() * localChartShape.getHeight() / 4000.0D + 0.5D);
      int i3 = (int)(paramShape.getWidthInShape() * localChartShape.getWidth() / 4000.0D + 0.5D);
      int i4 = (int)(paramShape.getHeightInShape() * localChartShape.getHeight() / 4000.0D + 0.5D);
      str = "position:absolute;margin-left:" + a(i1) + "pt;margin-top:" + a(i2) + "pt;width:" + a(i3) + "pt;height:" + a(i4) + "pt;z-index:" + o(paramShape) + ";";
    }
    else
    {
      str = "position:absolute;margin-left:" + a(paramShape.getLeftToCorner()) + "pt;margin-top:" + a(paramShape.getTopToCorner()) + "pt;width:" + a(paramShape.getWidth()) + "pt;height:" + a(paramShape.getHeight()) + "pt;z-index:" + o(paramShape) + ";";
    }
    if (paramShape.getMsoDrawingType() == 25)
    {
      localObject = ((CommentShape)paramShape).a();
      if (((Comment)localObject).isVisible()) {
        str = str + " visibility:visible;";
      } else {
        str = str + " visibility:hidden;";
      }
    }
    else if (paramShape.isHidden())
    {
      str = str + " visibility:hidden;";
    }
    if (paramShape.getMsoDrawingType() == 7) {
      str = str + "mso-wrap-style:tight";
    }
    return str;
  }
  
  private int o(Shape paramShape)
  {
    if ((paramShape.h != null) && (paramShape.h.e != -1))
    {
      if (this.l <= paramShape.h.e) {
        this.l = (paramShape.h.e + 1);
      }
      return paramShape.h.e;
    }
    return this.l++;
  }
  
  private void g()
    throws Exception
  {
    this.o.b("v:shapetype");
    this.o.a("id", "\000t202");
    this.o.a("coordsize", "21600,21600");
    this.o.a("o:spt", "202");
    this.o.a("path", "m,l,21600r21600,l21600,xe");
    this.o.b("v:stroke");
    this.o.a("joinstyle", "miter");
    this.o.b();
    this.o.b("v:path");
    this.o.a("gradientshapeok", "t");
    this.o.a("o:connecttype", "rect");
    this.o.b();
    this.o.b();
  }
  
  private void h()
    throws Exception
  {
    this.o.b("v:shapetype");
    this.o.a("id", "\000t75");
    this.o.a("coordsize", "21600,21600");
    this.o.a("o:spt", "75");
    this.o.a("o:preferrelative", "t");
    this.o.a("path", "m@4@5l@4@11@9@11@9@5xe");
    this.o.a("filled", "f");
    this.o.a("stroked", "f");
    this.o.b("v:stroke");
    this.o.a("joinstyle", "miter");
    this.o.b();
    this.o.b("v:formulas");
    a("if lineDrawn pixelLineWidth 0");
    a("sum @0 1 0");
    a("sum 0 0 @1");
    a("prod @2 1 2");
    a("prod @3 21600 pixelWidth");
    a("prod @3 21600 pixelHeight");
    a("sum @0 0 1");
    a("prod @6 1 2");
    a("prod @7 21600 pixelWidth");
    a("sum @8 21600 0");
    a("prod @7 21600 pixelHeight");
    a("sum @10 21600 0");
    this.o.b();
    this.o.d("<v:path o:extrusionok=\"f\" gradientshapeok=\"t\" o:connecttype=\"rect\"/>");
    this.o.d("<o:lock v:ext=\"edit\" aspectratio=\"t\"/>");
    this.o.b();
  }
  
  private void i()
    throws Exception
  {
    this.o.b("v:shapetype");
    this.o.a("id", "\000t201");
    this.o.a("coordsize", "21600,21600");
    this.o.a("o:spt", "201");
    this.o.a("path", "m,l,21600r21600,l21600,xe");
    this.o.b("v:stroke");
    this.o.a("joinstyle", "miter");
    this.o.b();
    this.o.b("v:path");
    this.o.a("shadowok", "f");
    this.o.a("o:extrusionok", "f");
    this.o.a("strokeok", "f");
    this.o.a("fillok", "f");
    this.o.a("o:connecttype", "rect");
    this.o.b();
    this.o.b("o:lock");
    this.o.a("v:ext", "edit");
    this.o.a("shapetype", "t");
    this.o.b();
    this.o.b();
  }
  
  private void a(String paramString)
    throws Exception
  {
    this.o.b("v:f");
    this.o.a("eqn", paramString);
    this.o.b();
  }
  
  private void a(zcjz paramzcjz, SignatureLine paramSignatureLine)
    throws Exception
  {
    paramzcjz.b("o:signatureline");
    if (paramSignatureLine.d != null) {
      paramzcjz.a("addlxml", paramSignatureLine.d);
    }
    if (paramSignatureLine.getAllowComments()) {
      paramzcjz.a("allowcomments", "t");
    }
    if (paramSignatureLine.a != null) {
      paramzcjz.a("v:ext", paramSignatureLine.a);
    }
    paramzcjz.a("id", zauj.a(paramSignatureLine.b.a()));
    paramzcjz.a("issignatureline", paramSignatureLine.isLine() ? "t" : "f");
    paramzcjz.a("provid", zauj.a(paramSignatureLine.a().a()));
    if (paramSignatureLine.getInstructions() != null)
    {
      paramzcjz.a("signinginstructionsset", "t");
      paramzcjz.a("signinginstructions", paramSignatureLine.getInstructions());
    }
    if (!paramSignatureLine.getShowSignedDate()) {
      paramzcjz.a("showsigndate", "f");
    }
    if (paramSignatureLine.getSigner() != null) {
      paramzcjz.a("o:suggestedsigner", paramSignatureLine.getSigner());
    }
    if (paramSignatureLine.getTitle() != null) {
      paramzcjz.a("o:suggestedsigner2", paramSignatureLine.getTitle());
    }
    if (paramSignatureLine.getEmail() != null) {
      paramzcjz.a("o:suggestedsigneremail", paramSignatureLine.getEmail());
    }
    if (paramSignatureLine.c != null) {
      paramzcjz.a("o:sigprovurl", paramSignatureLine.c);
    }
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zvu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */