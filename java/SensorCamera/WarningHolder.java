package SensorCamera;

/**
* SensorCamera/WarningHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./idl/camera.idl
* Friday, 29 April 2016 00:01:59 o'clock BST
*/

public final class WarningHolder implements org.omg.CORBA.portable.Streamable
{
  public SensorCamera.Warning value = null;

  public WarningHolder ()
  {
  }

  public WarningHolder (SensorCamera.Warning initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = SensorCamera.WarningHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    SensorCamera.WarningHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return SensorCamera.WarningHelper.type ();
  }

}