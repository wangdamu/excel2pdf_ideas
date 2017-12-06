package com.aspose.cells.b.a.b.a;

import com.aspose.cells.b.a.b.zo;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D.Float;

public class zi
  implements Cloneable
{
  private static zi a = new zi();
  private AffineTransform b;
  
  public zi()
  {
    this.b = new AffineTransform();
  }
  
  public zi(AffineTransform paramAffineTransform)
  {
    this.b = paramAffineTransform;
  }
  
  public zi(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    this(new AffineTransform(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6));
  }
  
  public void a(zi paramzi)
  {
    paramzi.a().setTransform(a());
  }
  
  public AffineTransform a()
  {
    return this.b;
  }
  
  public zi b()
  {
    return new zi((AffineTransform)this.b.clone());
  }
  
  public boolean c()
  {
    return this.b.isIdentity();
  }
  
  public boolean equals(Object obj)
  {
    if ((obj instanceof zi))
    {
      zi localzi = (zi)obj;
      return localzi.b.equals(localzi.b);
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.b.hashCode();
  }
  
  public void a(float paramFloat)
  {
    this.b.rotate(Math.toRadians(paramFloat));
  }
  
  public void a(float paramFloat, int paramInt)
  {
    a(AffineTransform.getRotateInstance(Math.toRadians(paramFloat)), paramInt);
  }
  
  public void a(float paramFloat, zo paramzo)
  {
    this.b.rotate(Math.toRadians(paramFloat), paramzo.d(), paramzo.e());
  }
  
  public void b(zi paramzi)
  {
    a(paramzi, 0);
  }
  
  public void a(zi paramzi, int paramInt)
  {
    a(paramzi.b, paramInt);
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    this.b.scale(paramFloat1, paramFloat2);
  }
  
  public void a(float paramFloat1, float paramFloat2, int paramInt)
  {
    a(AffineTransform.getScaleInstance(paramFloat1, paramFloat2), paramInt);
  }
  
  public void a(zo[] paramArrayOfzo)
  {
    Point2D.Float localFloat = new Point2D.Float();
    for (int i = 0; i < paramArrayOfzo.length; i++)
    {
      localFloat.setLocation(paramArrayOfzo[i].d(), paramArrayOfzo[i].e());
      this.b.transform(localFloat, localFloat);
      paramArrayOfzo[i].a((float)localFloat.getX());
      paramArrayOfzo[i].b((float)localFloat.getY());
    }
  }
  
  public void b(float paramFloat1, float paramFloat2)
  {
    this.b.translate(paramFloat1, paramFloat2);
  }
  
  public void b(float paramFloat1, float paramFloat2, int paramInt)
  {
    a(AffineTransform.getTranslateInstance(paramFloat1, paramFloat2), paramInt);
  }
  
  public void c(float paramFloat1, float paramFloat2)
  {
    this.b.shear(paramFloat1, paramFloat2);
  }
  
  public float[] d()
  {
    float[] arrayOfFloat = { (float)this.b.getScaleX(), (float)this.b.getShearY(), (float)this.b.getShearX(), (float)this.b.getScaleY(), (float)this.b.getTranslateX(), (float)this.b.getTranslateY() };
    return arrayOfFloat;
  }
  
  private void a(AffineTransform paramAffineTransform, int paramInt)
  {
    a(this.b, paramAffineTransform, paramInt);
  }
  
  private static void a(AffineTransform paramAffineTransform1, AffineTransform paramAffineTransform2, int paramInt)
  {
    if (paramInt == 0) {
      paramAffineTransform1.concatenate(paramAffineTransform2);
    } else {
      paramAffineTransform1.preConcatenate(paramAffineTransform2);
    }
  }
  
  public void e()
  {
    try
    {
      this.b = this.b.createInverse();
    }
    catch (Exception localException) {}
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/a/zi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */