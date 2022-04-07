package com.RESTfullService.MeasurementDataMinig;


public class MeasurementObjects {
    
    private int id;
    private double temperature;
    private double angle;
    private double intensity;
    private String chamberName;
    
    public MeasurementObjects(int id, double temperature, double angle, 
            double intensity, String chamberName)
    {
        this.id = id;
        this.temperature = temperature;
        this.angle = angle;
        this.intensity = intensity;
        this.chamberName = chamberName;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public double getTemperature()
    {
        return this.temperature;
    }
    
    public double getAngle()
    {
        return this.angle;
    }
    
    public double getIntensity()
    {
        return this.intensity;
    }
    
    public String getChamberName()
    {
        return this.chamberName;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setTemperature(double temperature)
    {
        this.temperature = temperature;
    }
    
    public void setAngle(double angle)
    {
        this.angle = angle;
    }
    
    public void setIntensity(double intensity)
    {
        this.intensity = intensity;
    }
    
    public void setChamberName(String chamberName)
    {
        this.chamberName = chamberName;
    }
}
