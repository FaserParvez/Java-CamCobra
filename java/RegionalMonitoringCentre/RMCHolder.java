package RegionalMonitoringCentre;

/**
* RegionalMonitoringCentre/RMCHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ./idl/rmc.idl
* Friday, 29 April 2016 00:01:59 o'clock BST
*/

public final class RMCHolder implements org.omg.CORBA.portable.Streamable
{
  public RegionalMonitoringCentre.RMC value = null;

  public RMCHolder ()
  {
  }

  public RMCHolder (RegionalMonitoringCentre.RMC initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RegionalMonitoringCentre.RMCHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RegionalMonitoringCentre.RMCHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RegionalMonitoringCentre.RMCHelper.type ();
  }

}