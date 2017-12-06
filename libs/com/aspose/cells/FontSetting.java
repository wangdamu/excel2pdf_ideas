package com.aspose.cells;

import com.aspose.cells.b.c.a.za;

public class FontSetting
{
  int o;
  int p;
  Font q;
  int r;
  WorksheetCollection s;
  FontSettingCollection t;
  Object u;
  private int a = 9;
  private int b = 7;
  private static final za c = new za(new String[] { "major", "minor" });
  
  public int getType()
  {
    return 0;
  }
  
  public FontSetting(int startIndex, int length, WorksheetCollection sheets)
  {
    this.o = startIndex;
    this.p = length;
    this.s = sheets;
  }
  
  FontSetting(int startIndex, int length, WorksheetCollection sheets, FontSettingCollection txo)
  {
    this(startIndex, length, sheets);
    this.o = startIndex;
    this.p = length;
    this.s = sheets;
    this.t = txo;
    this.u = txo.b;
  }
  
  FontSetting(int startIndex, int length, WorksheetCollection sheets, ChartFrame parent)
  {
    this(startIndex, length, sheets);
    this.o = startIndex;
    this.p = length;
    this.s = sheets;
    this.u = parent;
  }
  
  FontSetting(int startIndex, int length, WorksheetCollection sheets, Chart parent)
  {
    this(startIndex, length, sheets);
    this.o = startIndex;
    this.p = length;
    this.s = sheets;
    this.u = parent;
  }
  
  TextParagraph e()
  {
    if (getType() == 1) {
      return (TextParagraph)this;
    }
    if (this.t != null)
    {
      int i = 0;
      for (int j = this.t.getCount() - 1; j >= 0; j--) {
        if (this.t.get(j) == this) {
          i = 1;
        } else if ((i != 0) && (this.t.get(j).getType() == 1)) {
          return (TextParagraph)this.t.get(j);
        }
      }
    }
    return null;
  }
  
  int f()
    throws Exception
  {
    if (this.t != null)
    {
      TextParagraph localTextParagraph = e();
      if (localTextParagraph.g(4096)) {
        return localTextParagraph.getAlignmentType();
      }
      return this.t.getTextAlignment().m();
    }
    return this.b;
  }
  
  void e(int paramInt)
  {
    if (this.t != null)
    {
      TextParagraph localTextParagraph = e();
      localTextParagraph.setAlignmentType(paramInt);
    }
    else
    {
      this.a = paramInt;
    }
  }
  
  public int getStartIndex()
  {
    return this.o;
  }
  
  public int getLength()
  {
    return this.p;
  }
  
  public Font getFont()
  {
    if (this.q == null)
    {
      this.q = new Font(this.s, this.u, this.u != null);
      a();
    }
    return this.q;
  }
  
  int g()
  {
    if (this.q != null) {
      return this.q.m();
    }
    return this.r;
  }
  
  Font h()
  {
    return this.q;
  }
  
  void a(Font paramFont)
  {
    this.q = paramFont;
  }
  
  private void a()
  {
    Object localObject1;
    if (this.r > 0)
    {
      localObject1 = this.s.i(this.r);
      this.q.a((Font)localObject1, null);
      this.q.b().c(true);
    }
    else if ((this.t != null) && (this.t.b != null) && ((this.t.b instanceof Shape)))
    {
      localObject1 = (Shape)this.t.b;
      if ((localObject1 != null) && ((localObject1 instanceof CommentShape)))
      {
        this.q.a("Tahoma", true, 0);
        this.q.setSize(8);
        this.q.setBold(true);
        if (this.s.p().h()) {
          this.q.setSize(9);
        }
      }
      else if (this.s.p().h())
      {
        TextParagraph localTextParagraph = e();
        StyleFlag localStyleFlag = new StyleFlag();
        if ((localTextParagraph != null) && (localTextParagraph != this) && (localTextParagraph.q != null))
        {
          localObject2 = localTextParagraph.q;
          if (((Font)localObject2).l())
          {
            if (!this.q.l()) {
              this.q = new TextOptions(this.s, this.u);
            }
            this.q.a((Font)localObject2, null);
          }
          else if (((Font)localObject2).f(16))
          {
            this.q.b(((Font)localObject2).b());
          }
          localStyleFlag.setFontColor(((Font)localObject2).f(16));
        }
        Object localObject2 = ((Shape)localObject1).p == null ? null : ((Shape)localObject1).p.b;
        if (localObject2 != null)
        {
          Workbook localWorkbook = ((Shape)localObject1).P().p();
          int i = 0;
          if (((zbsy)localObject2).a != null) {
            switch (c.a(((zbsy)localObject2).a))
            {
            case 0: 
              i = 1;
              break;
            case 1: 
              i = 2;
              break;
            }
          }
          boolean bool = "major".equals(((zbsy)localObject2).a);
          String str = localWorkbook.d().f.a(localWorkbook.getSettings().getRegion(), bool);
          this.q.a("Calibri", ((zbsy)localObject2).a != null, i);
          if ((!localStyleFlag.getFontColor()) && (((zbsy)localObject2).b != null)) {
            this.q.b(((zbsy)localObject2).b);
          }
        }
        else
        {
          this.q.a("Calibri", false, 0);
        }
        this.q.b(11.0D);
        this.q.o();
      }
      else
      {
        this.q.a(this.q.getName(), false, 0);
        this.q.b(10.0D);
      }
    }
  }
  
  /**
   * @deprecated
   */
  public ShapeFont getShapeFont()
  {
    return (ShapeFont)getTextOptions();
  }
  
  public void setWordArtStyle(int style)
    throws Exception
  {
    zalg.a(style, this.t, getTextOptions(), true);
  }
  
  public TextOptions getTextOptions()
  {
    Font localFont;
    if (this.q == null)
    {
      this.q = new TextOptions(this.s, this.u);
      if (this.r > 0)
      {
        localFont = this.s.i(this.r);
        this.q.a(localFont, null);
      }
    }
    else if (!this.q.l())
    {
      localFont = this.q;
      this.q = new TextOptions(this.s, this.u);
      this.q.a(localFont, null);
    }
    return (TextOptions)this.q;
  }
  
  zbqv i()
  {
    TextParagraph localTextParagraph = a(false);
    if ((localTextParagraph != null) && (localTextParagraph.g(2)))
    {
      zbqv localzbqv = new zbqv();
      localzbqv.b = localTextParagraph.g;
      localzbqv.a = localTextParagraph.getSpaceAfterSizeType();
      return localzbqv;
    }
    return null;
  }
  
  zbqv j()
  {
    TextParagraph localTextParagraph = a(false);
    if ((localTextParagraph != null) && (localTextParagraph.g(4)))
    {
      zbqv localzbqv = new zbqv();
      localzbqv.b = localTextParagraph.h;
      localzbqv.a = localTextParagraph.getSpaceBeforeSizeType();
      return localzbqv;
    }
    return null;
  }
  
  zbqv k()
  {
    TextParagraph localTextParagraph = a(false);
    if ((localTextParagraph != null) && (localTextParagraph.g(1)))
    {
      zbqv localzbqv = new zbqv();
      localzbqv.b = localTextParagraph.f;
      localzbqv.a = localTextParagraph.getLineSpaceSizeType();
      return localzbqv;
    }
    return null;
  }
  
  int l()
  {
    TextParagraph localTextParagraph = a(false);
    if (localTextParagraph != null) {
      return localTextParagraph.o();
    }
    return 0;
  }
  
  int m()
  {
    TextParagraph localTextParagraph = a(false);
    if (localTextParagraph != null) {
      return localTextParagraph.p();
    }
    return 0;
  }
  
  TextParagraph a(boolean paramBoolean)
  {
    if (getType() == 1) {
      return (TextParagraph)this;
    }
    int i = b(paramBoolean);
    if (i != -1) {
      return (TextParagraph)this.t.get(i);
    }
    return null;
  }
  
  int b(boolean paramBoolean)
  {
    int i;
    if (getType() == 1) {
      for (i = this.t.getCount() - 1; i >= 0; i--) {
        if (this.t.get(i) == this) {
          return i;
        }
      }
    }
    if (this.t != null)
    {
      i = 0;
      for (int j = this.t.getCount() - 1; j >= 0; j--) {
        if (this.t.get(j) == this)
        {
          i = 1;
        }
        else if ((i != 0) && (this.t.get(j).getType() == 1))
        {
          if (paramBoolean)
          {
            if (this.t.get(j + 1) == this) {
              return j;
            }
            return -1;
          }
          return j;
        }
      }
    }
    return -1;
  }
  
  Bullet n()
  {
    TextParagraph localTextParagraph = a(true);
    if (localTextParagraph != null) {
      return localTextParagraph.d;
    }
    return null;
  }
  
  void a(FontSetting paramFontSetting)
  {
    this.q = paramFontSetting.q;
    this.r = paramFontSetting.r;
    this.b = paramFontSetting.b;
    this.a = paramFontSetting.a;
  }
  
  void a(FontSetting paramFontSetting, CopyOptions paramCopyOptions)
  {
    if (paramFontSetting.q != null)
    {
      if (paramFontSetting.q.l())
      {
        this.q = new TextOptions(this.s, this.u);
        this.q.a(paramFontSetting.getFont(), paramCopyOptions);
      }
      else
      {
        this.q = new Font(this.s, this.u, this.u != null);
        this.q.a(paramFontSetting.getFont(), paramCopyOptions);
      }
    }
    else {
      this.q = null;
    }
    this.a = paramFontSetting.a;
    this.b = paramFontSetting.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/FontSetting.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */